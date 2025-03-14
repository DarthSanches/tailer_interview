package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {

    lateinit var list: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = findViewById(R.id.recycler_view)
        list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        list.adapter = RecyclerAdapter(listOf(
            Item("title1", "description1"),
            Item("title2", "description2"),
            Item("title3", "description3"),
            Item("title4", "description4"),
            Item("title5", "description5")
        )) { item ->
            Toast.makeText(
                applicationContext,
                "${item.title} : ${item.description}",
                Toast.LENGTH_LONG
            ).show()
        }
    }

}