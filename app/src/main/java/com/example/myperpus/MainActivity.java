package com.example.myperpus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button
            cmdAllBooks,
            cmdAlreadyRead,
            cmdWantToRead,
            cmdCurrentRead,
            cmdFavorite,
            cmdAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisai
        initView();

        // Navigate ke other screen
        cmdAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                        MainActivity.this,
                        AllBooksActivity.class
                );

                startActivity(intent);
            }
        });
    }

    private void initView() {
        cmdAllBooks = findViewById(R.id.cmdAllBooks);
        cmdAlreadyRead = findViewById(R.id.cmdAlreadyRead);
        cmdWantToRead = findViewById(R.id.cmdWantToRead);
        cmdCurrentRead = findViewById(R.id.cmdCurrentReading);
        cmdFavorite = findViewById(R.id.cmdFavorite);
        cmdAbout = findViewById(R.id.cmdAbout);
    }

    public void keluar(View view) {
        System.exit(0);
    }
}






