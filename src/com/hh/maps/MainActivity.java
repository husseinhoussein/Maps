package com.hh.maps;

import android.content.Intent;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
//import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;



public class MainActivity<Context> extends MapActivity implements OnClickListener{

	private MapView mapView;
	private MapController mc;
	public static final int SETTING_CODE = 7;
	LocationManager locMgr;
	MyLocationListener locLstnr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button about = (Button) findViewById(R.id.buttonabout);
		about.setOnClickListener(this);
		
		mapView = (MapView) findViewById(R.id.mapview1);
		setMc(mapView.getController());
		
		
		
		String coordinates[] = {"30", "71"};
		 double lat = Double.parseDouble(coordinates[0]);
		 double lng = Double.parseDouble(coordinates[1]);
		 
		 GeoPoint p = new GeoPoint(
		 (int) (lat * 1E6),
		 (int) (lng * 1E6));
		 
		mc.animateTo(p);
		 mc.setZoom(7);
		 mapView.invalidate();
	}
	
	public void onClick(View v) {
		if(v.getId() == R.id.buttonabout)
		 {
			Intent i = new Intent(this, About_me.class); 
			startActivity(i);
		}

		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem menu)
	{
		switch(menu.getItemId()){
		case R.id.action_settings:
			Intent i = new Intent(this, Preferences.class);
			startActivityForResult(i, SETTING_CODE);
		}
		return true;
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		if(requestCode == SETTING_CODE)
		{
			showUserSettings();
		}
	}
	
	public void showUserSettings()
	{
		SharedPreferences p = PreferenceManager.getDefaultSharedPreferences(this);
		StringBuilder b = new StringBuilder();
		
		b.append("/n Send me cookies" + p.getBoolean("prefSendReport", false));
	}

	public MapController getMc() {
		return mc;
	}

	public void setMc(MapController mc) {
		this.mc = mc;
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	



//	locMgr = (LocationManager)void getSystemService(Context.LOCATION_SERVICE);
//	locLstnr = new MyLocationListener();
//	locMgr.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locLstnr);
//dit kreeg ik nog niet werkend.	
}
