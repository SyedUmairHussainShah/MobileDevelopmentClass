package com.example.fa15_be_0028.class1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    public void switchClass(View v)
    {
        String name = username.getText().toString();
        String pass = password.getText().toString();
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        intent.putExtra("username", name);
        intent.putExtra("password", pass);
        Toast.makeText(LoginActivity.this, "Successfully", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}
