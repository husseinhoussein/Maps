package com.hh.maps;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

public class MyLocationListener implements LocationListener
{
public void onLocationChanged1(Location loc)
{
loc.getLatitude();
loc.getLongitude();
String Text = "My current location is: " +
"Latitud = " + loc.getLatitude() +
"Longitud = " + loc.getLongitude();
Toast.makeText( getApplicationContext(), Text, Toast.LENGTH_SHORT).show();
 
}
 
private Context getApplicationContext() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void onProviderDisabled(String provider)
{
Toast.makeText( getApplicationContext(),
"Gps Disabled",
Toast.LENGTH_SHORT ).show();
}
 
@Override
public void onProviderEnabled(String provider)
{
Toast.makeText( getApplicationContext(),
"Gps Enabled",
Toast.LENGTH_SHORT).show();
}
 
public void onStatusChanged1(String provider, int status, Bundle extras)
{
 
}

@Override
public void onLocationChanged(Location arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
	// TODO Auto-generated method stub
	
}
 
}