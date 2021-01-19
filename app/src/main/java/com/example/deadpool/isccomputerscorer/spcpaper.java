package com.example.deadpool.isccomputerscorer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class spcpaper
  extends Activity
{
  PDFView b1;
  Button btn1;
  Button btn2;
  Button btn3;
  Button btn4;
  Button btn5;
  int i = 0;
  
  public void onBackPressed()
  {
    if (this.i == 1)
    {
      Intent localIntent1 = new Intent(this, spcpaper.class);
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
    setContentView(R.layout.spcpaper);
    this.btn1 = ((Button)findViewById(R.id.btn21));
    this.btn2 = ((Button)findViewById(R.id.btn22));
    this.btn3 = ((Button)findViewById(R.id.btn23));
    this.btn4 = ((Button)findViewById(R.id.btn24));
    this.btn5 = ((Button)findViewById(R.id.btn25));
    this.btn1.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        spcpaper.this.i = 1;
        MediaPlayer.create(spcpaper.this.getApplicationContext(), R.raw.click).start();
        spcpaper.this.setContentView(R.layout.pdf);
        spcpaper.this.b1 = ((PDFView)spcpaper.this.findViewById(R.id.pdf1));
        spcpaper.this.b1.fromAsset("spcpaper1.pdf").load();
      }
    });
    this.btn2.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        spcpaper.this.i = 1;
        MediaPlayer.create(spcpaper.this.getApplicationContext(), R.raw.click).start();
        spcpaper.this.setContentView(R.layout.pdf);
        spcpaper.this.b1 = ((PDFView)spcpaper.this.findViewById(R.id.pdf1));
        spcpaper.this.b1.fromAsset("spcpaper2.pdf").load();
      }
    });
    this.btn3.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        spcpaper.this.i = 1;
        MediaPlayer.create(spcpaper.this.getApplicationContext(), R.raw.click).start();
        spcpaper.this.setContentView(R.layout.pdf);
        spcpaper.this.b1 = ((PDFView)spcpaper.this.findViewById(R.id.pdf1));
        spcpaper.this.b1.fromAsset("spcpaper3.pdf").load();
      }
    });
    this.btn4.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        spcpaper.this.i = 1;
        MediaPlayer.create(spcpaper.this.getApplicationContext(), R.raw.click).start();
        spcpaper.this.setContentView(R.layout.pdf);
        spcpaper.this.b1 = ((PDFView)spcpaper.this.findViewById(R.id.pdf1));
        spcpaper.this.b1.fromAsset("spcpaper4.pdf").load();
      }
    });
    this.btn5.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        spcpaper.this.i = 1;
        MediaPlayer.create(spcpaper.this.getApplicationContext(), R.raw.click).start();
        spcpaper.this.setContentView(R.layout.pdf);
        spcpaper.this.b1 = ((PDFView)spcpaper.this.findViewById(R.id.pdf1));
        spcpaper.this.b1.fromAsset("spcpaper5.pdf").load();
      }
    });
  }
}



/* Location:           C:\Users\DEADPOOL\dex2jar-0.0.9.15\classes_dex2jar.jar

 * Qualified Name:     com.example.deadpool.isccomputerscorer.spcpaper

 * JD-Core Version:    0.7.0.1

 */