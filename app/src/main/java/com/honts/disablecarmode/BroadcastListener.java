package com.honts.disablecarmode;


import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastListener extends BroadcastReceiver {

    private UiModeManager uiModeManager;

    private static final String TAG = "CarMode-BroadcastListener";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive: reboot broadcast received");

        //below code shows how to disable the car mode in broadcast listener
        uiModeManager = (UiModeManager) context.getSystemService(Context.UI_MODE_SERVICE);
        uiModeManager.disableCarMode(UiModeManager.DISABLE_CAR_MODE_GO_HOME);



    }


}
