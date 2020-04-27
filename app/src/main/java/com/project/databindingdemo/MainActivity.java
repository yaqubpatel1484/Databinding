package com.project.databindingdemo;


import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.project.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //binding.setUser(new User("Yaqub"));
        binding.setUser(new User());
        binding.setActivity(new MainActivity());
    }

    public void onMessage(View view,String msg){
        Toast.makeText(view.getContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
