package com.jstephaniuk.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {


    public CustomAdapter(Context context, String[] items) {
        super(context, R.layout.custom_row,items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.custom_row, parent, false);

        String singleItem = getItem(position);
        TextView listLargeText = (TextView) customView.findViewById(R.id.listLargeText);
        ImageView listImage = (ImageView) customView.findViewById(R.id.listImage);

        listLargeText.setText(singleItem);
        listImage.setImageResource(R.drawable.chunkybacon);

        return customView;
    }
}
