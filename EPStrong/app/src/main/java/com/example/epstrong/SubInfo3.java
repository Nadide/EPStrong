package com.example.epstrong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubInfo3 extends AppCompatActivity {

    private TextView returntext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_info3);

        returntext = (TextView) findViewById(R.id.returntext3);
        returntext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo1();
            }
        });
    }

    public void openSubinfo1(){
        Intent open = new Intent( this, InformationPage.class);
        startActivity(open);
    }
}
