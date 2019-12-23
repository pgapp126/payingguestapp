package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pgapp.utils.Commonfunction;
import com.example.pgapp.utils.Constants;
import com.example.pgapp.utils.DataInterface;
import com.example.pgapp.utils.Webservice_Volley;

import org.json.JSONObject;

import java.util.HashMap;

public class ForgotpasswordActivity extends AppCompatActivity implements DataInterface {
    EditText edt_contactno;
    Button btn_submit;

    Webservice_Volley volley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        edt_contactno=(EditText)findViewById(R.id.edt_contactno);
        btn_submit=(Button) findViewById(R.id.btn_submit);

        volley=new Webservice_Volley(this,this);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkMobileNo(edt_contactno.getText().toString()))
                {
                    edt_contactno.setError("Enter 10 digit contactnumber");
                    edt_contactno.requestFocus();
                    return;
                }

                String url= Constants.Webserive_Url+"forgotpassword.php";
                HashMap<String,String> params=new HashMap<>();
                params.put("ContactNo",edt_contactno.getText().toString());

                volley.CallVolley(url,params,"forgotpassword");

            }
        });
    }

    @Override
    public void getData(JSONObject jsonObject, String tag) {
        Toast.makeText(this, jsonObject.toString(), Toast.LENGTH_SHORT).show();
    }
}
