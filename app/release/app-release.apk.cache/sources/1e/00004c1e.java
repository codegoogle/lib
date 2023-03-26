package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Log;
import com.google.gson.Gson;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: HydraLogDelegate.java */
@SuppressLint({"LogNotTimber"})
/* loaded from: classes2.dex */
public class ka1 extends ra1 {
    private static final int b = 128;
    @x1
    private static final String c = "\n";
    @x1
    private static final String d = "USDK-";
    private static final String e = "unified:LOGGER:level";
    private static final String f = "unified:LOGGER:handler";
    @x1
    private static Set<String> g = new HashSet();
    @x1
    private final Gson h;
    @x1
    private final x31 i;
    private final z31 j;
    private volatile int k;
    @z1
    private a l;

    /* compiled from: HydraLogDelegate.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, @x1 String str, @x1 String str2);
    }

    public ka1(@x1 final Gson gson, @x1 final x31 x31Var) {
        this.h = gson;
        this.i = x31Var;
        dq0.g(new Callable() { // from class: com.p7700g.p99005.ea1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ka1.this.h(x31Var, gson);
                return null;
            }
        });
        this.j = x31Var.d(null, new c31() { // from class: com.p7700g.p99005.da1
            @Override // com.p7700g.p99005.c31
            public final void a(String str) {
                ka1.this.n(gson, x31Var, str);
            }
        });
    }

    private void d(@x1 Gson gson, @x1 x31 x31Var) {
        try {
            k81 k81Var = (k81) gson.n(x31Var.e(f, ""), k81.class);
            if (k81Var != null) {
                this.l = (a) j81.a().b(k81Var);
            }
        } catch (Throwable unused) {
        }
    }

    private String e(@x1 String str, @z1 Object[] objArr) {
        if (objArr != null) {
            try {
                return objArr.length > 0 ? String.format(str, objArr) : str;
            } catch (Throwable unused) {
                return str;
            }
        }
        return str;
    }

    @x1
    private String f(@x1 Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return th instanceof UnknownHostException ? String.format("UnknownHostException: %s", th.getMessage()) : stringWriter.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private /* synthetic */ Object g(x31 x31Var, Gson gson) throws Exception {
        this.k = (int) x31Var.a(e, 7L);
        d(gson, x31Var);
        return null;
    }

    private /* synthetic */ Object i(Gson gson, x31 x31Var) throws Exception {
        d(gson, x31Var);
        return null;
    }

    private /* synthetic */ Object k(x31 x31Var) throws Exception {
        this.k = (int) x31Var.a(e, 7L);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void n(final Gson gson, final x31 x31Var, String str) {
        if (f.equals(str)) {
            dq0.g(new Callable() { // from class: com.p7700g.p99005.fa1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ka1.this.j(gson, x31Var);
                    return null;
                }
            });
        }
        if (e.equals(str)) {
            dq0.g(new Callable() { // from class: com.p7700g.p99005.ga1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ka1.this.l(x31Var);
                    return null;
                }
            });
        }
    }

    private /* synthetic */ Object o(int i) throws Exception {
        this.i.c().c(e, i).a();
        return null;
    }

    public static void q(@x1 String str) {
        g.add(str);
    }

    public static void r(@x1 String str) {
        g.remove(str);
    }

    @x1
    private String s(@x1 String str, int i) {
        String trim = str.trim();
        if (trim.length() >= i) {
            return trim;
        }
        StringBuilder G = wo1.G(trim);
        while (G.length() < i) {
            G.append(gl4.R);
        }
        return G.toString();
    }

    private void t(int i, @x1 String str, @x1 String str2) {
        String str3 = Build.MANUFACTURER;
        if ((str3.equals("HUAWEI") || str3.equals("samsung")) && (i == 2 || i == 3 || i == 4)) {
            i = 6;
        }
        Log.println(i, str, str2);
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(i, str, str2);
        }
    }

    private static List<String> v(@x1 String str, int i) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + i;
            arrayList.add(str.substring(i2, Math.min(length, i3)));
            i2 = i3;
        }
        return arrayList;
    }

    @Override // com.p7700g.p99005.jj1
    public void a(int i, @z1 Throwable th, @x1 String str, @x1 String str2, @z1 Object... objArr) {
        if (i < this.k) {
            return;
        }
        String t = wo1.t(d, str);
        if (t.length() > 23) {
            t = t.substring(0, 22);
        }
        if (g.contains(str)) {
            return;
        }
        String e2 = e(str2, objArr);
        if (e2.length() > 128) {
            List<String> v = v(e2, 128);
            t(i, t, "---------------------------------------------------------");
            Iterator<String> it = v.iterator();
            while (it.hasNext()) {
                t(i, t, String.format("| %s |", s(it.next().replaceAll(c, ""), 128)));
            }
            if (th != null) {
                t(i, t, f(th));
            }
            t(i, t, "---------------------------------------------------------");
            return;
        }
        t(i, t, s(e2.replaceAll(c, ""), 128));
        if (th != null) {
            t(i, t, f(th));
        }
    }

    @Override // com.p7700g.p99005.ra1
    public void c(final int i) {
        this.k = i;
        dq0.g(new Callable() { // from class: com.p7700g.p99005.ha1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ka1.this.p(i);
                return null;
            }
        });
    }

    public /* synthetic */ Object h(x31 x31Var, Gson gson) {
        g(x31Var, gson);
        return null;
    }

    public /* synthetic */ Object j(Gson gson, x31 x31Var) {
        d(gson, x31Var);
        return null;
    }

    public /* synthetic */ Object l(x31 x31Var) {
        k(x31Var);
        return null;
    }

    public /* synthetic */ Object p(int i) {
        o(i);
        return null;
    }

    public void u(@x1 k81<? extends a> k81Var) {
        this.i.c().b(f, this.h.z(k81Var)).a();
    }
}