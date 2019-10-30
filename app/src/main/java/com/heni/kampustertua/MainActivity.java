package com.heni.kampustertua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKampus;
    private ArrayList<Kampus> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvKampus = findViewById(R.id.rv_kampus);
        rvKampus.setHasFixedSize(true);

        list.addAll(KampusData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKampus.setLayoutManager(new LinearLayoutManager(this));
        ListKampusAdapter listKampusAdapter = new ListKampusAdapter(list);
        rvKampus.setAdapter(listKampusAdapter);

        listKampusAdapter.setOnItemClickCallback(new ListKampusAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kampus data) {
                showSelectedData(data);
            }
        });
    }

    public void showSelectedData(Kampus l) {
        Intent detail = new Intent(MainActivity.this, DetailKampus.class);
        detail.putExtra(DetailKampus.EXTRA_NAMAKAMPUS, l.getName());
        detail.putExtra(DetailKampus.EXTRA_BERDIRI, l.getBerdiri());
        detail.putExtra(DetailKampus.EXTRA_PENGERTIAN, l.getDetail());
        detail.putExtra(DetailKampus.EXTRA_SEJARAH, l.getSejarah());
        detail.putExtra(DetailKampus.EXTRA_IMG, l.getPhoto());
        startActivity(detail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
        return super.onOptionsItemSelected(item);
    }

}
