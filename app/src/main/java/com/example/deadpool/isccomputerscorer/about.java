
package com.example.deadpool.isccomputerscorer;;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class about extends Activity
{
    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.about);
    }
    public void onBackPressed()
    {
        Intent localIntent2 = new Intent(this, mainpage.class);
        finish();
        startActivity(localIntent2);
    }
}

