package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pgapp.utils.Commonfunction;

public class ResetpasswordActivity extends AppCompatActivity {
    EditText edt_newpsw;
    EditText edt_confirmpsw;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpassword);
        edt_newpsw=(EditText)findViewById(R.id.edt_newpsw);
        edt_confirmpsw=(EditText)findViewById(R.id.edt_confirmpsw);
        btn_submit=(Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkPassword(edt_newpsw.getText().toString()))
                {
                    edt_newpsw.setError("Your password should be 6 character long");
                    edt_newpsw.requestFocus();
                    return;
                }
                if(!Commonfunction.checkPassword(edt_confirmpsw.getText().toString()))
                {
                    edt_confirmpsw.setError("Your password should be 6 character long");
                    edt_confirmpsw.requestFocus();
                    return;
                }
                if(!edt_newpsw.getText().toString().equals(edt_confirmpsw.getText().toString()))
                {
                    edt_confirmpsw.setError("Both password should be same");
                    edt_confirmpsw.requestFocus();
                    return;
                }


            }
        });
    }
}
