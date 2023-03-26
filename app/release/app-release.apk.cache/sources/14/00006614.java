package com.p7700g.p99005;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: GlideException.java */
/* loaded from: classes2.dex */
public final class xr1 extends Exception {
    private static final long s = 1;
    private static final StackTraceElement[] t = new StackTraceElement[0];
    private final List<Throwable> u;
    private gq1 v;
    private aq1 w;
    private Class<?> x;
    private String y;
    @z1
    private Exception z;

    public xr1(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof xr1) {
            for (Throwable th2 : ((xr1) th).f()) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof xr1) {
                ((xr1) th).m(appendable);
            } else {
                d(th, appendable);
            }
            i = i2;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void m(Appendable appendable) {
        d(this, appendable);
        b(f(), new a(appendable));
    }

    public List<Throwable> f() {
        return this.u;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @z1
    public Exception g() {
        return this.z;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.y);
        String str3 = "";
        if (this.x != null) {
            StringBuilder G = wo1.G(", ");
            G.append(this.x);
            str = G.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.w != null) {
            StringBuilder G2 = wo1.G(", ");
            G2.append(this.w);
            str2 = G2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.v != null) {
            StringBuilder G3 = wo1.G(", ");
            G3.append(this.v);
            str3 = G3.toString();
        }
        sb.append(str3);
        List<Throwable> h = h();
        if (h.isEmpty()) {
            return sb.toString();
        }
        if (h.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(h.size());
            sb.append(" root causes:");
        }
        for (Throwable th : h) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public List<Throwable> h() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void i(String str) {
        List<Throwable> h = h();
        int size = h.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            h.get(i);
            i = i2;
        }
    }

    public void n(gq1 gq1Var, aq1 aq1Var) {
        o(gq1Var, aq1Var, null);
    }

    public void o(gq1 gq1Var, aq1 aq1Var, Class<?> cls) {
        this.v = gq1Var;
        this.w = aq1Var;
        this.x = cls;
    }

    public void p(@z1 Exception exc) {
        this.z = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public xr1(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m(printStream);
    }

    public xr1(String str, List<Throwable> list) {
        this.y = str;
        setStackTrace(t);
        this.u = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m(printWriter);
    }

    /* compiled from: GlideException.java */
    /* loaded from: classes2.dex */
    public static final class a implements Appendable {
        private static final String s = "";
        private static final String t = "  ";
        private final Appendable u;
        private boolean v = true;

        public a(Appendable appendable) {
            this.u = appendable;
        }

        @x1
        private CharSequence a(@z1 CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            if (this.v) {
                this.v = false;
                this.u.append("  ");
            }
            this.v = c == '\n';
            this.u.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@z1 CharSequence charSequence) throws IOException {
            CharSequence a = a(charSequence);
            return append(a, 0, a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@z1 CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = a(charSequence);
            boolean z = false;
            if (this.v) {
                this.v = false;
                this.u.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.v = z;
            this.u.append(a, i, i2);
            return this;
        }
    }
}