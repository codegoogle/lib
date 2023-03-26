package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class a43 extends AppCompatTextView {
    @NotNull
    public static final a s = new a(null);
    private final int A;
    private final int B;
    private final int C;
    private final boolean D;
    private final int E;
    private final boolean F;
    @Nullable
    private final Typeface G;
    @NotNull
    private jz2 H;
    @NotNull
    private kz2 I;
    @Nullable
    private String t;
    private TextPaint u;
    @Nullable
    private StaticLayout v;
    private int w;
    private final float x;
    private final float y;
    private float z;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: com.p7700g.p99005.a43$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0142a {
            public static final /* synthetic */ int[] a;

            static {
                jz2.values();
                int[] iArr = new int[3];
                iArr[jz2.CENTER.ordinal()] = 1;
                iArr[jz2.LEFT.ordinal()] = 2;
                iArr[jz2.RIGHT.ordinal()] = 3;
                a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final StaticLayout b(String str, TextPaint textPaint, int i, jz2 jz2Var) {
            Layout.Alignment alignment;
            int i2 = C0142a.a[jz2Var.ordinal()];
            if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i2 == 2) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 != 3) {
                throw new wo4();
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            Layout.Alignment alignment2 = alignment;
            if (Build.VERSION.SDK_INT >= 23) {
                StaticLayout build = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
                c25.o(build, "{\n                StaticLayout.Builder.obtain(text, 0, text.length, textPaint, width)\n                        .setAlignment(alignment)\n                        .setLineSpacing(0f, 1.0f) // multiplier, add\n                        .setIncludePad(false)\n                        .build()\n            }");
                return build;
            }
            return new StaticLayout(str, textPaint, i, alignment2, 1.0f, 0.0f, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(StaticLayout staticLayout, int i, String str) {
            if (i >= staticLayout.getLineCount()) {
                i = staticLayout.getLineCount();
            }
            int lineEnd = staticLayout.getLineEnd(i - 1) - 4;
            if (lineEnd < 0 || lineEnd >= str.length()) {
                return "";
            }
            String substring = str.substring(0, lineEnd);
            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String C = c25.C(substring, "...");
            xz2.c("AutScTV", c25.C("Changed Text: ", C));
            return C;
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            kz2.values();
            int[] iArr = new int[3];
            iArr[kz2.CENTER.ordinal()] = 1;
            iArr[kz2.TOP.ordinal()] = 2;
            iArr[kz2.BOTTOM.ordinal()] = 3;
            a = iArr;
        }
    }

    private final int e(int i, int i2, int i3, int i4) {
        if (i == i2) {
            xz2.c("AutScTV", "Mid reached 2");
            return i;
        }
        int i5 = (i + i2) / 2;
        TextPaint textPaint = this.u;
        if (textPaint != null) {
            textPaint.setTextSize(i5);
            a aVar = s;
            String str = this.t;
            c25.m(str);
            TextPaint textPaint2 = this.u;
            if (textPaint2 != null) {
                this.v = aVar.b(str, textPaint2, getWidth(), this.H);
                String[] strArr = new String[1];
                StringBuilder J = wo1.J("Min: ", i, " Max :", i2, " Mid: ");
                J.append(i5);
                J.append(" Max lines: ");
                J.append(this.w);
                J.append(" StaticLayout height: ");
                StaticLayout staticLayout = this.v;
                J.append(staticLayout == null ? null : Integer.valueOf(staticLayout.getHeight()));
                J.append(" StaticLayout line: ");
                StaticLayout staticLayout2 = this.v;
                J.append(staticLayout2 == null ? null : Integer.valueOf(staticLayout2.getLineCount()));
                strArr[0] = J.toString();
                xz2.c("AutScTV", strArr);
                if (!this.F) {
                    StaticLayout staticLayout3 = this.v;
                    c25.m(staticLayout3);
                    if (staticLayout3.getLineCount() > getLines()) {
                        return g(this, i, i5, 0, 0, 8, null);
                    }
                }
                StaticLayout staticLayout4 = this.v;
                c25.m(staticLayout4);
                if (staticLayout4.getHeight() > i4) {
                    if (j(i5, i2)) {
                        if (this.D) {
                            StaticLayout staticLayout5 = this.v;
                            c25.m(staticLayout5);
                            int i6 = this.w;
                            String str2 = this.t;
                            c25.m(str2);
                            String c = aVar.c(staticLayout5, i6, str2);
                            this.t = c;
                            if (b95.L1(c, "...", false, 2, null)) {
                                return 0;
                            }
                            return g(this, (int) this.y, (int) this.x, i3, 0, 8, null);
                        }
                        return g(this, i5 / 2, i5, i3, 0, 8, null);
                    }
                    return g(this, i, i5, 0, 0, 8, null);
                }
                StaticLayout staticLayout6 = this.v;
                c25.m(staticLayout6);
                if (staticLayout6.getHeight() < i4) {
                    int i7 = i3 + 1;
                    if (j(i5, i2)) {
                        if (i7 >= 3) {
                            return i5;
                        }
                        if (!i(i5)) {
                            return g(this, i, i5, i7, 0, 8, null);
                        }
                    }
                    return g(this, i5, i2, i7, 0, 8, null);
                }
                return i5;
            }
            c25.S("textPaint");
            throw null;
        }
        c25.S("textPaint");
        throw null;
    }

    private final int f(int i, int i2, boolean z, int i3) {
        if (i == i2) {
            xz2.c("AutScTV", "Mid reached 1");
            return i;
        }
        int i4 = (i + i2) / 2;
        setTextAlignment(4);
        TextPaint textPaint = this.u;
        if (textPaint != null) {
            textPaint.setTextSize(i4);
            a aVar = s;
            String str = this.t;
            c25.m(str);
            TextPaint textPaint2 = this.u;
            if (textPaint2 != null) {
                this.v = aVar.b(str, textPaint2, getWidth(), this.H);
                String[] strArr = new String[1];
                StringBuilder J = wo1.J("Min: ", i, " Mid :", i4, " Max: ");
                J.append(i2);
                J.append(" Max lines: ");
                J.append(this.w);
                J.append(" Layout height: ");
                StaticLayout staticLayout = this.v;
                J.append(staticLayout == null ? null : Integer.valueOf(staticLayout.getHeight()));
                J.append(" Lines: ");
                StaticLayout staticLayout2 = this.v;
                J.append(staticLayout2 == null ? null : Integer.valueOf(staticLayout2.getLineCount()));
                strArr[0] = J.toString();
                xz2.c("AutScTV", strArr);
                StaticLayout staticLayout3 = this.v;
                c25.m(staticLayout3);
                if (staticLayout3.getLineCount() > this.w) {
                    StaticLayout staticLayout4 = this.v;
                    c25.m(staticLayout4);
                    if (staticLayout4.getHeight() < getHeight()) {
                        if (j(i4, i2)) {
                            if (this.D) {
                                StaticLayout staticLayout5 = this.v;
                                c25.m(staticLayout5);
                                int i5 = this.w;
                                String str2 = this.t;
                                c25.m(str2);
                                String c = aVar.c(staticLayout5, i5, str2);
                                this.t = c;
                                if (b95.L1(c, "...", false, 2, null)) {
                                    return 0;
                                }
                                return f((int) this.y, (int) this.x, false, 0);
                            }
                            return f(i4 / 2, i4, true, i3);
                        }
                        return f(i, i4, false, i3);
                    }
                    StaticLayout staticLayout6 = this.v;
                    c25.m(staticLayout6);
                    if (staticLayout6.getHeight() > getHeight()) {
                        if (j(i4, i2)) {
                            if (this.D) {
                                StaticLayout staticLayout7 = this.v;
                                c25.m(staticLayout7);
                                int i6 = this.w;
                                String str3 = this.t;
                                c25.m(str3);
                                String c2 = aVar.c(staticLayout7, i6, str3);
                                this.t = c2;
                                if (b95.L1(c2, "...", false, 2, null)) {
                                    return 0;
                                }
                                return f((int) this.y, (int) this.x, false, 0);
                            }
                            return f(i4 / 2, i4, true, i3);
                        }
                        return f(i, i4, true, i3);
                    }
                    return f(i, i4, true, i3);
                }
                StaticLayout staticLayout8 = this.v;
                c25.m(staticLayout8);
                if (staticLayout8.getLineCount() < this.w) {
                    int i7 = i3 + 1;
                    StaticLayout staticLayout9 = this.v;
                    c25.m(staticLayout9);
                    if (staticLayout9.getHeight() < getHeight()) {
                        if (i7 >= 3) {
                            xz2.c("AutScTV", "Reached Three iterations");
                            return i4;
                        } else if (z) {
                            return f(i, i4, false, i7);
                        } else {
                            return f(i4, i2, false, i7);
                        }
                    }
                    StaticLayout staticLayout10 = this.v;
                    c25.m(staticLayout10);
                    if (staticLayout10.getHeight() > getHeight()) {
                        if (j(i4, i2)) {
                            if (this.D) {
                                StaticLayout staticLayout11 = this.v;
                                c25.m(staticLayout11);
                                int i8 = this.w;
                                String str4 = this.t;
                                c25.m(str4);
                                String c3 = aVar.c(staticLayout11, i8, str4);
                                this.t = c3;
                                if (b95.L1(c3, "...", false, 2, null)) {
                                    return 0;
                                }
                                return f((int) this.y, (int) this.x, false, 0);
                            }
                            return f(i4 / 2, i4, true, i7);
                        }
                        return f(i, i4, true, i7);
                    }
                    return i4;
                }
                int i9 = i3 + 1;
                StaticLayout staticLayout12 = this.v;
                c25.m(staticLayout12);
                if (staticLayout12.getHeight() > getHeight()) {
                    if (i9 >= 3) {
                        return f(i4 / 2, i4, true, i9);
                    }
                    return f(i4, i2, true, i9);
                }
                int i10 = i9 + 1;
                if (i10 >= 3) {
                    StaticLayout staticLayout13 = this.v;
                    c25.m(staticLayout13);
                    return e(i4, i2, 0, staticLayout13.getHeight());
                }
                return f(i4, i2, true, i10);
            }
            c25.S("textPaint");
            throw null;
        }
        c25.S("textPaint");
        throw null;
    }

    public static /* synthetic */ int g(a43 a43Var, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = a43Var.getHeight();
        }
        return a43Var.e(i, i2, i3, i4);
    }

    private final int getLines() {
        int i = this.w;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    private final void h() {
        int f;
        TextPaint textPaint = new TextPaint();
        this.u = textPaint;
        textPaint.setAntiAlias(true);
        TextPaint textPaint2 = this.u;
        if (textPaint2 != null) {
            textPaint2.setTextSize(this.x);
            TextPaint textPaint3 = this.u;
            if (textPaint3 != null) {
                textPaint3.setColor(this.A);
                Typeface typeface = this.G;
                if (typeface != null) {
                    TextPaint textPaint4 = this.u;
                    if (textPaint4 == null) {
                        c25.S("textPaint");
                        throw null;
                    }
                    textPaint4.setTypeface(typeface);
                }
                int i = this.E;
                if (i != -1) {
                    TextPaint textPaint5 = this.u;
                    if (textPaint5 == null) {
                        c25.S("textPaint");
                        throw null;
                    }
                    textPaint5.setAlpha(i);
                }
                if (this.F) {
                    f = g(this, (int) this.y, (int) this.x, 0, 0, 8, null);
                } else {
                    f = this.w >= 1 ? f((int) this.y, (int) this.x, false, 0) : g(this, (int) this.y, (int) this.x, 0, 0, 8, null);
                }
                float f2 = f;
                this.z = f2;
                xz2.c("AutScTV", c25.C("Text size: ", Float.valueOf(f2)));
                if (this.z < this.y) {
                    xz2.c("AutScTV", "[ERROR] Textsize smaller than the min font size");
                    return;
                }
                return;
            }
            c25.S("textPaint");
            throw null;
        }
        c25.S("textPaint");
        throw null;
    }

    private final boolean i(int i) {
        return this.y == ((float) i);
    }

    private final boolean j(int i, int i2) {
        return i == (i2 + i) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(@NotNull Canvas canvas) {
        int height;
        float f;
        StaticLayout staticLayout;
        c25.p(canvas, "canvas");
        super.onDraw(canvas);
        if (this.v == null) {
            return;
        }
        StringBuilder G = wo1.G("Height: ");
        G.append(getHeight());
        G.append(" | Static layout Height: ");
        StaticLayout staticLayout2 = this.v;
        c25.m(staticLayout2);
        G.append(staticLayout2.getHeight());
        xz2.c("AutScTV", G.toString());
        canvas.save();
        int i = b.a[this.I.ordinal()];
        if (i == 1) {
            int height2 = getHeight();
            StaticLayout staticLayout3 = this.v;
            c25.m(staticLayout3);
            height = (height2 - staticLayout3.getHeight()) / 2;
        } else if (i == 2) {
            f = 0.0f;
            xz2.c("AutScTV", c25.C("Y: ", Float.valueOf(f)));
            canvas.translate(0.0f, f);
            if (this.B != 0) {
                TextPaint textPaint = this.u;
                if (textPaint != null) {
                    textPaint.setStyle(Paint.Style.STROKE);
                    TextPaint textPaint2 = this.u;
                    if (textPaint2 != null) {
                        textPaint2.setStrokeJoin(Paint.Join.ROUND);
                        TextPaint textPaint3 = this.u;
                        if (textPaint3 != null) {
                            textPaint3.setStrokeMiter(10.0f);
                            TextPaint textPaint4 = this.u;
                            if (textPaint4 != null) {
                                textPaint4.setColor(this.B);
                                TextPaint textPaint5 = this.u;
                                if (textPaint5 != null) {
                                    textPaint5.setAlpha(this.E);
                                    TextPaint textPaint6 = this.u;
                                    if (textPaint6 != null) {
                                        textPaint6.setStrokeWidth(this.C);
                                        StaticLayout staticLayout4 = this.v;
                                        if (staticLayout4 != null) {
                                            staticLayout4.draw(canvas);
                                        }
                                        TextPaint textPaint7 = this.u;
                                        if (textPaint7 != null) {
                                            textPaint7.setStyle(Paint.Style.FILL);
                                            TextPaint textPaint8 = this.u;
                                            if (textPaint8 != null) {
                                                textPaint8.setAlpha(this.E);
                                                TextPaint textPaint9 = this.u;
                                                if (textPaint9 == null) {
                                                    c25.S("textPaint");
                                                    throw null;
                                                }
                                                textPaint9.setColor(this.A);
                                            } else {
                                                c25.S("textPaint");
                                                throw null;
                                            }
                                        } else {
                                            c25.S("textPaint");
                                            throw null;
                                        }
                                    } else {
                                        c25.S("textPaint");
                                        throw null;
                                    }
                                } else {
                                    c25.S("textPaint");
                                    throw null;
                                }
                            } else {
                                c25.S("textPaint");
                                throw null;
                            }
                        } else {
                            c25.S("textPaint");
                            throw null;
                        }
                    } else {
                        c25.S("textPaint");
                        throw null;
                    }
                } else {
                    c25.S("textPaint");
                    throw null;
                }
            }
            staticLayout = this.v;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
            canvas.restore();
        } else if (i != 3) {
            throw new wo4();
        } else {
            int height3 = getHeight();
            StaticLayout staticLayout5 = this.v;
            c25.m(staticLayout5);
            height = height3 - staticLayout5.getHeight();
        }
        f = height;
        xz2.c("AutScTV", c25.C("Y: ", Float.valueOf(f)));
        canvas.translate(0.0f, f);
        if (this.B != 0) {
        }
        staticLayout = this.v;
        if (staticLayout != null) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        xz2.c("AutScTV", "Size changed TV: " + i + ':' + i2);
        StringBuilder G = wo1.G("Width:Height: ");
        G.append(getWidth());
        G.append(':');
        G.append(getHeight());
        xz2.c("AutScTV", G.toString());
        h();
    }
}