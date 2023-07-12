package com.example.demo.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import okhttp3.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/controlador2")
public class Controlador2 {

    @GetMapping(value = "/token")
    public String token() throws IOException, KeyManagementException, NoSuchAlgorithmException {

        OkHttpClient client = new OkHttpClientient().getUnsafeOkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{ \"username\": \"Remedy\", \"password\": \"Temporal123#\"}");
        Request request = new Request.Builder()
                .url("https://10.152.29.236:443/FireFlow/api/authentication/authenticate")
                .method("POST", body)
                .addHeader("accept", "application/json;charset=UTF-8")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

        String Json=response.body().string();

        Gson gson=new Gson();
        JsonObject gsonobject= gson.fromJson(Json, JsonObject.class);

        JsonElement data= gsonobject.get("data");

        gsonobject= gson.fromJson(data.toString(), JsonObject.class);

        JsonElement sessionId= gsonobject.get("sessionId");

        return sessionId.toString().replace("\"", "");
    }
}
