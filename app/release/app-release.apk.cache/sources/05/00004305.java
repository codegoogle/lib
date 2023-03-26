package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes2.dex */
public class fs1 {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: classes2.dex */
    public static final class a implements Handler.Callback {
        public static final int s = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((cs1) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public synchronized void a(cs1<?> cs1Var, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            cs1Var.a();
            this.a = false;
        }
        this.b.obtainMessage(1, cs1Var).sendToTarget();
    }
}