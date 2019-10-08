package com.example.androidadvancetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_adapter.view.*
import java.util.zip.Inflater

class RecyclerAdapter (val list : ArrayList<String>, val lambdaFun : (String) -> Unit):
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

      val view =  LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler_adapter ,
          parent , false )
      return  RecyclerViewHolder(view , lambdaFun)

    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
     holder.onBind(list[position])
    }


    class RecyclerViewHolder(itemView : View , val lambdaFun : (String) -> Unit ) : RecyclerView.ViewHolder(itemView) {

        fun onBind(s : String) {
            itemView.setOnClickListener{
                lambdaFun(s)
            }
            itemView.textView.text = s

        }


    }
}
