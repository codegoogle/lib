package com.anythink.expressad.video.dynview.h.b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.anythink.expressad.foundation.h.s;

/* loaded from: classes2.dex */
public final class a {
    private static void a(View view, String str, String str2) {
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(str2));
            gradientDrawable.setCornerRadius(s.b(view.getContext(), 12.0f));
            gradientDrawable.setStroke(s.b(view.getContext(), 1.0f), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }

    public static void a(View view, float f, float f2, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null) {
            int[] iArr = new int[2];
            for (int i = 0; i < 2; i++) {
                iArr[i] = Color.parseColor(strArr[i]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(s.b(view.getContext(), f2));
            gradientDrawable.setStroke(s.b(view.getContext(), f), Color.parseColor(str));
            view.setBackgroundDrawable(gradientDrawable);
        }
    }
}