package com.p7700g.p99005;

import android.os.Build;
import android.text.TextPaint;
import com.p7700g.p99005.fv;
import com.p7700g.p99005.i2;

/* compiled from: DefaultGlyphChecker.java */
@i2({i2.a.LIBRARY})
@o0
/* loaded from: classes.dex */
public class ev implements fv.e {
    private static final int a = 10;
    private static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();
    private final TextPaint c;

    public ev() {
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // com.p7700g.p99005.fv.e
    public boolean a(@x1 CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 || i3 <= i4) {
            StringBuilder b2 = b();
            b2.setLength(0);
            while (i < i2) {
                b2.append(charSequence.charAt(i));
                i++;
            }
            return jj.a(this.c, b2.toString());
        }
        return false;
    }
}