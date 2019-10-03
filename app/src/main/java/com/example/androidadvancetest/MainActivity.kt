package com.example.androidadvancetest

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = NameModel(" " , " ")
        val list = ArrayList<NameModel>()
        list.add(model)

        recycler.adapter = RecyclerAdapter(list)
        recycler.layoutManager = LinearLayoutManager(this , requestedOrientation ,false)



    }
}
