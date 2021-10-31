package com.example.londonbaby;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeButtons();
    }

    private void initializeButtons(){
        ImageView abbaeioTouOuestminston = findViewById(R.id.imageview_main_abbaeiotououestminster);
        ImageView anaktoroTouMpakinam = findViewById(R.id.imageview_main_anaktorotoumpakinxam);
        ImageView bretanikoMouseio = findViewById(R.id.imageview_main_bretanikomouseio);
        ImageView piccardiSquare = findViewById(R.id.imageview_main_piccardisquare);
        ImageView purgosTouLondinou = findViewById(R.id.imageview_main_purgostoulondinou);
        ImageView londonEye = findViewById(R.id.imageview_main_londoneye);
        ImageView stPaulsCathedral = findViewById(R.id.imageview_main_stpaulscathedral);
        ImageView madameTussads = findViewById(R.id.imageview_main_madametussads);
        ImageView londonTowerBridge = findViewById(R.id.imageview_main_londontowerbridge);
        ImageView mouseioFusikisIstorias = findViewById(R.id.imageview_main_mouseiofusikisistorias);
        ImageView bigBen = findViewById(R.id.imageview_main_bigBen);
        ImageView harrods = findViewById(R.id.imageview_main_harrods);
        ImageView selfridges = findViewById(R.id.imageview_main_selfridges);
        ImageView albertMemorial = findViewById(R.id.imageview_main_albertmemorial);
        ImageView royalAlbertHall = findViewById(R.id.imageview_main_royalalberthall);
        ImageView marpleArch = findViewById(R.id.imageview_main_marplearch);

        abbaeioTouOuestminston.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.AbbaeioTouOuestminster);
            }
        });

        anaktoroTouMpakinam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.AnaktoroTouMpakinxam);
            }
        });

        bretanikoMouseio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.BretanikoMouseio);
            }
        });

        piccardiSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.PiccardiSquare);
            }
        });

        purgosTouLondinou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.PurgosTouLondinou);
            }
        });

        londonEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.LondonEye);
            }
        });

        stPaulsCathedral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.StPaulsCathedral);
            }
        });

        madameTussads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.MadameTussads);
            }
        });

        londonTowerBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.LondonTowerBridge);
            }
        });

        mouseioFusikisIstorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDetailedActivity(DetailedActivity.Places.MouseioFusikisIstorias);
            }
        });

        bigBen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startDetailedActivity((DetailedActivity.Places.BigBen));
            }
        });

        harrods.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startDetailedActivity((DetailedActivity.Places.Harrods));
            }
        });

        selfridges.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startDetailedActivity((DetailedActivity.Places.Selfridges));
            }
        });

        albertMemorial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startDetailedActivity((DetailedActivity.Places.AlbertMemorial));
            }
        });

        royalAlbertHall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startDetailedActivity((DetailedActivity.Places.RoyalAlbertHall));
            }
        });

        marpleArch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startDetailedActivity((DetailedActivity.Places.MarpleArch));
            }
        });
    }

    private void startDetailedActivity(DetailedActivity.Places place){
        Intent intent = new Intent(getBaseContext(), DetailedActivity.class);
        intent.putExtra("place", place);
        startActivity(intent);
    }
}