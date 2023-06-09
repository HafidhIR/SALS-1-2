package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1 = findViewById(R.id.tvHASIL);
        final EditText et1 = findViewById(R.id.editText1);
        final EditText et2 = findViewById(R.id.editText2);
        Button bt1 = findViewById(R.id.btJUMLAH);
        bt1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah="";
                if (v.getId() == bt1.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 + x2;
                    jumlah = String.valueOf(hasil);
                    tv1.setText(jumlah);
                }
            }
        });
        Button bt2 = findViewById(R.id.btKURANG);
        bt2 .setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String kurang="";
                if (v.getId() == bt2.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et2.getText().toString());
                    int hasil = x1 - x2;
                    kurang = String.valueOf(hasil);
                    tv1.setText(kurang);
                }
            }
        });
        Button bt3 = findViewById(R.id.btKali);
        bt3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String kali="";
                if (v.getId() == bt3.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et1.getText().toString());
                    int hasil = x1 * x2;
                    kali = String.valueOf(hasil);
                    tv1.setText(kali);
                }
            }
        });
        Button bt4 = findViewById(R.id.btBAGI);
        bt4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String bagi="";
                if (v.getId() == bt4.getId()) {
                    int x1 = Integer.parseInt(et1.getText().toString());
                    int x2 = Integer.parseInt(et1.getText().toString());
                    int hasil = x1 / x2;
                    bagi = String.valueOf(hasil);
                    tv1.setText(bagi);
                }
            }
        });
    }
}
