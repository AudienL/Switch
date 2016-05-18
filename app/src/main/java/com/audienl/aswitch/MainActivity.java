package com.audienl.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.audienl.switchlibrary.Switch;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwitch = (Switch) findViewById(R.id.my_switch);
        mSwitch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(boolean isChecked) {
                Log.i(TAG, "onCheckedChanged: is_checked=" + isChecked);
            }
        });
    }
}
