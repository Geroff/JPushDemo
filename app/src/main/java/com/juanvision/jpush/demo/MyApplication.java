package com.juanvision.jpush.demo;

import android.app.Application;
import android.app.Notification;

import cn.jpush.android.api.BasicPushNotificationBuilder;
import cn.jpush.android.api.JPushInterface;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(getApplicationContext());
        // 设置通知栏样式，处理在google手机上通知栏显示为黑色图标的问题
        BasicPushNotificationBuilder builder = new BasicPushNotificationBuilder(getApplicationContext());
        builder.statusBarDrawable = R.mipmap.ic_launcher;
        builder.notificationFlags = Notification.FLAG_AUTO_CANCEL;  //可选，设置为可点击消失
        builder.notificationDefaults = Notification.DEFAULT_SOUND; //可选，设置声音提示
        JPushInterface.setDefaultPushNotificationBuilder(builder);
    }
}
