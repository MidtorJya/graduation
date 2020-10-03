package com.example.graduation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class choosecard extends AppCompatActivity {
    //to sent data to MainActivity2.java button = (class),btn=object
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosecard);
        // show activity_main
        setContentView(R.layout.activity_main);


    }
}