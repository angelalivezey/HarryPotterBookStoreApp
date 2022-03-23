package com.example.angela.harrypotterbooksapp

import android.app.Activity
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.ActivityNavigator
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI


class MainActivity : AppCompatActivity() {

//TODO Question: What is action bar for?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//    //TODO what is even happening here, data binding
// val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
//  // val binding : ActivityMainBinding =  DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val navController = this.findNavController(R.id.navigation_hp)
//        NavigationUI.setupActionBarWithNavController(this, navController)
//
//    }
////TODO Question: What is this section for?
//// What is .navigateUp() for?
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = this.findNavController(R.id.navigation_hp)
//        return navController.navigateUp()
//    }
