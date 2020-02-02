package com.example.epstrong;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;

import android.view.View;
import android.content.DialogInterface;
import android.widget.Button;

import android.os.Bundle;

public class InformationPage extends AppCompatActivity {

    private Button subinfo1;
    private Button subinfo2;
    private Button subinfo3;
    private Button subinfo4;

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
}
