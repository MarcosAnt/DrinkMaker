package com.example.marcos.drinkmaker;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        String[] drinks = new String[]{"Batida de Sonho de Valsa", "Drink dos Deuses", "Quentão"};
        ArrayAdapter<String> arrayDrinks = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, drinks);
        setListAdapter(arrayDrinks);
    }

    @Override
    protected void onListItemClick(ListView lv, View v, int position, long id) {
        super.onListItemClick(lv, v, position, id);
        Intent it = new Intent(this, DetailActivity.class);
        it.putExtra("drinkID", position);
        startActivity(it);
    }

}
