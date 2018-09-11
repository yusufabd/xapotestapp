package com.yusufabd.data.network

import com.yusufabd.data.models.RepositoryListResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("/search/repositories")
    fun searchRepositories(
            @Query("q") query: String,
            @Query("sort") sort: String = "stars",
            @Query("order") order: String = "desc"
    ): Single<RepositoryListResponse>

}