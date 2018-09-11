package com.yusufabd.data.repository

import com.yusufabd.data.network.NetworkFactory
import com.yusufabd.data.tools.RxTools
import com.yusufabd.domain.models.Repo
import com.yusufabd.domain.repository.IAppRepository
import io.reactivex.Single

object AppRepository : IAppRepository {

    override fun getRepositoryList(): Single<List<Repo>> {
        return NetworkFactory.create().searchRepositories("android")
                .map { response ->
                    response.items.map {
                        Repo(it.id, it.name, it.description, it.owner.login, it.owner.avatar_url,
                                it.html_url, it.language ?: "unknown", it.stargazers_count)
                    }
                }
                .compose(RxTools.singleAsync())
    }

}