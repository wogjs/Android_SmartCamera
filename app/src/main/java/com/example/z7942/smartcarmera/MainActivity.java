package com.example.z7942.smartcarmera;

import android.icu.text.StringSearch;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

class ShopInformDTO {
    public String lastBuildDate;
    public int total;
    public int start;
    public int display;
    public Item[] items;

    class Item {
        public String title;
        public String link;
        public String image;


    }
}
/*
"lastBuildDate": "Mon, 13 May 2019 15:46:07 +0900",
        "total": 8765,
        "start": 1,
        "display": 100,
        "items": [
        {
        "title": "<b>삼성전자 SL-C436W</b>",
        "link": "https://search.shopping.naver.com/gate.nhn?id=9891475917",
        "image": "https://shopping-phinf.pstatic.net/main_9891475/9891475917.20160610105753.jpg",
        "lprice": "213620",
        "hprice": "500000",
        "mallName": "네이버",
        "productId": "9891475917",
        "productType": "1"

      */

public class MainActivity extends AppCompatActivity {
    public static StringBuilder sb;
    public static StringSearch Test;
    public void main(String[] args) {

        TextView textView1 = (TextView)findViewById(R.id.Test);



        ShopInformDTO inform;
        String temp_json;
        String json = "";

        Gson gson = new Gson();

                String clientId = "0RteynuNOBkpzEHzojFc";// 애플리케이션 클라이언트 아이디값";
                String clientSecret = "23e4h__YH1";// 애플리케이션 클라이언트 시크릿값";\
                int display = 1; // 검색결과갯수. 최대100개
                try {
                    String text = URLEncoder.encode("아트메가128", "utf-8");
                    String apiURL = "https://openapi.naver.com/v1/search/blog.json?query=" + text + "&display=" + display + "&";

                    URL url = new URL(apiURL);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();

                    con.setRequestMethod("GET");
                    con.setRequestProperty("X-Naver-Client-Id", clientId);
                    con.setRequestProperty("X-Naver-Client-Secret", clientSecret);

                    int responseCode = con.getResponseCode();
                    BufferedReader br;

                    if (responseCode == 200) {
                        br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    } else {
                        br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                    }

                    while ((temp_json = br.readLine()) != null) {
                        json += temp_json;
                    }
                    json = json.trim();


                    sb = new StringBuilder();
                    String line;

                    while ((line = br.readLine()) != null) {
                        sb.append(line + "\n");
                    }
                    br.close();
                    con.disconnect();
                    System.out.println(sb);
                } catch (Exception e) {

                    inform = new Gson().fromJson(json, ShopInformDTO.class);





                    Log.d("inform 값 : ", String.valueOf(inform));


                }


        }

    }
