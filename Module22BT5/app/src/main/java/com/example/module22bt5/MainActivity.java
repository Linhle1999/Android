package com.example.module22bt5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText txtmanv, txttennv;
    private RadioGroup loainv;
    private ArrayList<String> ds;
    private ArrayAdapter<String> adapter;
    private ListView list;
    private Employee employee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        txtmanv = (EditText) findViewById(R.id.txtmanv);
        txttennv = (EditText) findViewById(R.id.txttennv);

        ds = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ds);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        loainv = (RadioGroup) findViewById(R.id.loainv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String them = txtmanv.getText().toString() + " - " + txttennv.getText().toString() + " --> ";
                String loai = ((RadioButton) findViewById(loainv.getCheckedRadioButtonId())).getText().toString();

                if (loai.equals("Chính thức"))
                    employee=new EmployeeFullTime();
                else if (loai.equals("Thời vụ"))
                    employee=new EmployeePartTime();

                employee.setMaNV(txtmanv.getText().toString());
                employee.setTenNV(txttennv.getText().toString());

                ds.add(employee.toString());
                adapter.notifyDataSetChanged();
            }
        });
    }
}