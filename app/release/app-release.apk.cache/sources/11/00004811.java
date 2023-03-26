package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
@e2(18)
/* loaded from: classes.dex */
public class i90 implements j90 {
    private final ViewOverlay a;

    public i90(@x1 View view) {
        this.a = view.getOverlay();
    }

    @Override // com.p7700g.p99005.j90
    public void a(@x1 Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.p7700g.p99005.j90
    public void b(@x1 Drawable drawable) {
        this.a.remove(drawable);
    }
}