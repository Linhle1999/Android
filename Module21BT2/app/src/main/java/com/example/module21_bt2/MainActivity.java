package com.example.module21_bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3; //btn1: f->c; btn2: c->f; btn3: clear
    private EditText txtdo_c,txtdo_f;
    private View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtdo_c=(EditText) findViewById(R.id.doc);
        txtdo_f=(EditText) findViewById(R.id.dof);

        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);

        layout=(View) findViewById(R.id.contain);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if(txtdo_f.getText().toString().equals("")){
                    Snackbar.make(layout,"Chưa nhập độ f", Snackbar.LENGTH_LONG).show();
                    txtdo_f.requestFocus();
                    return;
                }

                txtdo_c.setText(String.valueOf((Integer.parseInt(txtdo_f.getText().toString())-32)*5/9));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if(txtdo_c.getText().toString().equals("")){
                    Snackbar.make(layout,"Chưa nhập độ c", Snackbar.LENGTH_LONG).show();
                    txtdo_c.requestFocus();
                    return;
                }

                txtdo_f.setText(String.valueOf(Integer.parseInt(txtdo_c.getText().toString())*9/5+32));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtdo_c.setText(String.valueOf(""));
                txtdo_f.requestFocus();
                txtdo_f.setText(String.valueOf(""));
                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });
    }
}