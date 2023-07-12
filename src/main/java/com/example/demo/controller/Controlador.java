package com.example.demo.controller;

import okhttp3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "/controlador")
public class Controlador {

    @GetMapping(value = "/token")
    public String token() throws IOException {
        log.info("Ejecutando token");
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "username=EX511912.telcel.mex.amx&password=vy6g08v#");
        Request request = new Request.Builder()
                .url("http://100.127.4.41:8008/api/jwt/login")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    @GetMapping(value = "/token2")
    public String token2() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{ \"username\": \"Remedy\", \"password\": \"Temporal123#\"}");
        Request request = new Request.Builder()
                .url("https://10.152.29.236:443/FireFlow/api/authentication/authenticate")
                .method("POST", body)
                .addHeader("accept", "application/json;charset=UTF-8")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}