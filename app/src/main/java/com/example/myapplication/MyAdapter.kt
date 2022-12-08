package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, val userList: List<myDataItem>):RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
      var title1 : TextView
      var category : TextView
      var userId : TextView
      var description : TextView


      init {
          userId = itemView.findViewById(R.id.user_id)
          category = itemView.findViewById(R.id.category)
          description = itemView.findViewById(R.id.description)
          title1 = itemView.findViewById(R.id.title)
      }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_item,parent,false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = userList[position].id.toString()
        holder.title1.text = userList[position].title.toString()
        holder.category.text = userList[position].category.toString()
        holder.description.text = userList[position].description.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}