package com.defgallium.terminal;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyRenderer implements GLSurfaceView.Renderer {

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        // Màu nền (RGBA)
        GLES20.glClearColor(0.1f, 0.1f, 0.3f, 1.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // Xóa màn hình với màu đã set
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }
}
