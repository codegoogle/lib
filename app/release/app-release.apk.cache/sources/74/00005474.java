package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PathUtils.java */
/* loaded from: classes.dex */
public final class oj {

    /* compiled from: PathUtils.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static float[] a(Path path, float f) {
            return path.approximate(f);
        }
    }

    private oj() {
    }

    @e2(26)
    @x1
    public static Collection<nj> a(@x1 Path path) {
        return b(path, 0.5f);
    }

    @e2(26)
    @x1
    public static Collection<nj> b(@x1 Path path, @g1(from = 0.0d) float f) {
        float[] a2 = a.a(path, f);
        int length = a2.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = a2[i2];
            float f3 = a2[i2 + 1];
            float f4 = a2[i2 + 2];
            float f5 = a2[i3];
            float f6 = a2[i3 + 1];
            float f7 = a2[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new nj(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}