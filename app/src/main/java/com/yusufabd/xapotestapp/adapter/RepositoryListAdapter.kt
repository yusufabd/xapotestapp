package com.yusufabd.xapotestapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yusufabd.domain.models.Repo
import com.yusufabd.xapotestapp.R
import kotlinx.android.synthetic.main.item_repository.view.*

class RepositoryListAdapter(private val list: List<Repo>,
                            private val onClick: (Repo) -> Unit)
    : RecyclerView.Adapter<RepositoryListAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater.inflate(R.layout.item_repository, parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position], onClick)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun bind(repo: Repo, onClick: (Repo) -> Unit){
            itemView.setOnClickListener { onClick(repo) }
            itemView.tvTitle.text = repo.name
            itemView.tvAuthor.text = itemView.context.getString(R.string.by, repo.authorLogin)
            itemView.tvStars.text = repo.stars.toString()
        }
    }

}