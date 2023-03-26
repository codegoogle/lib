package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: FontParser.java */
/* loaded from: classes.dex */
public class mn0 {
    private static final po0.a a = po0.a.a("fFamily", "fName", "fStyle", "ascent");

    private mn0() {
    }

    public static rk0 a(po0 po0Var) throws IOException {
        po0Var.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
            } else if (w == 1) {
                str2 = po0Var.q();
            } else if (w == 2) {
                str3 = po0Var.q();
            } else if (w != 3) {
                po0Var.z();
                po0Var.A();
            } else {
                f = (float) po0Var.k();
            }
        }
        po0Var.f();
        return new rk0(str, str2, str3, f);
    }
}