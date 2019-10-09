package com.example.androidadvancetest

import android.icu.lang.UCharacter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import com.example.androidadvancetest.duplicateCharacter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<String>()
        list.add("Ali")
        list.add("Hassan")
        list.add("Mamad")
        list.add("Kaveh")
        list.add("Hassan")
        val nationalCode = "0020823207"


        recycler.adapter = RecyclerAdapter(list) {
            showToast(it , list  , nationalCode)
        }
        recycler.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL ,false)

    }



    fun showToast(s : String,list: List<String>  , nationalCode :String){
        Toast.makeText(this , "this is name: $s", Toast.LENGTH_LONG).show()
        Toast.makeText(this , "we have the same name " + list.duplicateString(s), Toast.LENGTH_LONG).show()
        Log.d("MYTAG" , "this is a valid or not valid  national Code" +
                nationalCode.isValidNationalCode())

    }


}
