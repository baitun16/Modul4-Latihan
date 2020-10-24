package com.example.tugaswidgetview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val npm = findViewById<EditText>(R.id.editNPM)
        val npmview = npm.text

        val muncul = findViewById<ImageButton>(R.id.btnKirim)
        muncul.setOnClickListener {
            Toast.makeText(this@MainActivity, "NPM $npmview Berhasil Mendaftar", Toast.LENGTH_SHORT).show()
        }

        val batal = findViewById<ImageButton>(R.id.btnCancel)
        batal.setOnClickListener {
            Toast.makeText(this@MainActivity, "Pendaftaran di batalkan", Toast.LENGTH_LONG).show()
        editNama.text.clear()
            editNPM.text.clear()
            radioGroup.clearCheck()
            
        }
    }
}


