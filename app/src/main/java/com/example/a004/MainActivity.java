package com.example.a004;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText distance;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        distance = (EditText)findViewById(R.id.editT);
        Button submit = (Button)findViewById(R.id.button);

        submit.setOnClickListener(new Button.OnClickListener() {


            public void onClick(View arg0) {
                int m = Integer.parseInt(distance.getEditableText().toString());
                TextView result = (TextView)findViewById(R.id.textView);
                a=(m)/250;
                b=a*5;
                m=75+b;

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                result.setText(String.valueOf(m));

            }
        });
    }
}