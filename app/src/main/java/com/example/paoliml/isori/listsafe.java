package com.example.paoliml.isori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class listsafe extends AppCompatActivity {

    ListView listView;
    String Title[]={"성균관대학교 명륜","성균관대학교 율전"};
    public Button but2;
    public void init(){
        but2=(Button)findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(listsafe.this, parentwind.class);
                startActivity(toy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listsafe);
        init();
        listView =(ListView)findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Title);

        listView.setAdapter(adapter);
    }

}
