package ca.kgb.newservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("We are currently in the OnCreate part of the Service");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
