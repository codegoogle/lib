package com.p7700g.p99005;

import android.util.Log;
import com.p7700g.p99005.rp1;
import com.p7700g.p99005.xs1;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes2.dex */
public class bt1 implements xs1 {
    private static final String a = "DiskLruCacheWrapper";
    private static final int b = 1;
    private static final int c = 1;
    private static bt1 d;
    private final File f;
    private final long g;
    private rp1 i;
    private final zs1 h = new zs1();
    private final jt1 e = new jt1();

    @Deprecated
    public bt1(File file, long j) {
        this.f = file;
        this.g = j;
    }

    public static xs1 d(File file, long j) {
        return new bt1(file, j);
    }

    @Deprecated
    public static synchronized xs1 e(File file, long j) {
        bt1 bt1Var;
        synchronized (bt1.class) {
            if (d == null) {
                d = new bt1(file, j);
            }
            bt1Var = d;
        }
        return bt1Var;
    }

    private synchronized rp1 f() throws IOException {
        if (this.i == null) {
            this.i = rp1.X(this.f, 1, 1, this.g);
        }
        return this.i;
    }

    private synchronized void g() {
        this.i = null;
    }

    @Override // com.p7700g.p99005.xs1
    public void a(gq1 gq1Var, xs1.b bVar) {
        rp1 f;
        String b2 = this.e.b(gq1Var);
        this.h.a(b2);
        try {
            if (Log.isLoggable(a, 2)) {
                String str = "Put: Obtained: " + b2 + " for for Key: " + gq1Var;
            }
            try {
                f = f();
            } catch (IOException unused) {
                Log.isLoggable(a, 5);
            }
            if (f.F(b2) != null) {
                return;
            }
            rp1.c z = f.z(b2);
            if (z != null) {
                try {
                    if (bVar.a(z.f(0))) {
                        z.e();
                    }
                    z.b();
                    return;
                } catch (Throwable th) {
                    z.b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + b2);
        } finally {
            this.h.b(b2);
        }
    }

    @Override // com.p7700g.p99005.xs1
    public File b(gq1 gq1Var) {
        String b2 = this.e.b(gq1Var);
        if (Log.isLoggable(a, 2)) {
            String str = "Get: Obtained: " + b2 + " for for Key: " + gq1Var;
        }
        try {
            rp1.e F = f().F(b2);
            if (F != null) {
                return F.b(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable(a, 5);
            return null;
        }
    }

    @Override // com.p7700g.p99005.xs1
    public void c(gq1 gq1Var) {
        try {
            f().c1(this.e.b(gq1Var));
        } catch (IOException unused) {
            Log.isLoggable(a, 5);
        }
    }

    @Override // com.p7700g.p99005.xs1
    public synchronized void clear() {
        try {
            f().v();
        } catch (IOException unused) {
            Log.isLoggable(a, 5);
        }
        g();
    }
}