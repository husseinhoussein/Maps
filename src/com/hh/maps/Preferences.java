package com.hh.maps;

import android.os.Bundle;
import android.preference.PreferenceActivity;
//import android.app.Activity;
import android.view.Menu;

public class Preferences extends PreferenceActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.preference);
		addPreferencesFromResource(R.xml.preference);
	}


}
