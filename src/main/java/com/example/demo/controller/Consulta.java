/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Consulta")
public class Consulta {

    @GetMapping(value = "/StatusSession")
    public String StatusSession() throws IOException, KeyManagementException, NoSuchAlgorithmException {
        Controlador2 access= new Controlador2();
        OkHttpClient client = new OkHttpClientient().getUnsafeOkHttpClient();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
                .url("https://10.152.29.236:443/FireFlow/api/session")
                .method("GET", body)
                .addHeader("accept", "application/json;charset=UTF-8")
                .addHeader("Cookie", "FireFlow_Session=".concat(access.token()))
                .build();
        Response response = client.newCall(request).execute();
        //return response.toString();
        return "CONSULTA";
    }
}