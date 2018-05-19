package com.example.ranggasatriaa.miwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the views that show number category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //set click listener on the view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        //find the views that show family category
        TextView family = (TextView) findViewById(R.id.family);
        //set click listener on the view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        //find the views that show colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        //set click listener on the view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //find the views that show Phrases category
        TextView Phrases = (TextView) findViewById(R.id.phrases);

        //set click listener on the view
        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntest = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntest);
            }
        });
    }
}
