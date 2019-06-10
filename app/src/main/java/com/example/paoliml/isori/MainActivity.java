package com.example.paoliml.isori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button buttt,butttt;
    public void init_(){
        buttt=(Button)findViewById(R.id.gotoparent);
        buttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this, getqr.class);
                startActivity(toy);
            }
        });
    }
    public void init_1(){
        butttt=(Button)findViewById(R.id.button6);
        butttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(MainActivity.this, childwind.class);
                startActivity(toy1);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_image);
        init_();
        init_1();

    }
}

