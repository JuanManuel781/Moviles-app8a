package com.example.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListUsers extends AppCompatActivity {

    private Spinner sp1;
    ListView ListViewContacto;
    List<contactos> lst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("User list");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);

        ListViewContacto=findViewById(R.id.ListViewContacto);
        Custom_Adapter adapter = new Custom_Adapter(this, GetData());
        ListViewContacto.setAdapter(adapter);

        ListViewContacto.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                contactos c= lst.get(i);
              openNewActivity(edit_Usu.class);

            }

        });




    }

    private List<contactos> GetData() {
        lst=new ArrayList<>();

        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        lst.add(new contactos(R.drawable.listusu, "Peter McDonald", "peter@email.com"));
        return lst;
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_user, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public  boolean onOptionsItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                
            }

        return super.onOptionsItemSelected(item);
    }

    public void openNewActivity(Class view){
        Intent intent = new Intent(this,view);
        startActivity(intent);
    }
}