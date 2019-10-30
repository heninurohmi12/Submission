package com.heni.kampustertua;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailKampus extends AppCompatActivity {
    public static final String EXTRA_IMG= "extra_img";
    public static final String EXTRA_NAMAKAMPUS = "extra_namakampus";
    public static final String EXTRA_BERDIRI = "extra_berdiri";
    public static final String EXTRA_PENGERTIAN= "extra_pengertian";
    public static final String EXTRA_SEJARAH= "extra_sejarah";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kampus);

        ImageView Gambar;
        TextView tvNamaKampus, tvPengertian, tvSejarah ,tvBerdiri;

        Gambar = findViewById(R.id.img_kampus);
        tvNamaKampus = findViewById(R.id.tv_name);
        tvBerdiri = findViewById(R.id.tv_berdiri);
        tvPengertian = findViewById(R.id.tv_pengertian);
        tvSejarah = findViewById(R.id.tv_sejarah);

        int photo = getIntent().getIntExtra(EXTRA_IMG, 0);
        String nama = getIntent().getStringExtra(EXTRA_NAMAKAMPUS),
                rilis = getIntent().getStringExtra(EXTRA_BERDIRI),
                pengertian = getIntent().getStringExtra(EXTRA_PENGERTIAN),
                sejarah = getIntent().getStringExtra(EXTRA_SEJARAH);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(),photo);
        Gambar.setImageBitmap(bmp);
        tvNamaKampus.setText(nama);
        tvBerdiri.setText(rilis);
        tvPengertian.setText(pengertian);
        tvSejarah.setText(sejarah);


    }

}
