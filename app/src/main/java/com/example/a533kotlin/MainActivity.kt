package com.example.a533kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
    }
    private fun open() {
        horizontal_main_recyclerview_id.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val list = ArrayList<Int>()
        list.add(R.raw.cycling)
        list.add(R.raw.delivering)
        list.add(R.raw.cycling)
        list.add(R.raw.delivering)
        list.add(R.raw.c_2)
        list.add(R.raw.delivering)
        list.add(R.raw.c_2)
        list.add(R.raw.delivering)
        list.add(R.raw.c_2)
        val helper = PagerSnapHelper()
        helper.attachToRecyclerView(horizontal_main_recyclerview_id)
        val adapter = Adapter_View(list)
        horizontal_main_recyclerview_id.adapter = adapter
    }
}