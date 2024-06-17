package com.example.weatherapp.api


import com.google.gson.annotations.SerializedName

data class Current(
    @SerializedName("cloud")
    val cloud: String,
    @SerializedName("condition")
    val condition: Condition,
    @SerializedName("dewpoString_c")
    val dewpoStringC: String,
    @SerializedName("dewpoString_f")
    val dewpoStringF: String,
    @SerializedName("feelslike_c")
    val feelslikeC: String,
    @SerializedName("feelslike_f")
    val feelslikeF: String,
    @SerializedName("gust_kph")
    val gustKph: String,
    @SerializedName("gust_mph")
    val gustMph: String,
    @SerializedName("heatindex_c")
    val heatindexC: String,
    @SerializedName("heatindex_f")
    val heatindexF: String,
    @SerializedName("humidity")
    val humidity: String,
    @SerializedName("is_day")
    val isDay: String,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: String,
    @SerializedName("precip_in")
    val precipIn: String,
    @SerializedName("precip_mm")
    val precipMm: String,
    @SerializedName("pressure_in")
    val pressureIn: String,
    @SerializedName("pressure_mb")
    val pressureMb: String,
    @SerializedName("temp_c")
    val tempC: String,
    @SerializedName("temp_f")
    val tempF: String,
    @SerializedName("uv")
    val uv: String,
    @SerializedName("vis_km")
    val visKm: String,
    @SerializedName("vis_miles")
    val visMiles: String,
    @SerializedName("wind_degree")
    val windDegree: String,
    @SerializedName("wind_dir")
    val windDir: String,
    @SerializedName("wind_kph")
    val windKph: String,
    @SerializedName("wind_mph")
    val windMph: String,
    @SerializedName("windchill_c")
    val windchillC: String,
    @SerializedName("windchill_f")
    val windchillF: String
)