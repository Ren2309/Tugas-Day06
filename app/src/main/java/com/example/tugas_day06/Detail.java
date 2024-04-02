package com.example.tugas_day06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        String namaItem = intent.getStringExtra("nama_item");
        String deskripsiItem = intent.getStringExtra("deskripsi_item");
        String hargaItem = intent.getStringExtra("harga_item");


        TextView textViewNamaItem = findViewById(R.id.Nama);
        TextView textViewDeskripsiItem = findViewById(R.id.Deskripsi);
        TextView textViewHargaItem = findViewById(R.id.Harga);

        textViewNamaItem.setText(namaItem);
        textViewDeskripsiItem.setText(deskripsiItem);
        textViewHargaItem.setText(hargaItem);
    }
}