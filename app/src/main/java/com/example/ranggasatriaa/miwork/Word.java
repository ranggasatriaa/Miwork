package com.example.ranggasatriaa.miwork;

import android.content.Context;
import android.view.View;

public class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * word parameter
     */
    private String mEnglish;
    private String mMiwok;
    private int mImage = NO_IMAGE_PROVIDED;

    /**
     * Word contructor
     */
    public Word(String english, String miwok, int image) {
        mEnglish = english;
        mMiwok = miwok;
        mImage = image;
    }

    /**
     * Get english tranlation
     */
    public String getEnglish() {
        return mEnglish;
    }

    /**
     * Get miwok translation
     */
    public String getMiwok() {
        return mMiwok;
    }

    /**
     * Get image
     */
    public int getImage() {
        return mImage;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }
}

