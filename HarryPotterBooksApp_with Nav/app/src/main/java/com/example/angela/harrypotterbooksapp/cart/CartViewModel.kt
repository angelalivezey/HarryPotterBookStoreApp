package com.example.angela.harrypotterbooksapp.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartViewModel :ViewModel() {
    //setting book quantities to be live data, setting them to be zero to start
    private val _bookOneQuantity = MutableLiveData<Int>()
    val bookOneQuantity: LiveData<Int>
    get() = _bookOneQuantity

    private val _bookTwoQuantity = MutableLiveData<Int>(0)
    val bookTwoQuantity: LiveData<Int>
        get() = _bookTwoQuantity

    private val _bookThreeQuantity = MutableLiveData(0)
    val bookThreeQuantity: LiveData<Int>
        get() = _bookThreeQuantity

    private val _bookFourQuantity = MutableLiveData(0)
    val bookFourQuantity: LiveData<Int>
        get() = _bookFourQuantity

    private val _bookFiveQuantity = MutableLiveData(0)
    val bookFiveQuantity: LiveData<Int>
        get() = _bookFiveQuantity

    //TODO initialize here or above?
init {
    _bookOneQuantity.value = 0
}
fun addOne(){
    _bookOneQuantity.value = 1
}


}