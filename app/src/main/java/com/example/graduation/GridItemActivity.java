 package com.example.graduation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

 public class GridItemActivity extends AppCompatActivity {

    //TextView name;

    //creat variable image
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        //name = findViewById(R.id.griddata);


        //attach image variable to the ImageView in activity_grid.item.xml using findViewById method
        image = findViewById(R.id.imageView);



        Intent intent = getIntent();


        //name.setText(intent.getStringExtra("name"));


        image.setImageResource(intent.getIntExtra("image",0));
    }
}