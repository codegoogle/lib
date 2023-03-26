package com.anythink.core.c;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.ac;
import com.anythink.core.common.g.h;
import com.anythink.core.common.j.n;
import com.anythink.core.common.q;
import com.anythink.core.common.res.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    public static final String a = "b";
    private static b c;
    private static com.anythink.core.c.a d;
    private Context e;
    private Object g = new Object();
    private boolean f = false;
    public List<a> b = Collections.synchronizedList(new ArrayList(3));

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    private b(Context context) {
        this.e = context;
    }

    private Context c() {
        return this.e;
    }

    private void d() {
        synchronized (this.g) {
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.b.clear();
        }
    }

    private static com.anythink.core.c.a e() {
        com.anythink.core.c.a aVar = new com.anythink.core.c.a();
        aVar.b = true;
        aVar.K();
        aVar.b("0");
        aVar.a(0L);
        aVar.Q();
        aVar.T();
        aVar.V();
        aVar.c("");
        aVar.Y();
        aVar.aa();
        aVar.d("");
        aVar.I();
        aVar.C();
        aVar.u();
        aVar.w();
        aVar.a("[\"com.anythink\"]");
        aVar.q();
        return aVar;
    }

    private boolean f() {
        return this.f;
    }

    private static void g() {
    }

    public static /* synthetic */ void c(b bVar) {
        synchronized (bVar.g) {
            Iterator<a> it = bVar.b.iterator();
            while (it.hasNext()) {
                it.next();
            }
            bVar.b.clear();
        }
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                synchronized (b.class) {
                    if (c == null) {
                        c = new b(context);
                    }
                }
            }
            bVar = c;
        }
        return bVar;
    }

    private void b(Context context) {
        this.e = context;
    }

    private void b(a aVar) {
        synchronized (this.g) {
            if (aVar != null) {
                this.b.remove(aVar);
            }
        }
    }

    public final synchronized com.anythink.core.c.a b(String str) {
        ac acVar;
        if (d == null) {
            try {
                if (this.e == null) {
                    this.e = m.a().e();
                }
                List<ac> a2 = com.anythink.core.common.c.d.a(com.anythink.core.common.c.c.a(this.e)).a(str, g.o.a);
                com.anythink.core.c.a aVar = null;
                if (a2 != null && a2.size() > 0 && (acVar = a2.get(0)) != null && (aVar = com.anythink.core.c.a.e(acVar.d())) != null) {
                    aVar.a(Long.parseLong(acVar.a()));
                }
                d = aVar;
                if (aVar == null) {
                    com.anythink.core.c.a aVar2 = new com.anythink.core.c.a();
                    aVar2.b = true;
                    aVar2.K();
                    aVar2.b("0");
                    aVar2.a(0L);
                    aVar2.Q();
                    aVar2.T();
                    aVar2.V();
                    aVar2.c("");
                    aVar2.Y();
                    aVar2.aa();
                    aVar2.d("");
                    aVar2.I();
                    aVar2.C();
                    aVar2.u();
                    aVar2.w();
                    aVar2.a("[\"com.anythink\"]");
                    aVar2.q();
                    d = aVar2;
                }
            } catch (Exception unused) {
            }
        }
        return d;
    }

    private void a(a aVar) {
        synchronized (this.g) {
            if (this.g != null) {
                this.b.add(aVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str) {
        boolean z;
        Map<String, Object> map;
        boolean z2;
        com.anythink.core.c.a b = b(str);
        if (b != null) {
            c a2 = b.a();
            long J = b.J();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z3 = b.D() + J <= currentTimeMillis;
            if (a2 != null) {
                if (a2.a() + b.D() <= currentTimeMillis) {
                    z = true;
                    map = b.c;
                    Map<String, Object> k = m.a().k();
                    if (map == null) {
                        z2 = !map.equals(k);
                    } else {
                        z2 = k != null;
                    }
                    if (!z3 && !z && !z2) {
                        return false;
                    }
                }
            }
            z = false;
            map = b.c;
            Map<String, Object> k2 = m.a().k();
            if (map == null) {
            }
            if (!z3) {
                return false;
            }
        }
        com.anythink.core.common.j.e.b(a, "app Settings timeout or not exists");
        return true;
    }

    public static long a() {
        com.anythink.core.c.a aVar = d;
        if (aVar == null || aVar.B() == 0) {
            return 51200L;
        }
        return d.B();
    }

    private static com.anythink.core.c.a a(Context context, String str) {
        ac acVar;
        List<ac> a2 = com.anythink.core.common.c.d.a(com.anythink.core.common.c.c.a(context)).a(str, g.o.a);
        com.anythink.core.c.a aVar = null;
        if (a2 != null && a2.size() > 0 && (acVar = a2.get(0)) != null && (aVar = com.anythink.core.c.a.e(acVar.d())) != null) {
            aVar.a(Long.parseLong(acVar.a()));
        }
        return aVar;
    }

    public static com.anythink.core.c.a a(Context context, String str, String str2) {
        com.anythink.core.common.c.d.a(com.anythink.core.common.c.c.a(context)).a(str, str2, g.o.a);
        com.anythink.core.c.a e = com.anythink.core.c.a.e(str2);
        e.a(System.currentTimeMillis());
        n.a(context, g.o, g.o.j, e.O());
        return e;
    }

    public final synchronized void a(final String str, String str2) {
        if (this.f) {
            return;
        }
        this.f = true;
        new com.anythink.core.common.g.d(this.e, str, str2).a(0, new h() { // from class: com.anythink.core.c.b.1
            @Override // com.anythink.core.common.g.h
            public final void onLoadCanceled(int i) {
                b.this.f = false;
                b.c(b.this);
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadError(int i, String str3, AdError adError) {
                b.this.f = false;
                com.anythink.core.common.j.e.d(b.a, "app strg f!".concat(String.valueOf(str3)));
                b.c(b.this);
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadFinish(int i, Object obj) {
                b.this.f = false;
                if (obj != null) {
                    com.anythink.core.c.a unused = b.d = b.a(b.this.e, str, obj.toString());
                    if (b.d != null) {
                        String k = b.d.k();
                        if (!TextUtils.isEmpty(k) && TextUtils.isEmpty(m.a().w())) {
                            m.a().g(k);
                        }
                        m.a().a(b.d);
                        q.a(b.this.e).a(b.d);
                        Context unused2 = b.this.e;
                        com.anythink.core.c.a unused3 = b.d;
                        b.a(b.this.e, b.d);
                    }
                    b.c(b.this);
                    return;
                }
                com.anythink.core.common.j.e.d(b.a, "app strg f!");
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadStart(int i) {
            }
        });
    }

    private static void b(Context context, com.anythink.core.c.a aVar) {
        if (aVar == null) {
            return;
        }
        String d2 = aVar.d();
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, d2), (b.a) null);
    }

    public static /* synthetic */ void a(Context context, com.anythink.core.c.a aVar) {
        if (aVar != null) {
            String d2 = aVar.d();
            if (TextUtils.isEmpty(d2)) {
                return;
            }
            com.anythink.core.common.res.b.a(context).a(new com.anythink.core.common.res.e(3, d2), (b.a) null);
        }
    }
}