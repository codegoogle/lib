package com.p7700g.p99005;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: Animatable2Compat.java */
/* loaded from: classes.dex */
public interface z90 extends Animatable {

    /* compiled from: Animatable2Compat.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public Animatable2.AnimationCallback a;

        /* compiled from: Animatable2Compat.java */
        /* renamed from: com.p7700g.p99005.z90$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0278a extends Animatable2.AnimationCallback {
            public C0278a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @e2(23)
        public Animatable2.AnimationCallback a() {
            if (this.a == null) {
                this.a = new C0278a();
            }
            return this.a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }

    void b(@x1 a aVar);

    void c();

    boolean d(@x1 a aVar);
}