package com.example.user.chris21;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OnBootReceiver extends BroadcastReceiver {
    public OnBootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
      //  throw new UnsupportedOperationException("Not yet implemented");
        Log.v("brad","Boot OK");
        Intent it = new Intent(context, MyService.class);
        context.startService(it);
    }
}
