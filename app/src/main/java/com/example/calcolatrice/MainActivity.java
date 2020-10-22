package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Salva oggetti
        Button piu = findViewById(R.id.piu);
        Button meno = findViewById(R.id.meno);
        Button piu5 = findViewById(R.id.piu5);
        Button meno5 = findViewById(R.id.meno5);
        Button reset = findViewById(R.id.reset);
        TextView output = findViewById(R.id.output);
        // Sxyntax zuccheru
        output.setText("0");

        //Listeners

        piu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getIntOutput(output)<100){
                    update(1,output);
                }

            }
        });
        meno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getIntOutput(output)>0){
                    update(-1,output);
                }

            }
        });
        piu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getIntOutput(output)<=95){
                    update(5,output);
                }

            }
        });
        meno5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getIntOutput(output)>=5){
                    update(-5,output);
                }

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("0");

            }
        });
    }
    protected void update(int value, TextView output){
        int newOutInteger= value+Integer.parseInt(output.getText().toString());
        output.setText(Integer.toString(newOutInteger));
    }
    protected int getIntOutput(TextView output){
        return Integer.parseInt(output.getText().toString());
    }



    @Override
    protected void onStop() {

        super.onStop();

        /*TextView center = findViewById(R.id.centertext);
        center.setText("Test Bello");
        */

    }


}