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

//        //TODO initialize here or above?

        fun addOne(){
            _bookOneQuantity.postValue(bookOneQuantity.value?.plus(1))
        }
    }
