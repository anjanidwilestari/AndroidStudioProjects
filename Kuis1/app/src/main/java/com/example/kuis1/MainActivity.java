package com.example.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btnSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignin=(Button) findViewById(R.id.signin);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("2041720180") && password.getText().toString().equals("password")){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }else{
                    Toast.makeText(getApplicationContext(), "Maaf Username / Password Salah",Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Silahkan coba lagi",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}