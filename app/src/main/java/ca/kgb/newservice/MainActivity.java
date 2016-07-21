package ca.kgb.newservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG_", "We are currently in the OnCreate part of the Activity");
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG_", "We are currently in the OnStart part of the Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG_", "We are currently in the onStop part of the Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG_", "We are currently in the onPause part of the Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG_", "We are currently in the onResume part of the Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG_", "We are currently in the onRestart part of the Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG_", "We are currently in the onDestroy part of the Activity");
    }

    public void doMagic(View view) {
        try {
            EditText editText = (EditText) findViewById(R.id.editTextMid);
            TextView textView = (TextView) findViewById(R.id.topText);
            textView.setText(editText.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
