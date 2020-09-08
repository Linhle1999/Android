package com.example.module23bt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText maNV, tenNV;
    private RadioGroup gioiTinh;
    private Button btn_Them;
    private ImageButton btn_Xoa;
    private ListView list;
    private ArrayList<NhanVien> arrayList;
    private CustomListView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        maNV = (EditText) findViewById(R.id.txtmanv);
        tenNV = (EditText) findViewById(R.id.txttennv);
        btn_Them = (Button) findViewById(R.id.button);
        btn_Xoa = (ImageButton) findViewById(R.id.imageButton);
        gioiTinh = (RadioGroup) findViewById(R.id.gioitinh);

        arrayList = new ArrayList<NhanVien>();
//        adapter=new ArrayAdapter<NhanVien>(this, android.R.layout.simple_list_item_1,arrayList);

        adapter = new CustomListView(this, arrayList);
        list.setAdapter(adapter);

        btn_Them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(maNV.getText().toString());
                nv.setTenNV(tenNV.getText().toString());
                nv.setGioiTinh(((RadioButton) findViewById(gioiTinh.getCheckedRadioButtonId())).getText().toString());

                arrayList.add(nv);

                adapter.notifyDataSetChanged();
            }
        });

        btn_Xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = list.getChildCount() - 1; i >= 0; i--)
                    if (((CheckBox) list.getChildAt(i).findViewById(R.id.checkBox)).isChecked())
                        arrayList.remove(i);

                adapter.notifyDataSetChanged();
            }
        });
    }

}