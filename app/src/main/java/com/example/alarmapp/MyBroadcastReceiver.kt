package com.example.alarmapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Vibrator
import android.widget.Toast

class MyBroadcastReceiver:BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        Toast.makeText(context,"your time is up",Toast.LENGTH_SHORT).show()
        val vibrator = context!!.getSystemService(Context.VIBRATOR_SERVICE)as Vibrator
        vibrator.vibrate(1000)

    }
}