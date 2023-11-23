package com.neyser.spinnerimagenes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomSpinnerAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;
    private final int[] imageIds; // IDs de las imágenes

    public CustomSpinnerAdapter(Context context, int textViewResourceId,
                                String[] values, int[] imageIds) {
        super(context, textViewResourceId, values);
        this.context = context;
        this.values = values;
        this.imageIds = imageIds;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.spinner_list, parent, false);

        ImageView imageView = row.findViewById(R.id.img01);
        imageView.setImageResource(imageIds[position]); // Establecer la imagen según la posición

        return row;
    }
}
