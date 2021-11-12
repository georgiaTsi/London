package com.example.londonbaby;

import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    List<Item> allItemsList = new ArrayList<Item>();
    List<Item> mustSeeList = new ArrayList<Item>();
    List<Item> shoppingList = new ArrayList<Item>();

    RecyclerView recyclerView;
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeSpinner();

        initializeRecyclerView();
    }

    private void initializeSpinner(){
        String[] arraySpinner = new String[]{"All", "Shopping", "Must see"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner filterSpinner = findViewById(R.id.spinner_main_filter);
        filterSpinner.setAdapter(adapter);

        filterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){//All
                    itemAdapter.updateAdapter(allItemsList);
                }
                else if(position == 1){//Shopping
                    itemAdapter.updateAdapter(shoppingList);
                }
                else{//Must see
                    itemAdapter.updateAdapter(mustSeeList);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initializeRecyclerView(){
        populateList();

        recyclerView = findViewById(R.id.recyclerview_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemAdapter = new ItemAdapter(this);
        recyclerView.setAdapter(itemAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_detailed, menu);
        menu.getItem(0).getIcon().mutate().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_ATOP);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.action_notes){
            Intent intent = new Intent(getBaseContext(), NotesActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    private void populateList(){
        //All
        allItemsList.add(new Item(getResources().getString(R.string.abbaeiotououestminster), ResourcesCompat.getDrawable(getResources(), R.drawable.abbaeio_tou_ouestminster, null), DetailedActivity.Places.AbbaeioTouOuestminster, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.anaktoroTouMpakinxam), ResourcesCompat.getDrawable(getResources(), R.drawable.anaktoro_tou_mpakinxam, null), DetailedActivity.Places.AnaktoroTouMpakinxam, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.bretanikoMouseio), ResourcesCompat.getDrawable(getResources(), R.drawable.bretaniko_mouseio, null), DetailedActivity.Places.BretanikoMouseio, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.mouseioFusikisIstorias), ResourcesCompat.getDrawable(getResources(), R.drawable.mouseio_fusikis_istorias, null), DetailedActivity.Places.MouseioFusikisIstorias, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.bigBen), ResourcesCompat.getDrawable(getResources(), R.drawable.big_ben, null), DetailedActivity.Places.BigBen, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.harrods), ResourcesCompat.getDrawable(getResources(), R.drawable.harrods, null), DetailedActivity.Places.Harrods, true, true));
        allItemsList.add(new Item(getResources().getString(R.string.selfridges), ResourcesCompat.getDrawable(getResources(), R.drawable.selfridges, null), DetailedActivity.Places.Selfridges, false, true));
        allItemsList.add(new Item(getResources().getString(R.string.stPaulsCathedral), ResourcesCompat.getDrawable(getResources(), R.drawable.st_pauls_cathedral, null), DetailedActivity.Places.StPaulsCathedral, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.piccardiSquare), ResourcesCompat.getDrawable(getResources(), R.drawable.piccardi_square, null), DetailedActivity.Places.PiccardiSquare, false, true));
        allItemsList.add(new Item(getResources().getString(R.string.purgosTouLondinou), ResourcesCompat.getDrawable(getResources(), R.drawable.purgos_tou_londinou, null), DetailedActivity.Places.PurgosTouLondinou, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.londonEye), ResourcesCompat.getDrawable(getResources(), R.drawable.london_eye, null), DetailedActivity.Places.LondonEye, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.madameTussads), ResourcesCompat.getDrawable(getResources(), R.drawable.madame_tussads, null), DetailedActivity.Places.MadameTussads, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.londonTowerBridge), ResourcesCompat.getDrawable(getResources(), R.drawable.london_tower_bridge, null), DetailedActivity.Places.LondonTowerBridge, true, false));
        allItemsList.add(new Item(getResources().getString(R.string.albertMemorial), ResourcesCompat.getDrawable(getResources(), R.drawable.albert_memorial, null), DetailedActivity.Places.AlbertMemorial, false, false));
        allItemsList.add(new Item(getResources().getString(R.string.royalAlbertHall), ResourcesCompat.getDrawable(getResources(), R.drawable.royal_ambert_hall, null), DetailedActivity.Places.RoyalAlbertHall, false, false));
        allItemsList.add(new Item(getResources().getString(R.string.marpleArch), ResourcesCompat.getDrawable(getResources(), R.drawable.marple_arch, null), DetailedActivity.Places.MarpleArch, false, false));

        //Must see
        for(int i = 0; i < allItemsList.size(); i++){
            if(allItemsList.get(i).isMust){
                mustSeeList.add(allItemsList.get(i));
            }
        }

        //Shopping
        for(int i = 0; i < allItemsList.size(); i++){
            if(allItemsList.get(i).isShopping){
                shoppingList.add(allItemsList.get(i));
            }
        }
    }

    public class Item {
        public String title;
        public Drawable image;
        public DetailedActivity.Places place;

        public Boolean isMust;
        public Boolean isShopping;

        public Item(String title, Drawable image, DetailedActivity.Places place, Boolean isMust, Boolean isShopping){
            this.title = title;
            this.image = image;
            this.place = place;
            this.isMust = isMust;
            this.isShopping = isShopping;
        }
    }
}