package sabjimandi.spaaz.org.sabjimandi;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Pratik kothari on 9/11/2015.
 */
public class Client extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url) {
        v.loadUrl(url);
        return true;
    }
}
