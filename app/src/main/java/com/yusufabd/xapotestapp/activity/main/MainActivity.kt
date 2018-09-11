package com.yusufabd.xapotestapp.activity.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.yusufabd.domain.models.Repo
import com.yusufabd.xapotestapp.R
import com.yusufabd.xapotestapp.activity.repoDetails.DetailsActivity
import com.yusufabd.xapotestapp.adapter.RepositoryListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView{

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        presenter.getRepos()
    }

    override fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    override fun showError(value: Throwable) {
        value.printStackTrace()
        Toast.makeText(this, value.message, Toast.LENGTH_LONG).show()
    }

    override fun showResult(adapter: RepositoryListAdapter) {
        rvRepos.layoutManager = LinearLayoutManager(this)
        rvRepos.adapter = adapter
        rvRepos.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

    override fun openRepoDetails(repo: Repo) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(Repo::javaClass.name, repo)
        startActivity(intent)
    }
}
