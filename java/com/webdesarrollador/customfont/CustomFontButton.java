package com.webdesarrollador.customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

public class CustomFontButton extends Button {

    public CustomFontButton(Context context) {
        super(context);

        CustomFontsUtil.aplicarCustomFont(this, context, null);
    }

    public CustomFontButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        CustomFontsUtil.aplicarCustomFont(this, context, attrs);
    }

    public CustomFontButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        CustomFontsUtil.aplicarCustomFont(this, context, attrs);
    }
}