package com.example.newsappandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.newsappandroid.businessLogic.Nyhedsindslag;

public class MainActivity extends AppCompatActivity {

    TextView overskriftTekst, teaserTekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        overskriftTekst = findViewById(R.id.overskriftTekst);
        teaserTekst = findViewById(R.id.teaserTekst);

        Nyhedsindslag nyhedsindslag = new Nyhedsindslag();
        nyhedsindslag.setOverskrift("Mit Kæreste Eje Speciale - Kähleer samling");
        nyhedsindslag.setTeasertekst("Sille og Stefan er taget på tur i 2 specialprogrammer af Mit kæreste eje og denne gang besøger de den store...");
        nyhedsindslag.setVideoLink("linkVideo.com");
        nyhedsindslag.setBilledeLink("linkBillede.jpg");
        nyhedsindslag.setUdgivelsesdato("07-04-2021");
        nyhedsindslag.setUdgivetEllerEj(true);
        nyhedsindslag.setSlettetEllerEj(false);

        overskriftTekst.setText(nyhedsindslag.getOverskrift());
        teaserTekst.setText(nyhedsindslag.getTeasertekst());

        Log.d("Debug",
                nyhedsindslag.getOverskrift()
            +nyhedsindslag.getTeasertekst()
            +nyhedsindslag.getVideoLink()
            +nyhedsindslag.getVideoLink()
            +nyhedsindslag.getUdgivetEllerEj()
            +nyhedsindslag.getSlettetEllerEj());

        Nyhedsindslag nyhedsindslag2 = new Nyhedsindslag("Overskrift", "Teaser...", "billede.jpg");

        Log.d("Debug", nyhedsindslag2.getOverskrift()
                +nyhedsindslag2.getTeasertekst()
                +nyhedsindslag2.getBilledeLink());

        //Assignment 3 //TODO

        TextView[] textviewNews = new TextView[10];

        for (int i = 1; i < 10; i++) {

            textviewNews[i] = new TextView((this));
            textviewNews[i].setText("overskrift"+i);
        }
    }
}