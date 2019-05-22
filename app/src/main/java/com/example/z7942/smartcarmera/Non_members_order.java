package com.example.z7942.smartcarmera;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Non_members_order extends AppCompatActivity {
    Button Order, Cancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.non_members_order);
        setTitle("대행구매");

        Order = (Button) findViewById(R.id.Order);
        Cancle = (Button) findViewById(R.id.Cancle);

        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Non_members_order.this);
                dlg.setTitle("주문");
                dlg.setMessage("주문이 완료 되었습니다.");
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Non_members_order.this, activity_expendables.class);
                        startActivity(intent);
                    }
                });
                dlg.show();
            }
        });

        Cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Non_members_order.this, activity_expendables.class);
                startActivity(intent);
            }
        });
    }
}
