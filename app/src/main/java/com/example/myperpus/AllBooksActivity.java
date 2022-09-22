package com.example.myperpus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

    }

    public void kembali(View view) {
        System.exit(0);
    }

    // navigasi ke screen sebelumnya
//    @Override
//    public void onClick(View view) {
//        // System.exit(1);
//    }
}