package com.example.assignment02

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class Receivers: BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        if (Intent.ACTION_BOOT_COMPLETED == p1?.action) {
            Toast.makeText(p0, "Boot Complete", Toast.LENGTH_SHORT).show()
        }
    }
}