package com.example.lagu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lagu.data.Lagu;
import com.example.lagu.data.LaguDatabase;

public class MainActivity extends AppCompatActivity {
    private LaguDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                LaguDatabase.class, "lagu").build();


        final EditText inpjudul = findViewById(R.id.inputJudul);
        final EditText inpartis = findViewById(R.id.inputArtis);
        final EditText inplirik = findViewById(R.id.inputLirik);
        Button btnTambah = findViewById(R.id.btnTambah);
        Button btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this, ShowActivity.class);
                startActivity(i);
            }
        });


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lagu l = new Lagu();
                l.setJudul(inpjudul.getText().toString());
                l.setArtis(inpartis.getText().toString());
                l.setLirik(inplirik.getText().toString());
                insertData(l);
            }
        });
    }

    private void insertData(final Lagu lagu)
    {
        new AsyncTask<Void, Void, Long>(){
            @Override
            protected Long doInBackground(Void... voids){
                //melakukan proses insert
                long status = db.laguDao().insertLagu(lagu);
                return status;
            }
            @Override
            protected void onPostExecute(Long status){
                Toast.makeText(MainActivity.this, "Succes Insert"+status, Toast.LENGTH_SHORT).show();
            }
        }.execute();
    }


    public void onBtnHapusClick(View view) {
    }
}