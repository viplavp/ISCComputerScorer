package com.example.deadpool.isccomputerscorer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.github.barteksc.pdfviewer.PDFView;

public class book
  extends Activity
{
  PDFView b1;
  Button btn1;
  Button btn2;
  Button btn3;
  Button btn4;
  int i = 0;
  
  public void onBackPressed()
  {
    if (this.i == 1)
    {
      Intent localIntent1 = new Intent(this, book.class);
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
    setContentView(R.layout.book);
    this.btn1 = ((Button)findViewById(R.id.btn31));
    this.btn2 = ((Button)findViewById(R.id.btn32));
    this.btn3 = ((Button)findViewById(R.id.btn33));
    this.btn4 = ((Button)findViewById(R.id.btn34));
    this.btn1.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        book.this.i = 1;
        MediaPlayer.create(book.this.getApplicationContext(), R.raw.click).start();
        book.this.setContentView(R.layout.pdf);
        book.this.b1 = ((PDFView)book.this.findViewById(R.id.pdf1));
        book.this.b1.fromAsset("java for dummies.pdf").load();
      }
    });
    this.btn2.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        book.this.i = 1;
        MediaPlayer.create(book.this.getApplicationContext(), R.raw.click).start();
        book.this.setContentView(R.layout.pdf);
        book.this.b1 = ((PDFView)book.this.findViewById(R.id.pdf1));
        book.this.b1.fromAsset("android for dummies.pdf").load();
      }
    });
    this.btn3.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        book.this.i = 1;
        MediaPlayer.create(book.this.getApplicationContext(), R.raw.click).start();
        book.this.setContentView(R.layout.pdf);
        book.this.b1 = ((PDFView)book.this.findViewById(R.id.pdf1));
        book.this.b1.fromAsset("insertion sort.pdf").load();
      }
    });
    this.btn4.setOnClickListener(new OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        book.this.i = 1;
        MediaPlayer.create(book.this.getApplicationContext(), R.raw.click).start();
        book.this.setContentView(R.layout.pdf);
        book.this.b1 = ((PDFView)book.this.findViewById(R.id.pdf1));
        book.this.b1.fromAsset("viva voce.pdf").load();
      }
    });
  }
}
