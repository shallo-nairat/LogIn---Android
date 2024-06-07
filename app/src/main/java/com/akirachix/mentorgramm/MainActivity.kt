package com.akirachix.mentorgramm

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorgramm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.etLogin.setOnClickListener {
            val intent=Intent(this,LogIn::class.java)
            startActivity(intent)
        }
        binding.etBtnRegister.setOnClickListener {
            validateRegistration()
        }
    }

    fun validateRegistration(){
        var formError=false
        val firstName=binding.etFirstName.text.toString()
        if(firstName.isBlank()){
            formError=true
            binding.tilFirstName.error="First name is required"
        }

        val lastName=binding.tilLastName.text.toString()
        if(lastName.isBlank()){
            formError=true
            binding.tilLastName.error="Last name is required"
        }
        val codeHive=binding.CodehiveId.text.toString()
        if(codeHive.isBlank()){
            formError=true
            binding.CodehiveId.error="Last name is required"
        }
        val email=binding.tilEmail.text.toString()
        if(email.isBlank()){
            formError=true
            binding.tilEmail.error="Email is required"
        }
        val username=binding.tilUserName.text.toString()
        if(username.isBlank()){
            formError=true
            binding.tilUserName.error="Username is required"
        }
        val password=binding.tilPassword.text.toString()
        if(password.isBlank()){
            formError=true
            binding.tilPassword.error="Password is required"
        }
        val passwordConf=binding.tilConfirmPassword.text.toString()
        if(passwordConf.isBlank()){
            formError=true
            binding.tilConfirmPassword.error="Password is required"
        }
        if (password!=passwordConf){
            formError= true
            binding.tilConfirmPassword.error="Passwords don't match"
        }
        if(!formError){
//            proceed to registration
        }

    }
    fun clearErrors(){
        binding.tilConfirmPassword.error=null
        binding.tilPassword.error=null
        binding.tilUserName.error=null
        binding.tilEmail.error=null
        binding.CodehiveId.error=null
        binding.tilLastName.error=null
        binding.etFirstName.error=null

    }


}









