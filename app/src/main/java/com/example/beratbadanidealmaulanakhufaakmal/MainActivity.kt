package com.example.beratbadanidealmaulanakhufaakmal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var Tinggi : EditText
    private lateinit var Hasil : TextView
    private lateinit var Lakilaki : RadioButton
    private lateinit var Perempuan : RadioButton
    private lateinit var Proses : Button

    private var tb : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tinggi = findViewById(R.id.Ettinggi)
        Hasil = findViewById(R.id.hasil)
        Lakilaki = findViewById(R.id.rblakilaki)
        Perempuan = findViewById(R.id.rbperempuan)
        Proses = findViewById(R.id.BTNproses)

        Proses.setOnClickListener {
            var tinggi = Tinggi.text.toString().toInt()

            if (Lakilaki.isChecked) {
                tb = (tinggi - 100) - ((tinggi - 100) * 10 / 100)
                Hasil.setText(tb.toString() + "kg")

            }else{
                tb = (tinggi - 100)- ((tinggi - 100) * 15/100)
                Hasil.setText(tb.toString()+"kg")
            }
        }
    }
}