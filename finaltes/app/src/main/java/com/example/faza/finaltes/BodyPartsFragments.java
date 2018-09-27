package com.example.faza.finaltes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BodyPartsFragments extends Fragment {
    //Variabel Global
    private List<Integer> imageId;
    private int indexImg;
    private static String TAG="BodyPartFragment";
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    public BodyPartsFragments() {

    }

    @Nullable
    @Override //method overide on create view
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //merubah posisi lanscape / sebaliknya ()
        if(savedInstanceState!=null){
            imageId=savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            indexImg=savedInstanceState.getInt(LIST_INDEX);
        }
        //membuat tampilan fragment
        View rootView = inflater.inflate(R.layout.fragment_layout, container,false);
        //Peletakan gambar pada id imageViewFragments
        final ImageView imageViewVar = (ImageView) rootView.findViewById(R.id.imageViewFragments);
        //Membuat object dari resource
        BodyImageAssets varAssets = new BodyImageAssets();
        //mengisi id:imageView dengan gambar dari resource
        imageViewVar.setImageResource(imageId.get(indexImg));

        //fungsi untuk memindahkan gambar saat 1x klik
        imageViewVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (indexImg<imageId.size()-1){
                    indexImg++;
                }
                else{
                    indexImg=0;
                }
                imageViewVar.setImageResource(imageId.get(indexImg));
            }
        });
        return rootView;
    }

    //untuk set variabel image yg ada didalam list
    public void setImageId(List<Integer> imageId) {
        this.imageId = imageId;
    }

    public void setIndexImg(int indexImg) {
        this.indexImg = indexImg;
    }

    //menyimpan sementara variabel array dan index
    public void onSaveInstanceState(@NonNull Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST,(ArrayList<Integer>) imageId);
        currentState.putInt(LIST_INDEX,indexImg);
    }
}


