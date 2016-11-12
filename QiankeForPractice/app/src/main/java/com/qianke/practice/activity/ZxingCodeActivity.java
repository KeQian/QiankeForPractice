package com.qianke.practice.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.qianke.practice.R;

public class ZxingCodeActivity extends AppCompatActivity  {

    private  Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoder);


    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.test_scan_qrcode:
                startActivity(new Intent(this, TestScanActivity.class));
                break;
            case R.id.test_generate_qrcode:
                startActivity(new Intent(this, TestGeneratectivity.class));
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
