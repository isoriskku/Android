package com.example.paoliml.isori;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class childwind extends AppCompatActivity {

    Button gen_btn;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_childwind);
        //String id= Settings.Secure.getString(getContentResolver(),Settings.Secure.ANDROID_ID);
        gen_btn=(Button)findViewById(R.id.gen_btn);
        image=(ImageView)findViewById(R.id.qr);
        gen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try {
                    String id= Settings.Secure.getString(getContentResolver(),Settings.Secure.ANDROID_ID);
                    BitMatrix bitMatrix = multiFormatWriter.encode(id, BarcodeFormat.QR_CODE, 150, 150);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    image.setImageBitmap(bitmap);
                } catch (WriterException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
