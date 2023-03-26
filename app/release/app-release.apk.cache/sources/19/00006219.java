package com.p7700g.p99005;

import android.graphics.Rect;
import com.anchorfree.sdk.fireshield.FireshieldConfig;
import com.p7700g.p99005.lm0;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public class vn0 {
    private static final po0.a a = po0.a.a("w", "h", FireshieldConfig.Services.IP, "op", com.anythink.expressad.video.dynview.a.a.R, com.ironsource.sdk.controller.v.a, "layers", "assets", "fonts", "chars", "markers");
    public static po0.a b = po0.a.a("id", "layers", "w", "h", "p", "u");
    private static final po0.a c = po0.a.a("list");
    private static final po0.a d = po0.a.a("cm", "tm", "dr");

    public static ei0 a(po0 po0Var) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        po0 po0Var2 = po0Var;
        float e = cp0.e();
        v7<lm0> v7Var = new v7<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        z7<sk0> z7Var = new z7<>();
        ei0 ei0Var = new ei0();
        po0Var.d();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (po0Var.h()) {
            switch (po0Var2.w(a)) {
                case 0:
                    i = po0Var.l();
                    continue;
                    po0Var2 = po0Var;
                case 1:
                    i2 = po0Var.l();
                    continue;
                    po0Var2 = po0Var;
                case 2:
                    f = (float) po0Var.k();
                    continue;
                    po0Var2 = po0Var;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) po0Var.k()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) po0Var.k();
                    break;
                case 5:
                    String[] split = po0Var.q().split("\\.");
                    if (!cp0.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        ei0Var.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    e(po0Var2, ei0Var, arrayList2, v7Var);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    b(po0Var2, ei0Var, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    d(po0Var2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    c(po0Var2, ei0Var, z7Var);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    f(po0Var2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    po0Var.z();
                    po0Var.A();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            po0Var2 = po0Var;
        }
        ei0Var.w(new Rect(0, 0, (int) (i * e), (int) (i2 * e)), f, f2, f3, arrayList2, v7Var, hashMap2, hashMap3, z7Var, hashMap4, arrayList3);
        return ei0Var;
    }

    private static void b(po0 po0Var, ei0 ei0Var, Map<String, List<lm0>> map, Map<String, ii0> map2) throws IOException {
        po0Var.b();
        while (po0Var.h()) {
            ArrayList arrayList = new ArrayList();
            v7 v7Var = new v7();
            po0Var.d();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (po0Var.h()) {
                int w = po0Var.w(b);
                if (w == 0) {
                    str = po0Var.q();
                } else if (w == 1) {
                    po0Var.b();
                    while (po0Var.h()) {
                        lm0 b2 = un0.b(po0Var, ei0Var);
                        v7Var.u(b2.d(), b2);
                        arrayList.add(b2);
                    }
                    po0Var.e();
                } else if (w == 2) {
                    i = po0Var.l();
                } else if (w == 3) {
                    i2 = po0Var.l();
                } else if (w == 4) {
                    str2 = po0Var.q();
                } else if (w != 5) {
                    po0Var.z();
                    po0Var.A();
                } else {
                    str3 = po0Var.q();
                }
            }
            po0Var.f();
            if (str2 != null) {
                ii0 ii0Var = new ii0(i, i2, str, str2, str3);
                map2.put(ii0Var.e(), ii0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        po0Var.e();
    }

    private static void c(po0 po0Var, ei0 ei0Var, z7<sk0> z7Var) throws IOException {
        po0Var.b();
        while (po0Var.h()) {
            sk0 a2 = ln0.a(po0Var, ei0Var);
            z7Var.u(a2.hashCode(), a2);
        }
        po0Var.e();
    }

    private static void d(po0 po0Var, Map<String, rk0> map) throws IOException {
        po0Var.d();
        while (po0Var.h()) {
            if (po0Var.w(c) != 0) {
                po0Var.z();
                po0Var.A();
            } else {
                po0Var.b();
                while (po0Var.h()) {
                    rk0 a2 = mn0.a(po0Var);
                    map.put(a2.c(), a2);
                }
                po0Var.e();
            }
        }
        po0Var.f();
    }

    private static void e(po0 po0Var, ei0 ei0Var, List<lm0> list, v7<lm0> v7Var) throws IOException {
        po0Var.b();
        int i = 0;
        while (po0Var.h()) {
            lm0 b2 = un0.b(po0Var, ei0Var);
            if (b2.f() == lm0.a.IMAGE) {
                i++;
            }
            list.add(b2);
            v7Var.u(b2.d(), b2);
            if (i > 4) {
                yo0.e("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        po0Var.e();
    }

    private static void f(po0 po0Var, List<wk0> list) throws IOException {
        po0Var.b();
        while (po0Var.h()) {
            String str = null;
            po0Var.d();
            float f = 0.0f;
            float f2 = 0.0f;
            while (po0Var.h()) {
                int w = po0Var.w(d);
                if (w == 0) {
                    str = po0Var.q();
                } else if (w == 1) {
                    f = (float) po0Var.k();
                } else if (w != 2) {
                    po0Var.z();
                    po0Var.A();
                } else {
                    f2 = (float) po0Var.k();
                }
            }
            po0Var.f();
            list.add(new wk0(str, f, f2));
        }
        po0Var.e();
    }
}