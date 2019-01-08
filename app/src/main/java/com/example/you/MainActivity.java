package com.example.you;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.umeng.analytics.MobclickAgent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    /*
    *
    public void onResume() {
    super.onResume();
    MobclickAgent.onResume(this);//在这里调用
    }
    public void onPause() {
    super.onPause();
    MobclickAgent.onPause(this);//在这里调用
    }

    * */

}
