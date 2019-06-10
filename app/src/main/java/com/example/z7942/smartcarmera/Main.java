package com.example.z7942.smartcarmera;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main extends Statuscolors {

    ImageButton PicSearch, NameSearch;
    long pressedTime = 0;
    long seconds = 0;

    @Override
    protected void onCreate(Bundle savedlnstanceState){
        super.onCreate(savedlnstanceState);
        setContentView(R.layout.main);

        PicSearch = (ImageButton) findViewById(R.id.PicSearch);
        NameSearch = (ImageButton) findViewById(R.id.NameSearch);


        PicSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PicChoose.class);
                startActivity(intent);
                Log.d("TEST1","HERE");
                Log.d("TEST2", String.valueOf(intent));
            }
        });

        NameSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Listview.class);
                startActivity(intent);
            }
        });
    }

    //back버튼을 3초 내에 두 번 누르면 종료되도록 함.
    @Override
    public void onBackPressed() {

        if(pressedTime == 0){
            Toast.makeText(Main.this, "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
            pressedTime = System.currentTimeMillis();
        } else {
            seconds = System.currentTimeMillis() - pressedTime;

            if ( seconds > 3000 ) {
                Toast.makeText(Main.this, "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
                pressedTime = 0;
            } else {
                super.onBackPressed();
                finish();
            }
        }
    }

}