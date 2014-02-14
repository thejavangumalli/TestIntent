package com.rockerz.testintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
	 
	Button button1,button2;
	TextView text;
	protected boolean f;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 
		addListenerOnButton();
	}
 
	public void addListenerOnButton() {
 
		button1 = (Button) findViewById(R.id.button1);
        text = (TextView) findViewById(R.id.text);
		button1.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				f = true; 
			  Intent browserIntent = 
                            new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sjsu.edu"));
			    startActivity(browserIntent);
 
			}
 
		});
		button2 = (Button) findViewById(R.id.button2);
		 
		button2.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				if (f){
					text.setText("Assignment-1 completed"); 
			}
				else{
					
					Toast.makeText(getApplicationContext(), 
                            "Open SJSU home page first", Toast.LENGTH_LONG).show();
				}}
 
		});
 
	}
 
}
