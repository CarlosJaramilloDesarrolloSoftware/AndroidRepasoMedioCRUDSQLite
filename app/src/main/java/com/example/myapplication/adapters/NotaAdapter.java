package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
        item_titulo = view.findViewById(R.id.item_titulo);
        //item_contenido = view.findViewById(R.id.item_contenido);

        item_titulo.setText(list.get(i));

        return view;
    }
}
