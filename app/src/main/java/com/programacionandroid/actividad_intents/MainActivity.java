package com.programacionandroid.actividad_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botonExp;
    Button botonImp;

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonImp = (Button) findViewById(R.id.btnImplicito);
        botonImp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                implicito();
            }
        });

        botonExp = (Button) findViewById(R.id.btnExplicito);
        botonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                explicito();
            }
        });

    }

    //
    public void implicito(){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"961999986"));
        startActivity(intent);
    }

    //
    public void explicito(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}