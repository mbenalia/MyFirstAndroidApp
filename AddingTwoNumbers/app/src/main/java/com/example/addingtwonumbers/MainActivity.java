package com.example.addingtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1; // on crée les variable à utiliser dans Java
    private EditText num2; // EditText correspond à la saisie utilisateur
    private Button add;
    private TextView result; // text view est un champ text en lecture seule pr l user
    private Button rein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.number1); //on va assimiler nos variables à celles de xml
        num2=(EditText) findViewById(R.id.number2);
        add=(Button) findViewById(R.id.button);
        result=(TextView) findViewById(R.id.answer);
        rein=(Button) findViewById(R.id.button2);

        //on configure l'action du click
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(num1.getText().toString());
                int n2=Integer.parseInt(num1.getText().toString());
                int sum=n1+n2;
                result.setText("Answer: "+ String.valueOf(sum));

            }
        });
        rein.setOnClickListener(new View.OnClickListener() { //ecoute le clic du bouton reset
            @Override
            public void onClick(View view) {
                num1.setText("");  //on reset la variable 1
                num2.setText(""); // on reset la variable 2
                result.setText(""); //on reset le resultat

            }
        });
    }
}