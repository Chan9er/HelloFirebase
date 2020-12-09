package com.chan9er.hellofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        findViewById(R.id.btn_fb).setOnClickListener(v -> {
            Log.d("HelloFirebase", "HelloFirebase btn clicked");
            mFirebaseAnalytics.logEvent("HelloFirebase_btn_clicked", null);
        });
    }
}