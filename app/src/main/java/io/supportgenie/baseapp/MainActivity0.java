package io.supportgenie.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import io.supportgenie.arsdk.Sdk;


public class MainActivity0 extends AppCompatActivity {

    private Button open_sdk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open_sdk = findViewById(R.id.open_sdk);

        open_sdk.setOnClickListener(v-> {
        Intent intent = new Intent(MainActivity0.this, Sdk.class);
        startActivity(intent);
        finish();




        });



    }
}