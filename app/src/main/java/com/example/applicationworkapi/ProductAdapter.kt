package com.example.applicationworkapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applicationworkapi.model.Product

class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

}

class ProductAdapter(
    private val context:Context,
    private val productList: List<Product>) : RecyclerView.Adapter<ProductViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}