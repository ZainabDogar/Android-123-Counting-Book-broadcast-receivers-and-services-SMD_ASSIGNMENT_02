package com.example.assignment02

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class MediaServices : Service() {
    private lateinit var media_service:MediaPlayer

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        media_service = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        media_service.isLooping = true
        media_service.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        media_service.stop()
    }
}