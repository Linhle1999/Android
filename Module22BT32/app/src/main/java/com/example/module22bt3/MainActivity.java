package com.example.module22bt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button them;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;
    private EditText txtten;
    private ListView listView;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){

        }

        setContentView(R.layout.activity_main);

        them = (Button) findViewById(R.id.button);
        txtten = (EditText) findViewById(R.id.txtten);
        listView = (ListView) findViewById(R.id.list);

        list = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , list);

        listView.setAdapter(adapter);

        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(txtten.getText().toString());
                adapter.notifyDataSetChanged();
//                setContentView(listView);

            }
        });

        show = (TextView) findViewById(R.id.show);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                show.setText("position: " + i +", value: " + adapterView.getItemAtPosition(i).toString());
            }
        });
    }
}