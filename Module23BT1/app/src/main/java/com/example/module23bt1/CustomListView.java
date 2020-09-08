package com.example.module23bt1;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListView extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<NhanVien> data;

    public CustomListView(Context context, ArrayList<NhanVien> data) {
        this.context = context;
//        this.layoutInflater = layoutInflater;
        this.layoutInflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public int getCount() {
        if (data != null)
            return data.size();
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.customlistview, null);

        ImageView gioiTinh = (ImageView) view.findViewById(R.id.imageView);
        TextView infor = (TextView) view.findViewById(R.id.result);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkBox);

        if (data.get(i).getGioiTinh().equals("Nam"))
            gioiTinh.setImageResource(R.drawable.male);
        else gioiTinh.setImageResource(R.drawable.female);
        infor.setText(data.get(i).toString());


        Log.d("SecondViewList", data.get(i).toString());
        return view;
    }
}
