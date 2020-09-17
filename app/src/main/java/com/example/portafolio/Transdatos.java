package com.example.portafolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Transdatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transdatos);

        Button button = (Button)findViewById(R.id.idconvertir);
    }

    public void transferencia(View v){
        try{
            TextView tempVal=(TextView)findViewById(R.id.edtCantidad);
            Double cantidad3=Double.parseDouble(tempVal.getText().toString());

            Spinner spn=(Spinner)findViewById(R.id.cboDato);
            Integer de =spn.getSelectedItemPosition();

            Spinner spna=(Spinner)findViewById(R.id.cboDatos);
            Integer a =spna.getSelectedItemPosition();

            Double[]unidades={1e-9,1e-6,0.000125,1e-12};

            Double valor4=unidades[a]/unidades[de]*cantidad3;
            tempVal=(TextView)findViewById(R.id.txtRespuesta);
            tempVal.setText("Respuesta:"+valor4);
        }catch(Exception error){
            TextView tempVal = (TextView) findViewById(R.id.txtRespuesta);
            tempVal.setText("Ingrese la Cantidad a Convertir ");
        }
    }
}