package com.example.internshipui_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        val modelRecyclerView = findViewById<RecyclerView>(R.id.modelRecyclerView)
        modelRecyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        modelRecyclerView.adapter = adapter
    }
}