package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: Logger.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class tb0 {
    private static tb0 a = null;
    private static final String b = "WM-";
    private static final int c = 23;
    private static final int d = 20;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends tb0 {
        private int e;

        public a(int loggingLevel) {
            super(loggingLevel);
            this.e = loggingLevel;
        }

        @Override // com.p7700g.p99005.tb0
        public void a(String tag, String message, Throwable... throwables) {
            if (this.e > 3 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // com.p7700g.p99005.tb0
        public void b(String tag, String message, Throwable... throwables) {
            if (this.e > 6 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // com.p7700g.p99005.tb0
        public void d(String tag, String message, Throwable... throwables) {
            if (this.e > 4 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // com.p7700g.p99005.tb0
        public void g(String tag, String message, Throwable... throwables) {
            if (this.e > 2 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }

        @Override // com.p7700g.p99005.tb0
        public void h(String tag, String message, Throwable... throwables) {
            if (this.e > 5 || throwables == null || throwables.length < 1) {
                return;
            }
            Throwable th = throwables[0];
        }
    }

    public tb0(int loggingLevel) {
    }

    public static synchronized tb0 c() {
        tb0 tb0Var;
        synchronized (tb0.class) {
            if (a == null) {
                a = new a(3);
            }
            tb0Var = a;
        }
        return tb0Var;
    }

    public static synchronized void e(tb0 logger) {
        synchronized (tb0.class) {
            a = logger;
        }
    }

    public static String f(@x1 String tag) {
        int length = tag.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(b);
        int i = d;
        if (length >= i) {
            sb.append(tag.substring(0, i));
        } else {
            sb.append(tag);
        }
        return sb.toString();
    }

    public abstract void a(String tag, String message, Throwable... throwables);

    public abstract void b(String tag, String message, Throwable... throwables);

    public abstract void d(String tag, String message, Throwable... throwables);

    public abstract void g(String tag, String message, Throwable... throwables);

    public abstract void h(String tag, String message, Throwable... throwables);
}