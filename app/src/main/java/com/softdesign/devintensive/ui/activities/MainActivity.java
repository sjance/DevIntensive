package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";
    private ImageView mCallImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        mCallImg = (ImageView)findViewById(R.id.call_img);
        mCallImg.setOnClickListener(this);

        if (savedInstanceState == null) {
            // первый запуск activity
        } else {
            // activity уже запускалось
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.call_img:
            showProgress();
            break;
        }
    }
}
