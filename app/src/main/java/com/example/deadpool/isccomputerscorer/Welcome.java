package com.example.deadpool.isccomputerscorer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Welcome
        extends Activity
{
    MediaPlayer ourSong;

    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        setContentView(R.layout.welcome);
        this.ourSong = MediaPlayer.create(this, R.raw.call);
        this.ourSong.start();
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent localIntent = new Intent(Welcome.this, mainpage.class);

                    Welcome.this.startActivity(localIntent);
                }
            }
        };
        timer.start();
    }

    protected void onPause()
    {
        super.onPause();
        this.ourSong.release();
        finish();
    }
}

