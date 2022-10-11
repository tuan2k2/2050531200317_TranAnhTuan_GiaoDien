package com.example.giaodien_317;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ketQua extends AppCompatActivity {

    TextView out;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);
        btnBack = (Button) findViewById(R.id.back);
        out  = findViewById(R.id.outPut);
        Intent caIntent = getIntent();
        Bundle pBundle = caIntent.getBundleExtra("myName");
        double a = pBundle.getDouble("a");
        double b = pBundle.getDouble("b");
        double bmi = a / ((b/100)*(b/100));
        DecimalFormat dcf = new DecimalFormat("0.00");
        out.setText(String.valueOf(dcf.format(bmi)));
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}