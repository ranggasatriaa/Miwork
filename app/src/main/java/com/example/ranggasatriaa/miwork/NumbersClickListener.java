package com.example.ranggasatriaa.miwork;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class NumbersClickListener implements View.OnClickListener{
    @Override
    public void onClick(View view) {
            Toast.makeText(view.getContext(), "Open the list of number", Toast.LENGTH_LONG).show();
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
    }
}

