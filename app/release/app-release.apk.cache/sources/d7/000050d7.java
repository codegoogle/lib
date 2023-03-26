package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: TextUtilsCompat.java */
/* loaded from: classes.dex */
public final class mo {
    private static final Locale a = new Locale("", "");
    private static final String b = "Arab";
    private static final String c = "Hebr";

    /* compiled from: TextUtilsCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    private mo() {
    }

    private static int a(@x1 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(@z1 Locale locale) {
        return a.a(locale);
    }

    @x1
    public static String c(@x1 String str) {
        return TextUtils.htmlEncode(str);
    }
}