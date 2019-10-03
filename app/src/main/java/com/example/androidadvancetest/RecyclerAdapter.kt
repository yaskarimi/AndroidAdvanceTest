package com.example.androidadvancetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class RecyclerAdapter (val list : List<String>): RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

      val view =  LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_adapter , parent , false )
      return  RecyclerViewHolder(view)

    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
     holder.onBind()
    }


    class RecyclerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun onBind() {

        }


    }
}
