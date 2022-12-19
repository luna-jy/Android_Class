package com.example.conn;


import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class ApiClient {

    /*url을 바꿀수 있는 구조로 만든다*/
    public static void setBASEURL(String BASEURL) {
        ApiClient.BASEURL = BASEURL;
    }

    public static String BASEURL = "";

    
    public Retrofit getApiClient(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL) // 톰캣까지(서버 까지 접근 경로)
                .client( new OkHttpClient.Builder().connectTimeout(10 , TimeUnit.SECONDS).build())
                .addConverterFactory(ScalarsConverterFactory.create())//json String사용
                .build();


        return retrofit;
    }



}
