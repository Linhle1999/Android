package com.example.module21_bt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MicrophoneInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.InputMethodManager;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    private EditText txta, txtb;
    private TextView txtkq;
    private AlertDialog.Builder alert;
    private View baseView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        baseView=(View) findViewById(R.id.constraintLayout);

        txta=(EditText) findViewById(R.id.soa);
        txtb=(EditText) findViewById(R.id.sob);

        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button5);
        btn6=(Button) findViewById(R.id.button6);

        txtkq=(TextView) findViewById(R.id.txtKetQua);

        alert= new AlertDialog.Builder(this);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
		try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if(txta.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập a",Snackbar.LENGTH_LONG).show();
                    return;}
                if(txtb.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập b",Snackbar.LENGTH_LONG).show();
                    return;
                }
                txtkq.setText(String.valueOf(Integer.parseInt(txta.getText().toString())+Integer.parseInt(txtb.getText().toString())));
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

                if(txta.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập a",Snackbar.LENGTH_LONG).show();
                    return;}
                if(txtb.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập b",Snackbar.LENGTH_LONG).show();
                    return;
                }
                txtkq.setText(String.valueOf(Integer.parseInt(txta.getText().toString())-Integer.parseInt(txtb.getText().toString())));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
		try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if(txta.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập a",Snackbar.LENGTH_LONG).show();
                    return;}
                if(txtb.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập b",Snackbar.LENGTH_LONG).show();
                    return;
                }
                txtkq.setText(String.valueOf(Integer.parseInt(txta.getText().toString())*Integer.parseInt(txtb.getText().toString())));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
		try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if(txta.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập a",Snackbar.LENGTH_LONG).show();
                    return;}
                if(txtb.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập b",Snackbar.LENGTH_LONG).show();
                    return;
                }
                txtkq.setText(String.valueOf(Integer.parseInt(txta.getText().toString())/Integer.parseInt(txtb.getText().toString())));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
		try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }

                if(txta.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập a",Snackbar.LENGTH_LONG).show();
                    return;}
                if(txtb.getText().toString().equals("")){
                    Snackbar.make(baseView,"Chưa nhập b",Snackbar.LENGTH_LONG).show();
                    return;
                }
                int a=Integer.parseInt(txta.getText().toString());
                int b=Integer.parseInt(txtb.getText().toString());
                while (a*b!= 0){
                    if (a > b){
                       a %= b;
                    }else{
                        b %= a;
                    }
                }
                txtkq.setText(String.valueOf(a+b));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.setMessage("Bạn có muốn thoát chương trình không!");
                alert.setTitle("Thông báo");
                alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(1);
                    }
                });
                alert.setNegativeButton("Cancel",null);
                alert.create().show();
            }
        });
    }
}