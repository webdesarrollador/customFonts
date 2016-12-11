package com.webdesarrollador.customfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView miTexto = (TextView) findViewById(R.id.textoFuente);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Raleway-Regular.ttf");
        miTexto.setTypeface(typeface);
    }
}
