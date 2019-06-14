package com.example.paoliml.isori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class parentwind extends AppCompatActivity {

    public Button but2_1,but2_2,but2_3,but2_4,but2_5;
    ListView listView;
    String Title[]={"그쪽은 위험해, 조심해.",
            "잠시만 기다려줘, 같이 가자.",
            "거기서 기다려, 같이 가자",
            "조심해요, 차가 와요.",
            "주변에서 공사를 하나 봐. 조심히 지나가자.",
            "주변에서 큰 소리가 나네. 조심히 지나가자.",
            "빵빵- 자동차가 와요."};
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
        but2_5=(Button)findViewById(R.id.button14);
        but2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init2_5();
            }
        });
        but2_2=(Button)findViewById(R.id.loc_conf1);
        but2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init2_2();
            }
        });
        but2_4=(Button)findViewById(R.id.button13);
        but2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init2_4();
            }
        });
        but2_3=(Button)findViewById(R.id.button10);
        but2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init2_3();
            }
        });
        listView =(ListView)findViewById(R.id.danger);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, Title);

        listView.setAdapter(adapter);
        // ListView Item Click Listener

    }

    public void init2_1(){
        Intent intent=new Intent(this,listsafe.class);
        startActivity(intent);
    }public void init2_4(){
        Toast.makeText(this, "위험소리입니다", Toast.LENGTH_LONG).show();
    }
    public void init2_5(){
        Toast.makeText(this, "위험소리 아닙니다", Toast.LENGTH_LONG).show();
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
