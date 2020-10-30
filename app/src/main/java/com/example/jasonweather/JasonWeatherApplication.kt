package com.example.jasonweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class JasonWeatherApplication : Application() {
    companion object{

        const val TOKEN = "mBGz3N1uXzmS3B6G";

        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context;
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext;
    }
}