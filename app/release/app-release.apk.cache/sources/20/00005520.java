package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import com.p7700g.p99005.i2;

/* compiled from: TypefaceEmojiSpan.java */
@e2(19)
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ov extends jv {
    @z1
    private static Paint x;

    public ov(@x1 hv hvVar) {
        super(hvVar);
    }

    @x1
    private static Paint f() {
        if (x == null) {
            TextPaint textPaint = new TextPaint();
            x = textPaint;
            textPaint.setColor(fv.b().e());
            x.setStyle(Paint.Style.FILL);
        }
        return x;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@x1 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @p1(from = 0) int i, @p1(from = 0) int i2, float f, int i3, int i4, int i5, @x1 Paint paint) {
        if (fv.b().o()) {
            canvas.drawRect(f, i3, f + e(), i5, f());
        }
        c().a(canvas, f, i4, paint);
    }
}