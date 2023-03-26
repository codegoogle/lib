package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
@e2(18)
/* loaded from: classes3.dex */
public class ff2 implements gf2 {
    private final ViewGroupOverlay a;

    public ff2(@x1 ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // com.p7700g.p99005.jf2
    public void a(@x1 Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.p7700g.p99005.jf2
    public void b(@x1 Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // com.p7700g.p99005.gf2
    public void c(@x1 View view) {
        this.a.add(view);
    }

    @Override // com.p7700g.p99005.gf2
    public void d(@x1 View view) {
        this.a.remove(view);
    }
}