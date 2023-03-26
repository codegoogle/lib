package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.anchorfree.sdk.provider.TelemetryUrlProvider;
import com.google.gson.Gson;
import com.p7700g.p99005.e91;
import com.p7700g.p99005.mg1;
import com.p7700g.p99005.u31;
import com.p7700g.p99005.x91;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Telemetry.java */
/* loaded from: classes.dex */
public class i51 implements mg1.a, c21 {
    @x1
    private static final kj1 a = kj1.a(i51.class);
    @x1
    private static final String b = "com.anchorfree.hydrakit.TELEMETRY_PREFS";
    @x1
    private static final String c = "pref_servers_success";
    @x1
    private final e91 d;
    @x1
    private final SharedPreferences e;
    @x1
    private final Context f;
    @x1
    private final o51 g;
    @x1
    private final a h;
    @x1
    private final u31 i;
    @x1
    private final Executor j = Executors.newSingleThreadExecutor();
    @z1
    private volatile mg1.a k;

    /* compiled from: Telemetry.java */
    /* loaded from: classes.dex */
    public interface a {
        @x1
        dq0<d51> provide();
    }

    public i51(@x1 Context context, @x1 o51 o51Var, @x1 h31 h31Var, @x1 a aVar) {
        this.e = context.getSharedPreferences(b, 0);
        this.f = context;
        this.g = o51Var;
        this.h = aVar;
        f91 f = new f91().a(k81.d(x91.class, new Object[0])).a(k81.d(u31.c.class, new Object[0])).f("default", new Gson().z(new x91.b(k81.d(TelemetryUrlProvider.class, new Object[0]), 0, 0L)));
        f.b(k81.d(w41.class, new Object[0]));
        e91 a2 = e91.a(context, "sdk", f.c());
        this.d = a2;
        this.i = new u31(context, a2, (x31) i61.a().d(x31.class));
        h31Var.f(this);
        c();
    }

    private void c() {
        this.g.d().q(new aq0() { // from class: com.p7700g.p99005.qz0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                i51.this.e(dq0Var);
                return null;
            }
        });
    }

    private /* synthetic */ Object d(dq0 dq0Var) throws Exception {
        synchronized (this) {
            try {
                k81 k81Var = (k81) dq0Var.F();
                if (k81Var != null) {
                    try {
                        this.k = (mg1.a) j81.a().b(k81Var);
                        a.c("Created tracker delegate", new Object[0]);
                    } catch (Throwable unused) {
                        this.k = (mg1.a) Class.forName(k81Var.g()).getConstructor(Context.class).newInstance(this.f);
                        a.c("Created tracker delegate", new Object[0]);
                    }
                } else {
                    a.c("Set tracker delegate to null", new Object[0]);
                    this.k = null;
                }
            }
        }
        return null;
    }

    private /* synthetic */ Object f(d51 d51Var, dq0 dq0Var) throws Exception {
        if (dq0Var.F() == Boolean.TRUE) {
            this.i.l(d51Var.g().getCountry(), d51Var.f(), d51Var.e(), d51Var.c(), this.j);
            return null;
        }
        return null;
    }

    private /* synthetic */ Object h(dq0 dq0Var) throws Exception {
        final d51 d51Var = (d51) dq0Var.F();
        if (d51Var != null) {
            this.g.e().q(new aq0() { // from class: com.p7700g.p99005.tz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var2) {
                    i51.this.g(d51Var, dq0Var2);
                    return null;
                }
            });
            return null;
        }
        return null;
    }

    private /* synthetic */ Object j(d51 d51Var, u51 u51Var, dq0 dq0Var) throws Exception {
        if (dq0Var.F() == Boolean.TRUE) {
            this.i.j(d51Var, u51Var.c(), this.j);
            return null;
        }
        return null;
    }

    private /* synthetic */ Object l(final u51 u51Var, dq0 dq0Var) throws Exception {
        final d51 d51Var = (d51) dq0Var.F();
        if (d51Var != null) {
            this.g.e().q(new aq0() { // from class: com.p7700g.p99005.sz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var2) {
                    i51.this.k(d51Var, u51Var, dq0Var2);
                    return null;
                }
            });
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void o(String str, Bundle bundle) {
        mg1.a aVar;
        synchronized (this) {
            aVar = this.k;
        }
        if (aVar != null) {
            a.c("Has delegate. Insert", new Object[0]);
            aVar.b(str, bundle);
            return;
        }
        a.c("No tracking delegate. Skip", new Object[0]);
    }

    private /* synthetic */ Object p(final String str, Map map, dq0 dq0Var) throws Exception {
        if (dq0Var.F() == Boolean.TRUE) {
            this.d.k(str, map, new e91.b() { // from class: com.p7700g.p99005.uz0
                @Override // com.p7700g.p99005.e91.b
                public final void a(Bundle bundle) {
                    i51.this.o(str, bundle);
                }
            });
            a.l("{[%s], [%s]}", str, map);
            return null;
        }
        return null;
    }

    private void t(@x1 final String str, @x1 final Map<String, String> map) {
        this.g.e().q(new aq0() { // from class: com.p7700g.p99005.rz0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                i51.this.q(str, map, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.c21
    public void a(@x1 Object obj) {
        if (obj instanceof s21) {
            c();
        } else if (obj instanceof w51) {
            if (en1.CONNECTED == ((w51) obj).c() && wm1.d(this.f)) {
                this.h.provide().s(new aq0() { // from class: com.p7700g.p99005.wz0
                    @Override // com.p7700g.p99005.aq0
                    public final Object a(dq0 dq0Var) {
                        i51.this.i(dq0Var);
                        return null;
                    }
                }, this.j);
            }
        } else if ((obj instanceof u51) && wm1.d(this.f)) {
            final u51 u51Var = (u51) obj;
            this.h.provide().s(new aq0() { // from class: com.p7700g.p99005.vz0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var) {
                    i51.this.m(u51Var, dq0Var);
                    return null;
                }
            }, this.j);
        }
    }

    @Override // com.p7700g.p99005.mg1.a
    public void b(@x1 String str, @x1 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("startExtras");
        a.c("Track: event: %s, params: %s", str, bundle.toString());
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            hashMap.put(h51.m, bundle2.getString(h51.m));
        }
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                hashMap.put(str2, String.valueOf(obj));
            }
        }
        t(str, hashMap);
    }

    public /* synthetic */ Object e(dq0 dq0Var) {
        d(dq0Var);
        return null;
    }

    public /* synthetic */ Object g(d51 d51Var, dq0 dq0Var) {
        f(d51Var, dq0Var);
        return null;
    }

    public /* synthetic */ Object i(dq0 dq0Var) {
        h(dq0Var);
        return null;
    }

    public /* synthetic */ Object k(d51 d51Var, u51 u51Var, dq0 dq0Var) {
        j(d51Var, u51Var, dq0Var);
        return null;
    }

    public /* synthetic */ Object m(u51 u51Var, dq0 dq0Var) {
        l(u51Var, dq0Var);
        return null;
    }

    public /* synthetic */ Object q(String str, Map map, dq0 dq0Var) {
        p(str, map, dq0Var);
        return null;
    }

    public void r(@x1 String str) {
        s(Collections.singletonList(str));
    }

    public void s(@z1 Collection<String> collection) {
        Set<String> stringSet = this.e.getStringSet(c, new HashSet());
        if (collection != null) {
            stringSet.addAll(collection);
        }
        this.e.edit().putStringSet(c, stringSet).apply();
    }
}