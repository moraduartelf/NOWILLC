package com.moraduartelf.nowillc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactosActivity extends AppCompatActivity {
    //creamos una instancia de la clase RecyclerView y de nuestro adapter creado anteriormente
    private RecyclerView recyclerContacts;
    private ContactAdapter adaptadorContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);
    //Aqui vinculamos nuestra instancia RecyclerView con el RecyclerView de nuestro layout
        recyclerContacts=(RecyclerView) findViewById(R.id.recyclerContacts);
        //definimos la forma de la lista, en este caso vertical similar a la de un listView
        recyclerContacts.setLayoutManager(new LinearLayoutManager(this));
    //En estas lineas de codigo asignamos toda esta informacion en el RecyclerView de nuestro layout
        adaptadorContact=new ContactAdapter(obtenerContactos());
        recyclerContacts.setAdapter(adaptadorContact);
    }
   //Creamos una funcion tipo lista basada de la clase listContact la cual contiene los datos con los
    //cuales trabajaremos.
    public List<ListContact> obtenerContactos(){
        List<ListContact>contact=new ArrayList<>();
    //Seguidamente agregamos los datos que deseamos mostrar en dicha lista (segun parametros usados en listContact)
        contact.add(new ListContact("Claudia Rubio","Country Manager","3116641071","claudia.rubio@dnow.com",R.drawable.ic_dnow));
        contact.add(new ListContact("Carolina Cuellar","Account Manager","3116641071","carolina.cuellariguavita@dnow.com",R.drawable.ic_dnow));
        contact.add(new ListContact("Monica Rocha","Junior Accounting","3116641071","monica.rocha@dnow.com",R.drawable.ic_dnow));
        contact.add(new ListContact("Deisy","Temporal replacement","3116641071","claudia.rubio@dnow.com",R.drawable.ic_dnow));
        contact.add(new ListContact("Luis Francisco Mora Duarte","Inside Sales 1","3118643080","luis.moraduarte@dnow.com",R.drawable.ic_dnow));
        contact.add(new ListContact("Alejandro Piñeros","Inside Sales 2","3116641071","alejandro.pineros@dnow.com",R.drawable.ic_dnow));
        contact.add(new ListContact("John Romero","Warehouser","3116641071","john.romero@dnow.com",R.drawable.ic_dnow));
        contact.add(new ListContact("Yessica Galindo","Recepcionist","3116641071","yessica.galindo@dnow.com",R.drawable.ic_dnow));

    // Finalmente enviamos toda la informacion agregada a nuestra lista al adapter.
        return contact;
    }
}