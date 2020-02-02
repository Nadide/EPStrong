package com.example.epstrong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openReportPage();
            }
        });
    }
    public void openReportPage(){
        Intent open = new Intent(this, InformationPage.class);
        startActivity(open);
        //startActivity(new Intent(this, ReportPage.class));
    }
}
