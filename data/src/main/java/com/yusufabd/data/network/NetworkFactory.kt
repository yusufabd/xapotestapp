package com.yusufabd.data.network

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.yusufabd.domain.baseUrl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkFactory {
    companion object {
        fun create(): NetworkService {
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseUrl)
                    .client(OkHttpDelegate.getClient())
                    .build()

            return retrofit.create(NetworkService::class.java)
        }

    }
}