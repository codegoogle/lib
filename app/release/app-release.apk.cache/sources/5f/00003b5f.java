package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* compiled from: HtmlCompat.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class bo {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    public static final int i = 256;
    public static final int j = 0;
    public static final int k = 63;

    /* compiled from: HtmlCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Spanned a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        @e1
        public static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        @e1
        public static String c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    private bo() {
    }

    @x1
    public static Spanned a(@x1 String str, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(str, i2);
        }
        return Html.fromHtml(str);
    }

    @x1
    public static Spanned b(@x1 String str, int i2, @z1 Html.ImageGetter imageGetter, @z1 Html.TagHandler tagHandler) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.b(str, i2, imageGetter, tagHandler);
        }
        return Html.fromHtml(str, imageGetter, tagHandler);
    }

    @x1
    public static String c(@x1 Spanned spanned, int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.c(spanned, i2);
        }
        return Html.toHtml(spanned);
    }
}