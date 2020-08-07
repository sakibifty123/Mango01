package com.example.mango01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button HimsagorButton,LangraButton,FazliButton;
    private Intent intent;

    public MainActivity(Button himsagorButton, Button langraButton,Button fazliButton) {
        HimsagorButton = himsagorButton;
        LangraButton = langraButton;
        FazliButton= fazliButton;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HimsagorButton = (Button) findViewById(R.id.HimsagorButtonId);
        LangraButton = (Button) findViewById(R.id.LangraButtonId);
        FazliButton = (Button) findViewById(R.id.FazliButtonId);

        HimsagorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.HimsagorButtonId) {
                    intent = new Intent(MainActivity.this, profileActivity.class);
                    intent.putExtra("name","himsagor");
                    startActivity(intent);
                }

            }
        });

        LangraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.LangraButtonId) {
                    intent = new Intent(MainActivity.this, profileActivity.class);
                   intent.putExtra("name","langra");
                    startActivity(intent);
                }

            }
        });

        FazliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.FazliButtonId) {
                    intent = new Intent(MainActivity.this, profileActivity.class);
                    intent.putExtra("name","fazli");
                    startActivity(intent);
                }

            }
        });


    }
}