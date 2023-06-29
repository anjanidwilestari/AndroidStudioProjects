package com.example.tugaspertemuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rad;
    RadioButton bujursangkar;
    RadioButton persegipanjang;
    RadioButton segitiga;

    Button btnLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rad=findViewById(R.id.radioGroup);
        bujursangkar=(RadioButton) findViewById(R.id.radioBujursangkar);
        persegipanjang=(RadioButton) findViewById(R.id.radioPersegipanjang);
        segitiga=(RadioButton) findViewById(R.id.radioSegitiga);

        btnLuas=(Button) findViewById(R.id.btnLuas);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = rad.getCheckedRadioButtonId();
                if(radioId == bujursangkar.getId()){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }else if(radioId == persegipanjang.getId()){
                    startActivity(new Intent(MainActivity.this,MainActivity3.class));
                } else if(radioId == segitiga.getId()){
                    startActivity(new Intent(MainActivity.this,MainActivity4.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Silahkan Pilih Salah Satu",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}