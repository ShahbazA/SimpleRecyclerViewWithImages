package com.example.simplerecylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler_view;
    MyAdapter mAdapter;
    ArrayList textList, imagesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GenerateLists();

        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));

        mAdapter = new MyAdapter(textList,imagesList);
        recycler_view.setAdapter(mAdapter);
    }

    public void GenerateLists(){
        textList = new ArrayList();
        imagesList = new ArrayList();


        textList.add("One");
        textList.add("Two");
        textList.add("Three");
        textList.add("Four");
        textList.add("Five");
        textList.add("Six");
        textList.add("Seven");
        textList.add("Eight");
        textList.add("Nine");
        textList.add("Ten");


        imagesList.add(R.drawable.one);
        imagesList.add(R.drawable.two);
        imagesList.add(R.drawable.three);
        imagesList.add(R.drawable.four);
        imagesList.add(R.drawable.five);
        imagesList.add(R.drawable.six);
        imagesList.add(R.drawable.seven);
        imagesList.add(R.drawable.eight);
        imagesList.add(R.drawable.nine);
        imagesList.add(R.drawable.ten);

    }
}
