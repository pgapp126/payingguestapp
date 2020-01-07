package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pgapp.utils.Commonfunction;

public class ProfileActivity extends AppCompatActivity {

    EditText edt_username;
    EditText edt_contactno;
    EditText edt_email;
    Button btn_update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        edt_username=(EditText)findViewById(R.id.edt_username);
        edt_contactno=(EditText)findViewById(R.id.edt_contactno);
        edt_email=(EditText)findViewById(R.id.edt_email);
        btn_update=(Button) findViewById(R.id.btn_update);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkMobileNo(edt_username.getText().toString()))
                {
                    edt_username.setError("Enter User name");
                    edt_username.requestFocus();
                    return;
                }
                public void onClick(View v) {
                    if(!Commonfunction.checkMobileNo(edt_contactno.getText().toString()))
                    {
                        edt_contactno.setError("Enter 10 digit contact number");
                        edt_contactno.requestFocus();
                        return;
                    }
                    public void onClick(View v) {
                        if(!Commonfunction.checkMobileNo(edt_email.getText().toString()))
                        {
                            edt_email.setError("Enter valid Email");
                            edt_email.requestFocus();
                            return;
                        }


                }
}
