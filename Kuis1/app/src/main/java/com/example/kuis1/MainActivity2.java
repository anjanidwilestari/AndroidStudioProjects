package com.example.kuis1;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btnLogout;
    ImageButton btnKartuTabungan,btnKartuBelanja, btnKeranjangBelanja, btnRekapSimpanan, btnRekapPinjaman, btnRekapShu, btnInfoKpri ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnLogout=(Button) findViewById(R.id.logout);
        btnKartuTabungan=(ImageButton) findViewById(R.id.btnkartutabungan);
        btnKartuBelanja=(ImageButton) findViewById(R.id.btnkartubelanja);
        btnKeranjangBelanja=(ImageButton) findViewById(R.id.btnkeranjangbelanja);
        btnRekapSimpanan=(ImageButton) findViewById(R.id.btnrekapsimpanan);
        btnRekapPinjaman=(ImageButton) findViewById(R.id.btnrekappinjaman);
        btnRekapShu=(ImageButton) findViewById(R.id.btnrekapshu);
        btnInfoKpri=(ImageButton) findViewById(R.id.btninfokpri);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });

        btnKartuTabungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda menekan tombol Kartu Tabungan",Toast.LENGTH_SHORT).show();
            }
        });

        btnKartuBelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda menekan tombol Kartu Belanja",Toast.LENGTH_SHORT).show();
            }
        });

        btnKeranjangBelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda menekan tombol Keranjang Belanja",Toast.LENGTH_SHORT).show();
            }
        });

        btnRekapSimpanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda menekan tombol Rekap Simpanan",Toast.LENGTH_SHORT).show();
            }
        });

        btnRekapPinjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda menekan tombol Rekap Pinjaman",Toast.LENGTH_SHORT).show();
            }
        });

        btnRekapShu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda menekan tombol Rekap SHU",Toast.LENGTH_SHORT).show();
            }
        });

        btnInfoKpri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anda menekan tombol Info KPRIPOLINEMA Pay",Toast.LENGTH_SHORT).show();
            }
        });

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}