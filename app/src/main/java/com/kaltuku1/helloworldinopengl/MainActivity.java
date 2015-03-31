package com.kaltuku1.helloworldinopengl;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GameSurfaceView view = new GameSurfaceView(this);
        setContentView(view);
    }

}
