package com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.viewModel04_17

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.ApiInstance_04_17
import com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17.Product_04_17
import kotlinx.coroutines.launch

class ProductViewModel_04_17: ViewModel() {


    private val _products = MutableLiveData<List<Product_04_17>>()
    val products: LiveData<List<Product_04_17>> get() = _products

    init {
        viewModelScope.launch{
            fetchProducts()
        }


    }

    private suspend fun fetchProducts() {
        try {
            val response = ApiInstance_04_17.apiservice0417.getProducts()

            _products.postValue(response)
        }catch (e: Exception){

        }
    }

}