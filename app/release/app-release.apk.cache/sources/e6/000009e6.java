package com.anythink.expressad.video.dynview.endcard.cloudview;

import android.graphics.Color;
import android.graphics.PointF;
import android.view.View;
import com.p7700g.p99005.x1;

/* loaded from: classes2.dex */
public final class a implements Comparable<a> {
    private static final int g = 5;
    private int a;
    private float b;
    private float[] c;
    private View d;
    private PointF e;
    private com.anythink.expressad.video.dynview.endcard.cloudview.a.a f;

    public a() {
        this(0.0f, 0.0f, 0.0f, 1.0f, 0);
    }

    private float j() {
        return this.c[0];
    }

    public final float a() {
        return this.f.a;
    }

    public final float b() {
        return this.f.b;
    }

    public final float c() {
        return this.f.c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@x1 a aVar) {
        return this.b > aVar.b ? 1 : -1;
    }

    public final float d() {
        return this.b;
    }

    public final View e() {
        return this.d;
    }

    public final int f() {
        return this.a;
    }

    public final float g() {
        return this.e.x;
    }

    public final float h() {
        return this.e.y;
    }

    public final int i() {
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = (int) (this.c[i] * 255.0f);
        }
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public a(int i) {
        this(0.0f, 0.0f, 0.0f, 1.0f, i);
    }

    public final void a(float f) {
        this.f.a = f;
    }

    public final void b(float f) {
        this.f.b = f;
    }

    public final void c(float f) {
        this.f.c = f;
    }

    public final void d(float f) {
        this.b = f;
    }

    public final void e(float f) {
        this.c[0] = f;
    }

    public final void f(float f) {
        this.e.x = f;
    }

    public final void g(float f) {
        this.e.y = f;
    }

    private a(float f, float f2, float f3) {
        this(f, f2, f3, 1.0f, 5);
    }

    public final void a(View view) {
        this.d = view;
    }

    private a(float f, float f2, float f3, float f4) {
        this(f, f2, f3, f4, 5);
    }

    public final void a(float[] fArr) {
        if (fArr != null) {
            float[] fArr2 = this.c;
            System.arraycopy(fArr, 0, fArr2, fArr2.length - fArr.length, fArr.length);
        }
    }

    private a(float f, float f2, float f3, float f4, int i) {
        this.f = new com.anythink.expressad.video.dynview.endcard.cloudview.a.a(f, f2, f3);
        this.e = new PointF(0.0f, 0.0f);
        this.c = new float[]{1.0f, 0.5f, 0.5f, 0.5f};
        this.b = f4;
        this.a = i;
    }

    private int a(@x1 a aVar) {
        return this.b > aVar.b ? 1 : -1;
    }
}