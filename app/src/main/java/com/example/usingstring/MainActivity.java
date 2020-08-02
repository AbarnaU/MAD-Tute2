package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i ("Lifecycle", "OnCreate() invoked");

    }

    public void onStart() {
        super.onStart();
        Log.i ("Lifecycle", "onStart() invoked");
    }

    public void onResume() {
        super.onResume();
        Log.i ("Lifecycle", "onResume() invoked");
    }

    public void onPause() {
        super.onPause();
        Log.i ("Lifecycle","onPause() invoked");
    }

    public void onStop() {
        super.onStop();
        Log.i ("Lifecycle","onStop() invoked");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i ("Lifecycle","onDestroy() invoked");
    }

}