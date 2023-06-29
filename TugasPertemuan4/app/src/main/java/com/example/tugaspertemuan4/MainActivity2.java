package com.example.tugaspertemuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {
    Button btnBack,btnHitung;
    EditText sisi, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sisi=(EditText) findViewById(R.id.editSisi);
        btnBack=(Button) findViewById(R.id.buttonBack);
        btnHitung=(Button) findViewById(R.id.buttonHitung);
        result = (EditText) findViewById(R.id.result);
        result.setEnabled(false);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sisi.getText().toString().trim().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Sisi Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    Double s = Double.parseDouble(sisi.getText().toString());
                    Double L = s * s;
                    result.setText(String.valueOf(L));
                }
            }
        });
    }
}