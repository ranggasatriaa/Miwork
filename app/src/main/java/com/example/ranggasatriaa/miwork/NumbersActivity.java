package com.example.ranggasatriaa.miwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create arraylist
        ArrayList<String> words = new ArrayList<String>();
        //add arraylist
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        //create arraylist
        ArrayList<String> miwoks = new ArrayList<String>();
        //add arraylist
        miwoks.add("one");
        miwoks.add("two");
        miwoks.add("three");
        miwoks.add("four");
        miwoks.add("five");
        miwoks.add("six");
        miwoks.add("seven");
        miwoks.add("eight");
        miwoks.add("nine");
        miwoks.add("ten");

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, R.layout.list_item, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);



//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//
////        int index = 0;
////        while(index < words.size()){
////            TextView wordView = new TextView(this);
////            wordView.setText(words.get(index));
////            rootView.addView(wordView);
////
////            index ++;
////        }
//
//        for (int index = 0; index < words.size(); index++){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }
    }
}
