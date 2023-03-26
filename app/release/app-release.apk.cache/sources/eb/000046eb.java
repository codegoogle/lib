package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import com.p7700g.p99005.qk0;
import java.io.IOException;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public class hn0 implements mo0<qk0> {
    public static final hn0 a = new hn0();
    private static final po0.a b = po0.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", com.anythink.expressad.d.a.b.bH, "sw", "of");

    private hn0() {
    }

    @Override // com.p7700g.p99005.mo0
    /* renamed from: b */
    public qk0 a(po0 po0Var, float f) throws IOException {
        qk0.a aVar = qk0.a.CENTER;
        po0Var.d();
        qk0.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (po0Var.h()) {
            switch (po0Var.w(b)) {
                case 0:
                    str = po0Var.q();
                    break;
                case 1:
                    str2 = po0Var.q();
                    break;
                case 2:
                    f2 = (float) po0Var.k();
                    break;
                case 3:
                    int l = po0Var.l();
                    aVar2 = qk0.a.CENTER;
                    if (l <= aVar2.ordinal() && l >= 0) {
                        aVar2 = qk0.a.values()[l];
                        break;
                    }
                    break;
                case 4:
                    i = po0Var.l();
                    break;
                case 5:
                    f3 = (float) po0Var.k();
                    break;
                case 6:
                    f4 = (float) po0Var.k();
                    break;
                case 7:
                    i2 = rn0.d(po0Var);
                    break;
                case 8:
                    i3 = rn0.d(po0Var);
                    break;
                case 9:
                    f5 = (float) po0Var.k();
                    break;
                case 10:
                    z = po0Var.j();
                    break;
                default:
                    po0Var.z();
                    po0Var.A();
                    break;
            }
        }
        po0Var.f();
        return new qk0(str, str2, f2, aVar2, i, f3, f4, i2, i3, f5, z);
    }
}