package a0119;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.b10718.a0119.R;

public class GpsActivity extends android.support.v4.app.Fragment {

    public static GpsActivity newInstance() {
        GpsActivity gpsActivity = new GpsActivity();
        return gpsActivity;
    }
    public GpsActivity(){
        //required
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View oncCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_gps, container, false);
    }
}

