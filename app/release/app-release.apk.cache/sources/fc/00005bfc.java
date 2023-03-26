package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* compiled from: IconHelper.java */
/* loaded from: classes3.dex */
public class si2 {
    private si2() {
    }

    public static void a(@x1 TextInputLayout textInputLayout, @x1 CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = fk.r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                fk.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                fk.o(drawable, colorStateList);
            }
            if (mode != null) {
                fk.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static int[] b(@x1 TextInputLayout textInputLayout, @x1 CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public static void c(@x1 TextInputLayout textInputLayout, @x1 CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(b(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = fk.r(drawable).mutate();
        fk.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private static void d(@x1 CheckableImageButton checkableImageButton, @z1 View.OnLongClickListener onLongClickListener) {
        boolean J0 = sr.J0(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (J0 || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(J0);
        checkableImageButton.setPressable(J0);
        checkableImageButton.setLongClickable(z2);
        sr.Q1(checkableImageButton, z ? 1 : 2);
    }

    public static void e(@x1 CheckableImageButton checkableImageButton, @z1 View.OnClickListener onClickListener, @z1 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        d(checkableImageButton, onLongClickListener);
    }

    public static void f(@x1 CheckableImageButton checkableImageButton, @z1 View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d(checkableImageButton, onLongClickListener);
    }
}