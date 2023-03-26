package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* compiled from: EditorInfoCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class ts {
    public static final int a = 16777216;
    public static final int b = Integer.MIN_VALUE;
    private static final String[] c = new String[0];
    private static final String d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";
    private static final String g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";
    private static final String h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";
    @r2
    public static final int i = 2048;
    @r2
    public static final int j = 1024;

    /* compiled from: EditorInfoCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static CharSequence a(@x1 EditorInfo editorInfo, int i) {
            return editorInfo.getInitialSelectedText(i);
        }

        public static CharSequence b(@x1 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextAfterCursor(i, i2);
        }

        public static CharSequence c(@x1 EditorInfo editorInfo, int i, int i2) {
            return editorInfo.getInitialTextBeforeCursor(i, i2);
        }

        public static void d(@x1 EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    @x1
    public static String[] a(@x1 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : c;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return c;
        }
        String[] stringArray = bundle.getStringArray(d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(e);
        }
        return stringArray != null ? stringArray : c;
    }

    @z1
    public static CharSequence b(@x1 EditorInfo editorInfo, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a(editorInfo, i2);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int min = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int max = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i3 = editorInfo.extras.getInt(g);
        int i4 = editorInfo.extras.getInt(h);
        int i5 = max - min;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i4 - i3 != i5 || (charSequence = editorInfo.extras.getCharSequence(f)) == null) {
            return null;
        }
        if ((i2 & 1) != 0) {
            return charSequence.subSequence(i3, i4);
        }
        return TextUtils.substring(charSequence, i3, i4);
    }

    @z1
    public static CharSequence c(@x1 EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.b(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(h);
        int min = Math.min(i2, charSequence.length() - i4);
        if ((i3 & 1) != 0) {
            return charSequence.subSequence(i4, min + i4);
        }
        return TextUtils.substring(charSequence, i4, min + i4);
    }

    @z1
    public static CharSequence d(@x1 EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return a.c(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(g);
        int min = Math.min(i2, i4);
        if ((i3 & 1) != 0) {
            return charSequence.subSequence(i4 - min, i4);
        }
        return TextUtils.substring(charSequence, i4 - min, i4);
    }

    public static int e(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(d);
        boolean containsKey2 = editorInfo.extras.containsKey(e);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        return containsKey2 ? 2 : 0;
    }

    private static boolean f(CharSequence charSequence, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i2));
        }
        return Character.isLowSurrogate(charSequence.charAt(i2));
    }

    private static boolean g(int i2) {
        int i3 = i2 & 4095;
        return i3 == 129 || i3 == 225 || i3 == 18;
    }

    public static void h(@x1 EditorInfo editorInfo, @z1 String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(d, strArr);
        editorInfo.extras.putStringArray(e, strArr);
    }

    public static void i(@x1 EditorInfo editorInfo, @x1 CharSequence charSequence, int i2) {
        jp.l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, i2);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 - i2 : i3 - i2;
        int i6 = i3 > i4 ? i3 - i2 : i4 - i2;
        int length = charSequence.length();
        if (i2 >= 0 && i5 >= 0 && i6 <= length) {
            if (g(editorInfo.inputType)) {
                k(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                k(editorInfo, charSequence, i5, i6);
                return;
            } else {
                l(editorInfo, charSequence, i5, i6);
                return;
            }
        }
        k(editorInfo, null, 0, 0);
    }

    public static void j(@x1 EditorInfo editorInfo, @x1 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.d(editorInfo, charSequence, 0);
        } else {
            i(editorInfo, charSequence, 0);
        }
    }

    private static void k(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(g, i2);
        editorInfo.extras.putInt(h, i3);
    }

    private static void l(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        CharSequence subSequence;
        int i4 = i3 - i2;
        int i5 = i4 > 1024 ? 0 : i4;
        int i6 = 2048 - i5;
        int min = Math.min(charSequence.length() - i3, i6 - Math.min(i2, (int) (i6 * 0.8d)));
        int min2 = Math.min(i2, i6 - min);
        int i7 = i2 - min2;
        if (f(charSequence, i7, 0)) {
            i7++;
            min2--;
        }
        if (f(charSequence, (i3 + min) - 1, 1)) {
            min--;
        }
        int i8 = min2 + i5 + min;
        if (i5 != i4) {
            subSequence = TextUtils.concat(charSequence.subSequence(i7, i7 + min2), charSequence.subSequence(i3, min + i3));
        } else {
            subSequence = charSequence.subSequence(i7, i8 + i7);
        }
        int i9 = min2 + 0;
        k(editorInfo, subSequence, i9, i5 + i9);
    }
}