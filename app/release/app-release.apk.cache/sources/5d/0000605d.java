package com.p7700g.p99005;

import android.graphics.Color;
import android.graphics.Rect;
import com.anchorfree.sdk.fireshield.FireshieldConfig;
import com.p7700g.p99005.lm0;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* loaded from: classes.dex */
public class un0 {
    private static final po0.a a = po0.a.a("nm", "ind", "refId", "ty", "parent", "sw", com.anythink.expressad.foundation.d.d.t, com.anythink.expressad.d.a.b.bH, "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", FireshieldConfig.Services.IP, "op", "tm", "cl", "hd");
    private static final po0.a b = po0.a.a("d", "a");
    private static final po0.a c = po0.a.a("ty", "nm");

    /* compiled from: LayerParser.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            lm0.b.values();
            int[] iArr = new int[6];
            a = iArr;
            try {
                iArr[lm0.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[lm0.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private un0() {
    }

    public static lm0 a(ei0 ei0Var) {
        Rect b2 = ei0Var.b();
        return new lm0(Collections.emptyList(), ei0Var, "__container", -1L, lm0.a.PRE_COMP, -1L, null, Collections.emptyList(), new jl0(), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, Collections.emptyList(), lm0.b.NONE, null, false, null, null);
    }

    public static lm0 b(po0 po0Var, ei0 ei0Var) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        lm0.b bVar = lm0.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        po0Var.d();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        lm0.b bVar2 = bVar;
        lm0.a aVar = null;
        String str = null;
        jl0 jl0Var = null;
        hl0 hl0Var = null;
        il0 il0Var = null;
        zk0 zk0Var = null;
        nl0 nl0Var = null;
        in0 in0Var = null;
        long j = -1;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f2 = 1.0f;
        float f3 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        float f4 = 0.0f;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (po0Var.h()) {
            switch (po0Var.w(a)) {
                case 0:
                    str3 = po0Var.q();
                    break;
                case 1:
                    j2 = po0Var.l();
                    break;
                case 2:
                    str = po0Var.q();
                    break;
                case 3:
                    int l = po0Var.l();
                    aVar = lm0.a.UNKNOWN;
                    if (l >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = lm0.a.values()[l];
                        break;
                    }
                case 4:
                    j = po0Var.l();
                    break;
                case 5:
                    i = (int) (cp0.e() * po0Var.l());
                    break;
                case 6:
                    i2 = (int) (cp0.e() * po0Var.l());
                    break;
                case 7:
                    i3 = Color.parseColor(po0Var.q());
                    break;
                case 8:
                    jl0Var = bn0.g(po0Var, ei0Var);
                    break;
                case 9:
                    int l2 = po0Var.l();
                    lm0.b.values();
                    if (l2 >= 6) {
                        ei0Var.a("Unsupported matte type: " + l2);
                        break;
                    } else {
                        bVar2 = lm0.b.values()[l2];
                        int ordinal = bVar2.ordinal();
                        if (ordinal == 3) {
                            ei0Var.a("Unsupported matte type: Luma");
                        } else if (ordinal == 4) {
                            ei0Var.a("Unsupported matte type: Luma Inverted");
                        }
                        ei0Var.v(1);
                        break;
                    }
                case 10:
                    po0Var.b();
                    while (po0Var.h()) {
                        arrayList3.add(wn0.a(po0Var, ei0Var));
                    }
                    ei0Var.v(arrayList3.size());
                    po0Var.e();
                    break;
                case 11:
                    po0Var.b();
                    while (po0Var.h()) {
                        pl0 a2 = gn0.a(po0Var, ei0Var);
                        if (a2 != null) {
                            arrayList4.add(a2);
                        }
                    }
                    po0Var.e();
                    break;
                case 12:
                    po0Var.d();
                    while (po0Var.h()) {
                        int w = po0Var.w(b);
                        if (w == 0) {
                            hl0Var = cn0.d(po0Var, ei0Var);
                        } else if (w != 1) {
                            po0Var.z();
                            po0Var.A();
                        } else {
                            po0Var.b();
                            if (po0Var.h()) {
                                il0Var = an0.a(po0Var, ei0Var);
                            }
                            while (po0Var.h()) {
                                po0Var.A();
                            }
                            po0Var.e();
                        }
                    }
                    po0Var.f();
                    break;
                case 13:
                    po0Var.b();
                    ArrayList arrayList5 = new ArrayList();
                    while (po0Var.h()) {
                        po0Var.d();
                        while (po0Var.h()) {
                            int w2 = po0Var.w(c);
                            if (w2 == 0) {
                                int l3 = po0Var.l();
                                if (l3 == 29) {
                                    nl0Var = dn0.b(po0Var, ei0Var);
                                } else if (l3 == 25) {
                                    in0Var = new jn0().b(po0Var, ei0Var);
                                }
                            } else if (w2 != 1) {
                                po0Var.z();
                                po0Var.A();
                            } else {
                                arrayList5.add(po0Var.q());
                            }
                        }
                        po0Var.f();
                    }
                    po0Var.e();
                    ei0Var.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f2 = (float) po0Var.k();
                    break;
                case 15:
                    f3 = (float) po0Var.k();
                    break;
                case 16:
                    i4 = (int) (cp0.e() * po0Var.l());
                    break;
                case 17:
                    i5 = (int) (cp0.e() * po0Var.l());
                    break;
                case 18:
                    f = (float) po0Var.k();
                    break;
                case 19:
                    f4 = (float) po0Var.k();
                    break;
                case 20:
                    zk0Var = cn0.f(po0Var, ei0Var, false);
                    break;
                case 21:
                    str2 = po0Var.q();
                    break;
                case 22:
                    z = po0Var.j();
                    break;
                default:
                    po0Var.z();
                    po0Var.A();
                    break;
            }
        }
        po0Var.f();
        ArrayList arrayList6 = new ArrayList();
        if (f > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new ep0(ei0Var, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f4 <= 0.0f) {
            f4 = ei0Var.f();
        }
        arrayList2.add(new ep0(ei0Var, valueOf, valueOf, null, f, Float.valueOf(f4)));
        arrayList2.add(new ep0(ei0Var, valueOf2, valueOf2, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || com.anythink.expressad.d.a.b.cZ.equals(str2)) {
            ei0Var.a("Convert your Illustrator layers to shape layers.");
        }
        return new lm0(arrayList4, ei0Var, str3, j2, aVar, j, str, arrayList, jl0Var, i, i2, i3, f2, f3, i4, i5, hl0Var, il0Var, arrayList2, bVar2, zk0Var, z, nl0Var, in0Var);
    }
}