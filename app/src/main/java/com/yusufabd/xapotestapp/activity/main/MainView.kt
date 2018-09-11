package com.yusufabd.xapotestapp.activity.main

import com.yusufabd.domain.models.Repo
import com.yusufabd.xapotestapp.adapter.RepositoryListAdapter

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showError(value: Throwable)
    fun showResult(adapter: RepositoryListAdapter)
    fun openRepoDetails(repo: Repo)
}