package com.example.tugaspertemuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button btnBack, btnHitung;
    EditText editAlas, editTinggi, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editAlas=(EditText) findViewById(R.id.editAlas);
        editTinggi=(EditText) findViewById(R.id.editTinggi);
        btnBack=(Button) findViewById(R.id.buttonBack);
        btnHitung=(Button) findViewById(R.id.buttonHitung);
        result = (EditText) findViewById(R.id.result);
        result.setEnabled(false);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        MainActivity4.this,MainActivity.class));
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editAlas.getText().toString().trim().isEmpty() && editTinggi.getText().toString().trim().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Panjang dan Lebar Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    Double a = Double.parseDouble(editAlas.getText().toString());
                    Double t = Double.parseDouble(editTinggi.getText().toString());
                    Double L = (a * t) / 2;
                    result.setText(String.valueOf(L));
                }
            }
        });
    }
}