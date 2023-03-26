package com.p7700g.p99005;

import android.content.Context;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: InstallReferrerClient.java */
/* loaded from: classes2.dex */
public abstract class ro1 {

    /* compiled from: InstallReferrerClient.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private final Context a;

        private b(Context context) {
            this.a = context;
        }

        public ro1 a() {
            Context context = this.a;
            if (context != null) {
                return new so1(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    /* compiled from: InstallReferrerClient.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
        public static final int E = -1;
        public static final int F = 0;
        public static final int G = 1;
        public static final int H = 2;
        public static final int I = 3;
        public static final int J = 4;
    }

    public static b d(Context context) {
        return new b(context);
    }

    public abstract void a();

    public abstract uo1 b() throws RemoteException;

    public abstract boolean c();

    public abstract void e(to1 to1Var);
}