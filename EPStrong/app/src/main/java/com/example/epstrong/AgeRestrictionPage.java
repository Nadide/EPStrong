package com.example.epstrong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AgeRestrictionPage extends AppCompatActivity {

    private TextView agerestN;
    private TextView agerestY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_restriction_page);

        agerestN = (TextView) findViewById(R.id.textView9);
        agerestN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnMenu();
            }
        });

        agerestY = (TextView) findViewById(R.id.textView10);
        agerestY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reportPage();
            }
        });

    }

    public void returnMenu(){
        Intent open = new Intent( this, MainActivity.class);
        startActivity(open);
    }

    public void reportPage(){
        Intent open = new Intent( this, ReportPage.class);
        startActivity(open);
    }
}
