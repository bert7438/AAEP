package ru.bert7438.aaep;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    //this variables is used for initializing
    boolean playing = false;
    int N = 10;
    float[] x, y, vx, vy;



    float rand(float min, float max){
        return (float) (Math.random()*(max-min+1) +min);
    }

    void fillRandom(float[] arr, float min, float max){
        for (int i = 0; i<= arr.length-1; i++){
            arr[i]= rand(min,max);
        }
    }

    void move(float[] start, float[] change){
        for(int i =0; i<= start.length-1 && i<= change.length-1;i++){
            start[i] += change[i];
        }

    }

    public MyView(Context context){
        super(context);
        x = new float[N];
        y = new float[N];
        vx = new float[N];
        vy = new float[N];
        fillRandom(x,1, 1000);
        fillRandom(y,1, 1000);
        fillRandom(vx,1, 1000);
        fillRandom(vy,1, 1000);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //it seems to be wrong
        Paint paint = new Paint();
        paint.setStrokeWidth(10);
        paint.setColor(Color.RED);
        //initialization crutch
        if(!playing){
            playing = true;
            //init
        }
        canvas.drawLine(0,0, getWidth(), getHeight(), paint);
        //making circles
        for(int i = 0; i < N-1; i++){
            canvas.drawCircle(x[i], y[i], 20, paint);
        }

    }
}
