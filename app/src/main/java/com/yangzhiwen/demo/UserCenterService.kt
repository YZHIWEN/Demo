package com.yangzhiwen.demo

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.widget.Toast

/**
 * Created by yangzhiwen on 17/8/15.
 */
class UserCenterService : Service() {

    class UserCenterBinder : Binder() {
        var count = 0
        fun getTheCount() = count++
    }

    override fun onBind(p0: Intent?): IBinder? {
        println(" ")
        println("====================================")
        println("user center service on bind")
        println("====================================")
        println(" ")
        Toast.makeText(this, "UserCenterService onBind", Toast.LENGTH_SHORT).show()
        return UserCenterBinder()
    }

    override fun attachBaseContext(base: Context?) {
        println(" ")
        println("====================================")
        println("user center service on attach base context")
        println("====================================")
        println(" ")
//        base ?: Toast.makeText(base, "UserCenterService attachBaseContext", Toast.LENGTH_SHORT).show()
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        println(" ")
        println("====================================")
        println("user center service on create")
        println("====================================")
        println(" ")
        Toast.makeText(this, "UserCenterService onCreate", Toast.LENGTH_SHORT).show()
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println(" ")
        println("====================================")
        println("user center service on start command $intent")
        println("====================================")
        println(" ")
        Toast.makeText(this, "UserCenterService onStartCommand", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        println(" ")
        println("====================================")
        println("user center service on destroy")
        println("====================================")
        println(" ")
        Toast.makeText(this, "UserCenterService onDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        println(" ")
        println("====================================")
        println("user center service on un bind")
        println("====================================")
        println(" ")
        Toast.makeText(this, "UserCenterService onUnbind", Toast.LENGTH_SHORT).show()
        return super.onUnbind(intent)
    }
}