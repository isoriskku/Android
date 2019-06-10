package com.example.paoliml.isori;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class getqr extends AppCompatActivity{

    public Button prop;
    public TextView t;
    public void init_(){
        prop=(Button)findViewById(R.id.prop);
        prop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(getqr.this, parentwind.class);
                startActivity(toy);
            }
        });
    }
    private Button scan_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getqr);
        scan_btn=(Button)findViewById(R.id.scan);
        final Activity activity = this;
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator=new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scan");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();
            }
        });
        init_();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result=IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if(result!=null){
            if(result.getContents()==null){
                Toast.makeText(this, "You cancelled scanning", Toast.LENGTH_LONG).show();
            }
            else {
                TextView t = (TextView)findViewById(R.id.textView9);
                t.setText(result.getContents());
                //Toast.makeText(this,result.getContents(),Toast.LENGTH_LONG);
            }
        }else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

}
