package com.example.project5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_Screen extends AppCompatActivity {
    LottieAnimationView animationView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        animationView = findViewById(R.id.animationView);
        btn = findViewById(R.id.button);

        animationView.setVisibility(View.VISIBLE);
        btn.setVisibility(View.INVISIBLE);
        animationView.playAnimation();
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash_Screen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }
}
