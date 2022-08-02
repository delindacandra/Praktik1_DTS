package com.ayobelajar.praktik1dts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btOK = findViewById(R.id.bt_ok);
        btOK.setOnClickListener(view -> btOK.setBackgroundColor(Color.RED));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.menu_item1){
            startActivity(new Intent(this, Menu1.class));
        }else if(item.getItemId()==R.id.menu_item2){
            startActivity(new Intent(this, Menu2.class));
        }else if(item.getItemId()==R.id.menu_item3){
            startActivity(new Intent(this, Menu3.class));
        }
        return true;
    }
}