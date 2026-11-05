package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Xin chào! APK này được build tự động\nbởi GitHub Actions từ sandbox ARM64 🚀");
        tv.setTextSize(22);
        tv.setGravity(Gravity.CENTER);
        tv.setPadding(48, 48, 48, 48);
        setContentView(tv);
    }
}
