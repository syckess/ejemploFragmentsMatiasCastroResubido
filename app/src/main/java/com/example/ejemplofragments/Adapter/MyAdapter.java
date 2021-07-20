package com.example.ejemplofragments.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.ejemplofragments.model.Correo;
import com.example.ejemplofragments.model.FragmentCorreo;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<FragmentCorreo> asunto;
    private int layout;
    private Context context;

    public MyAdapter(List<FragmentCorreo> asunto, int layout, Context context)
    {
        this.asunto = asunto;
        this.layout = layout;
        this.context = context;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
