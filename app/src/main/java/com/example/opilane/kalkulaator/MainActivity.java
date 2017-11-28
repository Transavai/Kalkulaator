package com.example.opilane.kalkulaator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText opr1, opr2;
    private Button lahuta,liida,jaga,korruta,kustuta;
    private TextView tulemus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opr1=(EditText)findViewById(R.id.editOp1);
        opr1=(EditText)findViewById(R.id.editOp2);
        liida=(Button) findViewById(R.id.liida);
        lahuta=(Button) findViewById(R.id.lahuta);
        korruta=(Button) findViewById(R.id.korruta);
        jaga=(Button) findViewById(R.id.jaga);
        tulemus=(TextView) findViewById(R.id.tulemus);

        liida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opr1.getText().length()>0 &&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 + oper2;
                    tulemus.setText(Double.toString(tulemus));
                }
                else {
                    Toast toast;
                    Toast toast = Toast.makeText( Context: MainActivity.this,
                    Text"Sisesta vajalik number",Toast.LENGTH_LONG);
                   toast.show();
                };
            }
        });
        lahuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opr1.getText().length()>0 &&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 + oper2;
                    tulemus.setText(Double.toString(tulemus));
                }
                else {
                    Toast toast;
                    Toast toast = Toast.makeText( Context: MainActivity.this,
                            Text"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                };
            }
        });

        korruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opr1.getText().length()>0 &&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 + oper2;
                    tulemus.setText(Double.toString(tulemus));
                }
                else {
                    Toast toast;
                    Toast toast = Toast.makeText( Context: MainActivity.this,
                            Text"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                };
            }
        });
        jaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opr1.getText().length()>0 &&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 + oper2;
                    tulemus.setText(Double.toString(tulemus));
                }
                else {
                    Toast toast;
                    Toast toast = Toast.makeText( Context: MainActivity.this,
                            Text"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                };
            }
        });
        kustuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (opr1.getText().length()>0 &&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 + oper2;
                    tulemus.setText(Double.toString(tulemus));
                }
                else {
                    Toast toast;
                    Toast toast = Toast.makeText( Context: MainActivity.this,
                            Text"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                };
            }
        });


    }
}
