package com.example.alarmapp

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener{
            startAlart()
        }
    }
    
    fun startAlart(){
        
        val num = ed_num.text.toString().toInt()
        val intent = Intent(this,MyBroadcastReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,0,intent,0)
        val alartManager = getSystemService(Context.ALARM_SERVICE)as AlarmManager
        alartManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(num*1000),pendingIntent)
        Toast.makeText(this,"alarm is set in $num second",Toast.LENGTH_SHORT).show()
    }
    
}
