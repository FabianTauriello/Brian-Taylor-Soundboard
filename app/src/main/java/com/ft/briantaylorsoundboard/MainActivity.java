package com.ft.briantaylorsoundboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //createButtonEvents();

    }

//    private void createButtonEvents() {
//        Button btnALittleSneakyOne = findViewById(R.id.btnALittleSneakyOne);
//        btnALittleSneakyOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Code here executes on main thread after user presses button
//            }
//        });
//    }


}
