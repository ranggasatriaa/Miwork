package com.example.ranggasatriaa.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create arraylist with word type object
        ArrayList<Word> words = new ArrayList<Word>();
        //add arraylist with word type object
        words.add(new Word("red", "weṭeṭṭi",0));
        words.add(new Word("green", "chokokki",1));
        words.add(new Word("brown", "ṭakaakki",2));
        words.add(new Word("gray", "ṭopoppi",3));
        words.add(new Word("black", "kululli",4));
        words.add(new Word("white", "kelelli",5));
        words.add(new Word("dusty yellow", "ṭopiisә",6));
        words.add(new Word("mustard yellow", "chiwiiṭә",7));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter itemsAdapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

    }
}
