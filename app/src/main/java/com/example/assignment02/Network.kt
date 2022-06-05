package com.example.assignment02

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Network : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        if (Intent.ACTION_SCREEN_ON == p1?.action) {
            Toast.makeText(p0, "Network On", Toast.LENGTH_SHORT).show()
        }
    }
}