package com.yusufabd.xapotestapp.activity.repoDetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.squareup.picasso.Picasso
import com.yusufabd.domain.models.Repo
import com.yusufabd.xapotestapp.R
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val repo = intent.getSerializableExtra(Repo::javaClass.name) as Repo
        supportActionBar?.title = repo.name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        tvTitle.text = repo.name
        tvDescription.text = getString(R.string.description, repo.description)
        tvAuthor.text = getString(R.string.author, repo.authorLogin)
        tvLanguage.text = getString(R.string.language, repo.language)
        tvHomepage.text = getString(R.string.homepage, repo.homepage)
        Picasso.get().load(repo.authorAvatar).into(ivAvatar)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) onBackPressed()

        return super.onOptionsItemSelected(item)
    }
}
