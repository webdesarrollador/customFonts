package com.webdesarrollador.customfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomFontView extends TextView {

    public CustomFontView(Context context, AttributeSet attrs) {
        super(context, attrs);

        aplicarCustomFont(context,attrs);
    }

    public CustomFontView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        aplicarCustomFont(context,attrs);
    }
    private void aplicarCustomFont(Context context, AttributeSet attrs) {

        TypedArray atributoArray = context.obtainStyledAttributes(attrs, R.styleable.CustomFontView);
        String fuente = atributoArray.getString(R.styleable.CustomFontView_fuente);
        int estilo = attrs.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", Typeface.NORMAL);
        Typeface customFont = selectTypeface(context, fuente, estilo);
        setTypeface(customFont);
        atributoArray.recycle();
    }
    private Typeface selectTypeface(Context context, String fuente, int estilo) {
        if (fuente.contentEquals("montserrat")) {
            switch (estilo) {
                case Typeface.NORMAL: // regular
                    return FontCache.getTypeface("Montserrat-Regular.ttf", context);
                case Typeface.BOLD: // bold
                    return FontCache.getTypeface("Montserrat-Bold.ttf", context);
                default:
                    return FontCache.getTypeface("Montserrat-Regular.ttf", context);
            }
        }
        else if (fuente.contentEquals("raleway")) {
              /*
              information about the TextView textStyle:
              http://developer.android.com/reference/android/R.styleable.html#TextView_textStyle
              */
            switch (estilo) {
                case Typeface.NORMAL:
                    return FontCache.getTypeface("Raleway-Regular.ttf", context);
                case Typeface.ITALIC:
                    return FontCache.getTypeface("Raleway-Italic.ttf", context);
                default:
                    return FontCache.getTypeface("Raleway-Regular.ttf", context);
            }
        }
        else {
            return null;
        }
    }
}