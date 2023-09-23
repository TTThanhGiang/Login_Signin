package com.example.layout_login_signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private Button butLogin;
    private TextView txtsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtsign = (TextView) findViewById(R.id.txtsign);
        txtsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, SigninActivity.class);
                startActivity(intent);
            }
        });
    }
}