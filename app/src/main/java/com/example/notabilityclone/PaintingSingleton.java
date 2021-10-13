package com.example.notabilityclone;

public class PaintingSingleton {
    private static PaintingSingleton mInstance= null;

    public boolean isPainting = true;

    protected PaintingSingleton(){}

    public static synchronized PaintingSingleton getInstance() {
        if(null == mInstance){
            mInstance = new PaintingSingleton();
        }
        return mInstance;
    }
}
