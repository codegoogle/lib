package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: CompletableTask.java */
/* loaded from: classes2.dex */
public abstract class ej1 implements Runnable {
    private final Handler s = new Handler(Looper.getMainLooper());
    @x1
    private final va1 t;

    public ej1(@x1 va1 va1Var) {
        this.t = va1Var;
    }

    private /* synthetic */ void b(Exception exc) {
        this.t.a(gc1.unexpected(exc));
    }

    public abstract void a() throws Exception;

    public /* synthetic */ void c(Exception exc) {
        this.t.a(gc1.unexpected(exc));
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
            Handler handler = this.s;
            final va1 va1Var = this.t;
            Objects.requireNonNull(va1Var);
            handler.post(new Runnable() { // from class: com.p7700g.p99005.bj1
                @Override // java.lang.Runnable
                public final void run() {
                    va1.this.complete();
                }
            });
        } catch (Exception e) {
            this.s.post(new Runnable() { // from class: com.p7700g.p99005.zi1
                @Override // java.lang.Runnable
                public final void run() {
                    ej1.this.c(e);
                }
            });
        }
    }
}