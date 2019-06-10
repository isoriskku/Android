package com.example.paoliml.isori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class parentwind extends AppCompatActivity {

    public Button but2_1,but2_2,but2_3;
    /*public void init2_1(){
        but2_1=(Button)findViewById(R.id.butt3);
        but2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//
                Intent toy = new Intent(parentwind.this, listsafe.class);
                startActivity(toy);
            }
        });
    }

    public void init2_2(){
        but2_2=(Button)findViewById(R.id.loc_conf1);
        but2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(parentwind.this, loc_configuration.class);
                startActivity(toy);
            }
        });
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parentwind);
        but2_1=(Button)findViewById(R.id.butt3);
        but2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init2_1();
            }
        });
        but2_2=(Button)findViewById(R.id.loc_conf1);
        but2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init2_2();
            }
        });
        but2_3=(Button)findViewById(R.id.button10);
        but2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init2_3();
            }
        });
    }
    public void init2_1(){
        Intent intent=new Intent(this,listsafe.class);
        startActivity(intent);
    }
    public void init2_2(){
        Intent intent=new Intent(this,loc_configuration.class);
        startActivity(intent);
    }
    public void init2_3(){
        Intent intent=new Intent(this,getqr.class);
        startActivity(intent);
    }
}
