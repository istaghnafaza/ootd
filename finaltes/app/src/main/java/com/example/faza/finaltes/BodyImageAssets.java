package com.example.faza.finaltes;

import java.util.ArrayList;
import java.util.List;

public class BodyImageAssets {
    //variable ini adalah variabel untuk mengumpulkan gambar bodies menjadi satu.
    private static List<Integer> bodies = new ArrayList<Integer>() {
        {
            add(R.drawable.body1);
            add(R.drawable.body2);
            add(R.drawable.body3);
            add(R.drawable.body4);
            add(R.drawable.body5);
        }
    };

    //variable ini adalah variabel untuk mengumpulkan gambar legs menjadi satu.
    private static List<Integer> legs = new ArrayList<Integer>() {
        {
            add(R.drawable.legs1);
            add(R.drawable.legs2);
            add(R.drawable.legs3);
            add(R.drawable.legs4);
            add(R.drawable.legs6);
        }
    };

    //perintah untuk memanggil tiap2 list (kepala,badan,kaki)
    //public static List<Integer> getHeads() {
    //  return heads;
    //}

    public static List<Integer> getBodies() {
        return bodies;
    }

    public static List<Integer> getLegs() {
        return legs;
    }
}

