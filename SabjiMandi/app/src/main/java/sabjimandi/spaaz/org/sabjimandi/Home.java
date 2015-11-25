package sabjimandi.spaaz.org.sabjimandi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Pratik kothari on 9/11/2015.
 */
public class Home extends android.support.v4.app.Fragment {
      public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home, container,false);
        return rootView;

    }
}

