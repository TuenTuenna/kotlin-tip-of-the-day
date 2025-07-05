package com.jeongdaeri.kotlin_tip_of_the_day

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity :
    AppCompatActivity(),
    View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val someBtn : Button = findViewById<Button>(R.id.some_button)
        someBtn.setOnClickListener(this@MainActivity)
    }

    override fun onClick(p0: View?) {
//        super.onClick(p0)
        println("onClick called")
    }
}
