package com.cpedroza.myapp_listapaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MA_pais extends AppCompatActivity {

    private ImageView imagen;
    private TextView titulo,info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_pais);
        imagen = findViewById(R.id.viewImagen);
        titulo = findViewById(R.id.txtTitulo);
        info = findViewById(R.id.txtPoblacion);

        this.recibir();

    }

    private  void recibir(){
        Bundle bundle = getIntent().getExtras();
        int imagenes = bundle.getInt("im");
        imagen.setImageResource(imagenes);

        String titulo2 = bundle.getString("pa");
        titulo.setText(titulo2);

        int pob = bundle.getInt("tx");
        info.setText(pob);
    }


}