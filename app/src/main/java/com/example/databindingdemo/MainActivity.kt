package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var aPerson: Person = Person("Ali","001122141093","chankl-wm18@student.tarc.edu.my", "123 Japan ABC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData = aPerson

        /*binding.tvName.text = aPerson.name
        binding.tvIC.text = aPerson.ic
        binding.tvEmail.text = aPerson.email
        binding.tvAddress.text = aPerson.address*/

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "gg@gmail.com"
            aPerson.address = "ABC Jolan 123"
            binding.apply { invalidateAll() }
        }


        /*var tvName:TextView = findViewById<TextView>(R.id.tvName)
        var tvIC:TextView = findViewById<TextView>(R.id.tvIC)
        var tvEmail:TextView = findViewById<TextView>(R.id.tvEmail)
        var tvAddress:TextView = findViewById<TextView>(R.id.tvAddress)*/


    }
}