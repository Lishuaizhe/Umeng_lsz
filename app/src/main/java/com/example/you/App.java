package com.example.you;

import android.app.Application;
import android.se.omapi.Channel;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;


public class App extends Application {

    private  String AA= "5c3336e1f1f5567b30001667";

    @Override
    public void onCreate() {
        super.onCreate();


        UMConfigure.init(this, AA ,null, UMConfigure.DEVICE_TYPE_PHONE, null);
        UMConfigure.setEncryptEnabled(true);//设置日志加密
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);//普通统计场景
        MobclickAgent.setDebugMode( true );// 打开统计SDK测试模式
    }




}
