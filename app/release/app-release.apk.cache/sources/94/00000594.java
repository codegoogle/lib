package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.m;
import com.anythink.core.common.j.n;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class f {
    private static f h;
    public ConcurrentHashMap<String, List<af>> d;
    public ConcurrentHashMap<String, Integer> e;
    private MediationBidManager i;
    private final String g = f.class.getSimpleName();
    public ConcurrentHashMap<String, m> a = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, j> b = new ConcurrentHashMap<>(5);
    public ConcurrentHashMap<String, af> c = new ConcurrentHashMap<>(5);
    public List<Integer> f = new CopyOnWriteArrayList();

    private f() {
    }

    public static f a() {
        if (h == null) {
            h = new f();
        }
        return h;
    }

    private void d(af afVar) {
        m N;
        if (afVar == null || (N = afVar.N()) == null) {
            return;
        }
        c(N.g, N.k);
    }

    private boolean e(String str) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_c2sfirstStatus");
            return concurrentHashMap.get(sb.toString()) == null;
        }
        return true;
    }

    public final void b(String str) {
        com.anythink.core.common.j.e.b(this.g, "clean bid cache in disk:".concat(String.valueOf(str)));
        n.a(com.anythink.core.common.b.m.a().e(), com.anythink.core.common.b.g.v, str);
    }

    public final j c(af afVar) {
        if (afVar != null) {
            return b(afVar.N().g, afVar.N().k);
        }
        return null;
    }

    public final void c(String str, String str2) {
        ConcurrentHashMap<String, j> concurrentHashMap = this.b;
        concurrentHashMap.remove(str + "_" + str2);
    }

    private void d(String str) {
        if (this.e == null) {
            this.e = new ConcurrentHashMap<>();
        }
        this.e.put(wo1.t(str, "_c2sfirstStatus"), 1);
    }

    public final MediationBidManager b() {
        return this.i;
    }

    public final af c(String str) {
        return this.c.get(str);
    }

    private void a(af afVar, m mVar) {
        this.a.put(afVar.t(), mVar);
        if (afVar.l() == 3 || afVar.l() == 7) {
            a(afVar.t(), mVar);
        }
    }

    public final double b(af afVar) {
        m N;
        return (afVar == null || (N = afVar.N()) == null) ? zg2.s : a(N.g, afVar.t());
    }

    public final j b(String str, String str2) {
        ConcurrentHashMap<String, j> concurrentHashMap = this.b;
        return concurrentHashMap.get(str + "_" + str2);
    }

    public final void a(String str) {
        this.a.remove(str);
    }

    public final boolean b(int i) {
        boolean z;
        synchronized (this.f) {
            z = !this.f.contains(Integer.valueOf(i));
        }
        return z;
    }

    public static void a(String str, m mVar) {
        n.a(com.anythink.core.common.b.m.a().e(), com.anythink.core.common.b.g.v, str, mVar.c());
    }

    public final m a(af afVar) {
        m mVar = this.a.get(afVar.t());
        if (mVar == null && (afVar.l() == 3 || afVar.l() == 7)) {
            String b = n.b(com.anythink.core.common.b.m.a().e(), com.anythink.core.common.b.g.v, afVar.t(), "");
            if (!TextUtils.isEmpty(b)) {
                mVar = m.a(b);
            }
            if (mVar != null) {
                this.a.put(afVar.t(), mVar);
            }
        }
        return mVar;
    }

    public final void a(MediationBidManager mediationBidManager) {
        this.i = mediationBidManager;
    }

    public final double a(String str, String str2) {
        ConcurrentHashMap<String, j> concurrentHashMap = this.b;
        j jVar = concurrentHashMap.get(str + "_" + str2);
        return jVar != null ? jVar.c : zg2.s;
    }

    public final void a(String str, String str2, j jVar) {
        ConcurrentHashMap<String, j> concurrentHashMap = this.b;
        concurrentHashMap.put(str + "_" + str2, jVar);
    }

    public final void a(String str, af afVar) {
        this.c.put(str, afVar);
    }

    public final void a(int i) {
        synchronized (this.f) {
            if (!this.f.contains(Integer.valueOf(i))) {
                this.f.add(Integer.valueOf(i));
            }
        }
    }
}