package com.p7700g.p99005;

import android.view.View;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
public class wa2 {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public wa2(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        sr.e1(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        sr.d1(view2, this.e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.f;
    }

    public void h() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public void i(boolean z) {
        this.g = z;
    }

    public boolean j(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public boolean k(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }

    public void l(boolean z) {
        this.f = z;
    }
}