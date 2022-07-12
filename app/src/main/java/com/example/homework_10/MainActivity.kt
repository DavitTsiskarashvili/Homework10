package com.example.homework_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework_10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var productAdapter: ProductAdapter


    private val categoryList = mutableListOf<Category>()
    private val productList = mutableListOf<Product>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initCategoryRecyclerView()
        initProductRecyclerView()

    }

    private fun initCategoryRecyclerView() {
        setDataCategoryList()
        categoryAdapter = CategoryAdapter(categoryList)
        categoryAdapter.onCategoryClicked = { text ->
            if (text == getString(R.string.btnText_all)) {
                productAdapter.updateList(productList)
            } else {
                val newList = productList.filter { product ->
                    product.categoryType == text
                }
                productAdapter.updateList(newList)
            }
        }
        binding.rvCategory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategory.adapter = categoryAdapter
    }

    private fun initProductRecyclerView() {
        setDataProductList()
        productAdapter = ProductAdapter(productList)
        binding.rvProducts.layoutManager = GridLayoutManager(this, 2)
        binding.rvProducts.adapter = productAdapter
    }


    private fun setDataCategoryList() {
        categoryList.add(
            Category(
                text = getString(R.string.btnText_all),
                textColor = getColor(R.color.green),
                background = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Category(
                text = getString(R.string.btnText_party),
                textColor = getColor(R.color.text_color),
                background = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Category(
                text = getString(R.string.btnText_beach),
                textColor = getColor(R.color.text_color),
                background = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Category(
                text = getString(R.string.btnText_category1),
                textColor = getColor(R.color.text_color),
                background = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Category(
                text = getString(R.string.btnText_category2),
                textColor = getColor(R.color.text_color),
                background = getColor(R.color.grey)
            )
        )

        categoryList.add(
            Category(
                text = getString(R.string.btnText_category3),
                textColor = getColor(R.color.text_color),
                background = getColor(R.color.grey)
            )
        )

    }

    private fun setDataProductList() {
        productList.add(
            Product(
                categoryType = getString(R.string.category_party),
                image = R.drawable.product1,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )


        productList.add(
            Product(
                categoryType = getString(R.string.category_party),
                image = R.drawable.product2,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Product(
                categoryType = getString(R.string.category_beach),
                image = R.drawable.product3,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Product(
                categoryType = getString(R.string.category_beach),
                image = R.drawable.product4,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Product(
                categoryType = getString(R.string.category_camping),
                image = R.drawable.product1,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Product(
                categoryType = getString(R.string.category_camping),
                image = R.drawable.product2,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Product(

                categoryType = getString(R.string.category_1),
                image = R.drawable.product3,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Product(

                categoryType = getString(R.string.category_2),
                image = R.drawable.product4,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )

        productList.add(
            Product(

                categoryType = getString(R.string.category_3),
                image = R.drawable.product1,
                description = getString(R.string.description),
                price = getString(R.string.price)
            )
        )
    }
}

