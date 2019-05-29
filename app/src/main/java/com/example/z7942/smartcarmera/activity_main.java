package com.example.z7942.smartcarmera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class activity_main extends AppCompatActivity {

    Button PicSearch, NameSearch, Setting;

    @Override
    protected void onCreate(Bundle savedlnstanceState){
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.activity_main);

        PicSearch = (Button)findViewById(R.id.PicSearch);
        NameSearch = (Button)findViewById(R.id.NameSearch);
        Setting = (Button)findViewById(R.id.Setting);

        PicSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_camera.class);
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

        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_setting.class);
                startActivity(intent);
            }
        });

    }
}