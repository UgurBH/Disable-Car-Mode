package com.honts.disablecarmode;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //private UiModeManager uiModeManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //below code shows how to disable the car mode in MainActivity
        //uiModeManager = (UiModeManager) MainActivity.this.getSystemService(Context.UI_MODE_SERVICE);
        //uiModeManager.disableCarMode(UiModeManager.DISABLE_CAR_MODE_GO_HOME);


    }
}