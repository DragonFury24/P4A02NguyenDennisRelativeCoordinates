package com.dragonfury.duy.p4a02nguyendennisrelativecoordinates;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by 1383504 on 11/18/2016.
 */
public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint nam = new Paint();
        canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/6,nam);
        RectF nammy = new RectF(0,0,getWidth()/3,getHeight()/3);
        nam.setStyle(Paint.Style.STROKE);
        canvas.drawRect(nammy,nam);
        nam.setStrokeWidth(20);
        canvas.drawLine(nammy.left,nammy.top,nammy.right,nammy.bottom,nam);
        canvas.drawLine(nammy.right,nammy.top,nammy.left,nammy.bottom,nam);
        nam.setStrokeWidth(0);
        RectF namnam = new RectF(getWidth()/3*2,getHeight()/3*2,getWidth(),getHeight());
        canvas.drawRect(namnam,nam);
        nam.setStrokeWidth(20);
        canvas.drawCircle(namnam.centerX(),namnam.centerY(),namnam.width()/2,nam);
        canvas.drawLine(0,getHeight()/3,getWidth(),getHeight()/3,nam);
        canvas.drawLine(0,2*getHeight()/3,getWidth(),2*getHeight()/3,nam);
        canvas.drawLine(getWidth()/3,0,getWidth()/3,getHeight(),nam);
        canvas.drawLine(2*getWidth()/3,0,2*getWidth()/3,getHeight(),nam);


    }
}
