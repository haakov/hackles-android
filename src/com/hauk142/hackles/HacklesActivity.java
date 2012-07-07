package com.hauk142.hackles;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.DialogInterface;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.app.DialogFragment;
import android.widget.Toast;


public class HacklesActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
	ImageView image = (ImageView) findViewById(R.id.test_image);
	downloadStrips();
    }

    public void downloadStrips()
    {
	ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

	if( networkInfo != null && networkInfo.isConnected() )
	{
		
	}
	else
	{
		toast("Connection error!");
	}
    }

    public void toast(String text)
    {
	    Context context = getApplicationContext();
	    Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
	    toast.show();
    }
}
