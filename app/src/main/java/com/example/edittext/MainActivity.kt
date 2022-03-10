package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.math.BigInteger


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba = findViewById<EditText>(R.id.EditText)

        var DecToHex = findViewById<Button>(R.id.DecToHex)
        var DecToBin = findViewById<Button>(R.id.DecToBin)

        var HexToDec = findViewById<Button>(R.id.HexToDec)
        var HexToBin = findViewById<Button>(R.id.HexToBin)

        var BinToDec = findViewById<Button>(R.id.BinToDec)
        var BinToHex = findViewById<Button>(R.id.BinToHex)

        //           --------------------------------------------------------

        DecToHex.setOnClickListener() {

            val string: String = liczba.text.toString()

            val i = string.toInt()

            val hexadecimal = Integer.toHexString(i)

            liczba.setText(hexadecimal)
        }
        DecToBin.setOnClickListener() {

        }
        //           --------------------------------------------------------

        HexToDec.setOnClickListener() {

            val string: String = liczba.text.toString()

            val decimal = BigInteger(string, 16).toString()

            liczba.setText(decimal)
        }
        HexToBin.setOnClickListener() {

        }

        //           --------------------------------------------------------

        BinToDec.setOnClickListener() {

        }
        BinToHex.setOnClickListener() {

        }

        //           --------------------------------------------------------

    }
}