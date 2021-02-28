package com.offtline.controldailypayment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.offtline.controldailypayment.databinding.ActivityMainBinding
import java.io.DataOutputStream

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.title.text = applicationContext.getString(R.string.home)
        binding.bottomnavigation.setOnNavigationItemSelectedListener(mBottomNavigationView)
    }

    private val mBottomNavigationView = BottomNavigationView.OnNavigationItemSelectedListener {item: MenuItem ->
        when(item.itemId){
            R.id.dashboard->{
                binding.title.text = applicationContext.getString(R.string.dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.home->{
                binding.title.text = applicationContext.getString(R.string.home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.report->{
                binding.title.text = applicationContext.getString(R.string.Report)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
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

