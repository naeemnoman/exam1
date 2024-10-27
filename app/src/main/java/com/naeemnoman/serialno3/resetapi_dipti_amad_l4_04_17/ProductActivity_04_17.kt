package com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.adapter04_17.ProductAdapter_04_17
import com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.viewModel04_17.ProductViewModel_04_17

class ProductActivity_04_17 : AppCompatActivity() {
    private lateinit var productViewModel: ProductViewModel_04_17
    private lateinit var productAdapter: ProductAdapter_04_17
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_04_17)

        productViewModel = ViewModelProvider(this).get(ProductViewModel_04_17::class.java)
        productAdapter = ProductAdapter_04_17(emptyList())

        val refreshBtn:FloatingActionButton = findViewById(R.id.refreshBtn)
        refreshBtn.setOnClickListener {
            startActivity(Intent(this@ProductActivity_04_17, MainActivity::class.java))
            finish()
        }

        val recyclerView : RecyclerView = findViewById(R.id.productRv)
        recyclerView.layoutManager = LinearLayoutManager(this)


        productViewModel.products.observe(this) { products ->
            productAdapter = ProductAdapter_04_17(products)
            recyclerView.adapter = productAdapter



        }

    }
}