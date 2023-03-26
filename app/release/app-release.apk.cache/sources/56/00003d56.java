package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* compiled from: CheckedTextViewCompat.java */
/* loaded from: classes.dex */
public final class ct {
    private static final String a = "CheckedTextViewCompat";

    /* compiled from: CheckedTextViewCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        private static Field a;
        private static boolean b;

        private a() {
        }

        @z1
        public static Drawable a(@x1 CheckedTextView checkedTextView) {
            if (!b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                b = true;
            }
            Field field = a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException unused2) {
                    a = null;
                }
            }
            return null;
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @z1
        public static Drawable a(@x1 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @z1
        public static ColorStateList a(@x1 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @z1
        public static PorterDuff.Mode b(@x1 CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void c(@x1 CheckedTextView checkedTextView, @z1 ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void d(@x1 CheckedTextView checkedTextView, @z1 PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    private ct() {
    }

    @z1
    public static Drawable a(@x1 CheckedTextView checkedTextView) {
        return b.a(checkedTextView);
    }

    @z1
    public static ColorStateList b(@x1 CheckedTextView checkedTextView) {
        return c.a(checkedTextView);
    }

    @z1
    public static PorterDuff.Mode c(@x1 CheckedTextView checkedTextView) {
        return c.b(checkedTextView);
    }

    public static void d(@x1 CheckedTextView checkedTextView, @z1 ColorStateList colorStateList) {
        c.c(checkedTextView, colorStateList);
    }

    public static void e(@x1 CheckedTextView checkedTextView, @z1 PorterDuff.Mode mode) {
        c.d(checkedTextView, mode);
    }
}