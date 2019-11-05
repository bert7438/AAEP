package ru.bert7438.aaep;

import android.content.Context;
import android.view.View;

public class MyView extends View {
    //this variables is used for initializing
    boolean playing = false;
    int N = 10;
    float[] x, y, vx, vy;
    public MyView(Context context){
        super(context);
        x = new float[N];
        y = new float[N];
        vx = new float[N];
        vy = new float[N];
    }


    
}
