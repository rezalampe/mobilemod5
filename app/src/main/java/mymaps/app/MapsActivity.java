package mymaps.app;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sd = new LatLng(-2.2143644, 113.9130574);
        LatLng smp = new LatLng(-2.2142482, 113.9224686);
        LatLng sma = new LatLng(-2.2097629, 113.9267166);
        mMap.addMarker(new MarkerOptions().position(sd).title("Sekolah Dasar"));
        mMap.addMarker(new MarkerOptions().position(smp).title("Sekolah Menengah Pertama"));
        mMap.addMarker(new MarkerOptions().position(sma).title("Sekolah Menengah Atas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sd));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smp));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sma));
    }
}
