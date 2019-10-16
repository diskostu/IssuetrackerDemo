package de.diskostu.android.issuetrackerdemo

import android.app.Application
import timber.log.Timber

@Suppress("unused")
class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}