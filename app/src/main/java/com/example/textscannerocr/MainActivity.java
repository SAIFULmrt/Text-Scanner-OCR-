package com.example.textscannerocr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button captureBtn;
    private Button advanceBtn;
    private Button infoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captureBtn = findViewById(R.id.idBtnCapture);
        advanceBtn = findViewById(R.id.idBtnAdvance);
        infoBtn = findViewById(R.id.idBtnInfo);

        captureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ScannerActivity.class);
                startActivity(i);
            }
        });

        advanceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AdvanceActivity.class);
                startActivity(i);
            }
        });

        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,InfoActivity.class);
                startActivity(i);
            }
        });

    }
}