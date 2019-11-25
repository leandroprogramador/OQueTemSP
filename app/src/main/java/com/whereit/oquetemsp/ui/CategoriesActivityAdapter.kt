package com.whereit.oquetemsp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.whereit.oquetemsp.R
import com.whereit.oquetemsp.domain.InterestingPoint
import kotlinx.android.synthetic.main.category_item_card.view.*
import kotlinx.android.synthetic.main.explore_categories_itens.view.imgBackground
import kotlinx.android.synthetic.main.explore_categories_itens.view.txtTitulo

class CategoriesActivityAdapter(var interestingPoints: List<InterestingPoint>) :
    RecyclerView.Adapter<CategoriesActivityAdapter.CategoriesActivityViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesActivityViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item_card, parent, false)
        return CategoriesActivityViewHolder(view)
    }

    override fun getItemCount(): Int {
        return interestingPoints.size
    }

    override fun onBindViewHolder(holder: CategoriesActivityViewHolder, position: Int) {
        holder.titleCategory.text = interestingPoints.get(position).pointTitle
        holder.txtFavorites.text = interestingPoints.get(position).favorites.toString()
        holder.txtAddress.text = interestingPoints.get(position).address
        holder.txtResume.text = interestingPoints.get(position).resume

        try {
            Picasso.get().load(interestingPoints[position].image).into(holder.imgCategory)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        if (interestingPoints[position].favorite) {
            holder.imgFavorites.setImageResource(R.drawable.heart)
        } else {
            holder.imgFavorites.setImageResource(R.drawable.heart_outline)
        }
    }

    inner class CategoriesActivityViewHolder : RecyclerView.ViewHolder {
        val titleCategory = itemView.txtTitulo
        val imgCategory = itemView.imgBackground
        val imgFavorites = itemView.imgFavorite
        val txtFavorites = itemView.txtFavorites
        val txtAddress = itemView.txtAddress
        val txtResume = itemView.txtResume


        constructor(itemView: View) : super(itemView) {
            itemView.setOnClickListener {

            }
        }
    }
}