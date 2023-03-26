package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: InvalidationHandler.java */
/* loaded from: classes4.dex */
public class cy5 extends Handler {
    public static final int a = -1;
    private final WeakReference<ox5> b;

    public cy5(ox5 ox5Var) {
        super(Looper.getMainLooper());
        this.b = new WeakReference<>(ox5Var);
    }

    @Override // android.os.Handler
    public void handleMessage(@x1 Message message) {
        ox5 ox5Var = this.b.get();
        if (ox5Var == null) {
            return;
        }
        if (message.what == -1) {
            ox5Var.invalidateSelf();
            return;
        }
        Iterator<jx5> it = ox5Var.z.iterator();
        while (it.hasNext()) {
            it.next().a(message.what);
        }
    }
}