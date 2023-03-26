package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.p7700g.p99005.uk2;

/* compiled from: MaskEvaluator.java */
@e2(21)
/* loaded from: classes3.dex */
public class sk2 {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final rh2 d = rh2.k();
    private qh2 e;

    public void a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.a);
            return;
        }
        canvas.clipPath(this.b);
        canvas.clipPath(this.c, Region.Op.UNION);
    }

    public void b(float f, qh2 qh2Var, qh2 qh2Var2, RectF rectF, RectF rectF2, RectF rectF3, uk2.e eVar) {
        qh2 o = el2.o(qh2Var, qh2Var2, rectF, rectF3, eVar.d(), eVar.c(), f);
        this.e = o;
        this.d.d(o, 1.0f, rectF2, this.b);
        this.d.d(this.e, 1.0f, rectF3, this.c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.a.op(this.b, this.c, Path.Op.UNION);
        }
    }

    public qh2 c() {
        return this.e;
    }

    public Path d() {
        return this.a;
    }
}