package com.example.android.myportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //I used this method when I lerned the project called Just Java in a free Udacity course;
    //public void buttonMessage (View view){
    //    Toast.makeText(this, "This button will launch my capstone project", Toast.LENGTH_SHORT).show();
    //}


    public void sendMessage(View view) {
        Context context = view.getContext();
        int duration = Toast.LENGTH_SHORT;
        Button button = (Button) view; //O nome da aplicação está configurada no 'text' do botão
        String message = String.format(getString(R.string.toast_message), button.getText().toString().toLowerCase());
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
