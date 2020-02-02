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
    }

    public void openSubinfo1(){
        Intent open = new Intent( this, SubInfo1.class);
        startActivity(open);
    }


}
