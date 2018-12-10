package com.andiinsanudin.autoappversiontest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apk_version_name.text = BuildConfig.VERSION_NAME + " - " + BuildConfig.VERSION_CODE
    }
}
