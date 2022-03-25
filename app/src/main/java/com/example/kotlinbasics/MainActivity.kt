package com.example.kotlinbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val constante : String = "unaConstante"
        val a: Int = 1
        var b = 2
        b = 3


        Log.i("basics", "valor de b = $b ")
        Log.i("basics", constante)
        Log.d("basics", "d")
        Log.w("basics", "w")
        Log.e("basics", "e")


        unSwitch()
        unIf(1)
        unFor()

    }

    fun unSwitch(){

        val x = 1
        when (x){

            1 -> {  Log.i("basics", "Es un uno")  }
            2 -> {
                val algo = "lorem "
                val otro = "ipsum"
                Log.i("basics",algo + otro)
            }
            else -> Log.i("basics","No coincide")
        }

    }

        fun unIf(a: Int): Boolean{
            var array= arrayOf(1,2,3,4,5)
            if (a in array)
                return true
            else
                return false
        }



        fun unFor(){
            var array= arrayOf(1,2,3,4,5)
            for (numero in array){
                Log.i("basics", numero.toString())

            }

        }


    fun unosWhile(){

        var x = 0
        while(x < 5){
            Log.i("basics", x.toString())
            x++
        }

        do{
            Log.i("basics", x.toString())
            x++

        }
            while (x < 5)

    }
}