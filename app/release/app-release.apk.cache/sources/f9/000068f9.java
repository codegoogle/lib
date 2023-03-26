package com.p7700g.p99005;

import android.animation.Animator;

/* compiled from: AnimatorTracker.java */
/* loaded from: classes3.dex */
public class zd2 {
    @z1
    private Animator a;

    public void a() {
        Animator animator = this.a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.a = null;
    }

    public void c(Animator animator) {
        a();
        this.a = animator;
    }
}