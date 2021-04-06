package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    Bitmap bitMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        chonMau();

    }


    public void changeVS(){
        setContentView(R.layout.screen02);
        ImageView imageVS= findViewById(R.id.imageVS);
        ImageView colorLightBlue=findViewById(R.id.colorligthblue);
        ImageView colorRed=findViewById(R.id.red);
        ImageView colorBlack=findViewById(R.id.black);
        ImageView colorDarkBlue=findViewById(R.id.drakblue);
        TextView lblmau=findViewById(R.id.lblmau);
        TextView txtmau=findViewById(R.id.txtmausac);
        TextView txtCungCap=findViewById(R.id.txtcungcap);
        TextView txtgia=findViewById(R.id.txtgia);
        Button btnXong=findViewById(R.id.xong);


        colorLightBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageVS.setImageDrawable(getResources().getDrawable(R.drawable.vs_bac_1));
                bitMap= BitmapFactory.decodeResource(imageVS.getResources(),R.drawable.vs_bac_1);
                lblmau.setVisibility(View.VISIBLE);
                txtCungCap.setVisibility(View.VISIBLE);
                txtgia.setVisibility(View.VISIBLE);
                txtmau.setText("Bạc");
                txtmau.setVisibility(View.VISIBLE);
//                imageView.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_live_xanh_2));
            }
        });

        colorRed.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                imageVS.setImageDrawable(getResources().getDrawable(R.drawable.vs_red_a_2));
                bitMap= BitmapFactory.decodeResource(imageVS.getResources(),R.drawable.vs_red_a_2);
                lblmau.setVisibility(View.VISIBLE);
                txtCungCap.setVisibility(View.VISIBLE);
                txtgia.setVisibility(View.VISIBLE);
                txtmau.setText("Đỏ");
                txtmau.setVisibility(View.VISIBLE);
//                imageView.setImageDrawable(getResources().getDrawable(R.drawable.vs_red_a_2));
            }
        });
        colorBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageVS.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_black_star_1));
                bitMap= BitmapFactory.decodeResource(imageVS.getResources(),R.drawable.vsmart_black_star_1);
                lblmau.setVisibility(View.VISIBLE);
                txtCungCap.setVisibility(View.VISIBLE);
                txtgia.setVisibility(View.VISIBLE);
                txtmau.setText("Đen");
                txtmau.setVisibility(View.VISIBLE);
//                imageView.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_black_star_1));
            }
        });
        colorDarkBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageVS.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_live_xanh_2));
                bitMap= BitmapFactory.decodeResource(imageVS.getResources(),R.drawable.vsmart_live_xanh_2);

                lblmau.setVisibility(View.VISIBLE);
                txtCungCap.setVisibility(View.VISIBLE);
                txtgia.setVisibility(View.VISIBLE);
                txtmau.setText("Xanh");
                txtmau.setVisibility(View.VISIBLE);
//                imageView.setImageDrawable(getResources().getDrawable(R.drawable.vs_bac_1));
            }
        });

        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                ImageView image1=findViewById(R.id.imageeee);
                image1.setImageBitmap(bitMap);
                Button btnChon=findViewById(R.id.btnchonmau);
                btnChon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        changeVS();
                    }
                });
            }
        });

    }
    public void chonMau(){
        setContentView(R.layout.activity_main);
        Button btnChon=findViewById(R.id.btnchonmau);
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeVS();
            }
        });


    }
}