package com.example.myapplication.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.example.myapplication.R;

import java.util.ArrayList;

public class NotaAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> list;

    public NotaAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            view = layoutInflater.inflate(R.layout.nota_item, viewGroup, false);
        }

        TextView item_titulo, item_contenido;
        ImageView item_imagen;
        String icon = "ic_account_circle_white_18dp";

        item_imagen = view.findViewById(R.id.item_imagen);
        item_titulo = view.findViewById(R.id.item_titulo);

        //Forma dinámica
        //int id = view.getResources().getIdentifier("com.example.myapplication:drawable/" + icon, null, null);
        //item_imagen.setImageResource(id);

        //Forma estática
        Drawable img = ResourcesCompat.getDrawable(view.getResources(), R.drawable.ic_account_circle_white_18dp, null);
        item_imagen.setImageDrawable(img);

        item_titulo.setText(list.get(i));

        return view;
    }
}
