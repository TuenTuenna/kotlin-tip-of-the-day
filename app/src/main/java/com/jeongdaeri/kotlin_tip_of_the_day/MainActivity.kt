package com.jeongdaeri.kotlin_tip_of_the_day

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.jeongdaeri.kotlin_tip_of_the_day.basic.UserInfo

class MainActivity :
    AppCompatActivity()//    View.OnClickListener
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val someBtn : Button = findViewById<Button>(R.id.some_button)
//        someBtn.setOnClickListener(this@MainActivity)

//        someBtn.setOnClickListener {
//            println("onClick called")
//        }

        someBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                println("onClick called")
            }
        })

        Log.d("메인액티비티", "UserInfo.name: ${UserInfo.name}")
    }

//    override fun onClick(p0: View?) {
////        super.onClick(p0)
//        println("onClick called")
//    }
}
