package com.qianke.practice.tools;

import android.widget.Toast;

import com.qianke.practice.application.MyApplication;

/**
 * Author：qianke on 2016/11/10 10:56
 * Email：2874800352@qq.com
 */
public class MyUtil {
    //toast 没谁了
    private static Toast toast;
    public static void showToast( String content) {
        if (toast == null) {
            toast = Toast.makeText(MyApplication.getContext(), content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }

}
