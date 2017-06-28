package com.samples.locationproviders;

import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class LocationProvidersActivity extends AppCompatActivity {

    private TextView text;
    private LocationManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_providers);

        text =(TextView)findViewById(R.id.text);
        manager = (LocationManager)getSystemService(LOCATION_SERVICE);

        text.append("List of location providers\n");

        List<String> providers = manager.getAllProviders();

        for (int i = 0; i <providers.size(); i++){
            String provider = providers.get(i);
            text.append("\nProvider: " + provider);
            text.append("\nEnabled: " +
                    manager.isProviderEnabled(provider) + "\n");
        }
    }
}
