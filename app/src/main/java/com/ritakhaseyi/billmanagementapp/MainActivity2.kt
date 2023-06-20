package com.ritakhaseyi.billmanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ritakhaseyi.billmanagementapp.databinding.ActivityMain2Binding
import com.ritakhaseyi.billmanagementapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)




    }

    override fun onResume() {
        super.onResume()
        binding.button.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            valdateSignup()
        }

    }

    fun valdateSignup(){

        val lastName=binding.etLastname.text.toString()
        val Email=binding.etEmail.text.toString()
        val password=binding.etPassword.text.toString()

        var error=false


        if (lastName.isBlank()){
            binding.tilLastname.error="Last name is required"
            error=true
        }

        if (Email.isBlank()){
            binding.tilEmail.error="Email is required"
            error=true
        }
        if (Email !="ritakhaseyi@gmail.com"){
            binding.tilEmail.error="invalid email"
        }

        if (password.isBlank()){
            binding.tilPassword.error="password is required"
            error=true
        }
        if (password != "sandpaper"){
            binding.tilPassword.error="wrong password"
        }

        if(!error){
            Toast.makeText(this,"$lastName $Email",Toast.LENGTH_LONG)
                .show()
        }





    }

}