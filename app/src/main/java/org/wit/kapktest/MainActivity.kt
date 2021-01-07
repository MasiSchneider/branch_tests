package org.wit.kapktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.wit.kapktest.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            setContentView(R.layout.activity_test2)
        }




    }
}