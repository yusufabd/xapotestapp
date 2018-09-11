package com.yusufabd.domain.repository

import com.yusufabd.domain.models.Repo
import io.reactivex.Single

interface IAppRepository {
    fun getRepositoryList(): Single<List<Repo>>
}