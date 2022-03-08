package com.example.angela.harrypotterbooksapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.angela.harrypotterbooksapp.databinding.FragmentShoppingPageBinding


class ShoppingPage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_shopping_page, container, false)
        //TODO Q: how does this work? how does fragmentshoppingpage binding even work as a name?
        //TODO Q: what is container for, false etc.
        val binding = DataBindingUtil.inflate<FragmentShoppingPageBinding>(inflater, R.layout.fragment_shopping_page, container, false)

        binding.cartImage.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_shoppingPage_to_cart)
        }
        return binding.root
    }


}