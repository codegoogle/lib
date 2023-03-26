package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class fo implements Spannable {
    private static final char s = '\n';
    private static final Object t = new Object();
    @x1
    @k1("sLock")
    private static Executor u;
    @x1
    private final Spannable v;
    @x1
    private final a w;
    @x1
    private final int[] x;
    @z1
    private final PrecomputedText y;

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static class b extends FutureTask<fo> {

        /* compiled from: PrecomputedTextCompat.java */
        /* loaded from: classes.dex */
        public static class a implements Callable<fo> {
            private a a;
            private CharSequence b;

            public a(@x1 a aVar, @x1 CharSequence charSequence) {
                this.a = aVar;
                this.b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public fo call() throws Exception {
                return fo.a(this.b, this.a);
            }
        }

        public b(@x1 a aVar, @x1 CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    private fo(@x1 CharSequence charSequence, @x1 a aVar, @x1 int[] iArr) {
        this.v = new SpannableString(charSequence);
        this.w = aVar;
        this.x = iArr;
        this.y = null;
    }

    @SuppressLint({"WrongConstant"})
    public static fo a(@x1 CharSequence charSequence, @x1 a aVar) {
        PrecomputedText.Params params;
        jp.l(charSequence);
        jp.l(aVar);
        try {
            in.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.e) != null) {
                return new fo(PrecomputedText.create(charSequence, params), aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, (char) s, i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), Integer.MAX_VALUE).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            } else {
                new StaticLayout(charSequence, aVar.e(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new fo(charSequence, aVar, iArr);
        } finally {
            in.d();
        }
    }

    @q2
    public static Future<fo> g(@x1 CharSequence charSequence, @x1 a aVar, @z1 Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (t) {
                if (u == null) {
                    u = Executors.newFixedThreadPool(1);
                }
                executor = u;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @p1(from = 0)
    public int b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.y.getParagraphCount();
        }
        return this.x.length;
    }

    @p1(from = 0)
    public int c(@p1(from = 0) int i) {
        jp.g(i, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.y.getParagraphEnd(i);
        }
        return this.x[i];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.v.charAt(i);
    }

    @p1(from = 0)
    public int d(@p1(from = 0) int i) {
        jp.g(i, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.y.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.x[i - 1];
    }

    @x1
    public a e() {
        return this.w;
    }

    @e2(28)
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public PrecomputedText f() {
        Spannable spannable = this.v;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.v.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.v.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.v.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.y.getSpans(i, i2, cls);
        }
        return (T[]) this.v.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.v.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.v.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.y.removeSpan(obj);
                return;
            } else {
                this.v.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.y.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.v.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.v.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @x1
    public String toString() {
        return this.v.toString();
    }

    @e2(28)
    private fo(@x1 PrecomputedText precomputedText, @x1 a aVar) {
        this.v = precomputedText;
        this.w = aVar;
        this.x = null;
        this.y = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* loaded from: classes.dex */
    public static final class a {
        @x1
        private final TextPaint a;
        @z1
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        public final PrecomputedText.Params e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: com.p7700g.p99005.fo$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0173a {
            @x1
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public C0173a(@x1 TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            @x1
            public a a() {
                return new a(this.a, this.b, this.c, this.d);
            }

            @e2(23)
            public C0173a b(int i) {
                this.c = i;
                return this;
            }

            @e2(23)
            public C0173a c(int i) {
                this.d = i;
                return this;
            }

            @e2(18)
            public C0173a d(@x1 TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(@x1 TextPaint textPaint, @x1 TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.e = null;
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        @i2({i2.a.LIBRARY_GROUP_PREFIX})
        public boolean a(@x1 a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i < 23 || (this.c == aVar.b() && this.d == aVar.c())) && this.a.getTextSize() == aVar.e().getTextSize() && this.a.getTextScaleX() == aVar.e().getTextScaleX() && this.a.getTextSkewX() == aVar.e().getTextSkewX() && this.a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.a.getFlags() == aVar.e().getFlags()) {
                if (i >= 24) {
                    if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                        return false;
                    }
                } else if (!this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                    return false;
                }
                return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        @e2(23)
        public int b() {
            return this.c;
        }

        @e2(23)
        public int c() {
            return this.d;
        }

        @e2(18)
        @z1
        public TextDirectionHeuristic d() {
            return this.b;
        }

        @x1
        public TextPaint e() {
            return this.a;
        }

        public boolean equals(@z1 Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return ep.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            return ep.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder G = wo1.G("textSize=");
            G.append(this.a.getTextSize());
            sb.append(G.toString());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            StringBuilder G2 = wo1.G(", letterSpacing=");
            G2.append(this.a.getLetterSpacing());
            sb.append(G2.toString());
            sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder G3 = wo1.G(", textLocale=");
                G3.append(this.a.getTextLocales());
                sb.append(G3.toString());
            } else {
                StringBuilder G4 = wo1.G(", textLocale=");
                G4.append(this.a.getTextLocale());
                sb.append(G4.toString());
            }
            StringBuilder G5 = wo1.G(", typeface=");
            G5.append(this.a.getTypeface());
            sb.append(G5.toString());
            if (i >= 26) {
                StringBuilder G6 = wo1.G(", variationSettings=");
                G6.append(this.a.getFontVariationSettings());
                sb.append(G6.toString());
            }
            StringBuilder G7 = wo1.G(", textDir=");
            G7.append(this.b);
            sb.append(G7.toString());
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        @e2(28)
        public a(@x1 PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}