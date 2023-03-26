package com.p7700g.p99005;

import com.p7700g.p99005.aa;

/* compiled from: TypedValues.java */
/* loaded from: classes.dex */
public final /* synthetic */ class ba {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1095013018:
                if (str.equals(aa.b.g)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -891985903:
                if (str.equals("string")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -710953590:
                if (str.equals(aa.b.h)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97526364:
                if (str.equals(aa.b.c)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1958052158:
                if (str.equals(aa.b.b)) {
                    c = 6;
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
                return aa.b.o;
            case 1:
                return aa.b.m;
            case 2:
                return aa.b.p;
            case 3:
                return 904;
            case 4:
                return aa.b.l;
            case 5:
                return aa.b.k;
            case 6:
                return 900;
            default:
                return -1;
        }
    }
}