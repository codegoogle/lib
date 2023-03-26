package com.p7700g.p99005;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.m80;

/* compiled from: Scene.java */
/* loaded from: classes.dex */
public class o80 {
    private Context a;
    private int b;
    private ViewGroup c;
    private View d;
    private Runnable e;
    private Runnable f;

    public o80(@x1 ViewGroup viewGroup) {
        this.b = -1;
        this.c = viewGroup;
    }

    @z1
    public static o80 c(@x1 ViewGroup viewGroup) {
        return (o80) viewGroup.getTag(m80.e.H);
    }

    @x1
    public static o80 d(@x1 ViewGroup viewGroup, @s1 int i, @x1 Context context) {
        int i2 = m80.e.K;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i2);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i2, sparseArray);
        }
        o80 o80Var = (o80) sparseArray.get(i);
        if (o80Var != null) {
            return o80Var;
        }
        o80 o80Var2 = new o80(viewGroup, i, context);
        sparseArray.put(i, o80Var2);
        return o80Var2;
    }

    public static void g(@x1 ViewGroup viewGroup, @z1 o80 o80Var) {
        viewGroup.setTag(m80.e.H, o80Var);
    }

    public void a() {
        if (this.b > 0 || this.d != null) {
            e().removeAllViews();
            if (this.b > 0) {
                LayoutInflater.from(this.a).inflate(this.b, this.c);
            } else {
                this.c.addView(this.d);
            }
        }
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.c) != this || (runnable = this.f) == null) {
            return;
        }
        runnable.run();
    }

    @x1
    public ViewGroup e() {
        return this.c;
    }

    public boolean f() {
        return this.b > 0;
    }

    public void h(@z1 Runnable runnable) {
        this.e = runnable;
    }

    public void i(@z1 Runnable runnable) {
        this.f = runnable;
    }

    private o80(ViewGroup viewGroup, int i, Context context) {
        this.b = -1;
        this.a = context;
        this.c = viewGroup;
        this.b = i;
    }

    public o80(@x1 ViewGroup viewGroup, @x1 View view) {
        this.b = -1;
        this.c = viewGroup;
        this.d = view;
    }
}