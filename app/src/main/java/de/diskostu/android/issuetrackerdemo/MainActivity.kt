package de.diskostu.android.issuetrackerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // if Timber is in the dependencies, there is a quick fix available for using it
        Log.i("MainActivity", "demo logging")

        // after using the quick fix, this is produced:
        // Log.Timber.i("demo logging")
        // so we have to remove "Log." manually.
    }
}