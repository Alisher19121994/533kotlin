package com.example.a533kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class Adapter_View( var list: ArrayList<Int>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_view, parent, false)
        return MyHorizontalView(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chats = list[position]
        if (holder is MyHorizontalView) {
            holder.lottie.setAnimation(chats)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    inner class MyHorizontalView(item: View) : RecyclerView.ViewHolder(item) {
        val lottie: LottieAnimationView = item.findViewById(R.id.lotti_id)
    }
}