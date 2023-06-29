package com.example.tugaspertemuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button btnBack,btnHitung;
    EditText editPanjang, editLebar, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editPanjang=(EditText) findViewById(R.id.editPanjang);
        editLebar=(EditText) findViewById(R.id.editLebar);
        btnBack=(Button) findViewById(R.id.buttonBack);
        btnHitung=(Button) findViewById(R.id.buttonHitung);
        result = (EditText) findViewById(R.id.result);
        result.setEnabled(false);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        MainActivity3.this,MainActivity.class));
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editPanjang.getText().toString().trim().isEmpty() && editLebar.getText().toString().trim().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Panjang dan Lebar Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    Double p = Double.parseDouble(editPanjang.getText().toString());
                    Double l = Double.parseDouble(editLebar.getText().toString());
                    Double L = p * l;
                    result.setText(String.valueOf(L));
                }
            }
        });
    }
}