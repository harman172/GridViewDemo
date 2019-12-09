package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] imageIcons = {R.drawable.icon01_01, R.drawable.icon01_02, R.drawable.icon01_03, R.drawable.icon01_04,
            R.drawable.icon01_05, R.drawable.icon01_06, R.drawable.icon01_07, R.drawable.icon01_08, R.drawable.icon01_09,
            R.drawable.icon01_10};
    String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);


        final IconAdapter iconAdapter = new IconAdapter(this, imageIcons, numbers);
        gridView.setAdapter(iconAdapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "You clicked " + numbers[i], Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "You clicked " + iconAdapter.getItem(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
