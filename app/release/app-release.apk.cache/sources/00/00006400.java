package com.p7700g.p99005;

import com.p7700g.p99005.ul0;
import java.io.IOException;

/* compiled from: MaskParser.java */
/* loaded from: classes.dex */
public class wn0 {
    private wn0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r1.equals("s") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ul0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        char c;
        po0Var.d();
        ul0.a aVar = null;
        fl0 fl0Var = null;
        bl0 bl0Var = null;
        boolean z = false;
        while (po0Var.h()) {
            String m = po0Var.m();
            m.hashCode();
            char c2 = 3;
            switch (m.hashCode()) {
                case 111:
                    if (m.equals(ij3.b)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3588:
                    if (m.equals("pt")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 104433:
                    if (m.equals("inv")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3357091:
                    if (m.equals("mode")) {
                        c = 3;
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
                    bl0Var = cn0.h(po0Var, ei0Var);
                    break;
                case 1:
                    fl0Var = cn0.k(po0Var, ei0Var);
                    break;
                case 2:
                    z = po0Var.j();
                    break;
                case 3:
                    String q = po0Var.q();
                    q.hashCode();
                    switch (q.hashCode()) {
                        case 97:
                            if (q.equals("a")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 105:
                            if (q.equals("i")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 110:
                            if (q.equals("n")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 115:
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            aVar = ul0.a.MASK_MODE_ADD;
                            continue;
                        case 1:
                            ei0Var.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = ul0.a.MASK_MODE_INTERSECT;
                            continue;
                        case 2:
                            aVar = ul0.a.MASK_MODE_NONE;
                            continue;
                        case 3:
                            aVar = ul0.a.MASK_MODE_SUBTRACT;
                            continue;
                        default:
                            yo0.e("Unknown mask mode " + m + ". Defaulting to Add.");
                            aVar = ul0.a.MASK_MODE_ADD;
                            continue;
                    }
                default:
                    po0Var.A();
                    break;
            }
        }
        po0Var.f();
        return new ul0(aVar, fl0Var, bl0Var, z);
    }
}