package com.example.faza.finaltes;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //sebuah statement pengecekan agar fragment hanya dibuat 1x saja
        if (savedInstanceState == null){

            //membuar variabel untuk class BodyPartFragment
            BodyPartsFragments bodyPart;
            FragmentManager fm = getSupportFragmentManager();

            //membuat object untuk heads
            //bodyPart = new BodyPartsFragments();
            //untuk ngeset body part dengan gambar yg telah didapat dari body assets
            //bodyPart.setImageId(BodyImageAssets.getHeads());
            //bodyPart.setIndexImg(0);
            //mengeset gambar pada container fragment yang telah dibuat dengan gambar yang didapat
            //fm.beginTransaction().add(R.id.heads_container,bodyPart).commit();

            //membuat object badan
            bodyPart = new BodyPartsFragments();
            bodyPart.setImageId(BodyImageAssets.getBodies());
            bodyPart.setIndexImg(0);
            fm.beginTransaction().add(R.id.bodies_container,bodyPart).commit();

            //membuat object untuk kaki
            bodyPart = new BodyPartsFragments();
            bodyPart.setImageId(BodyImageAssets.getLegs());
            bodyPart.setIndexImg(0);

            //transaksi fragment kaki (biar bisa tampil di fragment)
            fm.beginTransaction().add(R.id.legs_container,bodyPart).commit();
        }
    }
}
