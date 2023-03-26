package com.p7700g.p99005;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p7700g.p99005.a02;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes2.dex */
public abstract class mz1<Z> extends uz1<ImageView, Z> implements a02.a {
    @z1
    private Animatable B;

    public mz1(ImageView imageView) {
        super(imageView);
    }

    private void t(@z1 Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.B = animatable;
            animatable.start();
            return;
        }
        this.B = null;
    }

    private void v(@z1 Z z) {
        u(z);
        t(z);
    }

    @Override // com.p7700g.p99005.a02.a
    public void a(Drawable drawable) {
        ((ImageView) this.w).setImageDrawable(drawable);
    }

    @Override // com.p7700g.p99005.sz1
    public void c(@x1 Z z, @z1 a02<? super Z> a02Var) {
        if (a02Var != null && a02Var.a(z, this)) {
            t(z);
        } else {
            v(z);
        }
    }

    @Override // com.p7700g.p99005.a02.a
    @z1
    public Drawable d() {
        return ((ImageView) this.w).getDrawable();
    }

    @Override // com.p7700g.p99005.ez1, com.p7700g.p99005.sz1
    public void k(@z1 Drawable drawable) {
        super.k(drawable);
        v(null);
        a(drawable);
    }

    @Override // com.p7700g.p99005.uz1, com.p7700g.p99005.ez1, com.p7700g.p99005.sz1
    public void l(@z1 Drawable drawable) {
        super.l(drawable);
        v(null);
        a(drawable);
    }

    @Override // com.p7700g.p99005.ez1, com.p7700g.p99005.wx1
    public void onStart() {
        Animatable animatable = this.B;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.p7700g.p99005.ez1, com.p7700g.p99005.wx1
    public void onStop() {
        Animatable animatable = this.B;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.p7700g.p99005.uz1, com.p7700g.p99005.ez1, com.p7700g.p99005.sz1
    public void p(@z1 Drawable drawable) {
        super.p(drawable);
        Animatable animatable = this.B;
        if (animatable != null) {
            animatable.stop();
        }
        v(null);
        a(drawable);
    }

    public abstract void u(@z1 Z z);

    @Deprecated
    public mz1(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}