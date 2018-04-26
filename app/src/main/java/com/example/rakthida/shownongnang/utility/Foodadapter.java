package com.example.rakthida.shownongnang.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rakthida.shownongnang.R;
import com.squareup.picasso.Picasso;

public class Foodadapter extends BaseAdapter{

    private Context context;
    private String[] imageStrings, foodStrings, priceStrings, detailStrings;

    public Foodadapter(Context context, String[] imageStrings, String[] foodStrings, String[] priceStrings, String[] detailStrings) {
        this.context = context;
        this.imageStrings = imageStrings;
        this.foodStrings = foodStrings;
        this.priceStrings = priceStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return foodStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_food,parent,false);

        TextView foodTextView = view.findViewById(R.id.txtFood);
        TextView priceTextView = view.findViewById(R.id.txtPrice);
        TextView detailTextView = view.findViewById(R.id.txtDetail);
        ImageView imageView = view.findViewById(R.id.imvFood);

        foodTextView.setText(foodStrings[position]);
        priceTextView.setText(priceStrings[position]);
        detailTextView.setText(detailStrings[position]);

        Picasso.get().load(imageStrings[position]).into(imageView);


        return view;
    }
}
