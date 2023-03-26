package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PreloadTarget.java */
/* loaded from: classes2.dex */
public final class pz1<Z> extends hz1<Z> {
    private static final int v = 1;
    private static final Handler w = new Handler(Looper.getMainLooper(), new a());
    private final jp1 x;

    /* compiled from: PreloadTarget.java */
    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((pz1) message.obj).a();
                return true;
            }
            return false;
        }
    }

    private pz1(jp1 jp1Var, int i, int i2) {
        super(i, i2);
        this.x = jp1Var;
    }

    public static <Z> pz1<Z> d(jp1 jp1Var, int i, int i2) {
        return new pz1<>(jp1Var, i, i2);
    }

    public void a() {
        this.x.z(this);
    }

    @Override // com.p7700g.p99005.sz1
    public void c(@x1 Z z, @z1 a02<? super Z> a02Var) {
        vy1 m = m();
        if (m == null || !m.j()) {
            return;
        }
        w.obtainMessage(1, this).sendToTarget();
    }

    @Override // com.p7700g.p99005.sz1
    public void p(@z1 Drawable drawable) {
    }
}