package com.unsplash.pickerandroid.example

import android.app.Application
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker

class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // initializing the picker library
        UnsplashPhotoPicker.init(
            this,
            "W_YEjexuiB7Afik8ZQ2iwsLJmUf6ipIeutFjQ_gpdyQ",
            "sSIiUFgvhRCUWbwcOF9H7oi00S0sj_ifsQx861RON9w",
            20
        )
            /* .setLoggingEnabled(true) // if you want to see the http requests */
    }
}
