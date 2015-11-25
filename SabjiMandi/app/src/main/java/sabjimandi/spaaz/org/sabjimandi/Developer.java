package sabjimandi.spaaz.org.sabjimandi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

/**
 * Created by Pratik kothari on 9/11/2015.
 */
public class Developer extends android.support.v4.app.Fragment {
    View rootview;
    WebView wv;
    ImageView p, s, a, a1, z, t, n;
    public static String link = null;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.developer, container, false);

        s = (ImageView) rootview.findViewById(R.id.fb_shubham);
        p = (ImageView) rootview.findViewById(R.id.fb_pratik);
        a1 = (ImageView) rootview.findViewById(R.id.fb_abu);
        a = (ImageView) rootview.findViewById(R.id.fb_ashish);
        z = (ImageView) rootview.findViewById(R.id.fb_zubair);
        t = (ImageView) rootview.findViewById(R.id.fb_trupti);
        n = (ImageView) rootview.findViewById(R.id.fb_naik);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(500);


                }catch(Exception e){
                    e.printStackTrace();
                }finally{

                    s.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                wv.loadUrl("http://www.facebook.com/shubham.shah.167");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    p.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                wv.loadUrl("http://www.facebook.com/pratik.kothari77");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    a1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                wv.loadUrl("http://www.facebook.com/abubakr.shaikh.18");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    a.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                wv.loadUrl("http://www.facebook.com/shubham.shah.167");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    z.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                wv.loadUrl("http://www.facebook.com/zubair.shaikh.7921");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    t.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                wv.loadUrl("http://www.facebook.com/truptiindi");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    n.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                wv.loadUrl("http://www.facebook.com/anilnaik");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });

                }
            }


        };
        timer.start();



        return rootview;
    }
}


