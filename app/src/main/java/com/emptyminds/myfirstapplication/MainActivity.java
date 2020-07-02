package com.emptyminds.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // 1 Object Creation
    // 2 Binding With UI
    // 3 Setting Listeners

    private TextView tv_result;
    private EditText et_email, et_pass;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_result = findViewById(R.id.tv_display);
        et_email = findViewById(R.id.et_email);
        et_pass = findViewById(R.id.et_password);
        bt_login = findViewById(R.id.bt_login);

        bt_login.setOnClickListener(this);

//        bt_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.bt_login:
                String email = et_email.getText().toString().trim();
                String pass = et_pass.getText().toString();
                tv_result.setText(email + " : " + pass);
                Toast.makeText(this, email + " : " + pass, Toast.LENGTH_SHORT).show();
                break;
        }
    }

//
//    public void loginHandle(View view) {
//    }
}