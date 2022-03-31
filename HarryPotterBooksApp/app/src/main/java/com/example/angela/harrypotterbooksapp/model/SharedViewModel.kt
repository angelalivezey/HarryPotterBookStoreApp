package com.example.angela.harrypotterbooksapp.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val PRICE_PER_BOOK = 8.00

class SharedViewModel : ViewModel() {
    //setting book quantities to be live data, setting them to be zero to start
    private val _bookOneQuantity = MutableLiveData<Int>(0)
    val bookOneQuantity: LiveData<Int> = _bookOneQuantity

    private val _bookTwoQuantity = MutableLiveData<Int>(0)
    val bookTwoQuantity: LiveData<Int> = _bookTwoQuantity

    private val _bookThreeQuantity = MutableLiveData(0)
    val bookThreeQuantity: LiveData<Int> = _bookThreeQuantity

    private val _bookFourQuantity = MutableLiveData(0)
    val bookFourQuantity: LiveData<Int> = _bookFourQuantity

    private val _bookFiveQuantity = MutableLiveData(0)
    val bookFiveQuantity: LiveData<Int> = _bookFiveQuantity

    private val _subtotal = MutableLiveData(0.00)
    val subtotal: MutableLiveData<Double> = _subtotal

    //add functions
    fun addBookOneToCart() {
        _bookOneQuantity.value = bookOneQuantity.value?.plus(1)
    }

    fun addBookTwoToCart() {
        _bookTwoQuantity.value = bookTwoQuantity.value?.plus(1)
    }

    fun addBookThreeToCart() {
        _bookThreeQuantity.value = bookThreeQuantity.value?.plus(1)
    }

    fun addBookFourToCart() {
        _bookFourQuantity.value = bookFourQuantity.value?.plus(1)
    }

    fun addBookFiveToCart() {
        _bookFiveQuantity.value = bookFiveQuantity.value?.plus(1)
    }

    //subtract functions
    fun subtractBookOneFromCart() {
        _bookOneQuantity.value = bookOneQuantity.value?.minus(1)
    }

    fun subtractBookTwoFromCart() {
        _bookTwoQuantity.value = bookTwoQuantity.value?.minus(1)
    }

    fun subtractBookThreeFromCart() {
        _bookThreeQuantity.value = bookThreeQuantity.value?.minus(1)
    }

    fun subtractBookFourFromCart() {
        _bookFourQuantity.value = bookFourQuantity.value?.minus(1)
    }

    fun subtractBookFiveFromCart() {
        _bookFiveQuantity.value = bookFiveQuantity.value?.minus(1)
    }

}
