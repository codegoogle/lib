package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import com.greedygame.mystique.models.Alignment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class j33 extends View {
    @NotNull
    public static final a s = new a(null);
    private final int A;
    private final int B;
    @NotNull
    private Alignment C;
    private TextPaint t;
    @Nullable
    private StaticLayout u;
    private final int v;
    private final int w;
    private int x;
    private final int y;
    private final int z;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

    private final int getLines() {
        int i = this.x;
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(@NotNull Canvas canvas) {
        int height;
        float f;
        StaticLayout staticLayout;
        c25.p(canvas, "canvas");
        super.onDraw(canvas);
        StringBuilder G = wo1.G("Height: ");
        G.append(this.w);
        G.append(" | Static layout Height: ");
        StaticLayout staticLayout2 = this.u;
        c25.m(staticLayout2);
        G.append(staticLayout2.getHeight());
        xz2.c("AutScTV", G.toString());
        canvas.save();
        kz2 b2 = this.C.b();
        int i = b2 == null ? -1 : b.a[b2.ordinal()];
        if (i == 1) {
            int i2 = this.w;
            StaticLayout staticLayout3 = this.u;
            c25.m(staticLayout3);
            height = (i2 - staticLayout3.getHeight()) / 2;
        } else if (i != 2 && i == 3) {
            int i3 = this.w;
            StaticLayout staticLayout4 = this.u;
            c25.m(staticLayout4);
            height = i3 - staticLayout4.getHeight();
        } else {
            f = 0.0f;
            xz2.c("AutScTV", c25.C("X: ", Float.valueOf(f)));
            canvas.translate(0.0f, f);
            if (this.z != 0) {
                TextPaint textPaint = this.t;
                if (textPaint != null) {
                    textPaint.setStyle(Paint.Style.STROKE);
                    TextPaint textPaint2 = this.t;
                    if (textPaint2 != null) {
                        textPaint2.setStrokeJoin(Paint.Join.ROUND);
                        TextPaint textPaint3 = this.t;
                        if (textPaint3 != null) {
                            textPaint3.setStrokeMiter(10.0f);
                            TextPaint textPaint4 = this.t;
                            if (textPaint4 != null) {
                                textPaint4.setColor(this.z);
                                TextPaint textPaint5 = this.t;
                                if (textPaint5 != null) {
                                    textPaint5.setAlpha(this.B);
                                    TextPaint textPaint6 = this.t;
                                    if (textPaint6 != null) {
                                        textPaint6.setStrokeWidth(this.A);
                                        StaticLayout staticLayout5 = this.u;
                                        if (staticLayout5 != null) {
                                            staticLayout5.draw(canvas);
                                        }
                                        TextPaint textPaint7 = this.t;
                                        if (textPaint7 != null) {
                                            textPaint7.setStyle(Paint.Style.FILL);
                                            TextPaint textPaint8 = this.t;
                                            if (textPaint8 != null) {
                                                textPaint8.setAlpha(this.B);
                                                TextPaint textPaint9 = this.t;
                                                if (textPaint9 == null) {
                                                    c25.S("textPaint");
                                                    throw null;
                                                }
                                                textPaint9.setColor(this.y);
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
            staticLayout = this.u;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            }
            canvas.restore();
        }
        f = height;
        xz2.c("AutScTV", c25.C("X: ", Float.valueOf(f)));
        canvas.translate(0.0f, f);
        if (this.z != 0) {
        }
        staticLayout = this.u;
        if (staticLayout != null) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.v, this.w);
    }
}