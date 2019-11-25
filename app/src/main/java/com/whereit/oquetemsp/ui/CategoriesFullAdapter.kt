package com.whereit.oquetemsp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.whereit.oquetemsp.R
import com.whereit.oquetemsp.domain.Categories
import kotlinx.android.synthetic.main.explore_categories_full.view.*
import kotlinx.android.synthetic.main.explore_categories_itens.view.*
import kotlinx.android.synthetic.main.explore_categories_itens.view.txtTitulo
import java.lang.Exception

class CategoriesFullAdapter(var categories: List<Categories>, var iCategoriaClick: ICategoriaClick) :
    RecyclerView.Adapter<CategoriesFullAdapter.CategoriesFullViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesFullAdapter.CategoriesFullViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.explore_categories_full, parent, false)
        return CategoriesFullViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(
        holder: CategoriesFullAdapter.CategoriesFullViewHolder,
        position: Int
    ) {
        holder.titleCategory.text = categories.get(position).category
        try {
            Picasso.get().load(categories[position].image).into(holder.imgCategory)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    inner class CategoriesFullViewHolder : RecyclerView.ViewHolder {
        val titleCategory = itemView.txtTitulo
        val imgCategory = itemView.imgCategory


        constructor(itemView: View) : super(itemView){
            itemView.setOnClickListener {
                iCategoriaClick.onClick(categories[layoutPosition])
            }
        }

    }

    interface ICategoriaClick{
        fun onClick(category : Categories)
    }
}