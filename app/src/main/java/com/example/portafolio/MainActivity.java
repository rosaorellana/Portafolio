package com.example.portafolio;

import androidx.appcompat.app.AppCompatActivity;

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

    SensorManager sensorManager;
    Sensor sensor;
    SensorEventListener sensorEventListener;

    @Override
    protected void onPause() {
        detener();
        super.onPause();
    }

    @Override
    protected void onResume() {
        iniciar();
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if (sensor == null) {
            finish();
        }
        final TextView lblSensorLuz = (TextView) findViewById(R.id.lblSensorLuz);
        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                double luz = sensorEvent.values[0];
                if (luz >= 0 && luz <= 15000) {
                    getWindow().getDecorView().setBackgroundColor(Color.BLACK);
                }
                if (luz >= 15000 && luz <= 30000) {
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                }
                if (luz >= 30000 && luz <= 50000) {
                    getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                }
                lblSensorLuz.setText("VALOR: " + luz);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        iniciar();
    }

    void iniciar() {
        sensorManager.registerListener(sensorEventListener, sensor, 2000 * 1000);
    }

    void detener() {
        sensorManager.unregisterListener(sensorEventListener);
    }

    }




