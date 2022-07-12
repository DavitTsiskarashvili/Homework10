package com.example.homework_10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_10.databinding.ProductBinding

class ProductAdapter(private var productList: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder( val binding: ProductBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoryViewHolder(
        ProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = productList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.apply {
            val product = productList[position]
            ivImage.setImageResource(product.image)
            tvDescription.text = product.description
            tvPrice.text = product.price
        }


    }
    fun updateList(list: List<Product>){
        productList = list
        notifyDataSetChanged()
    }
}


