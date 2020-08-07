package com.example.mango01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView = (ImageView) findViewById(R.id.imageViewId);
        textView =(TextView)findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            String mangoName = bundle.getString("name");
            showDetails(mangoName);

        }


        }
        void showDetails(String Mango01) {

            if (Mango01.equals("Himsagor")) {
                imageView.setImageResource(R.drawable.Himsagor);
                textView.setText(R.string.Himsagor_text);
            }
            if (Mango01.equals("Langra")) {
                imageView.setImageResource(R.drawable.Langra);
                textView.setText(R.string.Langra_text);
            }
            if (Mango01.equals("Fazli")) {
                imageView.setImageResource(R.drawable.Fazil);
                textView.setText(R.string.Fazli_text);

            }

        }
    }

