package com.lucascabral.androidfundamentals2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        Log.i("BROADCAST_RECEIVER", "Broadcast message is received")
        Toast.makeText(context, "Broadcast message is received", Toast.LENGTH_LONG).show()
    }
}