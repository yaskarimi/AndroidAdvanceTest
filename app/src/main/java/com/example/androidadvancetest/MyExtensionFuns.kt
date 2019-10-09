package com.example.androidadvancetest

import android.util.Log
import java.util.*
import kotlin.collections.ArrayList

fun String.duplicateCharacter(c : Char) : Boolean{
    var count = 0
    val a = this.toLowerCase()
    val ar = a.toCharArray()

    for(i in 0 until ar.size - 1) {
            if (ar[i] == c) {
                count += 1
        }
    }
    return count>1
}

fun Int.lenght() : Int{
    var lenght = this.toString().length
    return lenght
}

fun List<String>.duplicateString(s : String) : Boolean {
    var count = 0
    for(i in 0 until this.size ) {

            if (this[i] == s)
                count += 1

    }


    return count>1

}
fun Int.divisibility(int : Int): Boolean {
    return this%int==0
}
fun List<String>.biggerSize(list: List<String>) : Int{
    var max =0
    if(list.size > this.size)
        max =list.size
    else
        max = this.size
    return max

}

fun List<String>.commonItem(list: List<String>) : List<String> {
    var commons = ArrayList<String>()
    for(i in 0 until this.size)
    {

        for (j in 0 until list.size)
        {
            if (this[i] == list[j]){
                commons.add(this[i])
            }

        }
    }
    return commons

}
fun List<String>.unCommonItem(list: List<String>) : List<String> {
    var commons = ArrayList<String>()
    for(i in 0 until this.size)
    {

        for (j in 0 until list.size)
        {
            if (this[i] != list[j]){
                commons.add(this[i])
            }

        }
    }
    return commons

}


fun Int.separate(){
    var len = this.lenght()
    for( i in 0 until len )
    {

    }



}

fun String.isValidNationalCode()
:Boolean {
    val size = this.length
    var temp = 0
    val charAr = this.toCharArray()
    var ar = ArrayList<Int>()



    for(i in 0 until size)
    {
        if(charAr.size<10)
        {
            for( i in 0..10-charAr.size)
              //  ar[i] = this[i]
                ar[i] = this.toLong().toChar().toInt()
            Log.d("MYTag " , "this is ar : " + ar[i])
        }
       // ar[] = intAr.


      }



    for (i in 0 until 9){
        for(j in 10 downTo  2){
            temp += (i * j)
        }
    }
    var r = temp%11

    if(r<2 && ar[9]==r)
        return true
    return if(r>=2 && ar[9]==11-r)
        false
    else
        false
}




