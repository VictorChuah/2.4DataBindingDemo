package com.example.a24databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.a24databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("Ali","12341","214@g34gh.com","lot123141")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.tvName.text = aPerson.name
//        binding.tvIc.text = aPerson.ic
//        binding.tvEmail.text = aPerson.email
//        binding.tvAddress.text = aPerson.address

        binding.personData = aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "xxx@gmail.com"

            binding.apply { invalidateAll() }
        }

    }
}