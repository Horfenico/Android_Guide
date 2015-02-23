package com.example.eric.androidguide;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Eric on 2/8/2015.
 */
public class TerminologyActivity extends MainActivity {
    String[] terms;
    String[] definitions;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminology);

        terms = getResources().getStringArray(R.array.terms);
        definitions = getResources().getStringArray(R.array.definitions);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, terms);
        AutoCompleteTextView term = (AutoCompleteTextView) findViewById(R.id.termText);
        term.setAdapter(adapter);
        term.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View view, int position, long id) {

                String selected = ((AutoCompleteTextView) findViewById(R.id.termText)).getText().toString();
                int index = -1;

                switch (selected) {
                    case "adb":
                        index = 0;
                        break;
                    case "emulator":
                        index = 1;
                        break;
                    case "android":
                        index = 2;
                        break;
                    case "screenshot2":
                        index = 3;
                        break;
                    case "gradle":
                        index = 4;
                        break;
                    case "pm":
                        index = 5;
                        break;
                    case "lint":
                        index = 6;
                        break;
                    case "src/main":
                        index = 7;
                        break;
                    case "build/outputs":
                        index = 8;
                        break;
                    case "res/layout":
                        index = 9;
                        break;
                    case "res/values":
                        index = 10;
                        break;
                    case "project":
                        index = 11;
                        break;
                    case "panel":
                        index = 12;
                        break;
                    case "toolbar":
                        index = 13;
                        break;
                    case "status bar":
                        index = 14;
                        break;
                    case "preview pane":
                        index = 15;
                        break;
                    case "android pane":
                        index = 16;
                        break;
                    case "project explorer":
                        index = 17;
                        break;
                    case ".idea folder":
                        index = 18;
                        break;
                    case "intellisense":
                        index = 19;
                        break;
                    case "module":
                        index = 20;
                        break;
                    case "live layout":
                        index = 21;
                        break;
                    case "init":
                        index = 22;
                        break;
                    case "commit":
                        index = 23;
                        break;
                    case "push":
                        index = 24;
                        break;
                    case "add":
                        index = 25;
                        break;
                    case "pull":
                        index = 26;
                        break;
                    case "branch":
                        index = 27;
                        break;
                    case "clone":
                        index = 28;
                        break;
                }

                if (index != -1)
                    Toast.makeText(getApplicationContext(), definitions[index], Toast.LENGTH_LONG).show();

            }
        });
    }


}
