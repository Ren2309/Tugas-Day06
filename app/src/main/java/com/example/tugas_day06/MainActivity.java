package com.example.tugas_day06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private adapterhp Adapterhp;
    private ArrayList<allhp> Allhp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();

        recyclerView = findViewById(R.id.recyleview);
        Adapterhp = new adapterhp(Allhp);


        Adapterhp.setOnItemClickListener(new adapterhp.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Berpindah ke halaman detail item saat item diklik
                Intent intent = new Intent(MainActivity.this, Detail.class);
                allhp clickedItem = Allhp.get(position);
                // Kirim data terkait item ke halaman detail
                intent.putExtra("nama_item", clickedItem.getNamahp());
                intent.putExtra("deskripsi_item", clickedItem.getDeskripsi());
                intent.putExtra("harga_item", clickedItem.getHarga());
                startActivity(intent);
            }
        });


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(Adapterhp);
    }


    private void getData() {
        Allhp = new ArrayList<>();

        Allhp.add(new allhp(
                "SAMSUNG S24",
                R.drawable.s24,
                "Deskripsi Samsung S24:\n\n" +
                        "Layar: 6.7 inci, AMOLED, 120Hz refresh rate\n" +
                        "Prosesor: Snapdragon 888\n" +
                        "RAM: 8GB / 12GB\n" +
                        "Penyimpanan: 128GB / 256GB\n" +
                        "Kamera Belakang: 108MP (utama), 12MP (ultrawide), 5MP (makro)\n" +
                        "Kamera Depan: 40MP\n" +
                        "Baterai: 5000mAh, Fast charging 45W, Wireless charging 25W\n",
                "Rp 9.999.000"));

        Allhp.add(new allhp(
                "IQOO 12",
                R.drawable.iq12,
                "Deskripsi iQOO 12:\n\n" +
                        "Layar: 6.7 inci, Super AMOLED, 120Hz refresh rate\n" +
                        "Prosesor: Snapdragon 888 Plus\n" +
                        "RAM: 8GB / 12GB\n" +
                        "Penyimpanan: 256GB / 512GB\n" +
                        "Kamera Belakang: 50MP (utama), 20MP (ultrawide), 12MP (telefoto)\n" +
                        "Baterai: 5000mAh, Fast charging 120W\n",
                "Rp 10.999.000"));

        Allhp.add(new allhp(
                "IQOO 11",
                R.drawable.iq11,
                "Deskripsi iQOO 11:\n\n" +
                        "Layar: 6.5 inci, Super AMOLED, Full HD+, 90Hz refresh rate\n" +
                        "Prosesor: Snapdragon 870\n" +
                        "RAM: 8GB / 12GB\n" +
                        "Penyimpanan: 128GB / 256GB\n" +
                        "Kamera Belakang: 48MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 4500mAh, Fast charging 66W\n",
                "Rp 7.999.000"));

        Allhp.add(new allhp(
                "IPHONE 13",
                R.drawable.ip13,
                "Deskripsi iPhone 13:\n\n" +
                        "Layar: 6.1 inci, Super Retina XDR\n" +
                        "Prosesor: A15 Bionic\n" +
                        "RAM: Up to 6GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 12MP (utama), 12MP (ultrawide)\n" +
                        "Mode: Night mode\n" +
                        "Baterai: MagSafe wireless charging support\n",
                "Rp 14.499.000"));

        Allhp.add(new allhp(
                "POCO F4",
                R.drawable.pf4,
                "Deskripsi POCO F4:\n\n" +
                        "Layar: 6.67 inci, Super AMOLED, Full HD+, 120Hz refresh rate\n" +
                        "Prosesor: Snapdragon 870\n" +
                        "RAM: Up to 12GB\n" +
                        "Penyimpanan: Up to 256GB\n" +
                        "Kamera Belakang: 108MP (utama), 8MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 4500mAh, Fast charging 67W\n",
                "Rp 6.999.000"));

        Allhp.add(new allhp(
                "ROG 5",
                R.drawable.r5,
                "Deskripsi ROG 5:\n\n" +
                        "Layar: 6.78 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 888 Plus\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 6000mAh, Fast charging 65W\n",
                "Rp 11.999.000"));

        Allhp.add(new allhp(
                "ROG 5s",
                R.drawable.r5sp,
                "Deskripsi ROG 5s:\n\n" +
                        "Layar: 6.78 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 888 Plus\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 6000mAh, Fast charging 65W\n",
                "Rp 12.499.000"));

        Allhp.add(new allhp(
                "ROG 5s PRO",
                R.drawable.r5sp,
                "Deskripsi ROG 5s Pro:\n\n" +
                        "Layar: 6.78 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 888 Plus\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 6000mAh, Fast charging 65W\n",
                "Rp 13.499.000"));

        Allhp.add(new allhp(
                "ROG 6",
                R.drawable.r6,
                "Deskripsi ROG 6:\n\n" +
                        "Layar: 6.8 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 8 Gen 1\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 6000mAh, Fast charging 65W\n",
                "Rp 13.999.000"));

        Allhp.add(new allhp(
                "ROG 6 PRO",
                R.drawable.r6p,
                "Deskripsi ROG 6 Pro:\n\n" +
                        "Layar: 6.8 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 8 Gen 1\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 6000mAh, Fast charging 65W\n",
                "Rp 14.999.000"));

        Allhp.add(new allhp(
                "ROG 7",
                R.drawable.r7,
                "Deskripsi ROG 7:\n\n" +
                        "Layar: 6.9 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 8 Gen 1\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 7000mAh, Fast charging 65W\n",
                "Rp 15.999.000"));

        Allhp.add(new allhp(
                "RED MAGIS 8S PR0",
                R.drawable.rm,
                "Deskripsi Red Magic 8S Pro:\n\n" +
                        "Layar: 6.8 inci, AMOLED, Full HD+, 165Hz refresh rate\n" +
                        "Prosesor: Snapdragon 8 Gen 1\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 5000mAh, Fast charging 165W\n",
                "Rp 13.999.000"));

        Allhp.add(new allhp(
                "ROG ULTIMATE 5",
                R.drawable.ru5,
                "Deskripsi ROG Phone Ultimate 5:\n\n" +
                        "Layar: 6.78 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 888 Plus\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 6000mAh, Fast charging 65W\n",
                "Rp 16.999.000"));

        Allhp.add(new allhp(
                "ROG ULTIMATE 7",
                R.drawable.ru7,
                "Deskripsi ROG Phone Ultimate 7:\n\n" +
                        "Layar: 6.8 inci, AMOLED, Full HD+, 144Hz refresh rate\n" +
                        "Prosesor: Snapdragon 8 Gen 1\n" +
                        "RAM: Up to 18GB\n" +
                        "Penyimpanan: Up to 512GB\n" +
                        "Kamera Belakang: 64MP (utama), 13MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 7000mAh, Fast charging 65W\n",
                "Rp 17.999.000"));

        Allhp.add(new allhp(
                "SAMSUNG S23",
                R.drawable.s23,
                "Deskripsi Samsung S23:\n\n" +
                        "Layar: 6.4 inci, Super AMOLED, Full HD+, 90Hz refresh rate\n" +
                        "Prosesor: Snapdragon 870\n" +
                        "RAM: 6GB / 8GB\n" +
                        "Penyimpanan: 128GB / 256GB\n" +
                        "Kamera Belakang: 108MP (utama), 12MP (ultrawide), 5MP (makro)\n" +
                        "Baterai: 4500mAh, Fast charging 45W\n",
                "Rp 8.999.000"));

        Allhp.add(new allhp(
                "VIVO 80X PRO",
                R.drawable.v80,
                "Deskripsi Vivo 80X Pro:\n\n" +
                        "Layar: 6.78 inci, Super AMOLED, Full HD+, 120Hz refresh rate\n" +
                        "Prosesor: Snapdragon 870\n" +
                        "RAM: Up to 12GB\n" +
                        "Penyimpanan: Up to 256GB\n" +
                        "Kamera Belakang: 50MP (utama), 8MP (ultrawide), 2MP (makro)\n" +
                        "Baterai: 5000mAh, Fast charging 66W\n",
                "Rp 8.499.000"));
    }
}
