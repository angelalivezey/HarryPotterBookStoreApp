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
        fragmentBinding.sharedViewModel = sharedViewModel
        binding = fragmentBinding
        //solved data not updatng between fragments
        binding?.lifecycleOwner = viewLifecycleOwner
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // Set up the button click listeners
            cartImage.setOnClickListener { navToCart() }
            book1Button.setOnClickListener { (sharedViewModel?.addBookOneToCart()); sharedViewModel?.addPriceToSubtotal() }
            book2Button.setOnClickListener { (sharedViewModel?.addBookTwoToCart()); sharedViewModel?.addPriceToSubtotal() }
            book3Button.setOnClickListener { (sharedViewModel?.addBookThreeToCart()); sharedViewModel?.addPriceToSubtotal() }
            book4Button.setOnClickListener { (sharedViewModel?.addBookFourToCart()); sharedViewModel?.addPriceToSubtotal() }
            book5Button.setOnClickListener { (sharedViewModel?.addBookFiveToCart()); sharedViewModel?.addPriceToSubtotal() }
        }
    }


    private fun navToCart() {
        findNavController().navigate(R.id.action_shoppingPage_to_cart)
    }
}
