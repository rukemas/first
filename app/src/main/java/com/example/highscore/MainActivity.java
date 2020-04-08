package com.example.highscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private int x = 3;
    private TextView top1;
    private TextView top2;
    private TextView top3;
    private TextView top4;
    private TextView top5;
    private TextView top1pisteet;
    private TextView top2pisteet;
    private TextView top3pisteet;
    private TextView top4pisteet;
    private TextView top5pisteet;
    private LinearLayout lista;
    private LinearLayout pisteet;
    private TextView pisteesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        top1 = findViewById(R.id.top1);
        top2 = findViewById(R.id.top2);
        top3 = findViewById(R.id.top3);
        top4 = findViewById(R.id.top4);
        top5 = findViewById(R.id.top5);
        top1pisteet = findViewById(R.id.p1p);
        top2pisteet = findViewById(R.id.p2p);
        top3pisteet = findViewById(R.id.p3p);
        top4pisteet = findViewById(R.id.p4p);
        top5pisteet = findViewById(R.id.p5p);
        lista = findViewById(R.id.lista);
        pisteet = findViewById(R.id.pisteet);
        pisteesi = findViewById(R.id.pisteesi);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*TextView uusi = new TextView(getApplicationContext());
                uusi.setText("top" + x + "   ");
                uusi.setId(100 + x);
                lista.addView(uusi);*/

                int random = new Random().nextInt(100);
                /*TextView uudetpisteet = new TextView(getApplicationContext());
                uudetpisteet.setText(String.valueOf(random));
                uudetpisteet.setId(500 + x);
                pisteet.addView(uudetpisteet);*/
                pisteesi.setText("Pisteesi: " + random);

                String ykkonen = (String) top1pisteet.getText();
                String kakkonen = (String) top2pisteet.getText();
                String kolmonen = (String) top3pisteet.getText();
                String nelonen = (String) top4pisteet.getText();
                String vitonen = (String) top5pisteet.getText();

                if (random > Integer.parseInt(vitonen)){
                    top5pisteet.setText(String.valueOf(random));
                    if (random > Integer.parseInt(nelonen)){
                        top4pisteet.setText(String.valueOf(random));
                        top5pisteet.setText(String.valueOf(nelonen));
                        if (random > Integer.parseInt(kolmonen)){
                            top3pisteet.setText(String.valueOf(random));
                            top4pisteet.setText(String.valueOf(kolmonen));
                            if (random > Integer.parseInt(kakkonen)){
                                top2pisteet.setText(String.valueOf(random));
                                top3pisteet.setText(String.valueOf(kakkonen));
                            }
                        }
                    }
                }
                x++;
            }
        });

    }
}
