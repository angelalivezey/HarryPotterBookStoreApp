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

        fragmentBinding.sharedViewModel = sharedViewModel
        binding = fragmentBinding
        //fragmentBinding.setLifecycleOwner(this)
        return fragmentBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // Set up the button click listeners
            buttonAddB1.setOnClickListener { (sharedViewModel?.addOne()) }

        }
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
////        apply is a scope function in the Kotlin standard library.
////        It executes a block of code within the context of an object.
////        It forms a temporary scope, and in that scope, you can access the object
////        without its name. The common use case for apply is to configure an object.
////        Such calls can be read as "apply the following assignments to the object."
//        binding?.apply {
//            viewModel = sharedViewModel
//        }
//    }
}