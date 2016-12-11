package com.webdesarrollador.customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTexto2 extends TextView {

    public CustomTexto2(Context context, AttributeSet attrs) {
        super(context, attrs);

        aplicarCustomFont(context,attrs);
    }

    public CustomTexto2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        aplicarCustomFont(context,attrs);
    }
    private void aplicarCustomFont(Context context, AttributeSet attrs) {

        int textStyle = attrs.getAttributeIntValue("http://schemas.android.com/apk/res/android", "textStyle", Typeface.NORMAL);
        Typeface customFont = selectTypeface(context, textStyle);
        setTypeface(customFont);
    }
    private Typeface selectTypeface(Context context, int textStyle) {

        switch (textStyle) {
            case Typeface.NORMAL:
                return FontCache.getTypeface("Raleway-Regular.ttf", context);
            case Typeface.ITALIC:
                return FontCache.getTypeface("Raleway-Italic.ttf", context);
            default:
                return FontCache.getTypeface("Raleway-Regular.ttf", context);
        }
    }
}