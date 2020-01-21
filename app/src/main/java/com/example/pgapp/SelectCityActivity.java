package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SelectCityActivity extends AppCompatActivity {
    EditText edt_searchcity;
    TextView txt_city;
    TextView txt_mylocation;
    ListView lv_cities;


    ArrayList<String> citylist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);

        edt_searchcity=(EditText)findViewById(R.id.edt_searchcity);
        txt_city=(TextView) findViewById(R.id.txt_city);
        txt_mylocation=(TextView) findViewById(R.id.txt_mylocation);
        lv_cities=(ListView) findViewById(R.id.lv_cities);


        citylist.add("Vadodara");
        citylist.add("Surat");
        citylist.add("Mumbai");
        citylist.add("Ahmedabad");
        citylist.add("Delhi");
        citylist.add("Banglore");
        citylist.add("Hyderabad");
        citylist.add("Pune");
        citylist.add("Kolkata");

        Collections.sort(citylist,String.CASE_INSENSITIVE_ORDER);


        final ArrayAdapter<String> adapter=new ArrayAdapter<>(SelectCityActivity.this,android.R.layout.simple_list_item_1,citylist);
        lv_cities.setAdapter(adapter);



        edt_searchcity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }

}
