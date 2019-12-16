package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.SharedPreferencesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pgapp.utils.Commonfunction;

public class LoginActivity extends AppCompatActivity {

    EditText edt_contactno;
    EditText edt_psw;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_contactno=(EditText)findViewById(R.id.edt_contactno);
        edt_psw=(EditText)findViewById(R.id.edt_psw);
        btn_login=(Button)findViewById(R.id.btn_login);
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
    }
}
