package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class PostPgAdActivity extends AppCompatActivity {

    EditText edt_propertytitle;
    EditText edt_propertydescription;
    EditText edt_price;
    RadioButton rb_1bhk;
    RadioButton rb_2bhk;
    RadioButton rb_3bhk;
    RadioButton rb_family;
    RadioButton rb_student;
    EditText edt_noofperson;
    EditText edt_extrafacilities;
    EditText edt_depositeprice;
    CheckBox chk_showinfo;
    CheckBox chk_allowcall;
    CheckBox chk_allowwa;
    Button btn_update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_pg_ad);
        edt_propertytitle=(EditText)findViewById(R.id.edt_propertytitle);
        edt_propertydescription=(EditText)findViewById(R.id.edt_propertydescription);
        edt_price=(EditText)findViewById(R.id.edt_price);
        rb_1bhk=(RadioButton)findViewById(R.id.rb_1bhk);
        rb_2bhk=(RadioButton)findViewById(R.id.rb_2bhk);
        rb_3bhk=(RadioButton)findViewById(R.id.rb_3bhk);
        rb_family=(RadioButton)findViewById(R.id.rb_family);
        rb_student=(RadioButton)findViewById(R.id.rb_student);
        edt_noofperson=(EditText)findViewById(R.id.edt_noofperson);
        edt_extrafacilities=(EditText)findViewById(R.id.edt_extrafacilities);
        edt_depositeprice=(EditText)findViewById(R.id.edt_depositeprice);
        chk_showinfo=(CheckBox)findViewById(R.id.chk_showinfo);
        chk_allowcall=(CheckBox)findViewById(R.id.chk_allowcall);
        chk_allowwa=(CheckBox)findViewById(R.id.chk_allowwa);
    }
}