package com.example.attemptatkotlinconcurrency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {

private val EditText display;
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var display = findViewById<View>(R.id.inputText)

        display.setOnClickListener(View.OnClickListener(){
            @Override
            fun onclick(v:View){
                if (getString(R.string.display).equals(display.getText().toString())){

                }
            }
        })

    }

    fun zeroBtn(view: View) {


    }


}