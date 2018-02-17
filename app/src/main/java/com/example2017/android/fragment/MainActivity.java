package com.example2017.android.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //(R.id.main) is layout which u want to view fragmeent in
        //new test() is Fragment class
        //key is String like id for calling Fragment
        getFragmentManager().beginTransaction()
                .add(R.id.main,new test(),"key").commit();
    }
}
