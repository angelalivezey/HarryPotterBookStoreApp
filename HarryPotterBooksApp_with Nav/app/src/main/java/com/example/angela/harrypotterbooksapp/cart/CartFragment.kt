package com.example.angela.harrypotterbooksapp.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.angela.harrypotterbooksapp.R
import com.example.angela.harrypotterbooksapp.databinding.FragmentCartBinding
import com.example.angela.harrypotterbooksapp.databinding.FragmentShoppingPageBinding

class CartFragment : Fragment() {
    //before onCreateView - create a reference to the view model for this fragment
  private lateinit var viewModel: CartViewModel
    private lateinit var binding: FragmentCartBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_cart,
            container,
            false
        )
        viewModel = ViewModelProvider(this).get(CartViewModel::class.java)

    binding.cartViewModel = viewModel

        return binding.root
    }

}