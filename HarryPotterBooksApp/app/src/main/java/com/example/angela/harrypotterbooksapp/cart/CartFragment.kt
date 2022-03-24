package com.example.angela.harrypotterbooksapp.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.example.angela.harrypotterbooksapp.R
import com.example.angela.harrypotterbooksapp.databinding.FragmentCartBinding
import com.example.angela.harrypotterbooksapp.databinding.FragmentShoppingPageBinding
import com.example.angela.harrypotterbooksapp.model.SharedViewModel

class CartFragment : Fragment() {
    //before onCreateView - create a reference to the view model for this fragment
    private val sharedViewModel: SharedViewModel by activityViewModels()
    private var binding: FragmentCartBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentCartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

}