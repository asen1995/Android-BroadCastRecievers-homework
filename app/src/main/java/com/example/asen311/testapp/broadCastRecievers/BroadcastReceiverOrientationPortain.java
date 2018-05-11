package com.example.asen311.testapp.broadCastRecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastReceiverOrientationPortain extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected in BroadcastReceiverOrientationPortain : The screen was oriented Portain ",
                Toast.LENGTH_LONG).show();
    }
}
