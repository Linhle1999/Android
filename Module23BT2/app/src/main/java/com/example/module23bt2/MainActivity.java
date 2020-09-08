package com.example.module23bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Category> dsLoaiSP;
    private Product sanPham;
    private Button btn;
    private EditText txtMaSP, txttenSP;
    private ArrayList<Product> products;
    private ArrayAdapter<Product> adapter;
    private ListView listView;
    private Spinner spinnerLoaiSP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btn=(Button) findViewById(R.id.btnnhap);
        txtMaSP=(EditText)findViewById(R.id.masp);
        txttenSP=(EditText) findViewById(R.id.tensp);
        spinnerLoaiSP=(Spinner) findViewById(R.id.danhmucsp);
        listView=(ListView)findViewById(R.id.listview);

        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_multiple_choice,products);
        products=new ArrayList<>();
    }
}