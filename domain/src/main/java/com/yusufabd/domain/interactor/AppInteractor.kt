package com.yusufabd.domain.interactor

import com.yusufabd.domain.repository.IAppRepository
import com.yusufabd.domain.models.Repo
import io.reactivex.Single

class AppInteractor(private val repository: IAppRepository) {
    fun getRepositoryList(): Single<List<Repo>>{
        return repository.getRepositoryList()
    }
}