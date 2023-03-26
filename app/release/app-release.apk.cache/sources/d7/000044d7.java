package com.p7700g.p99005;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.po0;
import java.io.IOException;

/* compiled from: ContentModelParser.java */
/* loaded from: classes.dex */
public class gn0 {
    private static final po0.a a = po0.a.a("ty", "d");

    private gn0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c2, code lost:
        if (r2.equals("gf") == false) goto L21;
     */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pl0 a(po0 po0Var, ei0 ei0Var) throws IOException {
        pl0 pl0Var;
        String str;
        po0Var.d();
        char c = 2;
        int i = 2;
        while (true) {
            pl0Var = null;
            if (!po0Var.h()) {
                str = null;
                break;
            }
            int w = po0Var.w(a);
            if (w == 0) {
                str = po0Var.q();
                break;
            } else if (w != 1) {
                po0Var.z();
                po0Var.A();
            } else {
                i = po0Var.l();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                break;
            case IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL /* 3307 */:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals(com.anythink.core.common.g.c.O)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals(com.anythink.expressad.foundation.d.d.t)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '\r';
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
                pl0Var = en0.a(po0Var, ei0Var, i);
                break;
            case 1:
                pl0Var = ho0.a(po0Var, ei0Var);
                break;
            case 2:
                pl0Var = on0.a(po0Var, ei0Var);
                break;
            case 3:
                pl0Var = io0.a(po0Var, ei0Var);
                break;
            case 4:
                pl0Var = pn0.a(po0Var, ei0Var);
                break;
            case 5:
                pl0Var = xn0.a(po0Var);
                ei0Var.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                pl0Var = co0.a(po0Var, ei0Var);
                break;
            case 7:
                pl0Var = eo0.a(po0Var, ei0Var);
                break;
            case '\b':
                pl0Var = do0.a(po0Var, ei0Var);
                break;
            case '\t':
                pl0Var = jo0.a(po0Var, ei0Var);
                break;
            case '\n':
                pl0Var = bo0.a(po0Var, ei0Var, i);
                break;
            case 11:
                pl0Var = ko0.a(po0Var, ei0Var);
                break;
            case '\f':
                pl0Var = lo0.a(po0Var, ei0Var);
                break;
            case '\r':
                pl0Var = bn0.g(po0Var, ei0Var);
                break;
            default:
                yo0.e("Unknown shape type " + str);
                break;
        }
        while (po0Var.h()) {
            po0Var.A();
        }
        po0Var.f();
        return pl0Var;
    }
}