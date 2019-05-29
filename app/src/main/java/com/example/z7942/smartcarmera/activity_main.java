package com.example.z7942.smartcarmera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class activity_main extends statuscolors {

    ImageButton PicSearch, NameSearch;

    @Override
    protected void onCreate(Bundle savedlnstanceState){
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);

        PicSearch = (ImageButton) findViewById(R.id.PicSearch);
        NameSearch = (ImageButton) findViewById(R.id.NameSearch);


        PicSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), test.class);
                startActivity(intent);
                Log.d("TEST1","HERE");
                Log.d("TEST2", String.valueOf(intent));
            }
        });

        NameSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}