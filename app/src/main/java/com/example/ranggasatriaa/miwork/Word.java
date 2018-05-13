package com.example.ranggasatriaa.miwork;

import android.content.Context;
import android.view.View;

public class Word{

    /*
    * word parameter
    * */
    private String mEnglish;
    private String mMiwok;

    /*
    * Word contructor
    * */
    public Word(String english, String miwok){
        mEnglish = english;
        mMiwok   = miwok;
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
}

