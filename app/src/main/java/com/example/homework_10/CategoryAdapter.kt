package com.example.homework_10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_10.databinding.CategoryBinding

class CategoryAdapter(private var categoryList: MutableList<Category>) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    var onCategoryClicked: ((text: String) -> Unit)? = null

    inner class CategoryViewHolder(val binding: CategoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoryViewHolder(
        CategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = categoryList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.apply {
            val category = categoryList[position]
            btn.text = category.text
            btn.setTextColor(category.textColor)
            btn.setTextColor(category.background)
            onCategoryClicked?.invoke(category.text)
        }

    }
}


