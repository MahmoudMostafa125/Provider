package com.silicon.provider.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.silicon.provider.R;

public class LoginReg extends AppCompatActivity {

    Button buttonSignUp,buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_reg);

        buttonSignUp =findViewById(R.id.sign_id);
        buttonLogin =findViewById(R.id.login_id);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginReg.this, SignUP.class);
                startActivity(intent);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginReg.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
