package mvhacks.sosinseconds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.GeoDataClient;
import com.google.android.gms.location.places.PlaceDetectionClient;
import com.google.android.gms.location.places.Places;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private GeoDataClient geoData;
    private PlaceDetectionClient placeDetection;
    private FusedLocationProviderClient fusedLocationProvider;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Construct a GeoDataClient.
        geoData = Places.getGeoDataClient(this, null);

        // Construct a PlaceDetectionClient.
        placeDetection = Places.getPlaceDetectionClient(this, null);

        // Construct a FusedLocationProviderClient.
        fusedLocationProvider = LocationServices.getFusedLocationProviderClient(this);
    }
    private ArrayList<Integer> arr = new ArrayList<Integer> ();
    public void storeContact(android.view.View view) {
        EditText editText = (EditText) findViewById(R.id.editText_Contact);
        if (editText != null) {
            String contactString = editText.getText().toString();
        }
    }
}