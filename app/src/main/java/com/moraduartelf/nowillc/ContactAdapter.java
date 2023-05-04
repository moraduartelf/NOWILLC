package com.moraduartelf.nowillc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//Este tiene la funcion de comunicar al RecyclerView de nuestro layout la cantidad de informacion que se
// utilizara para crear y poblar cada item de nuestra lista; este adapter actua como un puente de comunicacion
// entre la presentacion y la fuente de informacion a mostrar.
//Seguidamente procedemos a crear el adaptador para el RecyclerView, atraves de la clase RecyclerViewAdapter
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    //Los adapter para el RecyclerView deben contener una clase interna que extienda de la clase RecyclerViewHolder...
    public static class ViewHolder extends RecyclerView.ViewHolder{
    //Seguidamente creamos las variables necesarias:
        private TextView nombre,posicion,telefono,email;
        ImageView imagen;
    //Luego creamos el metodo constructor de la clase interna, y vinculamos cada uno de las variables
    //creadas con los controles respectivos de nuestro layout.
        public ViewHolder(View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.textName1);
            posicion=(TextView)itemView.findViewById(R.id.textPosition1);
            telefono=(TextView)itemView.findViewById(R.id.textPhone1);
            email=(TextView)itemView.findViewById(R.id.textEmail1);
            imagen=(ImageView) itemView.findViewById(R.id.image1);
        }

    }
    //Creamos una variable tipo lista para almacenar todos los datos mostrados en cada item
    public List<ListContact> listaContactos;
    //Ahora creamos el metodo constructor de dicho adapter, el cual recibira como parametro la lista creada
    public ContactAdapter(List<ListContact> listaContactos) {
        this.listaContactos = listaContactos;
    }
    // Con el metodo onCreateviewHolder inflamos el contenido de un nuevo item para la lista para
    // hacer uso de un layout dentro de otro layout

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacts,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }
    //Con el metodo onBindViewHolder realiza las modificaciones del contenido para cada item

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(listaContactos.get(position).getNombre());
        holder.posicion.setText(listaContactos.get(position).getPosicion());
        holder.telefono.setText(listaContactos.get(position).getTelefono());
        holder.email.setText(listaContactos.get(position).getEmail());
        holder.imagen.setImageResource(listaContactos.get(position).getImagen());
    }
    //Finalmente el metodo getItemCount, el cual permite determinar al adaptador la cantidad de
    //elementos que se procesaran.

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }
}
