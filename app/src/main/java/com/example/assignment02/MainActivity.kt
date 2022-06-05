package com.example.assignment02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.IntentFilter
import android.net.ConnectivityManager

class MainActivity : AppCompatActivity() {
    lateinit var airplaneMode: AirplaneMode
    private val bootreceiver: Receivers = Receivers()
    private val batterychange: Receiver1 = Receiver1()
    private val screenreceiver: Network = Network()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        airplaneMode = AirplaneMode()

        val intentFilter:IntentFilter= IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        intentFilter.addAction(Intent.ACTION_BOOT_COMPLETED)
        registerReceiver(bootreceiver,intentFilter)

        val intentFilter1:IntentFilter= IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED)
        registerReceiver(batterychange,intentFilter1)

        val intentFilter2:IntentFilter= IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        intentFilter2.addAction(Intent.ACTION_SCREEN_ON)
        registerReceiver(screenreceiver,intentFilter2)

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(airplaneMode, it)
        }

        val startBtn = findViewById<View>(R.id.startBtn) as Button
        val playBtn = findViewById<View>(R.id.playBtn) as Button
        val stopBtn = findViewById<View>(R.id.stopBtn) as Button

        startBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, Page1Activity::class.java))
        }
        playBtn.setOnClickListener()
        {
            startService(Intent(this, MediaServices::class.java))
        }
        stopBtn.setOnClickListener()
        {
            stopService(Intent(this, MediaServices::class.java))
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airplaneMode)
        unregisterReceiver(bootreceiver)
        unregisterReceiver(batterychange)
        unregisterReceiver(screenreceiver)
    }
}