package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewGroupOverlayApi14.java */
/* loaded from: classes.dex */
public class c90 extends h90 implements e90 {
    public c90(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static c90 g(ViewGroup viewGroup) {
        return (c90) h90.e(viewGroup);
    }

    @Override // com.p7700g.p99005.e90
    public void c(@x1 View view) {
        this.a.b(view);
    }

    @Override // com.p7700g.p99005.e90
    public void d(@x1 View view) {
        this.a.h(view);
    }
}