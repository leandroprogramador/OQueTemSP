package com.whereit.oquetemsp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.whereit.oquetemsp.R
import com.whereit.oquetemsp.domain.InterestingPoint
import kotlinx.android.synthetic.main.explorar_itens.view.*
import java.lang.Exception

class ExploringPointsAdapter(
    var interestingPoints: List<InterestingPoint>,
    var interestingPointClick: ExploringPointsClick
) :
    RecyclerView.Adapter<ExploringPointsAdapter.ExploringPointsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploringPointsViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.explorar_itens, parent, false)
        return ExploringPointsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return interestingPoints.size
    }

    override fun onBindViewHolder(holder: ExploringPointsViewHolder, position: Int) {
        holder.titlePoint.text = interestingPoints.get(position).pointTitle
        holder.subtitlePoint.text = String.format(
            "%s • %d favoritos",
            interestingPoints[position].category, interestingPoints[position].favorites
        )

        try {
            Picasso.get().load(interestingPoints[position].image).into(holder.imgPoint)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        if (interestingPoints[position].favorite) {
            holder.favorite.setImageResource(R.drawable.heart)
        } else {
            holder.favorite.setImageResource(R.drawable.heart_outline)
        }
    }

    inner class ExploringPointsViewHolder : RecyclerView.ViewHolder {
        val titlePoint = itemView.txtTitulo
        val subtitlePoint = itemView.txtSubtitulo
        val imgPoint = itemView.imgBackground
        val favorite = itemView.favorite

        constructor(itemView: View) : super(itemView){
            itemView.setOnClickListener {
                interestingPointClick.onClick(interestingPoints[adapterPosition])
            }
        }


    }

    interface ExploringPointsClick {
        fun onClick(interestingPoint: InterestingPoint)
    }
}


