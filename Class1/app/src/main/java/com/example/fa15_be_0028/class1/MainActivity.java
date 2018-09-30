package com.example.fa15_be_0028.class1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView = (TextView) findViewById(R.id.Hello);
        Intent intent = getIntent();
        String name = intent.getStringExtra("username").toString();
        txtView.setText(name);
    }
}
