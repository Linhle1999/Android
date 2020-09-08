package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button btn_tong, btn_hieu, btn_tich, btn_thuong, btn_ucln, btn_thoat;
    private EditText soA, soB;
    private TextView ketQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btn_tong = (Button) findViewById(R.id.btntong);
        btn_hieu = (Button) findViewById(R.id.btnhieu);
        btn_tich = (Button) findViewById(R.id.btnnhan);
        btn_thuong = (Button) findViewById(R.id.btnchia);
        btn_ucln = (Button) findViewById(R.id.btnucln);
        btn_thoat = (Button) findViewById(R.id.btnthoat);

        soA = (EditText) findViewById(R.id.soa);
        soB = (EditText) findViewById(R.id.sob);
        ketQua = (TextView) findViewById(R.id.ketqua);

        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                ketQua.setText(String.valueOf(a + b));
            }
        });
        btn_hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketQua.setText(String.valueOf(Integer.parseInt(soA.getText().toString()) - Integer.parseInt(soB.getText().toString())));
            }
        });
        btn_tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketQua.setText(String.valueOf(Integer.parseInt(soA.getText().toString()) * Integer.parseInt(soB.getText().toString())));
            }
        });
        btn_thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketQua.setText(String.valueOf(Double.valueOf(Integer.parseInt(soA.getText().toString()) / Integer.parseInt(soB.getText().toString()))));
            }
        });
        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onDestroy();
            }
        });
    }
}