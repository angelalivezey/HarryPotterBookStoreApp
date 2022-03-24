package com.example.angela.harrypotterbooksapp.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.angela.harrypotterbooksapp.R
import com.example.angela.harrypotterbooksapp.databinding.FragmentShoppingPageBinding
import com.example.angela.harrypotterbooksapp.model.SharedViewModel


class StoreFragment : androidx.fragment.app.Fragment() {
    private val sharedViewModel: SharedViewModel by activityViewModels()
    private var binding: FragmentShoppingPageBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentShoppingPageBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // Set up the button click listeners
            cartImage.setOnClickListener { navToCart() }

        }
    }


    private fun navToCart(){
        findNavController().navigate(R.id.action_shoppingPage_to_cart)
    }

    }



