package com.Telephony;


import android.app.*;
import android.os.*;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends Activity {

    private  static  int SPLASH_SCREEN =2800;

    ImageView imageView;
    TextView text, text1;
    Animation top, bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);

        imageView = findViewById(R.id.imageView);
        text = findViewById(R.id.textView);
        text1 = findViewById(R.id.textView2);


        top = AnimationUtils.loadAnimation(this, R.anim.top);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom);
        imageView.setAnimation(top);
        text.setAnimation(bottom);
        text1.setAnimation(bottom);

        new Handler().postDelayed(new Runnable()
			{
				@Override
				public void run() {
					Intent intent = new Intent(splash.this, MainActivity.class);
					startActivity(intent);
					finish();
				}
			},SPLASH_SCREEN);

    }
	}
