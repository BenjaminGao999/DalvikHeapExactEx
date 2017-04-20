package com.gaos.dalvikheapexactex;

import android.app.ActivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "dalvikHeapSize";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getExactDalvikHeapSize();
    }

    private void getExactDalvikHeapSize() {
        ActivityManager activityManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        int memoryClass = activityManager.getMemoryClass();
        Log.i(TAG, "getExactDalvikHeapSize: memoryClass = " + memoryClass);
    }

}
