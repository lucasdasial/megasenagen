package com.example.megasenagen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val toolbar = findViewById<Toolbar>(R.id.app_toolbar)
//        setActionBar(toolbar)

        val editTextNumber: EditText = findViewById(R.id.editText_number)
        val textResult: TextView = findViewById(R.id.text_result)
        val buttonSort: Button = findViewById(R.id.button_sort)


        fun generateNumbers() {
            val editTextNumberValue = editTextNumber.text.toString()
            if (editTextNumberValue.isEmpty()) {
                Toast.makeText(this, "Digite um número entre 6 e 15!", Toast.LENGTH_LONG).show()
                return
            }

            val quantity = editTextNumberValue.toInt()

            if (quantity < 6 || quantity >15){
                Toast.makeText(this, "Digite um número entre 6 e 15!", Toast.LENGTH_LONG).show()
                return
            }

            val numbers = mutableSetOf<Int>()
            val random = Random()

            while (true){
                val number = random.nextInt(60)
                numbers.add(number +1)
                if(numbers.size == quantity){
                    break
                }
            }

            textResult.text = numbers.joinToString(", ")
        }


        buttonSort.setOnClickListener {
            generateNumbers()
        }


    }
}