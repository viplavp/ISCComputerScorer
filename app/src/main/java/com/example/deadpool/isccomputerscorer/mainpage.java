package com.example.deadpool.isccomputerscorer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class mainpage
  extends Activity
{
  Button b1;
  Button b2;
  Button b3;
  Button b4;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.mainpage);
    this.b1 = ((Button)findViewById(R.id.btn1));
    this.b2 = ((Button)findViewById(R.id.btn2));
    this.b3 = ((Button)findViewById(R.id.btn3));
    this.b4 = ((Button)findViewById(R.id.btn4));
    this.b1.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MediaPlayer.create(mainpage.this.getApplicationContext(), R.raw.click).start();
        Intent localIntent = new Intent(mainpage.this, iscpaper.class);
        mainpage.this.finish();
        mainpage.this.startActivity(localIntent);
      }
    });
    this.b2.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MediaPlayer.create(mainpage.this.getApplicationContext(), R.raw.click).start();
        Intent localIntent = new Intent(mainpage.this, spcpaper.class);
        mainpage.this.finish();
        mainpage.this.startActivity(localIntent);
      }
    });
     this.b3.setOnClickListener(new OnClickListener()
      {
          public void onClick(View paramAnonymousView)
          {
              MediaPlayer.create(mainpage.this.getApplicationContext(), R.raw.click).start();
              Intent localIntent = new Intent(mainpage.this, book.class);
              mainpage.this.finish();
              mainpage.this.startActivity(localIntent);
          }
      });
    this.b4.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        MediaPlayer.create(mainpage.this.getApplicationContext(), R.raw.click).start();
        Intent localIntent = new Intent(mainpage.this, about.class);
        mainpage.this.finish();
        mainpage.this.startActivity(localIntent);
      }
    });
  }
}
