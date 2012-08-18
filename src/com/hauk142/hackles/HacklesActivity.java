package com.hauk142.hackles;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Context;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;

public class HacklesActivity extends Activity
{
    int comic=1; // Which comic
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
	
	ImageView image = (ImageView) findViewById(R.id.test_image);
	Button Next = (Button) findViewById(R.id.ButtonNext);
	Button Previous = (Button) findViewById(R.id.ButtonPrevious);

	Next.setOnClickListener(new Button.OnClickListener() 
	{
		public void onClick(View v) {
			try
			{
				// Do something!
				if(comic != 364)
					toast("Next!");
				else
					toast("Reached the last comic!");
			}
			catch (Exception e) {
			}
		}
	});
	Previous.setOnClickListener(new Button.OnClickListener()
	{
		public void onClick(View v) {
			try
			{
				// Do something!
				if(comic != 1)
					toast("Previous!");
				else
					toast("Reached the first comic!");
			}
			catch (Exception e) {
			}
		}
	});
    }

    public void toast(String text)
    {
	    Context context = getApplicationContext();
	    Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
	    toast.show();
    }
}
