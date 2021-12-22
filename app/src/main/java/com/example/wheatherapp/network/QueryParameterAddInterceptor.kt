package com.example.wheatherapp.network

import okhttp3.Interceptor
import okhttp3.Response

class QueryParameterAddInterceptor : Interceptor
{
    val APP_ID="3d32a51a6879a7cd37c99e86f040115d"

    override fun intercept(chain: Interceptor.Chain): Response {

        val url = chain.request().url().newBuilder()
                .addQueryParameter("appid",APP_ID)
                .build()

        val request = chain.request().newBuilder()
                // .addHeader("Authorization", "Bearer token")
                .url(url)
                .build()

        return chain.proceed(request)
    }
}