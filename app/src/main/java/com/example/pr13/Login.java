package com.example.pr13;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {
Button signIn;
    @SuppressLint("MissingInflatedId")
    EditText login;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signIn=findViewById(R.id.sign_in);
        signIn.setOnClickListener(this);

        login=findViewById(R.id.editTextTextPersonName);
        pass=findViewById(R.id.editTextTextPersonName2);
    }
    @Override
    public void onClick(View view) {
        if(login.getText().equals("") && pass.getText().equals(""))
        {

        }
        else {
            Intent intent = new Intent(this, MainMENU.class);
            startActivity(intent);
        }
    }
}
