package com.p7700g.p99005;

import android.graphics.Color;
import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: ColorParser.java */
/* loaded from: classes.dex */
public class fn0 implements mo0<Integer> {
    public static final fn0 a = new fn0();

    private fn0() {
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: b */
    public Integer a(po0 po0Var, float f) throws IOException {
        boolean z = po0Var.s() == po0.b.BEGIN_ARRAY;
        if (z) {
            po0Var.b();
        }
        double k = po0Var.k();
        double k2 = po0Var.k();
        double k3 = po0Var.k();
        double k4 = po0Var.s() == po0.b.NUMBER ? po0Var.k() : 1.0d;
        if (z) {
            po0Var.e();
        }
        if (k <= 1.0d && k2 <= 1.0d && k3 <= 1.0d) {
            k *= 255.0d;
            k2 *= 255.0d;
            k3 *= 255.0d;
            if (k4 <= 1.0d) {
                k4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) k4, (int) k, (int) k2, (int) k3));
    }
}