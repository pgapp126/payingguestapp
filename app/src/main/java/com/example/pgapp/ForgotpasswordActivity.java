package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pgapp.utils.Commonfunction;

public class ForgotpasswordActivity extends AppCompatActivity {
    EditText edt_contactno;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        edt_contactno=(EditText)findViewById(R.id.edt_contactno);
        btn_submit=(Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkMobileNo(edt_contactno.getText().toString()))
                {
                    edt_contactno.setError("Enter 10 digit contactnumber");
                    edt_contactno.requestFocus();
                    return;
                }


            }
        });
    }
}
