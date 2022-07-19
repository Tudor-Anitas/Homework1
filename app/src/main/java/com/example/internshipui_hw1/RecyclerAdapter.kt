package com.example.internshipui_hw1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils.getString
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var title = arrayOf(R.string.title1.toString(), R.string.title2.toString(), R.string.title3.toString(), R.string.title4.toString(), R.string.title5.toString(), R.string.title6.toString(), R.string.title7.toString())
    private var description = arrayOf(
        R.string.desc1.toString(),
        R.string.desc2.toString(),
        R.string.desc3.toString(),
        R.string.desc4.toString(),
        R.string.desc5.toString(),
        R.string.desc6.toString(),
        R.string.desc7.toString()
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.name.text = title[position]
        holder.description.text = description[position]

    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var name : TextView = itemView.findViewById(R.id.modelName)
        var description : TextView = itemView.findViewById(R.id.modelDescription)
        var image : ImageView = itemView.findViewById(R.id.modelImageView)
    }
}