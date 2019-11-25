package com.whereit.oquetemsp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.squareup.picasso.Picasso
import com.whereit.oquetemsp.domain.InterestingPoint
import kotlinx.android.synthetic.main.activity_interesting_point_detail.*
import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import android.view.View
import android.view.WindowManager
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.whereit.oquetemsp.R


class InterestingPointDetailActivity : AppCompatActivity(), OnMapReadyCallback {


    lateinit var interestingPoint : InterestingPoint
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interesting_point_detail)


        interestingPoint = intent.getSerializableExtra(getString(R.string.interesting_point)) as InterestingPoint

        toolbar.setTitleTextAppearance(this, R.style.ToolbarTheme)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        if (Build.VERSION.SDK_INT >=  Build.VERSION_CODES.LOLLIPOP){
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }

        supportActionBar?.title = ""

        txtTitle.text = interestingPoint.pointTitle
        Picasso.get().load(interestingPoint.image).into(backdrop)
        txtAddress.setText(interestingPoint.address)
        txtDescription.text = interestingPoint.resume

        txtSeeMoreDescription.setOnClickListener {
            txtDescription.text = interestingPoint.description
            txtSeeMoreDescription.visibility = View.GONE
        }

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val pointer = LatLng(interestingPoint.lat, interestingPoint.long)
        mMap.addMarker(MarkerOptions().position(pointer).title(interestingPoint.pointTitle))
        mMap.setMinZoomPreference(15.0f)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pointer))

        mMap.setOnMapClickListener { latLng ->

        }
    }




}
