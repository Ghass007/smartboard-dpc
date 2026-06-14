package com.barakah.smartboard
import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AdminReceiver : DeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Toast.makeText(context, "? Smart Board DPC is now the Device Owner!", Toast.LENGTH_LONG).show()
    }
}
