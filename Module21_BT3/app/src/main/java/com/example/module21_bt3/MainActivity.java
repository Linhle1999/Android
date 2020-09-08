package com.example.module21_bt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText txtNam;
    private TextView txtChuyenDoi;
    private View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.button);

        txtNam=(EditText) findViewById(R.id.txtnam);
        txtChuyenDoi=(EditText) findViewById(R.id.txtchuyendoi);

        layout=(View) findViewById(R.id.container);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    InputMethodManager inp = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    inp.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                }catch (Exception e){

                }

                if(txtNam.getText().toString().equals("")){
                    Snackbar.make(layout, "Chưa nhập", Snackbar.LENGTH_LONG).show();
                    return;
                }

                String namAm = "";

                int can = Integer.parseInt(txtNam.getText().toString()) % 10;
                int chi = Integer.parseInt(txtNam.getText().toString()) % 12;

                switch (can){
                    case 0 :
                        namAm+="Canh";
                    case 1:
                        namAm += "Tân";
                    case 2:
                        namAm += "Nhâm";
                    case 3:
                        namAm += "Quý";
                    case 4:
                        namAm += "Giáp";
                    case 5:
                        namAm += "Ất";
                    case 6:
                        namAm += "Bính";
                    case 7:
                        namAm += "Đinh";
                    case 8:
                        namAm += "Mậu";
                    case 9:
                        namAm += "Kỷ";
                }

                namAm += " ";

                switch (chi) {
                    case 0 :
                        namAm += "Thân";
                    case 1 :
                        namAm += "Dậu";
                    case 2 :
                        namAm += "Tuất";
                    case 3 :
                        namAm += "Hợi";
                    case 4 :
                        namAm += "Tý";
                    case 5 :
                        namAm += "Sửu";
                    case 6 :
                        namAm += "Dần";
                    case 7 :
                        namAm += "Mẹo";
                    case 8 :
                        namAm += "Thìn";
                    case 9 :
                        namAm += "Tỵ";
                    case 10 :
                        namAm += "Ngọ";
                    case 11 :
                        namAm += "Mùi";
                }

                txtChuyenDoi.setText(namAm);
            }
        });
    }
}