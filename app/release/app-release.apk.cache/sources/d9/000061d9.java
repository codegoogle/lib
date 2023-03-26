package com.p7700g.p99005;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: LPaint.java */
/* loaded from: classes.dex */
public class vi0 extends Paint {
    public vi0() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((bp0.d(i, 0, 255) << 24) | (getColor() & sr.s));
            return;
        }
        super.setAlpha(bp0.d(i, 0, 255));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@x1 LocaleList localeList) {
    }

    public vi0(int i) {
        super(i);
    }

    public vi0(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public vi0(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}