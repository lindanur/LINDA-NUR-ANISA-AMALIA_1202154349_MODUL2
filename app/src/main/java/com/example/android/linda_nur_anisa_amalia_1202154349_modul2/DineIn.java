package com.example.android.linda_nur_anisa_amalia_1202154349_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        // untuk membuat Spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner_table);

        // untuk membuar ArrayAdapter menggunakan array string dan layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);
        // untuk menentukan posisi yang akan digunakan saat daftar pilihan muncul.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // menerapkam adaptor ke spinner nya.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
