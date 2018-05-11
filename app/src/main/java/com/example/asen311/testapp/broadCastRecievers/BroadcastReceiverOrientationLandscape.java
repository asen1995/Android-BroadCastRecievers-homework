package com.example.asen311.testapp.broadCastRecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastReceiverOrientationLandscape extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected in BroadcastReceiverOrientationPortain : The screen was oriented landscape ",
                Toast.LENGTH_LONG).show();
    }
}
