package com.example.calclepoids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1 , btn2 ;
    EditText t1 , t2 ;
    RadioButton r1 , r2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.b1);
        btn2 = (Button) findViewById(R.id.b2);
        t1 = (EditText) findViewById(R.id.taille);
        t2 = (EditText) findViewById(R.id.poid);
        r1 = (RadioButton) findViewById(R.id.rh);
        r2 = (RadioButton) findViewById(R.id.rf);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int taille = Integer.parseInt(t1.getText()+"");
                if (taille > 100) {
                    double a = 4;
                    if (r2.isChecked()) a = 2.5;
                    t2.setText((taille - 100) - ((taille - 150) / a) +"");
                }
                else {
                    Toast.makeText(getApplicationContext(),"taille doit entre sup 100 cm ",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
            }
        });

    }
}