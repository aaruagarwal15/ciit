package com.example.ciit;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class My_Account extends AppCompatActivity {

    private Button Accountinfo;
    private Button Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__account);

        Accountinfo=(Button)findViewById(R.id.account_info);
        Logout=(Button)findViewById(R.id.log_out);
        Accountinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                run();
            }
        });
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(My_Account.this, Login.class);
                startActivity(in);
                finish();
            }
        });
    }

    private void run(){
        Intent i = new Intent(My_Account.this, AccountInformation.class);
        startActivity(i);
    }
}
