package com.anythink.expressad.video.dynview.endcard.cloudview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class d {
    private a a;

    /* loaded from: classes2.dex */
    public interface a {
        void onChange();
    }

    private void d() {
        this.a.onChange();
    }

    public abstract int a();

    public abstract int a(int i);

    public abstract View a(Context context, int i, ViewGroup viewGroup);

    public final void a(a aVar) {
        this.a = aVar;
    }

    public abstract Object b();

    public abstract void c();
}