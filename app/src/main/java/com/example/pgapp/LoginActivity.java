package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.SharedPreferencesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pgapp.utils.Commonfunction;

public class LoginActivity extends AppCompatActivity {

    EditText edt_contactno;
    EditText edt_psw;
    TextView txt_forgotpsw;
    Button btn_login;
    TextView txt_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_contactno=(EditText)findViewById(R.id.edt_contactno);
        edt_psw=(EditText)findViewById(R.id.edt_psw);
        txt_forgotpsw=(TextView) findViewById(R.id.txt_forgotpsw);
        btn_login=(Button)findViewById(R.id.btn_login);
        txt_signup=(TextView) findViewById(R.id.txt_signup);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkMobileNo(edt_contactno.getText().toString()))
                {
                    edt_contactno.setError("Enter 10 digit contactnumber");
                    edt_contactno.requestFocus();
                    return;
                }
                if(!Commonfunction.checkPassword(edt_psw.getText().toString()))
                {
                    edt_psw.setError("Your password should be 6 character long");
                    edt_psw.requestFocus();
                    return;
                }


            }
        });
      txt_signup.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(LoginActivity.this,RegistrationActivity.class);
              startActivity(i);
          }
      });
      txt_forgotpsw.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(LoginActivity.this,ForgotpasswordActivity.class);
              startActivity(i);
          }
      });
    }
}
