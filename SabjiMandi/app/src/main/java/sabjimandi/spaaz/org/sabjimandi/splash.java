package sabjimandi.spaaz.org.sabjimandi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Pratik kothari on 9/11/2015.
 */
public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1800);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent opennaviagtion = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(opennaviagtion);
                    finish();
                }
            }
        };
        timer.start();

    }
}


