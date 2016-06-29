package com.example.administrator.viewanimation;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Administrator on 2016/6/29.
 */
public class MyAnimation extends Animation
{
    private float mPivotX;
    private float mPivotY;

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight)
    {
        super.initialize(width, height, parentWidth, parentHeight);
        mPivotX = resolveSize(RELATIVE_TO_SELF, 0.5f, width, parentWidth);
        mPivotY = resolveSize(RELATIVE_TO_SELF, 0.5f, height, parentHeight);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t)
    {
        t.setAlpha(interpolatedTime);
        t.getMatrix().setScale(interpolatedTime,interpolatedTime,mPivotX,mPivotY);
        super.applyTransformation(interpolatedTime, t);
    }
}
