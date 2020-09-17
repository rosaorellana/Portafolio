package com.example.portafolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMonedas = (Button)findViewById(R.id.btnMonedas);
        Button buttonMasa = (Button)findViewById(R.id.btnMasa);
        Button buttonVolumen = (Button)findViewById(R.id.btnVolumen);
        Button buttonLongitud = (Button)findViewById(R.id.btnLongitud);
        Button buttonAlmac = (Button)findViewById(R.id.btnAlmacenamiento);
        Button buttoTiempo = (Button)findViewById(R.id.btnTiempo);
        Button buttoTransdatos = (Button)findViewById(R.id.btnTransdatos);

        buttonMonedas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netxM = new Intent(MainActivity.this,Monedas.class);
                startActivity(netxM);
            }
        });

        buttonMasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netxM = new Intent(MainActivity.this,Masa.class);
                startActivity(netxM);
            }
        });

        buttonVolumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netxM = new Intent(MainActivity.this,Volumen.class);
                startActivity(netxM);
            }
        });

        buttonLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netxM = new Intent(MainActivity.this,Longitud.class);
                startActivity(netxM);
            }
        });

        buttonAlmac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netxM = new Intent(MainActivity.this,Almacenamiento.class);
                startActivity(netxM);
            }
        });

        buttoTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netxM = new Intent(MainActivity.this,Tiempo.class);
                startActivity(netxM);
            }
        });

        buttoTransdatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netxM = new Intent(MainActivity.this,Transdatos.class);
                startActivity(netxM);
            }
        });

    }
}








