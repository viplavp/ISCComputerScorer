package com.example.deadpool.isccomputerscorer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class iscpaper extends Activity
{
  PDFView b1;
  Button btn1;
  Button btn10;
  Button btn2;
  Button btn3;
  Button btn4;
  Button btn5;
  Button btn6;
  Button btn7;
  Button btn8;
  Button btn9;
  int i = 0;
  
  public void onBackPressed()
  {
    if (this.i == 1)
    {
      Intent localIntent1 = new Intent(this, iscpaper.class);
      finish();
      startActivity(localIntent1);
    }
    if (this.i == 0)
    {
      Intent localIntent2 = new Intent(this, mainpage.class);
      finish();
      startActivity(localIntent2);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.iscpaper);
    this.btn1 = ((Button)findViewById(R.id.btn11));
    this.btn2 = ((Button)findViewById(R.id.btn12));
    this.btn3 = ((Button)findViewById(R.id.btn13));
    this.btn4 = ((Button)findViewById(R.id.btn14));
    this.btn5 = ((Button)findViewById(R.id.btn15));
    this.btn6 = ((Button)findViewById(R.id.btn16));
    this.btn7 = ((Button)findViewById(R.id.btn17));
    this.btn8 = ((Button)findViewById(R.id.btn18));
    this.btn9 = ((Button)findViewById(R.id.btn19));
    this.btn10 = ((Button)findViewById(R.id.btn110));
    this.btn1.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2018p-min.pdf").load();
      }
    });
    this.btn2.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2017p-min.pdf").load();
      }
    });
    this.btn3.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2016p-min.pdf").load();
      }
    });
    this.btn4.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2015p-min.pdf").load();
      }
    });
    this.btn5.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2014p-min.pdf").load();
      }
    });
    this.btn6.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2013p-min.pdf").load();
      }
    });
    this.btn7.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2012p-min.pdf").load();
      }
    });
    this.btn8.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2011p-min.pdf").load();
      }
    });
    this.btn9.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2010p-min.pdf").load();
      }
    });
    this.btn10.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        iscpaper.this.i = 1;
        MediaPlayer.create(iscpaper.this.getApplicationContext(), R.raw.click).start();
        iscpaper.this.setContentView(R.layout.pdf);
        iscpaper.this.b1 = ((PDFView)iscpaper.this.findViewById(R.id.pdf1));
        iscpaper.this.b1.fromAsset("2009p-min.pdf").load();
      }
    });
  }
}



