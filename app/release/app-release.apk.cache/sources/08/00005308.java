package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.p7700g.p99005.pt1;
import java.util.HashMap;

/* compiled from: BitmapPreFiller.java */
/* loaded from: classes2.dex */
public final class nt1 {
    private final gt1 a;
    private final ls1 b;
    private final bq1 c;
    private mt1 d;

    public nt1(gt1 gt1Var, ls1 ls1Var, bq1 bq1Var) {
        this.a = gt1Var;
        this.b = ls1Var;
        this.c = bq1Var;
    }

    private static int b(pt1 pt1Var) {
        return z02.g(pt1Var.d(), pt1Var.b(), pt1Var.a());
    }

    @r2
    public ot1 a(pt1... pt1VarArr) {
        long f = this.b.f() + (this.a.f() - this.a.a());
        int i = 0;
        for (pt1 pt1Var : pt1VarArr) {
            i += pt1Var.c();
        }
        float f2 = ((float) f) / i;
        HashMap hashMap = new HashMap();
        for (pt1 pt1Var2 : pt1VarArr) {
            hashMap.put(pt1Var2, Integer.valueOf(Math.round(pt1Var2.c() * f2) / b(pt1Var2)));
        }
        return new ot1(hashMap);
    }

    public void c(pt1.a... aVarArr) {
        Bitmap.Config config;
        mt1 mt1Var = this.d;
        if (mt1Var != null) {
            mt1Var.b();
        }
        pt1[] pt1VarArr = new pt1[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            pt1.a aVar = aVarArr[i];
            if (aVar.b() == null) {
                if (this.c == bq1.PREFER_ARGB_8888) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                aVar.c(config);
            }
            pt1VarArr[i] = aVar.a();
        }
        mt1 mt1Var2 = new mt1(this.b, this.a, a(pt1VarArr));
        this.d = mt1Var2;
        z02.x(mt1Var2);
    }
}