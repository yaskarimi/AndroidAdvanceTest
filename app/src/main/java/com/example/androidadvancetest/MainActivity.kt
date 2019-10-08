package com.example.androidadvancetest

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = NameModel(" " , " ")
        val list = ArrayList<String>()
        list.add(model.name)
        list.add("Ali")
        list.add("Hassan")
        list.add("Mamad")
        list.add("Kaveh")


        recycler.adapter = RecyclerAdapter(list) {
            showToast(it)
        }
        recycler.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL ,false)




    }

    fun showToast(s : String){
        Toast.makeText(this , "this is name: " + s , Toast.LENGTH_LONG).show()
    }
}
