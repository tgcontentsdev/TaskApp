package jp.techacademy.haruki.saburi.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by tgaiacontentsdev on 2016/11/30.
 */

public class TaskApp extends Application{
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
