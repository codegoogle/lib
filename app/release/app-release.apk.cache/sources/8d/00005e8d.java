package com.p7700g.p99005;

import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
public class tn0 {
    public static po0.a a = po0.a.a("k");

    private tn0() {
    }

    public static <T> List<ep0<T>> a(po0 po0Var, ei0 ei0Var, float f, mo0<T> mo0Var, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (po0Var.s() == po0.b.STRING) {
            ei0Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        po0Var.d();
        while (po0Var.h()) {
            if (po0Var.w(a) != 0) {
                po0Var.A();
            } else if (po0Var.s() == po0.b.BEGIN_ARRAY) {
                po0Var.b();
                if (po0Var.s() == po0.b.NUMBER) {
                    arrayList.add(sn0.c(po0Var, ei0Var, f, mo0Var, false, z));
                } else {
                    while (po0Var.h()) {
                        arrayList.add(sn0.c(po0Var, ei0Var, f, mo0Var, true, z));
                    }
                }
                po0Var.e();
            } else {
                arrayList.add(sn0.c(po0Var, ei0Var, f, mo0Var, false, z));
            }
        }
        po0Var.f();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends ep0<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            ep0<T> ep0Var = list.get(i2);
            i2++;
            ep0<T> ep0Var2 = list.get(i2);
            ep0Var.j = Float.valueOf(ep0Var2.i);
            if (ep0Var.e == null && (t = ep0Var2.d) != null) {
                ep0Var.e = t;
                if (ep0Var instanceof bk0) {
                    ((bk0) ep0Var).i();
                }
            }
        }
        ep0<T> ep0Var3 = list.get(i);
        if ((ep0Var3.d == null || ep0Var3.e == null) && list.size() > 1) {
            list.remove(ep0Var3);
        }
    }
}