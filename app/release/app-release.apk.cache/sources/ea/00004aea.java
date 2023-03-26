package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: DropShadowEffectParser.java */
/* loaded from: classes.dex */
public class jn0 {
    private static final po0.a a = po0.a.a("ef");
    private static final po0.a b = po0.a.a("nm", com.ironsource.sdk.controller.v.a);
    private yk0 c;
    private zk0 d;
    private zk0 e;
    private zk0 f;
    private zk0 g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(po0 po0Var, ei0 ei0Var) throws IOException {
        po0Var.d();
        String str = "";
        while (po0Var.h()) {
            int w = po0Var.w(b);
            if (w != 0) {
                char c = 1;
                if (w != 1) {
                    po0Var.z();
                    po0Var.A();
                } else {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 397447147:
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f = cn0.e(po0Var, ei0Var);
                            continue;
                        case 1:
                            this.d = cn0.f(po0Var, ei0Var, false);
                            continue;
                        case 2:
                            this.e = cn0.f(po0Var, ei0Var, false);
                            continue;
                        case 3:
                            this.c = cn0.c(po0Var, ei0Var);
                            continue;
                        case 4:
                            this.g = cn0.e(po0Var, ei0Var);
                            continue;
                        default:
                            po0Var.A();
                            continue;
                    }
                }
            } else {
                str = po0Var.q();
            }
        }
        po0Var.f();
    }

    @z1
    public in0 b(po0 po0Var, ei0 ei0Var) throws IOException {
        zk0 zk0Var;
        zk0 zk0Var2;
        zk0 zk0Var3;
        zk0 zk0Var4;
        while (po0Var.h()) {
            if (po0Var.w(a) != 0) {
                po0Var.z();
                po0Var.A();
            } else {
                po0Var.b();
                while (po0Var.h()) {
                    a(po0Var, ei0Var);
                }
                po0Var.e();
            }
        }
        yk0 yk0Var = this.c;
        if (yk0Var == null || (zk0Var = this.d) == null || (zk0Var2 = this.e) == null || (zk0Var3 = this.f) == null || (zk0Var4 = this.g) == null) {
            return null;
        }
        return new in0(yk0Var, zk0Var, zk0Var2, zk0Var3, zk0Var4);
    }
}