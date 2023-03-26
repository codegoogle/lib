package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: WanderingCubes.java */
/* loaded from: classes2.dex */
public class m22 extends y12 {

    /* compiled from: WanderingCubes.java */
    /* loaded from: classes2.dex */
    public class a extends u12 {
        public int Z;

        public a(int i) {
            this.Z = i;
        }

        @Override // com.p7700g.p99005.u12, com.p7700g.p99005.x12
        public ValueAnimator v() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            l12 j = new l12(this).j(fArr, 0, -90, -179, -180, -270, -360);
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(0.75f);
            l12 t = j.r(fArr, valueOf, valueOf2, valueOf2, valueOf2, valueOf, valueOf).t(fArr, valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf);
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.5f);
            l12 d = t.m(fArr, valueOf3, valueOf4, valueOf3, valueOf3, valueOf4, valueOf3).c(com.anythink.expressad.d.a.b.aC).d(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                d.p(this.Z);
            }
            return d.b();
        }
    }

    @Override // com.p7700g.p99005.y12
    public void R(x12... x12VarArr) {
        super.R(x12VarArr);
        if (Build.VERSION.SDK_INT < 24) {
            x12VarArr[1].x(-900);
        }
    }

    @Override // com.p7700g.p99005.y12
    public x12[] S() {
        return new x12[]{new a(0), new a(3)};
    }

    @Override // com.p7700g.p99005.y12, com.p7700g.p99005.x12, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Rect a2 = a(rect);
        super.onBoundsChange(a2);
        for (int i = 0; i < P(); i++) {
            x12 O = O(i);
            int i2 = a2.left;
            O.z(i2, a2.top, (a2.width() / 4) + i2, (a2.height() / 4) + a2.top);
        }
    }
}