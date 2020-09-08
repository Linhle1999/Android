package com.example.module21bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Set;

public class SecondActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            for (String key : bundle.keySet()) {
                Log.d("TAG", key + " : " + (bundle.get(key) != null ? bundle.get(key) : "NULL"));
            }
        }

        String hoTen = intent.getStringExtra("hoten");
        String cmnd = intent.getStringExtra("cmnd");
        String bangcap = intent.getStringExtra("bangcap");
        String thongtinbosung = intent.getStringExtra("thongtinbosung");
        ArrayList<String> sothich = intent.getStringArrayListExtra("sothich");

        ((EditText)findViewById(R.id.txtthongtinbosung)).setText(thongtinbosung);
        ((EditText)findViewById(R.id.txthoten)).setText(hoTen);
        ((EditText)findViewById(R.id.txtcmnd)).setText(cmnd);
        ((EditText)findViewById(R.id.txtbangcap)).setText(bangcap);

        String sothichtxt = "";
        int i = 0;

        if(sothich.size() != 0)

        for(String x : sothich){
            sothichtxt += x;
            if(i < sothich.size() - 1)
                sothichtxt += ", ";
            i++;
        }

        ((EditText)findViewById(R.id.txtsothich)).setText(sothichtxt);

        btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });
    }
}