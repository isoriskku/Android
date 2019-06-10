package com.example.paoliml.isori;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class showloc extends AppCompatActivity {
    public Button but3;
    public void init3(){
        but3=(Button)findViewById(R.id.button7);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(showloc.this, parentwind.class);
                startActivity(toy);
            }
        });
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlocation);
        init3();
    }

}
