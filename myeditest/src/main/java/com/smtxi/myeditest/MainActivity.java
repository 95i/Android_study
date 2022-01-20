package com.smtxi.myeditest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et;
    private EditText pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        et = findViewById(R.id.et);
        pw = findViewById(R.id.pw);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = et.getText().toString();
                String  pwss = pw.getText().toString();
                Log.e("leo", "用户名:"+text+"密码："+pwss);
            }
        });


//        Button pwd = findViewById(R.id.pwd);
//        pw = findViewById(R.id.pw);
//
//        pwd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String text = et.getText().toString();
//                Log.e("leo", "密码: "+text);
//            }
//        });
    }
}