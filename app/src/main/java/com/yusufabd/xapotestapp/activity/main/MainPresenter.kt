package com.yusufabd.xapotestapp.activity.main

import com.yusufabd.data.repository.AppRepository
import com.yusufabd.domain.interactor.AppInteractor
import com.yusufabd.domain.models.Repo
import com.yusufabd.xapotestapp.adapter.RepositoryListAdapter

class MainPresenter(private val view: MainView) {

    private val interactor = AppInteractor(AppRepository)

    fun getRepos(){
        interactor.getRepositoryList()
                .doOnSubscribe { view.showLoading() }
                .doOnEvent { _, _ -> view.hideLoading() }
                .subscribe({
                    val adapter = RepositoryListAdapter(it, ::onRepoClick)
                    view.showResult(adapter)
                },{
                    view.showError(it)
                })
    }

    private fun onRepoClick(repo: Repo){
        view.openRepoDetails(repo)
    }
}