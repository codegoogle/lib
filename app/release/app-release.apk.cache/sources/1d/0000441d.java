package com.p7700g.p99005;

import com.p7700g.p99005.aa;

/* compiled from: TypedValues.java */
/* loaded from: classes.dex */
public final /* synthetic */ class ga {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1996906958:
                if (str.equals(aa.h.i)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1992012396:
                if (str.equals("duration")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1357874275:
                if (str.equals(aa.h.g)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1298065308:
                if (str.equals(aa.h.f)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3707:
                if (str.equals(aa.h.d)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3151786:
                if (str.equals("from")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1310733335:
                if (str.equals(aa.h.e)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1839260940:
                if (str.equals(aa.h.h)) {
                    c = 7;
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
                return aa.h.q;
            case 1:
                return aa.h.j;
            case 2:
                return aa.h.o;
            case 3:
                return 704;
            case 4:
                return aa.h.l;
            case 5:
                return aa.h.k;
            case 6:
                return 509;
            case 7:
                return aa.h.p;
            default:
                return -1;
        }
    }

    public static int b(int i) {
        if (i != 509) {
            switch (i) {
                case aa.h.j /* 700 */:
                    return 2;
                case aa.h.k /* 701 */:
                case aa.h.l /* 702 */:
                    return 8;
                default:
                    switch (i) {
                        case aa.h.o /* 705 */:
                        case aa.h.q /* 707 */:
                            return 8;
                        case aa.h.p /* 706 */:
                            return 4;
                        default:
                            return -1;
                    }
            }
        }
        return 2;
    }
}