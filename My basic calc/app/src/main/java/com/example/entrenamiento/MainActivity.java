package com.example.entrenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private  Spinner sp1;
    private TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.et1=(EditText)findViewById(R.id.editText1);
        this.et2=(EditText)findViewById(R.id.editText2);
        this.sp1=(Spinner)findViewById(R.id.sp1);
        this.tv3=(TextView)findViewById(R.id.textView5);

        /* Crear un vector */

        String[] opciones={"Add","Substract","Multiply", "Divide"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item, opciones);
        sp1.setAdapter(adapter);
    }

    public void operaciones_ma(View view){


       int num1, num2;
        int sum, resta,mult,divi;
        String select;

        num1= Integer.parseInt(this.et1.getText().toString());
        num2= Integer.parseInt(this.et2.getText().toString());

      select= sp1.getSelectedItem().toString();

      if(select.equals("Add")){
            sum= num1+num2;
            tv3.setText(""+sum);
        }
        else {
            if (select.equals("Substract")){
                resta= num1-num2;
                tv3.setText(""+resta);
            }else {
                if(select.equals("Multiply")){
                    mult=num1*num2;
                    tv3.setText(""+mult);
                }else{
                    if (select.equals("Divide")){
                        divi=num1/num2;
                        tv3.setText(""+divi);
                    }
                }
            }
        }
    }
}