package com.example.facestagramandroid.network

import org.json.JSONObject

class PlaceRequest : EntityRequestCallback() {
    override val entityUrl: String
        get() = "place"

    override fun getEntityId(entity: JSONObject): Int {
        return entity.getInt("placeId")
    }

}