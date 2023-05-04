package com.moraduartelf.nowillc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class NuestrosProductos extends AppCompatActivity {

    private RecyclerView rcvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuestros_productos);

        rcvItems = findViewById(R.id.rcv_item);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvItems.setLayoutManager(linearLayoutManager);

        ItemAdapter itemAdapter = new ItemAdapter();
        itemAdapter.setData(getListItems());
        rcvItems.setAdapter(itemAdapter);

    }
    private List<ItemObject> getListItems(){
        List<ItemObject> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(new ItemObject("Productos para perforación","Nuestros productos para perforacion incluyen:" +
                    " Repuestos OEM," + "insertos, mangueras, módulos y consumibles para bombas centrifugas, " +
                    "bombas de lodo," + "lineas de perforación, Choke  y Kill Manifolds" ));
            list.add(new ItemObject("Tuberias, Valvulas, Bridas, Sellos y Actuadores " ,"Content item" ));
            list.add(new ItemObject("Productos de protección personal EPP" ,"Content item" ));
            list.add(new ItemObject("Herramientas" ,"Content item" ));
            list.add(new ItemObject("Productos para elevación y carga" ,"Content item" ));
            list.add(new ItemObject("Productos MRO: Mantenimiento, Reparación y Operación" ,"Content item" ));
            list.add(new ItemObject("Productos para levantamiento artificial" ,"Content item" ));
            list.add(new ItemObject("Bombas y paquetes para bombas" ,"Content item" ));
            break;

        }

        return list;
    }
}