package com.example.z7942.smartcarmera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class activity_name extends AppCompatActivity {

    EditText EditName;
    ImageView imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namesearch);

        EditName = (EditText)findViewById(R.id.EditName);
        imageButton = (ImageView)findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity_expendables.class);
                startActivity(intent);
            }
        });
    }
}
