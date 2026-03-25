package com.example.check_box

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cbPizza = findViewById<CheckBox>(R.id.cbPizza)
        val cbBurger = findViewById<CheckBox>(R.id.cbBurger)
        val cbCoffee = findViewById<CheckBox>(R.id.cbCoffee)
        val btnCalc = findViewById<Button>(R.id.btnCalc)
        btnCalc.setOnClickListener {
            var total = 0
            if (cbPizza.isChecked) {
                total += 150
            }
            if (cbBurger.isChecked) {
                total += 120
            }
            if (cbCoffee.isChecked) {
                total += 80
            }
            if (total == 0) {
                Toast.makeText(this, "Select at least one item", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Total Amount: $total", Toast.LENGTH_SHORT).show()
            }
        }
    }
}