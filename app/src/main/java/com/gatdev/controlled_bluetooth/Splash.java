package com.gatdev.controlled_bluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.gatdev.controlled_bluetooth.MainActivity;
import com.gatdev.controlled_bluetooth.R;
//En esta clase se genera el inicio de la aplicación y se asigna el tiempo de la animación

public class Splash extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private TextView txtnombre;
    private TextView txtmatechs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        textView = (TextView) findViewById(R.id.txtsplash);
        txtnombre = (TextView) findViewById(R.id.txtnombre);
        txtmatechs = (TextView) findViewById(R.id.txtgatdev);
        imageView = (ImageView) findViewById(R.id.imagesplash);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translacion);
        textView.startAnimation(animation);
        txtnombre.startAnimation(animation);
        txtmatechs.startAnimation(animation);

        imageView.startAnimation(animation);
        final Intent i = new Intent(this,MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    //Duración de la animación
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}

