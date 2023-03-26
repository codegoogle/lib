package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import com.p7700g.p99005.nq3;

/* compiled from: DrawManager.java */
/* loaded from: classes3.dex */
public class lq3 {
    private pq3 a;
    private nq3 b;
    private oq3 c;
    private mq3 d;

    public lq3() {
        pq3 pq3Var = new pq3();
        this.a = pq3Var;
        this.b = new nq3(pq3Var);
        this.c = new oq3();
        this.d = new mq3(this.a);
    }

    public void a(@x1 Canvas canvas) {
        this.b.a(canvas);
    }

    @x1
    public pq3 b() {
        if (this.a == null) {
            this.a = new pq3();
        }
        return this.a;
    }

    public void c(@x1 Context context, @z1 AttributeSet attributeSet) {
        this.d.c(context, attributeSet);
    }

    public Pair<Integer, Integer> d(int i, int i2) {
        return this.c.a(this.a, i, i2);
    }

    public void e(@z1 nq3.b bVar) {
        this.b.e(bVar);
    }

    public void f(@z1 MotionEvent motionEvent) {
        this.b.f(motionEvent);
    }

    public void g(@z1 rp3 rp3Var) {
        this.b.g(rp3Var);
    }
}