package com.example.login;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateButton(R.id.button,ListUsers.class);
        CreateButton(R.id.button2,SignUp.class);
    }
    public void CreateButton(int id, Class view){
        Button button = (Button) findViewById(id);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity(view);
            }
        });
    }
    public void openNewActivity(Class view){
        Intent intent = new Intent(this,view);
        startActivity(intent);
    }

}