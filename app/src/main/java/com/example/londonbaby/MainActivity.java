package com.example.londonbaby;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    List<Item> items = new ArrayList<Item>();

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
                if(position == 0){

                }
                else if(position == 1){

                }
                else{

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initializeRecyclerView(){
        populateList();

        RecyclerView recyclerView = findViewById(R.id.recyclerview_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ItemAdapter adapter = new ItemAdapter(items, this);
        recyclerView.setAdapter(adapter);
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
        items.add(new Item(getResources().getString(R.string.abbaeiotououestminster), ResourcesCompat.getDrawable(getResources(), R.drawable.abbaeio_tou_ouestminster, null), DetailedActivity.Places.AbbaeioTouOuestminster));
        items.add(new Item(getResources().getString(R.string.anaktoroTouMpakinxam), ResourcesCompat.getDrawable(getResources(), R.drawable.anaktoro_tou_mpakinxam, null), DetailedActivity.Places.AnaktoroTouMpakinxam));
        items.add(new Item(getResources().getString(R.string.bretanikoMouseio), ResourcesCompat.getDrawable(getResources(), R.drawable.bretaniko_mouseio, null), DetailedActivity.Places.BretanikoMouseio));
        items.add(new Item(getResources().getString(R.string.mouseioFusikisIstorias), ResourcesCompat.getDrawable(getResources(), R.drawable.mouseio_fusikis_istorias, null), DetailedActivity.Places.MouseioFusikisIstorias));
        items.add(new Item(getResources().getString(R.string.bigBen), ResourcesCompat.getDrawable(getResources(), R.drawable.big_ben, null), DetailedActivity.Places.BigBen));
        items.add(new Item(getResources().getString(R.string.harrods), ResourcesCompat.getDrawable(getResources(), R.drawable.harrods, null), DetailedActivity.Places.Harrods));
        items.add(new Item(getResources().getString(R.string.selfridges), ResourcesCompat.getDrawable(getResources(), R.drawable.selfridges, null), DetailedActivity.Places.Selfridges));
        items.add(new Item(getResources().getString(R.string.stPaulsCathedral), ResourcesCompat.getDrawable(getResources(), R.drawable.st_pauls_cathedral, null), DetailedActivity.Places.StPaulsCathedral));
        items.add(new Item(getResources().getString(R.string.piccardiSquare), ResourcesCompat.getDrawable(getResources(), R.drawable.piccardi_square, null), DetailedActivity.Places.PiccardiSquare));
        items.add(new Item(getResources().getString(R.string.purgosTouLondinou), ResourcesCompat.getDrawable(getResources(), R.drawable.purgos_tou_londinou, null), DetailedActivity.Places.PurgosTouLondinou));
        items.add(new Item(getResources().getString(R.string.londonEye), ResourcesCompat.getDrawable(getResources(), R.drawable.london_eye, null), DetailedActivity.Places.LondonEye));
        items.add(new Item(getResources().getString(R.string.madameTussads), ResourcesCompat.getDrawable(getResources(), R.drawable.madame_tussads, null), DetailedActivity.Places.MadameTussads));
        items.add(new Item(getResources().getString(R.string.londonTowerBridge), ResourcesCompat.getDrawable(getResources(), R.drawable.london_tower_bridge, null), DetailedActivity.Places.LondonTowerBridge));
        items.add(new Item(getResources().getString(R.string.albertMemorial), ResourcesCompat.getDrawable(getResources(), R.drawable.albert_memorial, null), DetailedActivity.Places.AlbertMemorial));
        items.add(new Item(getResources().getString(R.string.royalAlbertHall), ResourcesCompat.getDrawable(getResources(), R.drawable.royal_ambert_hall, null), DetailedActivity.Places.RoyalAlbertHall));
        items.add(new Item(getResources().getString(R.string.marpleArch), ResourcesCompat.getDrawable(getResources(), R.drawable.marple_arch, null), DetailedActivity.Places.MarpleArch));
    }

    public class Item {
        public String title;
        public Drawable image;
        public DetailedActivity.Places place;

        public Item(String title, Drawable image, DetailedActivity.Places place){
            this.title = title;
            this.image = image;
            this.place = place;
        }
    }
}