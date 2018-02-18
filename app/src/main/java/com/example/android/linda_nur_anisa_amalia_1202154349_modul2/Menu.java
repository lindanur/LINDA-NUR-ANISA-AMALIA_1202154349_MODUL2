package com.example.android.linda_nur_anisa_amalia_1202154349_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // untuk menangani RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // untuk membuat adaptor dan mendukung data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // untuk menyambungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // RecyclerView sebagai default untuk mengola tata letak.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Nasi Goreng");
            foods.add("Mie Goreng");
            foods.add("Nasi Goreng Bawang");
            foods.add("Sate Madura");
            foods.add("Nasi Wagyu");

            priceses.add(20000);
            priceses.add(15000);
            priceses.add(22000);
            priceses.add(20000);
            priceses.add(28000);

            photos.add(R.drawable.nasgor);
            photos.add(R.drawable.migoreng);
            photos.add(R.drawable.nasgorbawang);
            photos.add(R.drawable.satemadura);
            photos.add(R.drawable.nasiwagyu);
        }
    }
}
