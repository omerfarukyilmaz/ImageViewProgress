package com.ofylab.sample

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initSample()
    }

    private fun initSample() {
        Toast.makeText(this, "User is picking a file", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            Toast.makeText(this, "User picked an image", Toast.LENGTH_SHORT).show()
            imageViewProgress.visibility = View.VISIBLE
        }, TimeUnit.SECONDS.toMillis(2))

        Handler().postDelayed({
            Toast.makeText(this, "File is starting to upload", Toast.LENGTH_SHORT).show()
            imageViewProgress.progressBarVisible()
        }, TimeUnit.SECONDS.toMillis(4))

        Handler().postDelayed({
            Toast.makeText(this, "File upload progress: 30%", Toast.LENGTH_SHORT).show()
            imageViewProgress.progressBarProgress(30)
        }, TimeUnit.SECONDS.toMillis(6))

        Handler().postDelayed({
            Toast.makeText(this, "File upload progress: 60%", Toast.LENGTH_SHORT).show()
            imageViewProgress.progressBarProgress(60)
        }, TimeUnit.SECONDS.toMillis(8))

        Handler().postDelayed({
            Toast.makeText(this, "File upload progress: 100%", Toast.LENGTH_SHORT).show()
            imageViewProgress.progressBarProgress(100)
        }, TimeUnit.SECONDS.toMillis(10))

        Handler().postDelayed({
            Toast.makeText(this, "File upload done", Toast.LENGTH_SHORT).show()
            imageViewProgress.progressBarGone()
        }, TimeUnit.SECONDS.toMillis(12))
    }

}
