package com.example.gasparyan.homeworke2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

     public void   goToRegistrationActivity(View view){
         Intent intent = new Intent(MainActivity.this,RegistrationActivity.class);
         startActivity(intent);


    }

}
