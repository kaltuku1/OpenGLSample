package com.kaltuku1.helloworldinopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

/**
 * Created by kaltuku1 on 3/31/15.
 */
public class GameSurfaceView extends GLSurfaceView {
    public static final int OPENGL_ES_VERSION = 2;

    public GameSurfaceView(Context context){
        super(context);

        setEGLContextClientVersion(OPENGL_ES_VERSION);
        setRenderer(new GameRenderer());
        setRenderMode(RENDERMODE_CONTINUOUSLY);
    }
}
