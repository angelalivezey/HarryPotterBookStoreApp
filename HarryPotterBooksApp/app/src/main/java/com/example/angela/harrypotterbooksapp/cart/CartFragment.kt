package com.example.angela.harrypotterbooksapp.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.angela.harrypotterbooksapp.databinding.FragmentCartBinding
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

        fragmentBinding.sharedViewModel = sharedViewModel
        binding = fragmentBinding
        //solved data not updatng between fragments
        binding?.lifecycleOwner = viewLifecycleOwner

        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // add books to cart
            buttonAddB1.setOnClickListener { sharedViewModel?.addBookOneToCart(); sharedViewModel?.addPriceToSubtotal() }
            buttonAddBook2.setOnClickListener { sharedViewModel?.addBookTwoToCart(); sharedViewModel?.addPriceToSubtotal() }
            buttonAddBook3.setOnClickListener { sharedViewModel?.addBookThreeToCart(); sharedViewModel?.addPriceToSubtotal() }
            buttonAddBook4.setOnClickListener { sharedViewModel?.addBookFourToCart(); sharedViewModel?.addPriceToSubtotal() }
            buttonAddBook5.setOnClickListener { sharedViewModel?.addBookFiveToCart(); sharedViewModel?.addPriceToSubtotal() }
            //subtract books from cart
            buttonSubtractB1.setOnClickListener { sharedViewModel?.subtractBookOneFromCart(); sharedViewModel?.subtractPriceFromSubtotal() }
            buttonSubtractBook2.setOnClickListener { sharedViewModel?.subtractBookTwoFromCart(); sharedViewModel?.subtractPriceFromSubtotal() }
            buttonSubtractBook3.setOnClickListener { sharedViewModel?.subtractBookThreeFromCart(); sharedViewModel?.subtractPriceFromSubtotal() }
            buttonSubtractBook4.setOnClickListener { sharedViewModel?.subtractBookFourFromCart(); sharedViewModel?.subtractPriceFromSubtotal() }
            buttonSubtractBook5.setOnClickListener { sharedViewModel?.subtractBookFiveFromCart(); sharedViewModel?.subtractPriceFromSubtotal() }

        }
    }

//      apply is a scope function in the Kotlin standard library.
//        It executes a block of code within the context of an object.
//        It forms a temporary scope, and in that scope, you can access the object
//        without its name. The common use case for apply is to configure an object.
//        Such calls can be read as "apply the following assignments to the object."
//        binding?.apply {
//            viewModel = sharedViewModel
//        }
}