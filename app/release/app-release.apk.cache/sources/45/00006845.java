package com.p7700g.p99005;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.p7700g.p99005.a02;

/* compiled from: DrawableCrossFadeTransition.java */
/* loaded from: classes2.dex */
public class yz1 implements a02<Drawable> {
    private final int a;
    private final boolean b;

    public yz1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // com.p7700g.p99005.a02
    /* renamed from: b */
    public boolean a(Drawable drawable, a02.a aVar) {
        Drawable d = aVar.d();
        if (d == null) {
            d = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{d, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        aVar.a(transitionDrawable);
        return true;
    }
}