package ca.kgb.newservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("We are currently in the OnCreate part of the Activity");
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}
