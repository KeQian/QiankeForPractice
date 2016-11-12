package com.qianke.practice.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.qianke.practice.common.CrashHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Author：qianke on 2016/11/9 10:06
 * Email：2874800352@qq.com
 */
public class MyApplication extends Application {

    private List<HashMap<String,Activity>> aylist;
    private HashMap<String,Activity> aymap;
    private static MyApplication myApplication;
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
        aylist=new ArrayList();
        aymap=new HashMap<>();
        context = getApplicationContext();

    }

    /**
     * 获取全局的context
     * @return 返回全局context对象
     */
    public static Context getContext(){
        return context;
    }

    /*
    * 获取Applition的对象
    *
    * */
    public synchronized static MyApplication  getInstance(){
        if (myApplication==null) {
            myApplication = new MyApplication();
        }
            return myApplication;
    }


    public void addAcyivity(String ay_name,Activity activity){
        aymap.put(ay_name,activity);
        aylist.add(aymap);

    }
    // 移除list中的某一个activity
    public void removeAcyivity(String ay_name){
        Activity spActivity = aymap.get(ay_name);
        if (spActivity != null) {
            spActivity.finish();
        }
        if (aylist.contains(spActivity)) {
            aylist.remove(spActivity);
        }

    }
}
