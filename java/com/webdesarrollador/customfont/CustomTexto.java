package com.webdesarrollador.customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTexto extends TextView {

    public CustomTexto(Context context) {
        super(context);

        aplicarCustomFont(context);
    }

    public CustomTexto(Context context, AttributeSet attrs) {
        super(context, attrs);

        aplicarCustomFont(context);
    }

    public CustomTexto(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        aplicarCustomFont(context);
    }

    private void aplicarCustomFont(Context context) {
        //Typeface customFont = Typeface.createFromAsset(context.getAssets(),"Raleway-Regular.ttf");
        Typeface customFont = FontCache.getTypeface("Raleway-Regular.ttf", context);
        setTypeface(customFont);
    }
}