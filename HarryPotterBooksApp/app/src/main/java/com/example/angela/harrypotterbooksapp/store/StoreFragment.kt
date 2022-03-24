package com.example.angela.harrypotterbooksapp.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.angela.harrypotterbooksapp.R
import com.example.angela.harrypotterbooksapp.cart.CartViewModel
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


    }

