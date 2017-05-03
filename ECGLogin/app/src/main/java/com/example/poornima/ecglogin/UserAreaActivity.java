package com.example.poornima.ecglogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final TextView tvWelcomemsg = (TextView) findViewById(R.id.tvWelcomemsg);

        final Button bSendECG = (Button) findViewById(R.id.bECG);
        bSendECG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SendECGIntent =new Intent(UserAreaActivity.this, SendECGActivity.class);
                UserAreaActivity.this.startActivity(SendECGIntent);
            }
        });
    }

}
