package com.moraduartelf.nowillc;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
//Vamos a crear los intent para pasar de un activity a otra.
        public void nuevoActivity(View view){
            Intent i = new Intent(this, QuienesSomos.class);
            startActivity(i);}
        public void nuevoActivity2(View view){
            Intent i = new Intent(this, NuestrosProductos.class);
            startActivity(i);}
        public void nuevoActivity3(View view){
            Intent i = new Intent(this, NovProducts.class);
            startActivity(i);}
        public void nuevoActivity4(View view){
            Intent i = new Intent(this, KimrayProducts.class);
            startActivity(i);}
        public void nuevoActivity5(View view){
            Intent i = new Intent(this, BestolifeProducts.class);
            startActivity(i);}
        public void nuevoActivity6(View view){
            Intent i = new Intent(this, ContactosActivity.class);
            startActivity(i);}
        public void nuevoActivity7(View view){
            Intent i = new Intent(this, ContactosActivity.class);
            startActivity(i);}
}