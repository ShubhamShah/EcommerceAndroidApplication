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
public class Login extends android.support.v4.app.Fragment {
    View rootview;
    WebView wv;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview=inflater.inflate(R.layout.login,container,false);

        wv=(WebView)rootview.findViewById(R.id.webView4);
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setUseWideViewPort(true);
        wv.setWebViewClient(new Client());
        wv.loadUrl("http://sabjimandi.byethost32.com/wp/?page_id=7");
        return rootview;
    }
}


