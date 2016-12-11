package com.webdesarrollador.customfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomFontsUtil {

    public static void aplicarCustomFont(TextView customFontTextView, Context context, AttributeSet attrs) {

        TypedArray atributoArray = context.obtainStyledAttributes(attrs, R.styleable.CustomFontView);
        String fuente = atributoArray.getString(R.styleable.CustomFontView_fuente);
        int estilo = attrs.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", Typeface.NORMAL);

        Typeface customFont = selectTypeface(context, fuente, estilo);
        customFontTextView.setTypeface(customFont);
        atributoArray.recycle();
    }
    private static Typeface selectTypeface(Context context, String fuente, int estilo) {
        if (fuente.contentEquals("montserrat")) {
            switch (estilo) {
                case Typeface.NORMAL:
                    return FontCache.getTypeface("Montserrat-Regular.ttf", context);
                case Typeface.BOLD:
                    return FontCache.getTypeface("Montserrat-Bold.ttf", context);
                default:
                    return FontCache.getTypeface("Montserrat-Regular.ttf", context);
            }
        }
        else if (fuente.contentEquals("raleway")) {

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