package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SelectCityActivity extends AppCompatActivity {
    EditText edt_searchcity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);
        edt_searchcity=(EditText)findViewById(R.id.edt_searchcity);
    }
}