package com.p7700g.p99005;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
public class pv implements Spannable {
    private boolean s = false;
    @x1
    private Spannable t;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    /* loaded from: classes.dex */
    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof fo;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // com.p7700g.p99005.pv.b
        public boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof fo);
        }
    }

    public pv(@x1 Spannable spannable) {
        this.t = spannable;
    }

    private void a() {
        Spannable spannable = this.t;
        if (!this.s && c().a(spannable)) {
            this.t = new SpannableString(spannable);
        }
        this.s = true;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public Spannable b() {
        return this.t;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.t.charAt(i);
    }

    @Override // java.lang.CharSequence
    @e2(api = 24)
    @x1
    public IntStream chars() {
        return a.a(this.t);
    }

    @Override // java.lang.CharSequence
    @e2(api = 24)
    @x1
    public IntStream codePoints() {
        return a.b(this.t);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.t.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.t.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.t.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.t.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.t.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.t.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.t.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.t.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @x1
    public CharSequence subSequence(int i, int i2) {
        return this.t.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @x1
    public String toString() {
        return this.t.toString();
    }

    public pv(@x1 Spanned spanned) {
        this.t = new SpannableString(spanned);
    }

    public pv(@x1 CharSequence charSequence) {
        this.t = new SpannableString(charSequence);
    }
}