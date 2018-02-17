package com.example2017.android.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by M7moud on 17-Feb-18.
 */
public class test extends Fragment
{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(),"Done",Toast.LENGTH_LONG).show();
    }
}
