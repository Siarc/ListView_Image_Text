package com.example.aminu.nowtest;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String>{

    int[] images;
    String[] details;
    String[] titles;
    //Context context;

    public CustomAdapter( Context context, String[] arcTitles, int images[],String[] arcDetails) {
        super(context,R.layout.custom_row, arcTitles);
        this.images=images;
        this.details=arcDetails;
        this.titles=arcTitles;
        //this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //LayoutInflater arcInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customView = convertView;
        if (customView==null) {
            LayoutInflater arcInflater = LayoutInflater.from(getContext());
            customView = arcInflater.inflate(R.layout.custom_row, parent, false);
        }

        //String singleTopicItem= getItem(position);
        TextView arcTitles = (TextView) customView.findViewById(R.id.arcText1);
        TextView arcDetails = (TextView) customView.findViewById(R.id.arcText2);
        ImageView arcImage=(ImageView) customView.findViewById(R.id.arcImage);


        arcTitles.setText(titles[position]);
        arcDetails.setText(details[position]);
        arcImage.setImageResource(images[position]);
        return customView;

        //Alternatice way to return;
        //return super.getView(position, convertView,parent);
    }
}
