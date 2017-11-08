package com.example.vianneyribeiro.uplay;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button internetRadio = findViewById(R.id.btn_InternetRadio);
        internetRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radio = new Intent(MainActivity.this, InternetRadioActivity.class);
                startActivity(radio);
            }
        });


        Button library = findViewById(R.id.btn_Library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent library = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(library);
            }
        });

        Button playlist = findViewById(R.id.btn_Playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlist = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlist);
            }
        });

        Button podcast = findViewById(R.id.btn_Podcast);
        podcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent podcast = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(podcast);
            }
        });

        Button account = findViewById(R.id.btn_Payment);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accountView = new Intent(MainActivity.this, AccountActivity.class);
                startActivity(accountView);
            }
        });
    }
}
