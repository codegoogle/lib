package com.p7700g.p99005;

import android.graphics.Color;
import android.graphics.PointF;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
public class rn0 {
    private static final po0.a a = po0.a.a("x", "y");

    /* compiled from: JsonUtils.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            po0.b.values();
            int[] iArr = new int[10];
            a = iArr;
            try {
                iArr[po0.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[po0.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[po0.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private rn0() {
    }

    private static PointF a(po0 po0Var, float f) throws IOException {
        po0Var.b();
        float k = (float) po0Var.k();
        float k2 = (float) po0Var.k();
        while (po0Var.s() != po0.b.END_ARRAY) {
            po0Var.A();
        }
        po0Var.e();
        return new PointF(k * f, k2 * f);
    }

    private static PointF b(po0 po0Var, float f) throws IOException {
        float k = (float) po0Var.k();
        float k2 = (float) po0Var.k();
        while (po0Var.h()) {
            po0Var.A();
        }
        return new PointF(k * f, k2 * f);
    }

    private static PointF c(po0 po0Var, float f) throws IOException {
        po0Var.d();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (po0Var.h()) {
            int w = po0Var.w(a);
            if (w == 0) {
                f2 = g(po0Var);
            } else if (w != 1) {
                po0Var.z();
                po0Var.A();
            } else {
                f3 = g(po0Var);
            }
        }
        po0Var.f();
        return new PointF(f2 * f, f3 * f);
    }

    @w0
    public static int d(po0 po0Var) throws IOException {
        po0Var.b();
        int k = (int) (po0Var.k() * 255.0d);
        int k2 = (int) (po0Var.k() * 255.0d);
        int k3 = (int) (po0Var.k() * 255.0d);
        while (po0Var.h()) {
            po0Var.A();
        }
        po0Var.e();
        return Color.argb(255, k, k2, k3);
    }

    public static PointF e(po0 po0Var, float f) throws IOException {
        int ordinal = po0Var.s().ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal == 6) {
                    return b(po0Var, f);
                }
                StringBuilder G = wo1.G("Unknown point starts with ");
                G.append(po0Var.s());
                throw new IllegalArgumentException(G.toString());
            }
            return c(po0Var, f);
        }
        return a(po0Var, f);
    }

    public static List<PointF> f(po0 po0Var, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        po0Var.b();
        while (po0Var.s() == po0.b.BEGIN_ARRAY) {
            po0Var.b();
            arrayList.add(e(po0Var, f));
            po0Var.e();
        }
        po0Var.e();
        return arrayList;
    }

    public static float g(po0 po0Var) throws IOException {
        po0.b s = po0Var.s();
        int ordinal = s.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6) {
                return (float) po0Var.k();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + s);
        }
        po0Var.b();
        float k = (float) po0Var.k();
        while (po0Var.h()) {
            po0Var.A();
        }
        po0Var.e();
        return k;
    }
}