package com.scu.yang.udptset;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    public UDPClient client = new UDPClient();
    private Handler handerViewUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handerViewUpdate = new Handler()
        {
            public void handleMessage(Message paramAnonymousMessage)
            {
            }
        };

        //initMainUI();

        new Timer().schedule(new TimerTask()
        {
            public void run()
            {
                handerViewUpdate.sendEmptyMessage(0);
            }
        }, 0L, 100L);
    }

    public void onclickrun(View v) {

        client.send();
    }
}
