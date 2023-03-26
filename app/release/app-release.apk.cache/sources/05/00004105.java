package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: ContentLoadingProgressBar.java */
/* loaded from: classes.dex */
public class et extends ProgressBar {
    private static final int s = 500;
    private static final int t = 500;
    public long u;
    public boolean v;
    public boolean w;
    public boolean x;
    private final Runnable y;
    private final Runnable z;

    public et(@x1 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q2
    public void b() {
        this.x = true;
        removeCallbacks(this.z);
        this.w = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.u;
        long j2 = currentTimeMillis - j;
        if (j2 < 500 && j != -1) {
            if (this.v) {
                return;
            }
            postDelayed(this.y, 500 - j2);
            this.v = true;
            return;
        }
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e() {
        this.v = false;
        this.u = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void g() {
        this.w = false;
        if (this.x) {
            return;
        }
        this.u = System.currentTimeMillis();
        setVisibility(0);
    }

    private void i() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @q2
    public void k() {
        this.u = -1L;
        this.x = false;
        removeCallbacks(this.y);
        this.v = false;
        if (this.w) {
            return;
        }
        postDelayed(this.z, 500L);
        this.w = true;
    }

    public void a() {
        post(new Runnable() { // from class: com.p7700g.p99005.xs
            @Override // java.lang.Runnable
            public final void run() {
                et.this.b();
            }
        });
    }

    public void j() {
        post(new Runnable() { // from class: com.p7700g.p99005.zs
            @Override // java.lang.Runnable
            public final void run() {
                et.this.k();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public et(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.u = -1L;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = new Runnable() { // from class: com.p7700g.p99005.ws
            @Override // java.lang.Runnable
            public final void run() {
                et.this.e();
            }
        };
        this.z = new Runnable() { // from class: com.p7700g.p99005.ys
            @Override // java.lang.Runnable
            public final void run() {
                et.this.g();
            }
        };
    }
}