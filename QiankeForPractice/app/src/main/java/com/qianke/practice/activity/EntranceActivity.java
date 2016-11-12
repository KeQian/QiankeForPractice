package com.qianke.practice.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.qianke.practice.R;
import com.qianke.practice.common.BaseActivity;

/**
 * 作者：qianke on 2016/11/8 14:40
 * 邮箱：2874800352@qq.com
 */

public class EntranceActivity extends BaseActivity implements View.OnClickListener {
    private Button qr_code;
    private Button qr_code_ZXingView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ay_entrance);


        qr_code = (Button) findViewById(R.id.qr_code);
        qr_code_ZXingView = (Button) findViewById(R.id.qr_code_ZXingView);
        qr_code.setOnClickListener(this);
        qr_code_ZXingView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.qr_code:
                break;
            case R.id.qr_code_ZXingView:
                intent.setClass(this, ZxingCodeActivity.class);
                this.startActivity(intent);

                break;

        }
    }
}
