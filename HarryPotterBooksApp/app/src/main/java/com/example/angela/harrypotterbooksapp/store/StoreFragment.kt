package com.example.angela.harrypotterbooksapp.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.angela.harrypotterbooksapp.R
import com.example.angela.harrypotterbooksapp.cart.CartViewModel
import com.example.angela.harrypotterbooksapp.databinding.FragmentShoppingPageBinding


class StoreFragment : androidx.fragment.app.Fragment() {
    private lateinit var viewModel: CartViewModel
    private lateinit var binding: FragmentShoppingPageBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_shopping_page, container, false)
        //get viewmodel
        viewModel = ViewModelProvider(this).get(CartViewModel::class.java)

        //TODO not sure here
       // binding.cartViewModel = viewModel

       // binding.setlifecycleOwner(this)

        //cart navigation click listener
        binding.cartImage.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_shoppingPage_to_cart)
        }

        binding.book1Button.setOnClickListener{
            viewModel.addOne()
        }


        //need to have an on click listener here. This will need to update values in the cart Viewmodel
        //how do you access that







        return binding.root
    }


}

