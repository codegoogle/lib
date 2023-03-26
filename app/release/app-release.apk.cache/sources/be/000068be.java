package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.gson.Gson;
import com.p7700g.p99005.ci3;
import com.p7700g.p99005.fr5;
import com.p7700g.p99005.x91;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: EventsTracker.java */
/* loaded from: classes2.dex */
public class z81 extends ci3.b {
    @x1
    public static final String w = "ucr:settings:global";
    @x1
    private static final kj1 x = kj1.b("UCRService");
    @x1
    private final a91 A;
    @x1
    private final Executor B;
    @x1
    private final Context D;
    @x1
    private final x31 E;
    @x1
    private final j81 F;
    @x1
    private final Executor G;
    @x1
    private final q91 y;
    @x1
    private final t91 z;
    @x1
    private final Map<String, a> H = new HashMap();
    @x1
    private final Gson C = new Gson();

    /* compiled from: EventsTracker.java */
    /* loaded from: classes2.dex */
    public static class a {
        @x1
        private final List<z91> a;
        @x1
        private final List<q91> b;
        @x1
        private final String c;
        @x1
        private final g91 d;

        public a(@x1 String str, @x1 g91 g91Var, @x1 List<z91> list, @x1 List<q91> list2) {
            this.c = str;
            this.d = g91Var;
            this.a = list;
            this.b = list2;
        }

        @x1
        public String b() {
            return this.c;
        }

        @x1
        public g91 c() {
            return this.d;
        }

        @x1
        public List<q91> d() {
            return this.b;
        }

        @x1
        public List<z91> e() {
            return this.a;
        }
    }

    public z81(@x1 Context context, @x1 x31 x31Var, @x1 t91 t91Var, @x1 a91 a91Var, @x1 j81 j81Var, @x1 Executor executor, @x1 Executor executor2) {
        this.D = context;
        this.E = x31Var;
        this.F = j81Var;
        this.G = executor2;
        this.z = t91Var;
        this.A = a91Var;
        this.B = executor;
        this.y = new u91(a91Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public /* synthetic */ void R1() {
        try {
            synchronized (this.H) {
                for (String str : this.H.keySet()) {
                    a aVar = this.H.get(str);
                    if (aVar != null) {
                        for (z91 z91Var : aVar.a) {
                            z91Var.c(this.D);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            x.f(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void T1() {
        HashMap hashMap;
        x.c("performUpload", new Object[0]);
        synchronized (this.H) {
            hashMap = new HashMap(this.H);
        }
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            if (aVar != null) {
                c2(aVar, this.z.h(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void V1(String str, String str2) {
        a aVar;
        g91 g91Var = (g91) this.C.n(str, g91.class);
        b2(this.E, g91Var.a());
        synchronized (this.H) {
            aVar = this.H.get(str2);
        }
        if (aVar == null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (k81<? extends q91> k81Var : g91Var.b()) {
                try {
                    arrayList2.add((q91) this.F.b(k81Var));
                } catch (Throwable th) {
                    x.f(th);
                }
            }
            for (k81<? extends z91> k81Var2 : g91Var.d()) {
                try {
                    z91 z91Var = (z91) this.F.b(k81Var2);
                    fr5.a aVar2 = new fr5.a();
                    aa1.a(aVar2);
                    z91Var.a(this.D, str2, this.A, g91Var.c().get(z91Var.getKey()), aVar2.f());
                    arrayList.add(z91Var);
                } catch (i81 e) {
                    x.f(e);
                }
            }
            a aVar3 = new a(str2, g91Var, arrayList, arrayList2);
            synchronized (this.H) {
                this.H.put(str2, aVar3);
            }
        }
        a2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void X1(Bundle bundle, bi3 bi3Var, String str, String str2, String str3) {
        HashMap hashMap;
        Map<String, String> a2;
        Bundle bundle2 = new Bundle(bundle);
        x91.a Y1 = Y1();
        HashMap hashMap2 = new HashMap();
        if (Y1 != null && (a2 = Y1.a()) != null) {
            hashMap2.putAll(a2);
        }
        for (String str4 : hashMap2.keySet()) {
            bundle2.putString(str4, (String) hashMap2.get(str4));
        }
        synchronized (this.H) {
            hashMap = new HashMap(this.H);
        }
        for (String str5 : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str5);
            if (aVar != null) {
                for (q91 q91Var : aVar.d()) {
                    q91Var.a(this.D, bundle2);
                }
            }
        }
        this.y.a(this.D, bundle2);
        try {
            bi3Var.G(bundle2);
        } catch (RemoteException e) {
            x.o(e);
        }
        this.z.j(str, bundle2, str2, str3);
    }

    @z1
    private x91.a Y1() {
        return (x91.a) new Gson().n(this.E.e(w, ""), x91.a.class);
    }

    public static void b2(@x1 x31 x31Var, @x1 Map<String, String> map) {
        try {
            x91.a aVar = (x91.a) new Gson().n(x31Var.e(w, ""), x91.a.class);
            if (aVar == null) {
                aVar = new x91.a(new HashMap());
            }
            aVar.a().putAll(map);
            x31Var.c().b(w, new Gson().z(aVar)).a();
        } catch (Throwable unused) {
            x31Var.c().b(w, new Gson().z(new HashMap())).a();
        }
    }

    private void c2(a aVar, Map<String, List<v91>> map) {
        ArrayList arrayList;
        synchronized (aVar.a) {
            arrayList = new ArrayList(aVar.a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z91 z91Var = (z91) it.next();
            List<v91> list = map.get(z91Var.getKey());
            if (list != null && list.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                kj1 kj1Var = x;
                StringBuilder G = wo1.G("Transport upload: ");
                G.append(aVar.b());
                kj1Var.c(G.toString(), new Object[0]);
                if (z91Var.b(this.z, arrayList2, list)) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        this.z.d((String) it2.next());
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.ci3
    public void D0(@x1 final String str, @x1 final String str2) {
        this.B.execute(new Runnable() { // from class: com.p7700g.p99005.s81
            @Override // java.lang.Runnable
            public final void run() {
                z81.this.V1(str2, str);
            }
        });
    }

    @Override // com.p7700g.p99005.ci3
    public void U0(@x1 final String str, @x1 final Bundle bundle, @x1 final String str2, @x1 final String str3, int i, @x1 final bi3 bi3Var) throws RemoteException {
        this.B.execute(new Runnable() { // from class: com.p7700g.p99005.t81
            @Override // java.lang.Runnable
            public final void run() {
                z81.this.X1(bundle, bi3Var, str, str2, str3);
            }
        });
    }

    public void Z1() {
        this.B.execute(new Runnable() { // from class: com.p7700g.p99005.u81
            @Override // java.lang.Runnable
            public final void run() {
                z81.this.R1();
            }
        });
    }

    public void a2() {
        this.G.execute(new Runnable() { // from class: com.p7700g.p99005.v81
            @Override // java.lang.Runnable
            public final void run() {
                z81.this.T1();
            }
        });
    }

    @Override // com.p7700g.p99005.ci3
    public void i0(@x1 String str) {
        synchronized (this.H) {
            this.H.remove(str);
        }
    }
}