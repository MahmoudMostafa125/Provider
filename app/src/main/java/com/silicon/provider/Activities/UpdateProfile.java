package com.silicon.provider.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.silicon.provider.R;

public class UpdateProfile extends AppCompatActivity {


    LinearLayout Profile, Service, AddServidce;
    ImageView proImg, ServiceImg, AddServiceImg;
    TextView proTxt, ServiceTxt, AddServiceTxt;
    Button MyserButton;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        Profile = findViewById(R.id.pro);
        Service = findViewById(R.id.ser);
        AddServidce = findViewById(R.id.addser);

        proImg = findViewById(R.id.proimg);
        ServiceImg = findViewById(R.id.serimg);
        AddServiceImg = findViewById(R.id.addserimg);

        proTxt= findViewById(R.id.txtpro);
        ServiceTxt= findViewById(R.id.sertxt);
        AddServiceTxt= findViewById(R.id.addsertxt);
        MyserButton= findViewById(R.id.myser);

        Profile.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == (MotionEvent.ACTION_UP) && event.getAction() != (MotionEvent.ACTION_MOVE)) {

                    proImg.setImageResource(R.drawable.manuser);
                    proTxt.setTextColor(Color.parseColor("#444444"));


                } else {
                    proImg.setImageResource(R.drawable.manuserplue);
                    proTxt.setTextColor(Color.parseColor("#2C50ED"));
                }
                return true;

            }
        });
        Service.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == (MotionEvent.ACTION_UP) && event.getAction() != (MotionEvent.ACTION_MOVE)) {

                    ServiceImg.setImageResource(R.drawable.repairingservice);
                    ServiceTxt.setTextColor(Color.parseColor("#444444"));


                } else {
                    ServiceImg.setImageResource(R.drawable.repairingserviceplue);
                    ServiceTxt.setTextColor(Color.parseColor("#2C50ED"));
                }
                return true;

            }
        });
        AddServiceImg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == (MotionEvent.ACTION_UP) && event.getAction() != (MotionEvent.ACTION_MOVE)) {
                    AddServiceImg.setImageResource(R.drawable.plus);
                    AddServiceTxt.setTextColor(Color.parseColor("#444444"));
                } else {
                    AddServiceImg.setImageResource(R.drawable.plusplue);
                    AddServiceTxt.setTextColor(Color.parseColor("#2C50ED"));
                }
                return true;

            }
        });

        MyserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UpdateProfile.this, MyServices.class);
                startActivity(intent);
            }
        });
        imageView =findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
