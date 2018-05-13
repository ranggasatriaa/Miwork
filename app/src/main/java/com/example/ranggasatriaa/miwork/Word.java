package com.example.ranggasatriaa.miwork;

import android.content.Context;
import android.view.View;

public class Word{

    /*
    * word parameter
    * */
    private String mEnglish;
    private String mMiwok;
    private int mImage;

    /*
    * Word contructor
    * */
    public Word(String english, String miwok, int image){
        mEnglish = english;
        mMiwok   = miwok;
        mImage   = image;
    }

    /*
    * Get english tranlation
    * */
    public String getEnglish(){
        return mEnglish;
    }

    /*
    * Get miwok translation
    * */
    public String getMiwok(){
        return mMiwok;
    }

    /*
    * Get image
    * */
    public int getImage(){
        return mImage;
    }
}

