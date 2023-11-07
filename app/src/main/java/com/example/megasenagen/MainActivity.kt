package com.example.megasenagen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNumber: EditText = findViewById(R.id.editText_number)
        val textResult: TextView = findViewById(R.id.text_result)
        val buttonSort: Button = findViewById(R.id.button_sort)

        buttonSort.setOnClickListener {
            Log.i("Teste", "Clicando !");
        }

    }
}