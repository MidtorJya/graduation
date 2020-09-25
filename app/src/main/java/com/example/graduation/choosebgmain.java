package com.example.graduation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class choosebgmain extends AppCompatActivity {

    GridView listView;
    //String[] itemNames = {"bk1","bk2","bk3","bk4","bk5","bk6"};
    int[] itemImages = {R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosebgmain);

        listView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),GridItemActivity.class);
              // intent.putExtra("name",itemNames[i]);
                intent.putExtra("image",itemImages[i]);
                startActivity(intent);

            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return itemImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);

            //TextView name = view1.findViewById(R.id.items);
            ImageView image = view1.findViewById(R.id.images);

           // name.setText(itemNames[i]);
            image.setImageResource(itemImages[i]);
            return  view1;
        }
    }
}