package com.example.ciit;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Login extends AppCompatActivity {
    private ImageView Image;
    private EditText Username;
    private EditText Password;
    private Button log;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Image=(ImageView)findViewById(R.id.logo);
        Username=(EditText)findViewById(R.id.username);
        Password=(EditText)findViewById(R.id.password);
        log=(Button)findViewById(R.id.button);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_run();

            }
        });

    }

    private void login_run(){
        Intent i = new Intent(Login.this, Home.class);
        startActivity(i);

    }
}
