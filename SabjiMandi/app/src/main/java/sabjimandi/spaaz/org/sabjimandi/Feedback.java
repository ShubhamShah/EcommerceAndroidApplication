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
public class Feedback extends android.support.v4.app.Fragment {
    View rootview;
    WebView wv;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.feedback,container,false);
        wv=(WebView)rootview.findViewById(R.id.webView5);
        try {
            wv.loadUrl("https://goo.gl/forms/3TPJePCAzy");
        }catch(Exception e){
            e.printStackTrace();
        }
        return rootview;
    }
}

