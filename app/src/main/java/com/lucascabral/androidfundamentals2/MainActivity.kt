package com.lucascabral.androidfundamentals2

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucascabral.androidfundamentals2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentFilter = IntentFilter("com.lucascabral.myBroadcastMessage")
        val objReceiver = MyBroadcastReceiver()
        registerReceiver(objReceiver, intentFilter)
    }
}