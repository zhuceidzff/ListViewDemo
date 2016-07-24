package com.example.lsx.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.activity_main_list_view);
        String[] fruit = {"apple", "banana", "orange", "pear", "grape", "cherry", "mango","apple",
                "banana", "orange", "pear", "grape", "cherry", "mango"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, fruit);
        ListView listView = (ListView) findViewById(R.id.activity_main_list_view);
        listView.setAdapter(adapter);


    }
}
