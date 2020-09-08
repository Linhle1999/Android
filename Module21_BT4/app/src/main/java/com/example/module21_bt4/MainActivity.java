package com.example.module21_bt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup bangcap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangcap = (RadioGroup)findViewById(R.id.chonBangCap);

        System.out.println(bangcap.getCheckedRadioButtonId());
    }
}