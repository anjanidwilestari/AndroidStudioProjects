package com.example.lagu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Index;
import androidx.room.Room;

import com.example.lagu.data.Lagu;
import com.example.lagu.data.LaguDao;
import com.example.lagu.data.LaguDatabase;

public class ShowActivity extends AppCompatActivity {
    private TextView tvjudul,tvartis,tvlirik;
    private Lagu currentLagu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        this.loadData();
        this.initComponent();

    }

    private void initComponent() {
        this.tvjudul = findViewById(R.id.tvjudul1);
        this.tvartis = findViewById(R.id.tvartis1);
        this.tvlirik = findViewById(R.id.tvlirik1);

        if (this.currentLagu == null){
            return;
        }

        this.tvjudul.setText(this.currentLagu.judul);
        this.tvartis.setText(this.currentLagu.artis);
        this.tvlirik.setText(this.currentLagu.lirik);
    }

    private void loadData() {
        LaguDatabase db = Room.databaseBuilder(getApplicationContext(),
                LaguDatabase.class, "lagu").allowMainThreadQueries().build();
        LaguDao laguDao = db.laguDao();

        this.currentLagu = laguDao.selectOne();
    }

    private void syncData()
    {
        this.currentLagu.judul = this.tvjudul.getText().toString();
        this.currentLagu.artis = this.tvartis.getText().toString();
        this.currentLagu.lirik = this.tvlirik.getText().toString();
    }

    public void onBtnHapusClick(View view)
    {
        this.syncData();

        LaguDatabase db = Room.databaseBuilder(getApplicationContext(),
                LaguDatabase.class, "lagu").allowMainThreadQueries().build();
        LaguDao laguDao = db.laguDao();

        laguDao.delete(this.currentLagu);

        Toast.makeText(this, "Berhasil Dihapus", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

}
