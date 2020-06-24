package com.example.june9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class brdcst extends BroadcastReceiver {
    MediaPlayer m;
    @Override
    public void onReceive(Context context, Intent intent) {
        m=MediaPlayer.create(context,R.raw.a);
        m.start();
        Toast.makeText(context, "Get Up", Toast.LENGTH_SHORT).show();
    }
}
