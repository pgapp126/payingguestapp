package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pgapp.utils.Commonfunction;

public class VerificationActivity extends AppCompatActivity {
    EditText edt_verificationcode;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        edt_verificationcode=(EditText)findViewById(R.id.edt_verificationcode);
        btn_submit=(Button) findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkverificationcode(edt_verificationcode.getText().toString()))
                {
                    edt_verificationcode.setError("Enter 4 digit verification code");
                    edt_verificationcode.requestFocus();
                    return;
                }



            }
        });
    }
}
