package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* compiled from: CompoundButtonCompat.java */
/* loaded from: classes.dex */
public final class dt {
    private static final String a = "CompoundButtonCompat";
    private static Field b;
    private static boolean c;

    /* compiled from: CompoundButtonCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        @e1
        public static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        @e1
        public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        @e1
        public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* compiled from: CompoundButtonCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    private dt() {
    }

    @z1
    public static Drawable a(@x1 CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(compoundButton);
        }
        if (!c) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                b = null;
            }
        }
        return null;
    }

    @z1
    public static ColorStateList b(@x1 CompoundButton compoundButton) {
        return a.a(compoundButton);
    }

    @z1
    public static PorterDuff.Mode c(@x1 CompoundButton compoundButton) {
        return a.b(compoundButton);
    }

    public static void d(@x1 CompoundButton compoundButton, @z1 ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void e(@x1 CompoundButton compoundButton, @z1 PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}