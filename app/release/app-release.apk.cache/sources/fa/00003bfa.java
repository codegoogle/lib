package com.p7700g.p99005;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.p7700g.p99005.f02;

/* compiled from: ViewAnimationFactory.java */
/* loaded from: classes2.dex */
public class c02<R> implements b02<R> {
    private final f02.a a;
    private a02<R> b;

    /* compiled from: ViewAnimationFactory.java */
    /* loaded from: classes2.dex */
    public static class a implements f02.a {
        private final Animation a;

        public a(Animation animation) {
            this.a = animation;
        }

        @Override // com.p7700g.p99005.f02.a
        public Animation a(Context context) {
            return this.a;
        }
    }

    /* compiled from: ViewAnimationFactory.java */
    /* loaded from: classes2.dex */
    public static class b implements f02.a {
        private final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // com.p7700g.p99005.f02.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.a);
        }
    }

    public c02(Animation animation) {
        this(new a(animation));
    }

    @Override // com.p7700g.p99005.b02
    public a02<R> a(aq1 aq1Var, boolean z) {
        if (aq1Var != aq1.MEMORY_CACHE && z) {
            if (this.b == null) {
                this.b = new f02(this.a);
            }
            return this.b;
        }
        return zz1.b();
    }

    public c02(int i) {
        this(new b(i));
    }

    public c02(f02.a aVar) {
        this.a = aVar;
    }
}