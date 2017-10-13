package edu.upc.eseiaat.pma.kmamillas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText edit_km = (EditText) findViewById(R.id.edit_km);
        final EditText edit_millas = (EditText) findViewById(R.id.edit_millas);

       edit_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String skm = edit_km.getText().toString();
                float km = Float.parseFloat(skm);
                float millas = km / 1.609f;
                String smillas = String.format("%f",millas);
                edit_millas.setText(smillas);
            }
        });

        edit_millas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String smillas = edit_millas.getText().toString();
                float millas = Float.parseFloat(smillas);
                float km = millas * 1.609f;
                String skm = String.format("%f",km);
                edit_km.setText(skm);
            }
        });


    }
}
