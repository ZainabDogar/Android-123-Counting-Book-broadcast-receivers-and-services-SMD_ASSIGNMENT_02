package com.example.assignment02

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Receiver1 : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        if (Intent.ACTION_BATTERY_CHANGED == p1?.action) {
            Toast.makeText(p0, "Battery Changed", Toast.LENGTH_SHORT).show()
        }
    }
}