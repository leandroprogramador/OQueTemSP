package com.whereit.oquetemsp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.Time
import com.whereit.oquetemsp.R
import java.util.*
import java.util.concurrent.TimeUnit
import javax.xml.datatype.DatatypeConstants.HOURS






class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.frameLayout, ExplorarFragment()).commit()



    }
}
