package com.example.zacarias_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText var1txt, var2txt; //declared the edit text boxes
    Button btnadd, btnsubtract, btnmultiply, btnDivided, btnmodulo; //declared the 5 buttons
    TextView answerkey;

    double var1, var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //this method is responsible for creating the display we can see in our app
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnadd = findViewById(R.id.add);
        btnsubtract = findViewById(R.id.subtract);
        btnmultiply = findViewById(R.id.multiply);
        btnDivided = findViewById(R.id.Divided);
        btnmodulo = findViewById(R.id.modulo);


        //Answer text view
        answerkey =findViewById(R.id.answer);



        btnadd.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btnmultiply.setOnClickListener(this);
        btnDivided.setOnClickListener(this);
        btnmodulo.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        //variable text boxes
        var1txt = findViewById(R.id.decimal);
        var2txt = findViewById(R.id.decimal2);

        //RAW text --> String --Double

        var1 =Double.parseDouble(var1txt.getText().toString());
        var2 =Double.parseDouble(var2txt.getText().toString());



        switch (v.getId()){
            case R.id.add:
                answerkey.setText(Double.toString(var1+var2));

                break;
            case R.id.subtract:
                answerkey.setText(Double.toString(var1-var2));

                break;
            case R.id.multiply:
                answerkey.setText(Double.toString(var1*var2));

                break;
            case R.id.Divided:
                answerkey.setText(Double.toString(var1/var2));

                break;
            case R.id.modulo:
                answerkey.setText(Double.toString(var1%var2));

                break;

        }



    }
}




