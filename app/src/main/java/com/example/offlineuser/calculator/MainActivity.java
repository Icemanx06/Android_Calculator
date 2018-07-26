package com.example.offlineuser.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button kiszamol, kiszamol2, kiszamol3, kiszamol4;
    EditText elsoSzam, masodikSzam;
    TextView eredmenyText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kiszamol = (Button) findViewById(R.id.button);
        kiszamol2 = (Button) findViewById(R.id.button2);
        kiszamol3 = (Button) findViewById(R.id.button3);
        kiszamol4 = (Button) findViewById(R.id.button4);
        elsoSzam = (EditText) findViewById(R.id.editText3);
        masodikSzam = (EditText) findViewById(R.id.editText4);
        eredmenyText = (TextView) findViewById(R.id.textView3);

        kiszamol.setOnClickListener(this);

        Button osszead = (Button) findViewById(R.id.button);
        osszead.setOnClickListener(this);

        kiszamol2.setOnClickListener(this);

        Button kivon = (Button) findViewById(R.id.button2);
        kivon.setOnClickListener(this);

        kiszamol3.setOnClickListener(this);

        Button szoroz = (Button) findViewById(R.id.button3);
        szoroz.setOnClickListener(this);

        kiszamol4.setOnClickListener(this);

        Button eloszt = (Button) findViewById(R.id.button4);
        eloszt.setOnClickListener(this);


    }

    public void onClick(View v){

        double szam1 = Double.parseDouble((elsoSzam.getText().toString()));
        double szam2 = Double.parseDouble(masodikSzam.getText().toString());
        double eredmeny;
        switch (v.getId()){
            case R.id.button:
                eredmeny = szam1+szam2;

                Toast.makeText(this,"Összeadás eredménye: "+Double.toString(eredmeny),Toast.LENGTH_SHORT).show();
                eredmenyText.setText("Az összeadás eredménye: "+Double.toString(eredmeny));
                break;

            case R.id.button2:
                eredmeny = szam1-szam2;

                Toast.makeText(this,"Kivonás eredménye: "+Double.toString(eredmeny),Toast.LENGTH_SHORT).show();
                eredmenyText.setText("A kivonás eredménye: "+Double.toString(eredmeny));
                break;

            case R.id.button3:
                eredmeny = szam1*szam2;

                Toast.makeText(this,"A szorzás eredménye: "+Double.toString(eredmeny),Toast.LENGTH_SHORT).show();
                eredmenyText.setText("A szorzás eredménye: "+Double.toString(eredmeny));
                break;

            case R.id.button4:
                eredmeny = szam1/szam2;

                Toast.makeText(this,"Az osztás eredménye: "+Double.toString(eredmeny),Toast.LENGTH_SHORT).show();
                eredmenyText.setText("Az osztás eredménye: "+Double.toString(eredmeny));
                break;

        }
    }
}


