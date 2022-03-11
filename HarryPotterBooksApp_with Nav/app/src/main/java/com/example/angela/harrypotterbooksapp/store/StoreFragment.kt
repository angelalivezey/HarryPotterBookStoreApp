package com.example.angela.harrypotterbooksapp.store

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.angela.harrypotterbooksapp.R
import com.example.angela.harrypotterbooksapp.databinding.FragmentShoppingPageBinding


class StoreFragment : Fragment() {
    private lateinit var viewModel: StoreViewModel
    private lateinit var binding: FragmentShoppingPageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_shopping_page, container, false)
        //TODO Q: how does this work? how does fragmentshoppingpage binding even work as a name?
        //TODO Q: what is container for, false etc.
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_shopping_page, container, false)
        //get viewmodel
        viewModel = ViewModelProvider(this).get(StoreViewModel::class.java)



        //cart navigation click listener
        binding.cartImage.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_shoppingPage_to_cart)
        }



        return binding.root
    }


}

