package com.p7700g.p99005;

import android.view.View;

/* compiled from: DebouncingOnClickListener.java */
/* loaded from: classes2.dex */
public abstract class q81 implements View.OnClickListener {
    private static final long s = 300;
    private long t = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (System.currentTimeMillis() - this.t > 300) {
            this.t = System.currentTimeMillis();
            a(view);
        }
    }
}