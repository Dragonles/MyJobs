package com.job.fragment;

<<<<<<< HEAD
import android.app.Activity;
import android.net.Uri;
=======

>>>>>>> develop
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.job.activity.myjobs.R;

/**
<<<<<<< HEAD
 * 发布框架
 * */
public class FabuFragment extends Fragment {
    /**
     * 实例化页面
     * */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fabu,container,false);


        return v;
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_fabu, container, false);
=======
 * A simple {@link Fragment} subclass.
 */
public class FabuFragment extends Fragment {


    public FabuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fabu, container, false);
>>>>>>> develop
    }


}
