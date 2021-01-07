package org.wit.kapktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.wit.kapktest.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.info
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast


class MainActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener() {
            //setContentView(R.layout.activity_test2)
            info("New feature 1 added")
        }




    }
}