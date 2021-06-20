package com.example.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class edit_Usu extends AppCompatActivity {
    private Spinner sp1;
    private Spinner sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Update user");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__usu);

        this.sp1=(Spinner)findViewById(R.id.sp1);
        this.sp2=(Spinner)findViewById(R.id.spinner2);

        String[] opciones={"Colombia","Ecuador","Venezuela", "Perú"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item, opciones);
        sp1.setAdapter(adapter);

        String[] opciones1={"Masculino","Femenino"};
        ArrayAdapter<String> adaptere=new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item, opciones1);
        sp2.setAdapter(adaptere);
    }
}