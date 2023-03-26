package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
@e2(18)
/* loaded from: classes.dex */
public class d90 implements e90 {
    private final ViewGroupOverlay a;

    public d90(@x1 ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // com.p7700g.p99005.j90
    public void a(@x1 Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.p7700g.p99005.j90
    public void b(@x1 Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // com.p7700g.p99005.e90
    public void c(@x1 View view) {
        this.a.add(view);
    }

    @Override // com.p7700g.p99005.e90
    public void d(@x1 View view) {
        this.a.remove(view);
    }
}