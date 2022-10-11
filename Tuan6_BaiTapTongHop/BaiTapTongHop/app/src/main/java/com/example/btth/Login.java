package com.example.btth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);
        TextView textView1 = (TextView) findViewById(R.id.textv1);
        TextView textView2 =  (TextView)  findViewById(R.id.editPassword);
        Button signIn = (Button) findViewById(R.id.back);
        TextView textView3 = (TextView) findViewById(R.id.textView5);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, registerApp.class);
                startActivity(intent);
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = "admin";
                String pass = "admin";

                if (textView1.getText().toString().equals("") || textView2.getText().toString().equals("")){
                    Toast.makeText( Login.this,"Tài khoản hoặc mật khẩu không được để trống" , Toast.LENGTH_SHORT).show();
                }
                else {
                    if ((textView1.getText().toString().equals(user)) && (textView2.getText().toString().equals(pass))){
                        Toast.makeText( Login.this,"Thành Công" , Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, HomeApp.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText( Login.this,"Tài khoản hoặc mật khẩu không đúng" , Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }
}

