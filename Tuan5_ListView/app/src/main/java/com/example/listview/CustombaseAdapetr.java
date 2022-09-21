package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustombaseAdapetr extends BaseAdapter {

    Context context;
    String foodlist[];
    int listImg[];
    LayoutInflater inflater;

    public CustombaseAdapetr(Context context, String[] foodlist, int[] listImg) {
        this.context = context;
        this.foodlist = foodlist;
        this.listImg = listImg;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return foodlist.length;
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
        view = inflater.inflate(R.layout.activity_food_list_view , null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView foodImg = (ImageView) view.findViewById(R.id.image);
        textView.setText(foodlist[i]);
        foodImg.setImageResource(listImg[i]);
         return view   ;
    }
}
