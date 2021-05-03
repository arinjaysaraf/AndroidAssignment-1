package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class info extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,result,gen,sk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        tv1 = findViewById(R.id.Fname);
        tv2 = findViewById(R.id.Lname);
        tv3 = findViewById(R.id.et10);
        tv4 = findViewById(R.id.et12);
        tv5 = findViewById(R.id.etStream);
        tv6 = findViewById(R.id.etFather);
        tv7 = findViewById(R.id.etMother);
        tv8 = findViewById(R.id.etCity);
        tv9 = findViewById(R.id.etphone);
        result = findViewById(R.id.tvResult);
        gen = findViewById(R.id.tvgen);
        sk = findViewById(R.id.tvSkill);

        tv1.setText(getIntent().getStringExtra("name1"));
        tv2.setText(getIntent().getStringExtra("name2"));
        tv3.setText(getIntent().getStringExtra("name3"));
        tv4.setText(getIntent().getStringExtra("name4"));
        tv5.setText(getIntent().getStringExtra("name5"));
        tv6.setText(getIntent().getStringExtra("name6"));
        tv7.setText(getIntent().getStringExtra("name7"));
        tv8.setText(getIntent().getStringExtra("name8"));
        tv8.setText(getIntent().getStringExtra("name8"));
        tv9.setText(getIntent().getStringExtra("name9"));
        result.setText(getIntent().getStringExtra("result"));
        gen.setText(getIntent().getStringExtra("gender0"));
        sk.setText(getIntent().getStringExtra("Skill"));
    }
}