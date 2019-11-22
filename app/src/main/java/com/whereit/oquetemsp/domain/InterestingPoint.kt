package com.whereit.oquetemsp.domain

import com.google.android.gms.maps.model.LatLng
import java.io.Serializable

class InterestingPoint (var pointTitle : String, var resume : String, var description : String, var category : String, var favorites : Int, var image : String, var favorite : Boolean,  var lat : Double, var long: Double) : Serializable {

}