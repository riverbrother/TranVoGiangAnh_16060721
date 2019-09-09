package com.example.formdangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.app.*;

public class MainActivity extends AppCompatActivity {
    private EditText et_tk,et_mk;
    private Button btn_dn,btn_thoat;
    private CheckBox cb_luu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_mk=(EditText)findViewById(R.id.ETMatKhau);
        et_tk=(EditText)findViewById(R.id.ETTaiKhoan);
        btn_dn=(Button)findViewById(R.id.BtnDangNhap);
        btn_thoat=(Button)findViewById(R.id.BtnThoat);
        cb_luu=(CheckBox)findViewById(R.id.CBLuu);
        Thoat();

        btn_dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String taikhoan="ad";
                String matkhau="123";
//                if(et_tk.getText().toString()==null
//                        && et_mk.getText().toString()==null){
//                    Toast toast=Toast.makeText(getApplicationContext(),
//                            "ko duoc de trong",Toast.LENGTH_SHORT);
//                    toast.show();
//                }
//                else {
//                if(et_tk.getText().toString().equals(taikhoan)
//                && et_mk.getText().toString().equals(matkhau)){
                if (cb_luu.isChecked()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Chao mung dang nhap.Thong tin da duoc luu", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Chao mung dang nhap.Thong tin ko duoc luu", Toast.LENGTH_SHORT);
                    toast.show();
                }
//                }
//                }
            }
        });

        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //.app
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this
                        , android.R.style.Theme_DeviceDefault);
                builder.setTitle("Ban muon thoat ko");
                builder.setMessage("lua chon de xac nhan");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("co", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
    }

    private void Thoat() {

    }
}
