package com.example.btth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PhimAdapetr extends BaseAdapter {
    Context context;
    private List<Phim> listPhim;
    private int layout;

    public PhimAdapetr() {
    }

    public PhimAdapetr(Context context, List<Phim> listPhim, int layout) {
        this.context = context;
        this.listPhim = listPhim;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return listPhim.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView img;
        TextView tenPhim;
        TextView gthPhim;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();
            viewHolder.tenPhim = (TextView) view.findViewById(R.id.tenPhim);
            viewHolder.gthPhim = (TextView) view.findViewById(R.id.gthPhim);
            viewHolder.img = (ImageView) view.findViewById(R.id.imgPhim);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Phim phim = listPhim.get(i);
        viewHolder.tenPhim.setText(phim.getTenPhim());
        viewHolder.gthPhim.setText(phim.getGthPhim());
        viewHolder.img.setImageResource(phim.getImg());
        return view  ;
    }
}