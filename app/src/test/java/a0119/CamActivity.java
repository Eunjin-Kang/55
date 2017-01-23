package a0119;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.b10718.a0119.R;

public class CamActivity extends android.support.v4.app.Fragment {

    public static CamActivity newInstance() {
        CamActivity camActivity = new CamActivity ();
        return camActivity;
    }
    public CamActivity(){
        //required
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View oncCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_cam, container, false);
    }
}
