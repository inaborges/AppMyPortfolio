package com.example.android.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //I used this method when I lerned the project called Just Java in a free Udacity course;
    public void buttonMessage (View view){
        Toast.makeText(this, "This button will launch my capstone project", Toast.LENGTH_SHORT).show();
    }
}
