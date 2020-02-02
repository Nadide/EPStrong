package com.example.epstrong;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.TextView;

public class InformationPage extends AppCompatActivity {

    private Button subinfo1;
    private Button subinfo2;
    private Button subinfo3;
    private Button subinfo4;
    private Button subinfo5;
    private TextView returntext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_page);

        subinfo1 = (Button) findViewById(R.id.button);
        subinfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo1();
            }
        });

        subinfo2 = (Button) findViewById(R.id.button2);
        subinfo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo2();
            }
        });

        subinfo3 = (Button) findViewById(R.id.button3);
        subinfo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo3();
            }
        });

        subinfo4 = (Button) findViewById(R.id.button4);
        subinfo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo4();
            }
        });

        subinfo5 = (Button) findViewById(R.id.button6);
        subinfo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo5();
            }
        });

        returntext = (TextView) findViewById(R.id.textView6);
        returntext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnMenu();
            }
        });
    }


    public void openSubinfo1(){
        Intent open = new Intent( this, SubInfo1.class);
        startActivity(open);
    }

    public void openSubinfo2(){
        Intent open = new Intent( this, SubInfo22.class);
        startActivity(open);
    }

    public void openSubinfo3(){
        Intent open = new Intent( this, SubInfo3.class);
        startActivity(open);
    }

    public void openSubinfo4(){
        Intent open = new Intent( this, SubInfo4.class);
        startActivity(open);
    }

    public void openSubinfo5(){
        Intent open = new Intent( this, SubInfo5.class);
        startActivity(open);
    }

    public void returnMenu(){
        Intent open = new Intent( this, MainActivity.class);
        startActivity(open);
    }
}
