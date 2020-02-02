package com.example.epstrong;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;

import android.view.View;
import android.content.DialogInterface;
import android.widget.Button;

import android.os.Bundle;

import static android.util.Log.d;

public class ReportPage extends AppCompatActivity {

    private Button SubmitButton;
    private Button CancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_page);

        SubmitButton = (Button) findViewById(R.id.SubmitButton);
        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfirmationPage();
            }
        });

        CancelButton = (Button) findViewById(R.id.CancelButton);
        CancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CancelReport();
            }
        });

    }

    public void openConfirmationPage(){
        Intent open = new Intent( this, ConfirmationPage.class);
        startActivity(open);
    }

    public void CancelReport(){
        Intent open = new Intent( this, MainActivity.class);
        startActivity(open);
    }
}
