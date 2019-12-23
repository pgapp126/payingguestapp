package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.SharedPreferencesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pgapp.utils.Commonfunction;
import com.example.pgapp.utils.Constants;
import com.example.pgapp.utils.DataInterface;
import com.example.pgapp.utils.Webservice_Volley;

import org.json.JSONObject;

import java.util.HashMap;

public class LoginActivity extends AppCompatActivity implements DataInterface {

    EditText edt_contactno;
    EditText edt_psw;
    TextView txt_forgotpsw;
    Button btn_login;
    TextView txt_signup;

    Webservice_Volley volley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_contactno=(EditText)findViewById(R.id.edt_contactno);
        edt_psw=(EditText)findViewById(R.id.edt_psw);
        txt_forgotpsw=(TextView) findViewById(R.id.txt_forgotpsw);
        btn_login=(Button)findViewById(R.id.btn_login);
        txt_signup=(TextView) findViewById(R.id.txt_signup);

        volley=new Webservice_Volley(this,this);
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
                String url= Constants.Webserive_Url+"login.php";
                HashMap<String,String> params=new HashMap<>();
                params.put("ContactNo",edt_contactno.getText().toString());
                params.put("Password",edt_psw.getText().toString());

                volley.CallVolley(url,params,"login");
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

    @Override
    public void getData(JSONObject jsonObject, String tag) {
        Toast.makeText(this, jsonObject.toString(), Toast.LENGTH_SHORT).show();
    }
}
