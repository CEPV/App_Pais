package com.cpedroza.myapp_listapaises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista;


    ArrayList<String> paises = new ArrayList<>();
    ArrayList<Integer> imagenes = new ArrayList<>();
    ArrayList<Integer> textos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lstLista);

        paises.add("Guatemala");
        paises.add("El Salvador");
        paises.add("Honduras");
        paises.add("Nicaragua");
        paises.add("Costa Rica");
        paises.add("Panama");
        paises.add("México");
        paises.add("Estados Unidos");
        paises.add("Canada");
        paises.add("Belice");

        imagenes.add(R.drawable.ic_guatemala);
        imagenes.add(R.drawable.ic_salvador);
        imagenes.add(R.drawable.ic_honduras);
        imagenes.add(R.drawable.ic_nicaragua);
        imagenes.add(R.drawable.ic_costarica);
        imagenes.add(R.drawable.ic_panama);
        imagenes.add(R.drawable.ic_mexico);
        imagenes.add(R.drawable.ic_estadosunidos);
        imagenes.add(R.drawable.ic_canada);
        imagenes.add(R.drawable.ic_belice);

        textos.add(R.string.guatemala);
        textos.add(R.string.Salvador);
        textos.add(R.string.Honduras);
        textos.add(R.string.Nicaragua);
        textos.add(R.string.CostaRica);
        textos.add(R.string.Panama);
        textos.add(R.string.México);
        textos.add(R.string.EstadosUnidos);
        textos.add(R.string.Canada);
        textos.add(R.string.Belice);

        //llenar lista
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,paises);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),MA_pais.class);
                intent.putExtra("pa",paises.get(position));
                intent.putExtra("im",imagenes.get(position));
                intent.putExtra("tx",textos.get(position));

                startActivity(intent);
            }
        });

    }





}