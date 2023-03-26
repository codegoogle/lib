package com.anythink.expressad.a;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.core.common.b.k;
import com.anythink.expressad.a.c;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.out.LoadingActivity;
import com.anythink.expressad.out.j;
import com.anythink.expressad.out.p;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {
    public static final String a = "Anythink SDK M";
    public static boolean b = false;
    public static Map<String, Long> c = new HashMap();
    public static Set<String> d = new HashSet();
    public static final String e = "2";
    private static final int f = 1;
    private String g;
    private long h;
    private com.anythink.expressad.foundation.c.c i;
    private Context j;
    private c k;
    private com.anythink.expressad.out.f l;
    private com.anythink.expressad.d.a n;
    private boolean o;
    private boolean r;
    private p.c m = null;
    private boolean p = false;
    private boolean q = true;

    public a(Context context, String str) {
        this.i = null;
        this.j = null;
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
        this.n = b2;
        if (b2 == null) {
            com.anythink.expressad.d.b.a();
            this.n = com.anythink.expressad.d.b.c();
        }
        this.o = this.n.u();
        Context applicationContext = context.getApplicationContext();
        this.j = applicationContext;
        this.g = str;
        if (this.i == null) {
            this.i = com.anythink.expressad.foundation.c.c.a(applicationContext);
        }
    }

    private void a(String str) {
        this.g = str;
    }

    private boolean c() {
        return this.q;
    }

    private com.anythink.expressad.out.f d() {
        return this.l;
    }

    private com.anythink.expressad.foundation.c.c e() {
        return this.i;
    }

    private static void f() {
    }

    private void g() {
        c cVar = this.k;
        if (cVar == null || !cVar.a()) {
            return;
        }
        this.k.b();
    }

    private static void h() {
    }

    private int i() {
        try {
            com.anythink.expressad.d.a aVar = this.n;
            if (aVar != null) {
                return aVar.k();
            }
            return 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    private void j() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            k.a(this.j).a(intent);
        } catch (Exception e2) {
            n.b(a, "Exception", e2);
        }
    }

    public final void a(p.c cVar) {
        this.m = cVar;
    }

    public final void b() {
        try {
            this.m = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a() {
        this.q = false;
    }

    private void a(com.anythink.expressad.out.f fVar) {
        this.l = fVar;
    }

    private void b(com.anythink.expressad.foundation.d.c cVar) {
        try {
            Intent intent = new Intent(this.j, LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("icon_url", cVar.bd());
            this.j.startActivity(intent);
        } catch (Exception e2) {
            n.b(a, "Exception", e2);
        }
    }

    private static boolean a(com.anythink.expressad.foundation.d.c cVar) {
        Long l;
        if (cVar != null) {
            try {
                if (2 == cVar.P() || 3 == cVar.P()) {
                    String aZ = cVar.aZ();
                    Map<String, Long> map = c;
                    if (map != null) {
                        if (map.containsKey(aZ) && (l = c.get(aZ)) != null) {
                            if (l.longValue() > System.currentTimeMillis() || d.contains(cVar.aZ())) {
                                return false;
                            }
                        }
                        c.put(cVar.aZ(), Long.valueOf(System.currentTimeMillis() + (cVar.Z() * 1000)));
                        return true;
                    }
                    return true;
                }
                return true;
            } catch (Exception e2) {
                if (com.anythink.expressad.a.a) {
                    e2.printStackTrace();
                    return true;
                }
                return true;
            }
        }
        return true;
    }

    private void b(c.b bVar, com.anythink.expressad.foundation.d.c cVar, boolean z) {
        if (cVar == null || bVar == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.h;
            com.anythink.expressad.foundation.d.f fVar = new com.anythink.expressad.foundation.d.f();
            fVar.i(cVar.ab());
            fVar.a();
            fVar.h(String.valueOf(currentTimeMillis));
            fVar.g(cVar.aZ());
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                fVar.f(URLEncoder.encode(bVar.i(), "utf-8"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.h / 1000);
            fVar.b(sb.toString());
            fVar.a(Integer.parseInt(cVar.ad()));
            fVar.b(cVar.P());
            fVar.a(this.g);
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                fVar.f(URLEncoder.encode(bVar.i(), "utf-8"));
            }
            if (this.o) {
                fVar.c(bVar.a());
                if (!TextUtils.isEmpty(bVar.d())) {
                    fVar.d(URLEncoder.encode(bVar.d(), "utf-8"));
                }
                if (!TextUtils.isEmpty(bVar.f())) {
                    fVar.e(URLEncoder.encode(bVar.f(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.e())) {
                    fVar.c(URLEncoder.encode(bVar.e(), "utf-8"));
                }
            }
            if (z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(fVar);
            v.b(com.anythink.expressad.foundation.d.f.a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(com.anythink.expressad.foundation.d.c cVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(this.j, cVar, this.g, str, true, false, com.anythink.expressad.a.a.a.k);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.c cVar, String str, String str2, boolean z) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a("2", str, cVar, str2, false, z, com.anythink.expressad.a.a.a.h);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.c cVar, String str, String str2, boolean z, boolean z2, int i) {
        if (context == null) {
            return;
        }
        new c(context.getApplicationContext()).a("2", str, cVar, str2, z, z2, i);
    }

    public static void a(Context context, com.anythink.expressad.foundation.d.c cVar, String str, String[] strArr, boolean z) {
        if (context == null || cVar == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        c cVar2 = new c(context.getApplicationContext());
        for (String str2 : strArr) {
            cVar2.a("2", str, cVar, str2, false, z, com.anythink.expressad.a.a.a.h);
        }
    }

    private void a(final boolean z, final j jVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (z && !a.b && com.anythink.expressad.a.o) {
                    a.a(a.this);
                }
                if (a.this.m == null || a.b || !com.anythink.expressad.a.o) {
                    return;
                }
                a.this.m.b(jVar);
            }
        });
    }

    private void a(c.b bVar, com.anythink.expressad.foundation.d.c cVar, boolean z) {
        if (cVar == null || bVar == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.h;
            com.anythink.expressad.foundation.d.f fVar = new com.anythink.expressad.foundation.d.f();
            fVar.i(cVar.ab());
            fVar.a();
            fVar.h(String.valueOf(currentTimeMillis));
            fVar.g(cVar.aZ());
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                fVar.f(URLEncoder.encode(bVar.i(), "utf-8"));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.h / 1000);
            fVar.b(sb.toString());
            fVar.a(Integer.parseInt(cVar.ad()));
            fVar.b(cVar.P());
            fVar.a(this.g);
            fVar.d(bVar.c());
            if (!TextUtils.isEmpty(bVar.i())) {
                fVar.f(URLEncoder.encode(bVar.i(), "utf-8"));
            }
            if (this.o) {
                fVar.c(bVar.a());
                if (!TextUtils.isEmpty(bVar.d())) {
                    fVar.d(URLEncoder.encode(bVar.d(), "utf-8"));
                }
                if (!TextUtils.isEmpty(bVar.f())) {
                    fVar.e(URLEncoder.encode(bVar.f(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(bVar.e())) {
                    fVar.c(URLEncoder.encode(bVar.e(), "utf-8"));
                }
            }
            if (z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(fVar);
            v.b(com.anythink.expressad.foundation.d.f.a(arrayList));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(j jVar, String str) {
        try {
            if (!TextUtils.isEmpty(str) && jVar != null) {
                com.anythink.expressad.foundation.d.c cVar = jVar instanceof com.anythink.expressad.foundation.d.c ? (com.anythink.expressad.foundation.d.c) jVar : null;
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || r.a.a(this.j, str, this.m) || cVar == null) {
                    return;
                }
                if (!TextUtils.isEmpty(cVar.ba())) {
                    Context context = this.j;
                    r.a.a(context, "market://details?id=" + cVar.ba(), this.m);
                } else if (i() == 2) {
                    r.a(this.j, cVar.af(), cVar, this.m);
                } else {
                    r.a(this.j, cVar.af(), this.m);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void a(int i, String str, com.anythink.expressad.foundation.d.c cVar, p.c cVar2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i == 2) {
                r.a(this.j, str, cVar, cVar2);
            } else {
                r.a(this.j, str, cVar2);
            }
        } catch (Throwable th) {
            n.b(a, th.getMessage(), th);
        }
    }

    private boolean a(com.anythink.expressad.foundation.d.c cVar, c.b bVar, boolean z, int i) {
        boolean z2 = false;
        if (z) {
            try {
                int parseInt = Integer.parseInt(cVar.ad());
                if (parseInt == 1) {
                    r.a(this.j, bVar.i(), this.m);
                } else if (parseInt == 2) {
                    r.a(this.j, bVar.i(), cVar, this.m);
                } else if (cVar.ba() != null) {
                    Context context = this.j;
                    if (!r.a.a(context, "market://details?id=" + cVar.ba(), this.m)) {
                        a(i, bVar.i(), cVar, this.m);
                    }
                } else {
                    a(i, bVar.i(), cVar, this.m);
                }
                z2 = true;
            } catch (Throwable th) {
                n.b(a, th.getMessage(), th);
            }
        }
        if (z2) {
            b(bVar, cVar, true);
            p.c cVar2 = this.m;
            if (cVar2 != null) {
                cVar2.a((j) cVar, bVar.i());
            }
        } else {
            b(bVar, cVar, true);
            p.c cVar3 = this.m;
            if (cVar3 != null && z) {
                cVar3.b(cVar, bVar.i());
            }
        }
        return z2;
    }

    private boolean a(com.anythink.expressad.foundation.d.c cVar, c.b bVar, boolean z) {
        boolean z2 = false;
        if (z) {
            try {
                r.a(this.j, cVar.af(), this.m);
                z2 = true;
            } catch (Throwable th) {
                n.b(a, th.getMessage(), th);
            }
        }
        b(bVar, cVar, true);
        if (z2) {
            p.c cVar2 = this.m;
            if (cVar2 != null) {
                cVar2.a((j) cVar, bVar.i());
            }
        } else {
            p.c cVar3 = this.m;
            if (cVar3 != null) {
                cVar3.b(cVar, bVar.i());
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
        if (com.anythink.expressad.foundation.h.r.a.a(r2, "market://details?id=" + r7.ba(), r6.m) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0139, code lost:
        b(r8, r7, true);
        r7 = r6.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013e, code lost:
        if (r7 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
        r7.b(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0144, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(com.anythink.expressad.foundation.d.c cVar, c.b bVar, boolean z, boolean z2) {
        p.c cVar2;
        try {
            if (this.q) {
                if (cVar != null && bVar != null) {
                    int i = i();
                    int h = bVar.h();
                    if (TextUtils.isEmpty(bVar.i()) && z) {
                        int P = cVar.P();
                        if (P == 2) {
                            a(cVar, bVar, z, i());
                            return;
                        } else if (P == 3) {
                            a(cVar, bVar, z);
                            return;
                        } else {
                            r.a(this.j, cVar.af(), this.m);
                            b(bVar, cVar, true);
                            p.c cVar3 = this.m;
                            if (cVar3 != null) {
                                cVar3.a((j) cVar, bVar.i());
                                return;
                            }
                            return;
                        }
                    }
                    if (h == 1) {
                        if (!TextUtils.isEmpty(cVar.ba()) && !TextUtils.isEmpty(bVar.i()) && bVar.i().contains(cVar.ba()) && z) {
                            if (!r.a.a(this.j, bVar.i(), this.m)) {
                                a(i, bVar.i(), cVar, this.m);
                            }
                            cVar2 = this.m;
                            if (cVar2 != null) {
                                cVar2.a((j) cVar, bVar.i());
                            }
                        } else {
                            if (z) {
                                if (!TextUtils.isEmpty(cVar.ba())) {
                                    Context context = this.j;
                                }
                                a(i, bVar.i(), cVar, this.m);
                            }
                            cVar2 = this.m;
                            if (cVar2 != null && z) {
                                cVar2.a((j) cVar, bVar.i());
                            }
                        }
                    } else if (h == 3) {
                        if (z) {
                            r.a(this.j, bVar.i(), this.m);
                        }
                        p.c cVar4 = this.m;
                        if (cVar4 != null && z) {
                            cVar4.a((j) cVar, bVar.i());
                        }
                    } else if (z) {
                        if (3 == cVar.P()) {
                            a(cVar, bVar, z);
                            return;
                        } else if (2 == cVar.P()) {
                            a(cVar, bVar, z, i());
                            return;
                        } else {
                            r.a(this.j, bVar.i(), this.m);
                            p.c cVar5 = this.m;
                            if (cVar5 != null) {
                                cVar5.a((j) cVar, bVar.i());
                            }
                        }
                    }
                    if (a(cVar.P(), bVar.i())) {
                        b(bVar, cVar, false);
                    } else {
                        b(bVar, cVar, true);
                    }
                    p.c cVar6 = this.m;
                    if (cVar6 == null || z || !z2) {
                        return;
                    }
                    cVar6.a((j) cVar, bVar.i());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0017 -> B:13:0x0018). Please submit an issue!!! */
    private static boolean a(int i, String str) {
        try {
            if (i == 2) {
                if (r.a.a(str)) {
                    return true;
                }
            } else if (!TextUtils.isEmpty(str)) {
                return true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public static /* synthetic */ void a(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            k.a(aVar.j).a(intent);
        } catch (Exception e2) {
            n.b(a, "Exception", e2);
        }
    }
}