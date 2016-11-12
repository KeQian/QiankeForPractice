package com.qianke.practice.common;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Author：qianke on 2016/11/8 15:20
 * Email：2874800352@qq.com
 */

public abstract class BaseActivity extends AppCompatActivity {

private Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    protected void initView(){
        context=this;
        initData();
    }

    protected void initData(){
        context=this;

    }

}
