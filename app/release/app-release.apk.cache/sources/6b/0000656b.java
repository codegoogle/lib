package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import com.p7700g.p99005.i2;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class xe2 {
    private final ArrayList<b> a = new ArrayList<>();
    @z1
    private b b = null;
    @z1
    public ValueAnimator c = null;
    private final Animator.AnimatorListener d = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xe2 xe2Var = xe2.this;
            if (xe2Var.c == animator) {
                xe2Var.c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes3.dex */
    public static class b {
        public final int[] a;
        public final ValueAnimator b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
    }

    private void e(@x1 b bVar) {
        ValueAnimator valueAnimator = bVar.b;
        this.c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}