package com.moraduartelf.nowillc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class VisorImagenBestolife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen_bestolife);
    //Instanciamos la imagen de nuestro diseño
        ImageView img=(ImageView) findViewById(R.id.ivImagenCompleta);
        Intent intent=getIntent();
        Bundle b= intent.getExtras();

        if(b!=null){
            img.setImageResource(b.getInt("IMG"));
        }
    }
}