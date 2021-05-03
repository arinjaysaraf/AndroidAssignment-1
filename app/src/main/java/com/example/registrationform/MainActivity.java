package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname,ten,twelfth,father,mother,city,phone,stream;
    Button b;
    RadioGroup gender;
    CheckBox per,cg,cpp,py,adr;
    String cbanswer="";
    String skill="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = findViewById(R.id.etFname);
        lname = findViewById(R.id.etLname);
        ten = findViewById(R.id.et10);
        twelfth = findViewById(R.id.et12);
        father = findViewById(R.id.etFather);
        mother = findViewById(R.id.etMother);
        stream = findViewById(R.id.etStream);
        city = findViewById(R.id.etCity);
        phone = findViewById(R.id.etphone);
        gender = findViewById(R.id.rb0);
        cg = findViewById(R.id.cgpa);
        per = findViewById(R.id.percent);
        cpp = findViewById(R.id.skill1);
        py = findViewById(R.id.skill2);
        adr = findViewById(R.id.skill3);
        b = findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cg.isChecked()){
                    cbanswer=cg.getText().toString();
                }
                else if (per.isChecked()){
                    cbanswer=per.getText().toString();
                }

                if (cpp.isChecked()){
                    skill+="C++ ";
                }
                if (adr.isChecked()){
                    skill+="Java ";
                }
                if (py.isChecked()){
                    skill+="Python ";
                }
                int selected_rb_gender=gender.getCheckedRadioButtonId();
                RadioButton sendgender=findViewById(selected_rb_gender);

                Toast.makeText(MainActivity.this,"Submitted",Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(),info.class);
                i.putExtra("name1",fname.getText().toString());
                i.putExtra("name2",lname.getText().toString());
                i.putExtra("name3",ten.getText().toString());
                i.putExtra("name4",twelfth.getText().toString());
                i.putExtra("name5",stream.getText().toString());
                i.putExtra("name6",father.getText().toString());
                i.putExtra("name7",mother.getText().toString());
                i.putExtra("name8",city.getText().toString());
                i.putExtra("name9",phone.getText().toString());
                i.putExtra("name9",phone.getText().toString());
                i.putExtra("gender0",sendgender.getText().toString());
                i.putExtra("Skill",skill);
                i.putExtra("gender0",sendgender.getText().toString());
                i.putExtra("result",cbanswer);
                startActivity(i);
            }
        });
    }
}