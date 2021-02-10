package com.intoverflown.sasakaziprototype.UserAuth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.intoverflown.sasakaziprototype.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun intentToSignup(view: View) {}
}