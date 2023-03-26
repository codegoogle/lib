package com.p7700g.p99005;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.p7700g.p99005.hr5;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultTrackerTransport.java */
/* loaded from: classes2.dex */
public class x91 extends w91 {
    @x1
    public static final String a = "default";
    @x1
    private static final kj1 b = kj1.b("DefaultTrackerTransport");
    private static final int c = 100;
    private static final int d = 3145728;
    @z1
    private b e;
    @z1
    private String f;
    @z1
    private a91 g;
    @z1
    private fr5 h;
    @z1
    private c91 i;
    private int j = 0;

    /* compiled from: DefaultTrackerTransport.java */
    /* loaded from: classes2.dex */
    public static class a {
        @mw2("fields")
        private final Map<String, String> a;

        public a(Map<String, String> map) {
            this.a = map;
        }

        public Map<String, String> a() {
            return this.a;
        }
    }

    /* compiled from: DefaultTrackerTransport.java */
    /* loaded from: classes2.dex */
    public static class b {
        @x1
        @mw2("report-url-provider")
        private final k81<? extends c91> a;
        private final int b;
        private final long c;

        public b(@x1 k81<? extends c91> k81Var, int i, long j) {
            this.a = k81Var;
            this.b = i;
            this.c = j;
        }

        public long b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }
    }

    public x91() {
        b.c("DefaultTrackerTransport constructor", new Object[0]);
    }

    @Override // com.p7700g.p99005.z91
    public void a(@x1 Context context, @x1 String str, @x1 a91 a91Var, @z1 String str2, @x1 fr5 fr5Var) {
        this.f = str;
        this.g = a91Var;
        this.h = fr5Var;
        b.c("Called init", new Object[0]);
        if (str2 == null) {
            return;
        }
        b bVar = (b) new Gson().n(str2, b.class);
        this.e = bVar;
        if (bVar != null) {
            try {
                this.i = (c91) j81.a().b(this.e.a);
            } catch (Throwable th) {
                try {
                    Constructor<?> constructor = Class.forName(this.e.a.g()).getConstructor(Context.class);
                    if (constructor != null) {
                        this.i = (c91) constructor.newInstance(context);
                    } else {
                        b.f(th);
                    }
                } catch (Throwable th2) {
                    b.f(th2);
                }
            }
        }
        if (this.i == null) {
            this.i = c91.a;
        }
    }

    @Override // com.p7700g.p99005.z91
    public boolean b(@x1 t91 t91Var, @x1 List<String> list, @x1 List<v91> list2) {
        kj1 kj1Var;
        try {
            kj1Var = b;
            kj1Var.c("upload", new Object[0]);
        } catch (Throwable th) {
            b.f(th);
        }
        if (this.i != null && this.e != null && this.h != null && this.g != null && this.f != null) {
            if (list2.size() < this.e.c()) {
                kj1Var.c("eventList.size() < settings.getMinUploadItemsCount() skip upload", new Object[0]);
                return false;
            } else if (System.currentTimeMillis() - this.g.c(this.f) < this.e.b()) {
                kj1Var.c("diff < settings.getMinUploadDelayMillis() skip upload", new Object[0]);
                return false;
            } else {
                y91 y91Var = new y91(new pv2().w(nv2.w).e());
                StringBuilder sb = new StringBuilder((int) d);
                int i = this.j;
                int i2 = 0;
                for (v91 v91Var : list2) {
                    if (i2 > 100 || sb.length() > d) {
                        break;
                    }
                    v91Var.c().put("seq_no", Integer.valueOf(i));
                    sb.append(y91Var.a(v91Var));
                    sb.append("\n");
                    i2++;
                    i++;
                    list.add(v91Var.b());
                }
                if (sb.length() > 0) {
                    kj1 kj1Var2 = b;
                    kj1Var2.c("Perform Request data: %s", sb);
                    String provide = this.i.provide();
                    if (provide != null) {
                        try {
                            jr5 w0 = this.h.a(new hr5.a().B(provide).r(ir5.f(br5.h("text/plain"), sb.toString())).b()).w0();
                            if (w0.s1()) {
                                this.j = i;
                                kj1Var2.c("Upload success", new Object[0]);
                                this.g.d((String) r81.f(this.f), System.currentTimeMillis());
                                this.i.reportUrl(provide, true, null);
                                t91Var.k(sb.toString(), w0.toString(), w0.E());
                                return true;
                            }
                            t91Var.k(sb.toString(), w0.toString(), w0.E());
                            this.i.reportUrl(provide, false, null);
                            kj1Var2.c("Upload failure %s", w0);
                        } catch (Exception e) {
                            t91Var.k(sb.toString(), Log.getStackTraceString(e), 0);
                            this.i.reportUrl(provide, false, e);
                            b.f(e);
                        }
                    } else {
                        kj1Var2.c("Provider returned empty url. Skip upload", new Object[0]);
                    }
                } else {
                    b.c("Data length == 0. Skip upload", new Object[0]);
                }
                return false;
            }
        }
        kj1Var.c("Empty endpoint skip upload", new Object[0]);
        return false;
    }

    @Override // com.p7700g.p99005.z91
    public void c(@x1 Context context) {
        b.c("onBecameOnline", new Object[0]);
    }

    @Override // com.p7700g.p99005.z91
    public String getKey() {
        return "default";
    }
}