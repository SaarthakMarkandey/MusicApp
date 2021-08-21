package com.example.test3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class onlinelist extends AppCompatActivity  {

    private static final String TAG ="onlinelistactivity" ;
    private String[] names = {"Badnam", "Burjkhalifa", "Despacito", "Dynamite", "LifeGoesOn",
                "NaachmeriRani", "ShapeOfYou", "SomethingJustLikeThis", "TeriMitti", "Wind"};

        private int[] images = {R.drawable.badnam, R.drawable.burjkhalifa, R.drawable.despacito, R.drawable.dynamite,
                R.drawable.lifegoeson, R.drawable.naachmerirani, R.drawable.shapeofyou,
                R.drawable.somethingjustlikethis, R.drawable.terimitti, R.drawable.wind};
        private List<Person> personList = new ArrayList<>();
        private RecyclerView recyclerView;
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlinelist);
        recyclerView = findViewById(R.id.home_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        prepareTheList();
        RecyclerAdapter adapter = new RecyclerAdapter(this,personList);
        recyclerView.setAdapter(adapter);
    }
        private void prepareTheList () {
        int count = 0;
        for (String name : names) {
            Person person = new Person(name, images[count]);
            personList.add(person);
            count++;

        }
    }


}