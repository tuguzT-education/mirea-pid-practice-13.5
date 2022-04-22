package io.github.tuguzt.simplereceiver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.tuguzt.simplereceiver.databinding.ActivityReceivingBinding

class ReceivingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReceivingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityReceivingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent?.action == Intent.ACTION_SEND) {
            val text = intent.getStringExtra(Intent.EXTRA_TEXT)
            binding.editText.setText(text)
        }
    }
}
