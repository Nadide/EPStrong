package com.example.epstrong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageView reportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openInfoPage();
            }
        });


        reportButton = (ImageView) findViewById(R.id.imageView);
        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReportPage();
            }
        });
    }
    public void openInfoPage(){
        Intent open = new Intent(this, InformationPage.class);
        startActivity(open);
        //startActivity(new Intent(this, ReportPage.class));
    }


    public void openReportPage(){
        Intent open = new Intent( this, ReportPage.class);
        startActivity(open);
    }
}
