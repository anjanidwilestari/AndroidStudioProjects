package com.example.pertemuan3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView judul;
    TextView nim;
    EditText editNim;
    TextView nama;
    EditText editNama;
    TextView alamat;
    EditText editAlamat;
    RadioButton radioLk;
    RadioButton radioPr;
    RadioGroup radioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button1);
        radioGroup = findViewById(R.id.radioGroup);
        radioLk=(RadioButton) findViewById(R.id.radioLk);
        radioPr=(RadioButton) findViewById(R.id.radioPr);
        judul=(TextView) findViewById(R.id.judul);
        nim=(TextView) findViewById(R.id.nim);
        editNim=(EditText) findViewById(R.id.editNim);
        nama=(TextView) findViewById(R.id.nama);
        editNama=(EditText) findViewById(R.id.editNama);
        alamat=(TextView) findViewById(R.id.alamat);
        editAlamat=(EditText) findViewById(R.id.editAlamat);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                if(radioId == radioPr.getId()){
                    Toast.makeText(getApplicationContext(), "Halo Mbak " + editNama.getText().toString() + "\nData Tersimpan" + "\nNIM : " + editNim.getText() + "\nNama : " + editNama.getText() + "\nAlamat : "+editAlamat.getText(),Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Halo Mas " + editNama.getText().toString() + "\nData Tersimpan" + "\nNIM : " + editNim.getText() + "\nNama : " + editNama.getText() + "\nAlamat : "+editAlamat.getText(),Toast.LENGTH_SHORT).show();
                }

                startActivity(new Intent(
                        MainActivity.this,MainActivity2.class));
            }
        });

    }
}