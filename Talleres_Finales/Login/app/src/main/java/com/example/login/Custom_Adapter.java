package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Custom_Adapter extends BaseAdapter {

    Context context;
    List<contactos> lst;

    public Custom_Adapter(Context context, List<contactos> lst) {
        this.context = context;
        this.lst = lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return i ;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View View, ViewGroup viewGroup) {

        ImageView ImageViewContacto;
        TextView TextViewNombre;
        TextView TextViewCorreo;

        contactos c=lst.get(i);
        if(View == null){
            View= LayoutInflater.from(context).inflate(R.layout.users, null);
            ImageViewContacto = View.findViewById(R.id.imageViewContacto);
            TextViewNombre = View.findViewById(R.id.textViewNombre);
            TextViewCorreo= View.findViewById(R.id.textViewCorreo);

            ImageViewContacto.setImageResource(c.imagen);
            TextViewNombre.setText(c.nombre);
            TextViewCorreo.setText(c.correo);
        }
        return View;
    }
}
