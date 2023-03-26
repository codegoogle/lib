package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class yd0<T> {
    private static final String a = tb0.f("ConstraintTracker");
    public final cg0 b;
    public final Context c;
    private final Object d = new Object();
    private final Set<hd0<T>> e = new LinkedHashSet();
    public T f;

    /* compiled from: ConstraintTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List s;

        public a(final List val$listenersList) {
            this.s = val$listenersList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (hd0 hd0Var : this.s) {
                hd0Var.a(yd0.this.f);
            }
        }
    }

    public yd0(@x1 Context context, @x1 cg0 taskExecutor) {
        this.c = context.getApplicationContext();
        this.b = taskExecutor;
    }

    public void a(hd0<T> listener) {
        synchronized (this.d) {
            if (this.e.add(listener)) {
                if (this.e.size() == 1) {
                    this.f = b();
                    tb0.c().a(a, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f), new Throwable[0]);
                    e();
                }
                listener.a(this.f);
            }
        }
    }

    public abstract T b();

    public void c(hd0<T> listener) {
        synchronized (this.d) {
            if (this.e.remove(listener) && this.e.isEmpty()) {
                f();
            }
        }
    }

    public void d(T newState) {
        synchronized (this.d) {
            T t = this.f;
            if (t != newState && (t == null || !t.equals(newState))) {
                this.f = newState;
                this.b.b().execute(new a(new ArrayList(this.e)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}