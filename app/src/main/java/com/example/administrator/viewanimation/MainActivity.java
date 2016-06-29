package com.example.administrator.viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void translate(View view)
    {
        view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.mytranslate));
    }

    public void alpha(View view)
    {
        view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.myalpha));
    }

    public void scale(View view)
    {
        view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.myscale));
    }

    public void rotate(View view)
    {
        view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.myrotate));
    }

    public void set(View view)
    {
//        view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.myset));
        MyAnimation animation=new MyAnimation();
        animation.setDuration(5000);
        view.startAnimation(animation);
    }
}
