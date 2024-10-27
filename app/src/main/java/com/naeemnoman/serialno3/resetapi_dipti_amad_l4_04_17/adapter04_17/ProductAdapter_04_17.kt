package com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.adapter04_17

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.Product_04_17
import com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.R


class   ProductAdapter_04_17(private val products:List<Product_04_17>):RecyclerView.Adapter<ProductAdapter_04_17.ProductViewHolder>() {
    inner class ProductViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val productImg = itemView.findViewById<ImageView>(R.id.productImage)
        val productName = itemView.findViewById<TextView>(R.id.nameTxt)
        val productPrice =  itemView.findViewById<TextView>(R.id.productPriceTxt)
        val productDescription = itemView.findViewById<TextView>(R.id.productDescriptionTxt)

        fun bind(product: Product_04_17){
            productName.text = product.title
            productPrice.text = "$${product.price}"
            productDescription.text = product.description
            Glide.with(itemView).load(product.images[0])
                .into(productImg)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list_04_17,parent,false)

        return ProductViewHolder(view)

    }


    override fun getItemCount(): Int {
        return products.size
    }


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product)
    }

}