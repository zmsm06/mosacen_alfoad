package com.zeinabmallaki.mosacen_alfoad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.zeinabmallaki.mosacen_alfoad.databinding.ActivitySplBinding

class SplActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000

        )
    }

}