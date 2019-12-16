package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pgapp.utils.Commonfunction;

public class RegistrationActivity extends AppCompatActivity {
    EditText edt_username;
    EditText edt_contactno;
    EditText edt_email;
    EditText edt_psw;
    EditText edt_confirmpsw;
    Button btn_signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edt_username=(EditText)findViewById(R.id.edt_username);
        edt_contactno=(EditText)findViewById(R.id.edt_contactno);
        edt_email=(EditText)findViewById(R.id.edt_email);
        edt_psw=(EditText)findViewById(R.id.edt_psw);
        edt_confirmpsw=(EditText)findViewById(R.id.edt_confirmpsw);
        btn_signup=(Button)findViewById(R.id.btn_signup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkString(edt_username.getText().toString()))
                {
                    edt_username.setError("Enter Username");
                    edt_username.requestFocus();
                    return;
                }
                if(!Commonfunction.checkMobileNo(edt_contactno.getText().toString()))
                {
                    edt_contactno.setError("Enter 10 digit contactnumber");
                    edt_contactno.requestFocus();
                    return;
                }
                if(!Commonfunction.checkEmail(edt_email.getText().toString()))
                {
                    edt_email.setError("Enter valid Email");
                    edt_email.requestFocus();
                    return;
                }
                if(!Commonfunction.checkPassword(edt_psw.getText().toString()))
                {
                    edt_psw.setError("Your password should be 6 character long");
                    edt_psw.requestFocus();
                    return;
                }
                if(!Commonfunction.checkPassword(edt_confirmpsw.getText().toString()))
                {
                    edt_confirmpsw.setError("Your password should be 6 character long");
                    edt_confirmpsw.requestFocus();
                    return;
                }
                if(!edt_psw.getText().toString().equals(edt_confirmpsw.getText().toString()))
                {
                    edt_confirmpsw.setError("Both password should be same");
                    edt_confirmpsw.requestFocus();
                    return;
                }


            }
        });

            }
}
