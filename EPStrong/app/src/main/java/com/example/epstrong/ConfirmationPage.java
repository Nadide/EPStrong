package com.example.epstrong;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationPage extends AppCompatActivity {

    private TextView returntext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_page);

        returntext = (TextView) findViewById(R.id.returntext);
        returntext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSubinfo1();
            }
        });
    }

    public void openSubinfo1(){
        Intent open = new Intent( this, MainActivity.class);
        startActivity(open);
    }
}