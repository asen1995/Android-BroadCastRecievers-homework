package com.example.asen311.testapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button broadCastA;
    private Button broadCastB;
    private Button broadCastC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        broadCastA = (Button) findViewById(R.id.sendBroadCastA);
        broadCastB = (Button) findViewById(R.id.sendBroadCastB);
        broadCastC = (Button) findViewById(R.id.sendBroadCastC);

        broadCastA.setOnClickListener(this);
        broadCastB.setOnClickListener(this);
        broadCastC.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sendBroadCastA:
                sendBroadCastTo("A");
                break;
            case R.id.sendBroadCastB:
                sendBroadCastTo("B");
                break;
            case R.id.sendBroadCastC:
                sendBroadCastTo("C");
                break;

        }
    }

    private void sendBroadCastTo(String recivierIdentificator){
        Intent intent = new Intent();
        intent.setAction("android.intent.action.BroadcastReceiver" + recivierIdentificator);
        sendBroadcast(intent);
    }




    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

            int orientation=newConfig.orientation;
                 switch(orientation) {

                case Configuration.ORIENTATION_LANDSCAPE:

                    sendBroadCastTo("_LANDSCAPE");
                    break;

                case Configuration.ORIENTATION_PORTRAIT:
                    sendBroadCastTo("_PORTRAIT");
                    break;
            }
    }


}
