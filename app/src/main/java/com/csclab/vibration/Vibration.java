package com.csclab.vibration;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Vibrator;

public class Vibration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibration);

        Vibrator vb = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        // Make devices vibrate for 5 sec
        vb.vibrate(5000);

        // stop 0.01 sec and then vibrate 0.1 sec (repeat 3 times)
        vb.vibrate(new long[]{10, 100, 10, 100, 10, 100}, -1);

        // Cancel vibration
        vb.cancel();
    }
}
