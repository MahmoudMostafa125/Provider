package com.silicon.provider.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.silicon.provider.R;

public class MyServices extends AppCompatActivity {

    Button UniButton,FacButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_services);

        UniButton =findViewById(R.id.university);
        FacButton =findViewById(R.id.faculity);
        imageView =findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        UniButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyServices.this, UniversitiesServices.class);
                startActivity(intent);
            }
        });

        FacButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyServices.this, FacultiesServices.class);
                startActivity(intent);
            }
        });

    }
}
