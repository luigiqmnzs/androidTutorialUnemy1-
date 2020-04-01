package com.example.conversodemoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcular.setOnClickListener {
            converterMoedas()
        }
    }

    private fun converterMoedas(){
        if(valorReal.text.toString() != "") {
            var dinheiroReal = valorReal.text.toString()
            var realDouble = dinheiroReal.toDouble()
            var dolarDouble = realDouble / 5.25
            dolarDouble = Math.round(dolarDouble * 100.0) / 10.00
            var euroDouble = realDouble / 5.76
            euroDouble = Math.round(euroDouble * 100.0) / 10.00
            valorDolar.setText(dolarDouble.toString())
            valorEuro.setText(euroDouble.toString())
        }
    }
}
