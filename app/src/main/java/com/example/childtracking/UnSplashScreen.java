package com.example.childtracking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class UnSplashScreen extends AppCompatActivity {


    private ImageView image;
    private TextView unsplash1,unsplash2;
    Animation animationImg,animationTxt,animationTxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un_splash_screen);


        unsplash1=findViewById(R.id.unsplash1);
        unsplash2=findViewById(R.id.unsplash2);
        image=findViewById(R.id.imageView2);


        animationImg= AnimationUtils.loadAnimation(this,R.anim.image_animation);
        animationTxt= AnimationUtils.loadAnimation(this,R.anim.welcometext_animation);
        animationTxt2= AnimationUtils.loadAnimation(this,R.anim.mottotext_animation);

        image.setAnimation(animationImg);
        unsplash1.setAnimation(animationTxt);
        unsplash2.setAnimation(animationTxt2);


        new CountDownTimer(5000,1000)
        {

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(UnSplashScreen.this,MainActivity.class));
                finish();
            }
        }.start();
    }
}