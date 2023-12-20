package com.example.glideexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.glideexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            bLoad.setOnClickListener {
                val url = PhotoProvider.generateRandomPictureUrl()
                Glide.with(this@MainActivity).load(url).timeout(5000)
                    .placeholder(androidx.core.R.drawable.notification_tile_bg)
                    .error(androidx.core.R.drawable.notification_bg).fallback(R.drawable.ic_launcher_background).into(imageView)
            }
            bCircle.setOnClickListener() {
                val url = PhotoProvider.generateRandomPictureUrl()
                Glide.with(this@MainActivity).load(url)
                    .placeholder(androidx.core.R.drawable.notification_tile_bg)
                    .error(androidx.core.R.drawable.notification_bg).fallback(R.drawable.ic_launcher_background).circleCrop().into(imageView)
            }
            bTransform.setOnClickListener() {
                val url = PhotoProvider.generateRandomPictureUrl()
                Glide.with(this@MainActivity).load(url)
                    .placeholder(androidx.core.R.drawable.notification_tile_bg)
                    .error(androidx.core.R.drawable.notification_tile_bg).skipMemoryCache(true).fallback(R.drawable.ic_launcher_background).centerCrop().into(imageView)
            }
        }
    }
}