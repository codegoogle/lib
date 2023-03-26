package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.i2;

/* compiled from: Trackers.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class be0 {
    private static be0 a;
    private vd0 b;
    private wd0 c;
    private zd0 d;
    private ae0 e;

    private be0(@x1 Context context, @x1 cg0 taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        this.b = new vd0(applicationContext, taskExecutor);
        this.c = new wd0(applicationContext, taskExecutor);
        this.d = new zd0(applicationContext, taskExecutor);
        this.e = new ae0(applicationContext, taskExecutor);
    }

    @x1
    public static synchronized be0 c(Context context, cg0 taskExecutor) {
        be0 be0Var;
        synchronized (be0.class) {
            if (a == null) {
                a = new be0(context, taskExecutor);
            }
            be0Var = a;
        }
        return be0Var;
    }

    @r2
    public static synchronized void f(@x1 be0 trackers) {
        synchronized (be0.class) {
            a = trackers;
        }
    }

    @x1
    public vd0 a() {
        return this.b;
    }

    @x1
    public wd0 b() {
        return this.c;
    }

    @x1
    public zd0 d() {
        return this.d;
    }

    @x1
    public ae0 e() {
        return this.e;
    }
}