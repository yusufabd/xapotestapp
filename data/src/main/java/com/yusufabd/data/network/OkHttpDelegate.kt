package com.yusufabd.data.network

import com.yusufabd.domain.accept
import com.yusufabd.domain.token
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * Created by yusufabd on 4/2/18.
 */
class OkHttpDelegate {

    companion object {
        private const val CONNECT_TIMEOUT: Long = 30
        private const val READ_TIMEOUT: Long = 30

        fun getClient(): OkHttpClient{
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val tokenInterceptor = Interceptor {
                val request = it.request()
                val build = request.newBuilder()
                val newRequest = build
                        .addHeader("Authorization", token)
                        .addHeader("Accept", accept)
                        .build()
                it.proceed(newRequest)
            }

            return OkHttpClient.Builder()
                    .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
                    .addInterceptor(loggingInterceptor)
                    .addInterceptor(tokenInterceptor)
                    .build()
        }
    }
}