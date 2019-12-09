package com.example.gridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class IconAdapter extends BaseAdapter {

    Context context;
    int[] imageIcons;
    String[] numbers;

    public IconAdapter(Context context, int[] imageIcons, String[] numbers) {
        this.context = context;
        this.imageIcons = imageIcons;
        this.numbers = numbers;
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public String getItem(int i) {
        return numbers[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.cell_item, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.icon_text);

        imageView.setImageResource(imageIcons[i]);
        textView.setText(numbers[i]);

        return view;
    }
}

