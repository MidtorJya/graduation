package com.example.graduation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //creat creatbt variable
    Button creatbt;
    //creat chcard variable
    Button chcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //attach creatbt variable to the Button view in activity_main.xml using findViewById method
        creatbt =(Button) findViewById(R.id.creatbt);
        //attach chcard variable to the Button view in activity_main.xml using findViewById method
        chcard =(Button) findViewById(R.id.chcard);

        chcard.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          //establish a connection between choosecard activity and MainActivity.java using intent
                                          Intent choosecard = new Intent(MainActivity.this, com.example.graduation.choosecard.class);
                                          //open the activity , choosecard.java
                                          startActivity(choosecard);

                                      }
                                  });
        creatbt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                                          //establish a connection between choosebgmain activity and MainActivity.java using intent
                                          Intent creatcard = new Intent(MainActivity.this, choosebgact.class);

                                         //open the activity , creatcard.java
                                         startActivity(creatcard);

            }
         });
    }

}