package com.example.z7942.smartcarmera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class activity_expendables extends AppCompatActivity {

    Handler handler = new Handler();
    Button btnOrder1, btnOrder2, btnOrder3,btnOrder4,btnOrder5,btnOrder6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expendableslist);

        btnOrder1 = (Button)findViewById(R.id.btnOrder1);
        btnOrder2 = (Button)findViewById(R.id.btnOrder2);
        btnOrder3 = (Button)findViewById(R.id.btnOrder3);
        btnOrder4 = (Button)findViewById(R.id.btnOrder4);
        btnOrder5 = (Button)findViewById(R.id.btnOrder5);
        btnOrder6 = (Button)findViewById(R.id.btnOrder6);

        btnOrder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), order.class);
                startActivity(intent);
            }
        });

        btnOrder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Non_members_order.class);
                startActivity(intent);
            }
        });

        btnOrder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), order.class);
                startActivity(intent);
            }
        });

        btnOrder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Non_members_order.class);
                startActivity(intent);
            }
        });

        btnOrder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), order.class);
                startActivity(intent);
            }
        });

        btnOrder6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Non_members_order.class);
                startActivity(intent);
            }
        });


       /* //인터넷 이미지 불러오기
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    final ImageView iv = (ImageView)findViewById(R.id.image1);
                    //URL에 이미지 추가
                    URL url = new URL("");
                    InputStream is = url.openStream();
                    final Bitmap bm = BitmapFactory.decodeStream(is);
                    handler.post(new Runnable() {

                        @Override
                        public void run() {  // 화면에 그려줄 작업
                            iv.setImageBitmap(bm);
                        }
                    });
                    iv.setImageBitmap(bm); //비트맵 객체로 보여주기
                } catch(Exception e){

                }

            }
        });

        t.start();
        //여기까지

        //인터넷 이미지 불러오기
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    final ImageView iv = (ImageView)findViewById(R.id.image2);
                    //URL에 이미지 추가
                    URL url = new URL("");
                    InputStream is = url.openStream();
                    final Bitmap bm = BitmapFactory.decodeStream(is);
                    handler.post(new Runnable() {

                        @Override
                        public void run() {  // 화면에 그려줄 작업
                            iv.setImageBitmap(bm);
                        }
                    });
                    iv.setImageBitmap(bm); //비트맵 객체로 보여주기
                } catch(Exception e){

                }

            }
        });

        t.start();
        //여기까지

        //인터넷 이미지 불러오기
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    final ImageView iv = (ImageView)findViewById(R.id.image3);
                    //URL에 이미지 추가
                    URL url = new URL("");
                    InputStream is = url.openStream();
                    final Bitmap bm = BitmapFactory.decodeStream(is);
                    handler.post(new Runnable() {

                        @Override
                        public void run() {  // 화면에 그려줄 작업
                            iv.setImageBitmap(bm);
                        }
                    });
                    iv.setImageBitmap(bm); //비트맵 객체로 보여주기
                } catch(Exception e){

                }

            }
        });

        t.start();
        //여기까지*/
        }
}
