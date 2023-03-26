package com.p7700g.p99005;

import android.graphics.PointF;
import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public class ao0 implements mo0<PointF> {
    public static final ao0 a = new ao0();

    private ao0() {
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: b */
    public PointF a(po0 po0Var, float f) throws IOException {
        po0.b s = po0Var.s();
        if (s == po0.b.BEGIN_ARRAY) {
            return rn0.e(po0Var, f);
        }
        if (s == po0.b.BEGIN_OBJECT) {
            return rn0.e(po0Var, f);
        }
        if (s == po0.b.NUMBER) {
            PointF pointF = new PointF(((float) po0Var.k()) * f, ((float) po0Var.k()) * f);
            while (po0Var.h()) {
                po0Var.A();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + s);
    }
}