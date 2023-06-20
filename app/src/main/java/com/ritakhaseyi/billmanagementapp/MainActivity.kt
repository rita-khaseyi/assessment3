package com.ritakhaseyi.billmanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ritakhaseyi.billmanagementapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }

    override fun onResume() {
        super.onResume()
        binding.tvlogin.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            valdateSignup()
        }

    }

    fun valdateSignup(){
        val firstName=binding.etFirstname.text.toString()
        val lastName=binding.etLastname.text.toString()
        val Email=binding.etEmail.text.toString()
        val password=binding.etPassword.text.toString()
        val passwordConfirmation=binding.etpasswordConfirmation.text.toString()
        var error=false
        if (firstName.isBlank()){
            binding.tilFirstname.error="first name is required"
            error=true
        }

        if (lastName.isBlank()){
            binding.tilLastname.error="Last name is required"
            error=true
        }

        if (Email.isBlank()){
            binding.tilEmail.error="Email is required"
            error=true
        }


        if (password.isBlank()){
            binding.tilPassword.error="password is required"
            error=true
        }

        if (passwordConfirmation.isBlank()){
            binding.tilPasswordConfirmation.error="password confirmation is required"
            error=true
        }
        if(password !=passwordConfirmation){
            binding.tilPasswordConfirmation.error="password and passsword confirmation do not match"
            error=true
        }
        if(!error){
            Toast.makeText(this,"$firstName $lastName $Email",Toast.LENGTH_LONG)
                .show()
        }





    }

}