package com.whereit.oquetemsp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.whereit.oquetemsp.R
import com.whereit.oquetemsp.domain.Categories
import kotlinx.android.synthetic.main.explore_categories_itens.view.*
import java.lang.Exception

class CategoriesAdapter(var categories: List<Categories>) :
    RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.explore_categories_itens, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.titleCategory.text = categories.get(position).category
        try {
            Picasso.get().load(categories[position].image).into(holder.imgCategory)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }


    class CategoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleCategory = itemView.txtTitulo
        val imgCategory = itemView.imgBackground

    }
}