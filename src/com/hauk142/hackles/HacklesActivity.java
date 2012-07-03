package com.hauk142.hackles;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class HacklesActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
	ImageView image = (ImageView) findViewById(R.id.test_image);
    }
}
