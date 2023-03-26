package com.p7700g.p99005;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import com.p7700g.p99005.a20;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.z10;

/* compiled from: MediaSessionManager.java */
/* loaded from: classes.dex */
public final class x10 {
    public static final String a = "MediaSessionManager";
    public static final boolean b = Log.isLoggable(a, 3);
    private static final Object c = new Object();
    private static volatile x10 d;
    public a e;

    /* compiled from: MediaSessionManager.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(c cVar);

        Context getContext();
    }

    /* compiled from: MediaSessionManager.java */
    /* loaded from: classes.dex */
    public interface c {
        int a();

        int b();

        String e();
    }

    private x10(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.e = new z10(context);
        } else {
            this.e = new y10(context);
        }
    }

    @x1
    public static x10 b(@x1 Context context) {
        x10 x10Var = d;
        if (x10Var == null) {
            synchronized (c) {
                x10Var = d;
                if (x10Var == null) {
                    d = new x10(context.getApplicationContext());
                    x10Var = d;
                }
            }
        }
        return x10Var;
    }

    public Context a() {
        return this.e.getContext();
    }

    public boolean c(@x1 b bVar) {
        if (bVar != null) {
            return this.e.a(bVar.b);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* compiled from: MediaSessionManager.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final String a = "android.media.session.MediaController";
        public c b;

        public b(@x1 String str, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.b = new z10.a(str, i, i2);
            } else {
                this.b = new a20.a(str, i, i2);
            }
        }

        @x1
        public String a() {
            return this.b.e();
        }

        public int b() {
            return this.b.b();
        }

        public int c() {
            return this.b.a();
        }

        public boolean equals(@z1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.b.equals(((b) obj).b);
            }
            return false;
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        @e2(28)
        @i2({i2.a.LIBRARY_GROUP})
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.b = new z10.a(remoteUserInfo);
        }
    }
}