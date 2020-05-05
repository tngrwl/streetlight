package com.example.dell.streetlight;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.support.v4.app.Fragment;
//import android.support.v4.FragmentTransaction;
import static com.google.android.gms.maps.CameraUpdateFactory.*;

public class mapActivity extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
       // FragmentManager fragmentManager=getSupportFragmentManager();
        //MapFragment mapFragment = (SupportMapFragment) getFragmentManager().findFragmentById(R.id.map);
            //MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
       // mapFragment.getMapAsync(this);
      //  map=mapFragment.getMap();
    }

    public void onMapReady(GoogleMap googlemap){
        map=googlemap;
        LatLng Sudhowala=new LatLng(30.348842, 77.936444);
        map.addMarker(new MarkerOptions().position(Sudhowala).title("Sudhowala"));
        map.moveCamera(newLatLng(Sudhowala));
    }
}
