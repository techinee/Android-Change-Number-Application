package com.techinee.changenumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText decText;
    private Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decText = (EditText) findViewById(R.id.desText);
        btnCal = (Button) findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dec;
                dec = Integer.parseInt(decText.getText().toString());
                String binText = ""; //binary text
                binText = decToBin(dec);
                Toast.makeText(MainActivity.this , binText , Toast.LENGTH_LONG).show();
            }
        });
    }

    private String decToBin(int dec){
        String binary = Integer.toBinaryString(dec);
        return ("Binary Number : " + binary);
    }
}