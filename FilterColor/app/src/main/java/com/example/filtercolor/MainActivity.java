package com.example.filtercolor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbr_red=null;
    private SeekBar sbr_green=null;
    private SeekBar sbr_blue=null;
    private SeekBar sbr_alpha=null;
    private View view_colors=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbr_red = findViewById(R.id.sbrRed);
        sbr_green=findViewById(R.id.sbrGreen);
        sbr_blue=findViewById(R.id.sbrBlue);
        sbr_alpha=findViewById(R.id.sbrAlpha);
        view_colors=findViewById(R.id.viewColors);

        sbr_red.setOnSeekBarChangeListener(this);
        sbr_green.setOnSeekBarChangeListener(this);
        sbr_blue.setOnSeekBarChangeListener(this);
        sbr_alpha.setOnSeekBarChangeListener(this);

    }

    // ----- OPCIÓN PARA MOSTRAR EL MENÚ---------------
    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.filter, menu);
        return super.onCreateOptionsMenu(menu);
    }
     @Override
    public  boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.iteYellow:
                sbr_red.setProgress(255);
                sbr_green.setProgress(255);
                sbr_blue.setProgress(0);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteBlack:
                sbr_red.setProgress(0);
                sbr_green.setProgress(0);
                sbr_blue.setProgress(0);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteWhite:
                sbr_red.setProgress(255);
                sbr_green.setProgress(255);
                sbr_blue.setProgress(255);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteBrown:
                sbr_red.setProgress(120);
                sbr_green.setProgress(70);
                sbr_blue.setProgress(50);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteBlue:
                sbr_red.setProgress(0);
                sbr_green.setProgress(0);
                sbr_blue.setProgress(255);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteRed:
                sbr_red.setProgress(255);
                sbr_green.setProgress(0);
                sbr_blue.setProgress(0);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteMagenta:
                sbr_red.setProgress(255);
                sbr_green.setProgress(0);
                sbr_blue.setProgress(255);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteGreen:
                sbr_red.setProgress(0);
                sbr_green.setProgress(255);
                sbr_blue.setProgress(0);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteCyan:
                sbr_red.setProgress(0);
                sbr_green.setProgress(255);
                sbr_blue.setProgress(255);
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteGray:
                break;
            case R.id.iteSemiTransparent:
                sbr_alpha.setProgress(128);
                break;
            case  R.id.iteTransparent:
                sbr_alpha.setProgress(0);
                break;
            case R.id.iteOpaque:
                sbr_alpha.setProgress(255);
                break;
            case R.id.iteHelp:
                Intent intent = new Intent(this, HelpActivity2.class);
                startActivity(intent);
                break;
            case R.id.iteReset:
                sbr_red.setProgress(0);
                sbr_green.setProgress(0);
                sbr_blue.setProgress(0);
                sbr_alpha.setProgress(0);
                break;
            case R.id.iteAboutof:
                Intent intent1= new Intent(this,AboutOfActivity.class);
                startActivity(intent1);
                break;
            case R.id.iteExit:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        int red =sbr_red.getProgress();
        int green=sbr_green.getProgress();
        int blue=sbr_blue.getProgress();
        int alpha=sbr_alpha.getProgress();

        int color = Color.argb(alpha, red, green, blue); //a r g b
        view_colors.setBackgroundColor(color);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}