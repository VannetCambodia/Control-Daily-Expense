package com.offtline.controldailypayment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.offtline.controldailypayment.databinding.ActivityMainBinding
import java.io.DataOutputStream

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding.bottomnavigation.setOnNavigationItemReselectedListener {
            BottomNavigationView.OnNavigationItemSelectedListener { 
                when(it.itemId){
                    R.id.dashboard->{
                        Toast.makeText(applicationContext,"Dashboard",Toast.LENGTH_SHORT).show()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.home->{
                        Toast.makeText(applicationContext,"Home",Toast.LENGTH_SHORT).show()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.report->{
                        Toast.makeText(applicationContext,"Report",Toast.LENGTH_SHORT).show()
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            }
        }
    }

    fun open_navigation(view: View) {
        Toast.makeText(applicationContext,"Hello",Toast.LENGTH_SHORT).show()
    }

    fun loadFragment(fragment:Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}