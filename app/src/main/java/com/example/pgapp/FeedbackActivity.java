package com.example.pgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pgapp.utils.Commonfunction;

public class FeedbackActivity extends AppCompatActivity {

    EditText edt_comments;
    Button btn_submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        edt_comments=(EditText)findViewById(R.id.edt_comments);
        btn_submit=(Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Commonfunction.checkString(edt_comments.getText().toString()))
                {
                    edt_comments.setError("Enter your comments");
                    edt_comments.requestFocus();
                    return;
                }
            }
});
    }
}