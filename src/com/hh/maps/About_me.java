package com.hh.maps;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class About_me extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_me);
		
		//Button preferences = (Button) findViewById(R.id.preferences);
		//preferences.setOnClickListener(this);
	}
//	public void onClick(View v) {
//		if(v.getId() == R.id.preferences)
	//	 {
	//		Intent i = new Intent(this, Preferences.class); 
	//		startActivity(i);
	//	}

	//	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		 //Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_me, menu);
		return true;
		
	}

	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

}
