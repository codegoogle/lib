package com.anythink.core.common.i;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.b.i;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.f;
import com.anythink.core.common.e.m;
import com.anythink.core.common.g.a.b;
import com.anythink.core.common.g.h;
import com.anythink.core.common.g.k;
import com.anythink.core.common.j.g;
import com.anythink.core.common.n;
import com.anythink.core.common.p;
import com.anythink.core.common.q;
import com.p7700g.p99005.wo1;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class a extends n<f> {
    private static a e;

    private a(Context context) {
        super(context);
    }

    private static void c(int i, ae aeVar) {
        if (aeVar instanceof e) {
            if (i == 4) {
                ((e) aeVar).b();
            } else if (i != 6) {
            } else {
                ((e) aeVar).c();
            }
        }
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (e == null) {
                e = new a(context);
            }
            aVar = e;
        }
        return aVar;
    }

    private void b(int i, ae aeVar, af afVar) {
        if (i == 4) {
            m N = afVar != null ? afVar.N() : null;
            if (N != null) {
                N.a(true, N.price, true);
            }
            if (aeVar instanceof e) {
                a((e) aeVar, afVar);
            }
        }
    }

    public final synchronized void a(int i, ae aeVar) {
        a(i, aeVar, null, -1L);
    }

    private static void b(int i, ae aeVar) {
        if (4 == i && (aeVar instanceof e)) {
            p.a();
            p.a((e) aeVar);
        }
    }

    public final synchronized void a(int i, ae aeVar, af afVar) {
        a(i, aeVar, afVar, -1L);
    }

    private f b(int i, ae aeVar, af afVar, long j) {
        if (i == 13) {
            m N = afVar != null ? afVar.N() : null;
            if (N != null) {
                N.a(afVar);
            }
        }
        if (i == 4) {
            m N2 = afVar != null ? afVar.N() : null;
            if (N2 != null) {
                N2.a(true, N2.price, true);
            }
            if (aeVar instanceof e) {
                a((e) aeVar, afVar);
            }
        }
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()));
        f fVar = new f();
        fVar.a = i;
        fVar.b = aeVar;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        fVar.c = j;
        q.a(com.anythink.core.common.b.m.a().e()).a(i, fVar, l0);
        if (a(i, aeVar, l0)) {
            return null;
        }
        if (4 == i && (aeVar instanceof e)) {
            p.a();
            p.a((e) aeVar);
        }
        return fVar;
    }

    private static void a(int i, af afVar) {
        if (i == 13) {
            m N = afVar != null ? afVar.N() : null;
            if (N != null) {
                N.a(afVar);
            }
        }
    }

    private static boolean a(int i, ae aeVar, com.anythink.core.c.a aVar) {
        String ae = aVar.ae();
        if (!TextUtils.isEmpty(ae) && (aeVar instanceof e)) {
            try {
                JSONArray jSONArray = new JSONArray(ae);
                int length = jSONArray.length();
                String valueOf = String.valueOf(((e) aeVar).G());
                for (int i2 = 0; i2 < length; i2++) {
                    if (TextUtils.equals(valueOf, jSONArray.optString(i2))) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Map<String, String> ac = aVar.ac();
        if (ac != null && ac.containsKey(String.valueOf(i))) {
            String str = ac.get(String.valueOf(i));
            if (!TextUtils.isEmpty(str) && str.contains(aeVar.U())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.core.common.n
    public final void a(List<f> list) {
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()));
        if (l0 != null) {
            int m = l0.m();
            if (m == 1) {
                com.anythink.core.common.g.a.d dVar = new com.anythink.core.common.g.a.d(list);
                dVar.a(1, l0.l());
                dVar.a((b.a) null);
                return;
            } else if (m != 2) {
                new k(this.d, l0.m(), list).a(0, (h) null);
                return;
            } else {
                new k(this.d, l0.m(), list).a(0, (h) null);
                com.anythink.core.common.g.a.d dVar2 = new com.anythink.core.common.g.a.d(list);
                dVar2.a(2, l0.l());
                dVar2.a((b.a) null);
                return;
            }
        }
        new k(this.d, 0, list).a(0, (h) null);
    }

    private void a(e eVar, af afVar) {
        List<String> r;
        List<af> B;
        com.anythink.core.common.e.b a;
        m N;
        String S = eVar.S();
        com.anythink.core.c.d a2 = com.anythink.core.c.e.a(this.d).a(S);
        if (a2 == null || (r = a2.r()) == null || r.size() == 0 || (B = a2.B()) == null || B.size() == 0) {
            return;
        }
        for (af afVar2 : B) {
            try {
                if (r.contains(String.valueOf(afVar2.c())) && (a = com.anythink.core.common.a.a().a(S, afVar2)) != null && (N = a.e().getUnitGroupInfo().N()) != null) {
                    N.a(false, g.a(afVar, afVar.x()), afVar.j());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final synchronized void a(final int i, final ae aeVar, final af afVar, final long j) {
        if (aeVar instanceof e) {
            if (i == 4) {
                ((e) aeVar).b();
            } else if (i == 6) {
                ((e) aeVar).c();
            }
        }
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.i.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if ((aeVar instanceof e) && com.anythink.core.common.b.m.a().G()) {
                    i.a().a(i, (e) aeVar);
                }
                f a = a.a(a.this, i, aeVar, afVar, j);
                if (a == null) {
                    return;
                }
                af afVar2 = afVar;
                if (afVar2 == null || afVar2.l() != 7) {
                    a.super.a((a) a);
                } else {
                    a.super.b(a);
                }
            }
        });
    }

    public static /* synthetic */ f a(a aVar, int i, ae aeVar, af afVar, long j) {
        if (i == 13) {
            m N = afVar != null ? afVar.N() : null;
            if (N != null) {
                N.a(afVar);
            }
        }
        if (i == 4) {
            m N2 = afVar != null ? afVar.N() : null;
            if (N2 != null) {
                N2.a(true, N2.price, true);
            }
            if (aeVar instanceof e) {
                aVar.a((e) aeVar, afVar);
            }
        }
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(com.anythink.core.common.b.m.a().e()));
        f fVar = new f();
        fVar.a = i;
        fVar.b = aeVar;
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        fVar.c = j;
        q.a(com.anythink.core.common.b.m.a().e()).a(i, fVar, l0);
        if (a(i, aeVar, l0)) {
            return null;
        }
        if (4 == i && (aeVar instanceof e)) {
            p.a();
            p.a((e) aeVar);
        }
        return fVar;
    }
}