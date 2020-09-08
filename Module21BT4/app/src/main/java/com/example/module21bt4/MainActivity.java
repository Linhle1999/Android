package com.example.module21bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RadioGroup bangcap;
    private Button btn;
    private ArrayList<String> sothich = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button) ;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CheckBox)findViewById(R.id.docbao)).isChecked())
                    sothich.add("Đọc báo");
                if(((CheckBox)findViewById(R.id.docoding)).isChecked())
                    sothich.add("Đọc conding");
                if(((CheckBox)findViewById(R.id.docsach)).isChecked())
                    sothich.add("Đọc sách");

                bangcap = (RadioGroup)findViewById(R.id.chonbangcap);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                intent.putExtra("bangcap", ((RadioButton) findViewById(bangcap.getCheckedRadioButtonId())).getText().toString());
                intent.putStringArrayListExtra("sothich", sothich);
                intent.putExtra("hoten", ((EditText) findViewById(R.id.txthoten)).getText().toString());
                intent.putExtra("cmnd", ((EditText) findViewById(R.id.txtcmnd)).getText().toString());
                intent.putExtra("thongtinbosung", ((EditText) findViewById(R.id.txtthongtinbosung)).getText().toString());

                startActivity(intent);
            }
        });
    }
}