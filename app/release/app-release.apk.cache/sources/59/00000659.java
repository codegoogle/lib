package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.c.e;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.af;
import com.anythink.core.common.j;
import com.anythink.core.common.k;
import com.p7700g.p99005.zg2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class f<T extends j> {
    public Context b;
    public String c;
    public boolean f;
    public g k;
    private long n;
    private long o;
    private boolean p;
    private long q;
    private List<WeakReference<com.anythink.core.common.b.a>> s;
    private final String a = getClass().getSimpleName();
    public int e = 0;
    public String g = "";
    private boolean r = false;
    public int h = 1;
    private Object t = new Object();
    public com.anythink.core.common.b.a i = new com.anythink.core.common.b.a() { // from class: com.anythink.core.common.f.1
        @Override // com.anythink.core.common.b.a
        public final void onAdLoadFail(AdError adError) {
            f.this.a();
            synchronized (f.this.t) {
                Iterator it = f.this.s.iterator();
                while (it.hasNext()) {
                    com.anythink.core.common.b.a aVar = (com.anythink.core.common.b.a) ((WeakReference) it.next()).get();
                    if (aVar != null) {
                        aVar.onAdLoadFail(adError);
                        it.remove();
                    }
                }
            }
        }

        @Override // com.anythink.core.common.b.a
        public final void onAdLoaded() {
            synchronized (f.this.t) {
                if (f.this.s != null) {
                    Iterator it = f.this.s.iterator();
                    while (it.hasNext()) {
                        com.anythink.core.common.b.a aVar = (com.anythink.core.common.b.a) ((WeakReference) it.next()).get();
                        if (aVar != null) {
                            aVar.onAdLoaded();
                            it.remove();
                        }
                    }
                }
            }
        }
    };
    public Random j = new Random();
    public double l = zg2.s;
    public String m = "";
    public ConcurrentHashMap<String, h> d = new ConcurrentHashMap<>(5);

    /* renamed from: com.anythink.core.common.f$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ j a;
        public final /* synthetic */ String b;
        public final /* synthetic */ com.anythink.core.common.b.a c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ int[] e;
        public final /* synthetic */ String f;

        public AnonymousClass2(j jVar, String str, com.anythink.core.common.b.a aVar, Context context, int[] iArr, String str2) {
            this.a = jVar;
            this.b = str;
            this.c = aVar;
            this.d = context;
            this.e = iArr;
            this.f = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (f.this) {
                if (!f.this.d() || this.a.d == 0) {
                    if (f.this.h() || this.a.d != 5) {
                        if (f.this.i() && this.a.d == 0) {
                            return;
                        }
                        f.this.a(this.c);
                        j jVar = this.a;
                        f fVar = f.this;
                        jVar.f = fVar.i;
                        if (jVar.d != 4) {
                            fVar.h = 1;
                        } else {
                            fVar.h++;
                        }
                        fVar.j();
                        com.anythink.core.common.j.e.b("anythink", "PlacementId(" + this.b + ") start load type:" + this.a.d);
                        com.anythink.core.common.b.m.a().a(this.d, com.anythink.core.common.b.m.a().n(), com.anythink.core.common.b.m.a().o());
                        final String a = com.anythink.core.common.j.g.a(this.d);
                        this.a.a = a;
                        f.this.a(a, this.c);
                        if (com.anythink.core.common.b.m.a().e() != null && !TextUtils.isEmpty(com.anythink.core.common.b.m.a().n()) && !TextUtils.isEmpty(com.anythink.core.common.b.m.a().o()) && !com.anythink.core.common.j.h.a(this.b)) {
                            if (f.this.f()) {
                                return;
                            }
                            final Context applicationContext = this.d.getApplicationContext();
                            String n = com.anythink.core.common.b.m.a().n();
                            String o = com.anythink.core.common.b.m.a().o();
                            boolean t = com.anythink.core.common.b.m.a().t();
                            com.anythink.core.c.d a2 = t ? null : com.anythink.core.c.e.a(applicationContext).a(this.b);
                            final String P = a2 != null ? a2.P() : "";
                            final com.anythink.core.common.e.e a3 = com.anythink.core.common.j.p.a(a, this.b, "", a2, "", a2 != null ? a2.g() : -1, this.a.d, this.e[0]);
                            a3.x(this.f);
                            if (a2 == null && !t && ((!TextUtils.isEmpty(this.a.c) || this.a.b != null) && f.this.a(this.b, a, (String) this.a, this.c))) {
                                com.anythink.core.c.e.a(this.d).a(null, n, o, this.b, null);
                                return;
                            }
                            f fVar2 = f.this;
                            if (fVar2.e != 1 || fVar2.c() || a.a().a(this.d, this.b) == null) {
                                if (a2 != null && f.this.p) {
                                    long currentTimeMillis = System.currentTimeMillis() - f.this.q;
                                    if (currentTimeMillis > 0 && currentTimeMillis < a2.ae()) {
                                        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.loadFailInPacingError, "", "");
                                        a3.z(7);
                                        f.this.a(f.this.r ? false : true, a3, new e(errorCode, errorCode.printStackTrace()));
                                        f.this.r = true;
                                        return;
                                    }
                                }
                                f.this.p = false;
                                f.this.q = 0L;
                                f.this.r = false;
                                if (a2 != null && com.anythink.core.a.b.a().a(applicationContext, this.b, a2)) {
                                    AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.loadCappingError, "", "");
                                    a3.z(8);
                                    f.this.a(true, a3, (Throwable) new e(errorCode2, errorCode2.printStackTrace()));
                                    return;
                                } else if (f.this.d()) {
                                    return;
                                } else {
                                    f fVar3 = f.this;
                                    fVar3.f = true;
                                    for (h hVar : fVar3.d.values()) {
                                        hVar.f();
                                    }
                                    com.anythink.core.c.e.a(this.d).a(a2, n, o, this.b, new e.a() { // from class: com.anythink.core.common.f.2.1
                                        @Override // com.anythink.core.c.e.a
                                        public final void a(final com.anythink.core.c.d dVar) {
                                            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.f.2.1.1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    synchronized (f.this) {
                                                        f.this.o = dVar.N();
                                                        com.anythink.core.common.j.p.a(a3, dVar);
                                                        if (!TextUtils.equals(String.valueOf(dVar.S()), AnonymousClass2.this.f)) {
                                                            AdError errorCode3 = ErrorCode.getErrorCode("3003", "", "Format corresponding to API: " + com.anythink.core.common.j.g.d(AnonymousClass2.this.f) + ", Format corresponding to placement strategy: " + com.anythink.core.common.j.g.d(String.valueOf(dVar.S())));
                                                            f.this.a(errorCode3);
                                                            a3.a(false);
                                                            com.anythink.core.common.i.c.a(a3, errorCode3);
                                                            f.this.f = false;
                                                            return;
                                                        }
                                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                                        f.a(f.this, applicationContext, anonymousClass2.b, a, dVar, a3, anonymousClass2.a);
                                                    }
                                                }
                                            });
                                        }

                                        @Override // com.anythink.core.c.e.a
                                        public final void b(final com.anythink.core.c.d dVar) {
                                            if (!TextUtils.equals(P, dVar.P())) {
                                                f.this.e = 0;
                                            }
                                            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.f.2.1.2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    synchronized (f.this) {
                                                        try {
                                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                                            f.a(f.this, dVar, a, anonymousClass2.b);
                                                        }
                                                    }
                                                }
                                            });
                                        }

                                        @Override // com.anythink.core.c.e.a
                                        public final void a(AdError adError) {
                                            String str = g.i.g;
                                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                            String str2 = anonymousClass2.b;
                                            String d = com.anythink.core.common.j.g.d(anonymousClass2.f);
                                            String printStackTrace = adError.printStackTrace();
                                            if (ATSDK.isNetworkLogDebug()) {
                                                try {
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put("action", g.i.v);
                                                    jSONObject.put("result", str);
                                                    jSONObject.put(com.anythink.expressad.videocommon.e.b.v, str2);
                                                    jSONObject.put("adtype", d);
                                                    jSONObject.put("errorMsg", printStackTrace);
                                                    com.anythink.core.common.j.m.a("anythink_network", jSONObject.toString(), TextUtils.equals(g.i.g, str));
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            AdError errorCode3 = ErrorCode.getErrorCode("3001", adError.getPlatformCode(), adError.getPlatformMSG());
                                            a3.z(5);
                                            f.this.a(true, a3, errorCode3);
                                        }
                                    });
                                    return;
                                }
                            }
                            u.a().a(this.b, a);
                            f.this.g();
                            a3.a(false);
                            a3.z(4);
                            com.anythink.core.common.i.a.a(applicationContext).a(10, a3);
                            com.anythink.core.common.i.a.a(applicationContext).a(12, a3);
                            f.this.f = false;
                            return;
                        }
                        f.this.a(ErrorCode.getErrorCode("3002", "", ""));
                        if (com.anythink.core.common.b.m.a().y()) {
                            com.anythink.core.common.b.m.a().n();
                            com.anythink.core.common.b.m.a().o();
                        }
                        f.this.f = false;
                    }
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ j b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ com.anythink.core.c.d e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ List g;
        public final /* synthetic */ com.anythink.core.common.e.e h;
        public final /* synthetic */ List i;
        public final /* synthetic */ List j;

        public AnonymousClass3(Context context, j jVar, String str, String str2, com.anythink.core.c.d dVar, boolean z, List list, com.anythink.core.common.e.e eVar, List list2, List list3) {
            this.a = context;
            this.b = jVar;
            this.c = str;
            this.d = str2;
            this.e = dVar;
            this.f = z;
            this.g = list;
            this.h = eVar;
            this.i = list2;
            this.j = list3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                System.currentTimeMillis();
                com.anythink.core.common.e.a aVar = new com.anythink.core.common.e.a();
                aVar.a = this.a;
                aVar.b = this.b;
                aVar.c = this.c;
                aVar.d = this.d;
                aVar.e = this.e.S();
                aVar.f = this.e.C();
                aVar.g = this.e.u();
                aVar.h = this.e.d();
                i.a();
                aVar.l = i.a(this.e, this.f);
                i.a();
                aVar.o = i.a(this.e);
                i.a();
                aVar.p = this.e.l();
                aVar.i = this.g;
                aVar.n = this.e;
                aVar.s = this.h;
                aVar.q = t.a().c(f.this.c);
                if (this.i.size() > 0) {
                    aVar.t = (af) this.i.get(0);
                }
                ArrayList arrayList = new ArrayList();
                List list = this.j;
                if (list != null) {
                    arrayList.addAll(list);
                }
                aVar.j = arrayList;
                aVar.m = this.f;
                if (this.b.d == 8) {
                    aVar.u = 7;
                }
                com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar);
                bVar.a(ATSDK.isNetworkLogDebug());
                bVar.a(new k.a() { // from class: com.anythink.core.common.f.3.1
                    @Override // com.anythink.core.common.k.a
                    public final void a(String str, List<af> list2, List<af> list3) {
                        boolean z = com.anythink.core.c.e.a(f.this.b).a(f.this.c).e() == 1;
                        ArrayList arrayList2 = null;
                        for (af afVar : list3) {
                            if (z && (afVar.l() == 1 || afVar.l() == 3)) {
                                if (afVar.P() != 1) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList(4);
                                    }
                                    afVar.y(7);
                                    arrayList2.add(afVar);
                                }
                            }
                            if (!z && afVar.k() != 0) {
                                c.a().b.put(afVar.t(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                        if (list2.size() > 0) {
                            com.anythink.core.common.j.e.b("HeadBidding", "onSuccess: ----------------------------------------------");
                            u.a().a(AnonymousClass3.this.d, str, list2);
                        }
                        h hVar = f.this.d.get(str);
                        if (hVar != null) {
                            hVar.a(list2, list3, arrayList2);
                        }
                    }

                    @Override // com.anythink.core.common.k.a
                    public final void b(String str) {
                        com.anythink.core.common.j.e.b("HeadBidding", "onFinished: ----------------------------------------------");
                        u.a().a(AnonymousClass3.this.d, str);
                        h hVar = f.this.d.get(str);
                        if (hVar != null) {
                            hVar.e();
                        }
                    }

                    @Override // com.anythink.core.common.k.a
                    public final void a(String str) {
                        h hVar = f.this.d.get(str);
                        if (hVar != null) {
                            hVar.d();
                        }
                    }
                });
            } catch (Throwable unused) {
                h hVar = f.this.d.get(this.c);
                if (hVar != null) {
                    hVar.e();
                }
            }
        }
    }

    /* renamed from: com.anythink.core.common.f$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ ATBaseAdAdapter a;
        public final /* synthetic */ double b;
        public final /* synthetic */ String c;

        public AnonymousClass4(ATBaseAdAdapter aTBaseAdAdapter, double d, String str) {
            this.a = aTBaseAdAdapter;
            this.b = d;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.e.e trackingInfo = this.a.getTrackingInfo();
            af unitGroupInfo = this.a.getUnitGroupInfo();
            if (trackingInfo == null || unitGroupInfo == null || unitGroupInfo.j() || TextUtils.equals(trackingInfo.U(), "2") || TextUtils.equals(trackingInfo.U(), "4")) {
                return;
            }
            f fVar = f.this;
            if ((fVar.l <= this.b || !fVar.m.equals(this.c)) && trackingInfo.G() != 35) {
                f fVar2 = f.this;
                fVar2.l = this.b;
                fVar2.m = this.c;
                g gVar = fVar2.k;
                if (gVar != null) {
                    gVar.cancel();
                    f.this.k = null;
                }
                f.a(f.this, unitGroupInfo, trackingInfo);
            }
        }
    }

    public f(Context context, String str) {
        this.b = context.getApplicationContext();
        this.c = str;
        if (com.anythink.core.common.b.m.a().e() == null) {
            com.anythink.core.common.b.m.a().a(this.b);
        }
    }

    public abstract h a(T t);

    public void a(String str, com.anythink.core.common.b.a aVar) {
    }

    public boolean a(String str, String str2, T t, com.anythink.core.common.b.a aVar) {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean h() {
        return !TextUtils.isEmpty(this.g);
    }

    public boolean i() {
        return false;
    }

    public void j() {
    }

    public final boolean b() {
        return System.currentTimeMillis() - this.q <= 2000;
    }

    public final h c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.d.get(str);
    }

    public final boolean d() {
        h hVar;
        if (this.f) {
            return true;
        }
        return (TextUtils.isEmpty(this.g) || (hVar = this.d.get(this.g)) == null || hVar.c()) ? false : true;
    }

    public final void e() {
        com.anythink.core.common.b.m.a().a(new Runnable() { // from class: com.anythink.core.common.f.5
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = f.this.k;
                if (gVar != null) {
                    gVar.cancel();
                    f.this.k = null;
                }
            }
        });
    }

    public final void g() {
        com.anythink.core.common.b.a aVar = this.i;
        if (aVar != null) {
            aVar.onAdLoaded();
        }
    }

    public final void b(String str) {
        this.d.remove(str);
    }

    private void b(com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.a.c.a();
        if (com.anythink.core.a.c.a(eVar.S(), dVar)) {
            com.anythink.core.common.j.e.b(this.a, "placement pacing error");
            eVar.z(2);
            throw new e(ErrorCode.getErrorCode(ErrorCode.inPacingError, "", ""), "Pacing.");
        }
    }

    public final boolean c() {
        return System.currentTimeMillis() - this.n >= this.o;
    }

    public final void a(com.anythink.core.common.b.a aVar) {
        synchronized (this.t) {
            if (this.s == null) {
                this.s = new ArrayList();
            }
            boolean z = false;
            for (WeakReference<com.anythink.core.common.b.a> weakReference : this.s) {
                if (weakReference.get() == aVar) {
                    z = true;
                }
            }
            if (!z) {
                this.s.add(new WeakReference<>(aVar));
            }
        }
    }

    public final void d(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.f.6
            @Override // java.lang.Runnable
            public final void run() {
                h hVar = f.this.d.get(str);
                if (hVar != null) {
                    hVar.i();
                }
            }
        });
    }

    public final List<ATAdInfo> b(Context context) {
        List<com.anythink.core.common.e.b> a;
        if (a(false, false) || (a = a.a().a(context, this.c, false, false, true)) == null || a.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        Iterator<com.anythink.core.common.e.b> it = a.iterator();
        while (it.hasNext()) {
            com.anythink.core.common.e.b next = it.next();
            BaseAd f = next != null ? next.f() : null;
            ATBaseAdAdapter e = next != null ? next.e() : null;
            if (f != null) {
                arrayList.add(com.anythink.core.common.b.j.a(f));
            } else if (e != null) {
                arrayList.add(com.anythink.core.common.b.j.a(e));
            }
        }
        return arrayList;
    }

    public final void a(String str) {
        if (TextUtils.equals(str, com.anythink.core.c.e.a(this.b).a(this.c).P())) {
            this.e = 1;
            this.n = System.currentTimeMillis();
            this.p = false;
            this.q = 0L;
            this.r = false;
            return;
        }
        this.e = 0;
    }

    public final void a() {
        com.anythink.core.c.d b = com.anythink.core.c.e.a(this.b).b(this.c);
        if (this.p || b == null) {
            return;
        }
        this.p = true;
        this.q = System.currentTimeMillis();
    }

    public final void a(String str, double d, af afVar) {
        h hVar = this.d.get(str);
        if (hVar != null) {
            hVar.a(d, afVar);
        }
    }

    public final void a(Context context, String str, String str2, T t, com.anythink.core.common.b.a aVar) {
        Map<String, Object> c = t.a().c(str2);
        int[] iArr = {0};
        if (c.containsKey(ae.N)) {
            try {
                iArr[0] = ((Integer) c.get(ae.N)).intValue();
            } catch (Throwable unused) {
            }
        }
        int i = t.d;
        if (i == 0 || i == 3) {
            t.a().a(str2, new Throwable().getStackTrace());
        }
        com.anythink.core.common.j.b.a.a().a(new AnonymousClass2(t, str2, aVar, context, iArr, str));
    }

    private void a(com.anythink.core.c.d dVar, String str, String str2) {
        List<af> a = com.anythink.core.c.d.a(dVar.aa(), dVar.ab());
        List<af> a2 = com.anythink.core.c.d.a(dVar.ac(), dVar.x(), dVar.ad(), dVar.v(), dVar.n(), dVar.aj(), dVar.ak());
        a2.addAll(com.anythink.core.c.d.d(dVar.b()));
        List<af> c = com.anythink.core.c.d.c(dVar.i());
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                com.anythink.core.common.j.g.a(a, c.get(i), true);
            }
        }
        if (a2.size() > 0) {
            for (af afVar : a2) {
                com.anythink.core.common.e.b a3 = a.a().a(str2, afVar);
                if (a3 != null) {
                    try {
                        afVar.a(a3.e().getUnitGroupInfo(), 0, 3, 1);
                        com.anythink.core.common.j.g.a(a, afVar, true);
                    } catch (Exception unused) {
                    }
                }
                com.anythink.core.common.e.m a4 = com.anythink.core.b.f.a().a(afVar);
                if (a4 != null) {
                    afVar.a(a4, 0, 2, 1);
                    com.anythink.core.common.j.g.a(a, afVar, true);
                } else if (!TextUtils.isEmpty(str)) {
                    h hVar = this.d.get(str);
                    af afVar2 = null;
                    if (hVar != null) {
                        String t = afVar.t();
                        ConcurrentHashMap<String, af> concurrentHashMap = hVar.D;
                        if (concurrentHashMap != null) {
                            afVar2 = concurrentHashMap.get(t);
                        }
                    }
                    if (afVar2 != null) {
                        afVar.a(afVar2, 0, 3, 1);
                        com.anythink.core.common.j.g.a(a, afVar, true);
                    }
                }
            }
        }
        u.a().a(str2, str, dVar, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    private void a(Context context, String str, String str2, com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar, T t) {
        boolean z;
        a.a().a(this.c, str2, dVar);
        boolean a = com.anythink.core.c.d.a(dVar.aa(), dVar.ab());
        List<af> a2 = com.anythink.core.c.d.a(dVar.ac(), dVar.x(), dVar.ad(), dVar.v(), dVar.n(), dVar.aj(), dVar.ak());
        List<af> c = com.anythink.core.c.d.c(dVar.i());
        List<af> d = com.anythink.core.c.d.d(dVar.b());
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                com.anythink.core.common.j.g.a((List<af>) a, c.get(i), false);
            }
        }
        try {
        } catch (e e) {
            e = e;
            a = 1;
        } catch (Throwable th) {
            th = th;
            a = 1;
        }
        try {
            if (dVar.aq()) {
                if ((a != 0 && a.size() != 0) || ((a2 != null && a2.size() != 0) || (d != null && d.size() != 0))) {
                    ab a3 = com.anythink.core.a.a.a(context).a(str);
                    long W = dVar.W();
                    long X = dVar.X();
                    int i2 = a3 != null ? a3.d : 0;
                    int i3 = a3 != null ? a3.c : 0;
                    if ((W != -1 && i3 >= W) || (X != -1 && i2 >= X)) {
                        com.anythink.core.common.j.e.b(this.a, "placement capping error");
                        eVar.z(1);
                        throw new e(ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", ""), "Capping.");
                    }
                    com.anythink.core.a.c.a();
                    if (!com.anythink.core.a.c.a(eVar.S(), dVar)) {
                        ArrayList arrayList = new ArrayList(3);
                        ArrayList arrayList2 = new ArrayList(3);
                        ArrayList arrayList3 = new ArrayList(3);
                        ArrayList arrayList4 = new ArrayList(2);
                        a(dVar, a, a2, d, arrayList2, arrayList3, arrayList4, arrayList, a3, eVar);
                        ArrayList arrayList5 = new ArrayList(1);
                        a(arrayList2, arrayList3, eVar, arrayList5);
                        a(arrayList2, arrayList4, eVar, arrayList5);
                        List<af> a4 = a(dVar, str2, eVar.E(), arrayList2);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(a4);
                        arrayList6.addAll(arrayList);
                        u.a().a(str, str2, dVar, arrayList6);
                        boolean z2 = arrayList5.size() > 0;
                        if (z2 || arrayList3.size() != 0) {
                            z = false;
                        } else {
                            u.a().a(str, str2);
                            z = true;
                        }
                        if (z && a4.size() == 0 && arrayList4.size() == 0) {
                            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                            eVar.z(6);
                            a(true, eVar, errorCode);
                            this.f = false;
                            return;
                        }
                        com.anythink.core.a.b.a().b(this.b, str, dVar);
                        eVar.a(true);
                        com.anythink.core.common.i.a.a(this.b).a(10, eVar);
                        Map<String, Object> c2 = t.a().c(this.c);
                        h a5 = a((f<T>) t);
                        a5.h = c2;
                        a5.i = eVar;
                        a5.a(t);
                        a5.a(t.e);
                        a5.R = arrayList4;
                        this.g = str2;
                        this.d.put(str2, a5);
                        com.anythink.core.common.k.g gVar = new com.anythink.core.common.k.g();
                        gVar.a = str;
                        gVar.b = str2;
                        gVar.c = dVar;
                        gVar.d = a4;
                        gVar.e = z;
                        gVar.f = eVar.O();
                        a5.a(gVar);
                        this.f = false;
                        if (z) {
                            return;
                        }
                        com.anythink.core.common.j.b.a.a().b(new AnonymousClass3(context, t, str2, str, dVar, z2, arrayList3, eVar, arrayList5, a4));
                        return;
                    }
                    com.anythink.core.common.j.e.b(this.a, "placement pacing error");
                    eVar.z(2);
                    throw new e(ErrorCode.getErrorCode(ErrorCode.inPacingError, "", ""), "Pacing.");
                }
                com.anythink.core.common.j.e.b(this.a, "unitgroup list is null");
                eVar.z(5);
                if (dVar.c() == 1) {
                    throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                }
                throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
            }
            eVar.z(5);
            throw new e(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
        } catch (e e2) {
            e = e2;
            a(a, eVar, e);
        } catch (Throwable th2) {
            th = th2;
            a(a, eVar, th);
        }
    }

    private static void a(com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar) {
        if (dVar.aq()) {
            return;
        }
        eVar.z(5);
        throw new e(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
    }

    private void a(com.anythink.core.c.d dVar, List list, List list2, List list3, com.anythink.core.common.e.e eVar) {
        if (list == null || list.size() == 0) {
            if (list2 == null || list2.size() == 0) {
                if (list3 == null || list3.size() == 0) {
                    com.anythink.core.common.j.e.b(this.a, "unitgroup list is null");
                    eVar.z(5);
                    if (dVar.c() == 1) {
                        throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                    }
                    throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
                }
            }
        }
    }

    private void a(com.anythink.core.c.d dVar, ab abVar, com.anythink.core.common.e.e eVar) {
        long W = dVar.W();
        long X = dVar.X();
        int i = abVar != null ? abVar.d : 0;
        int i2 = abVar != null ? abVar.c : 0;
        if ((W == -1 || i2 < W) && (X == -1 || i < X)) {
            return;
        }
        com.anythink.core.common.j.e.b(this.a, "placement capping error");
        eVar.z(1);
        throw new e(ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", ""), "Capping.");
    }

    private void a(com.anythink.core.c.d dVar, List<af> list, List<af> list2, List<af> list3, List<af> list4, List<af> list5, List<af> list6, List<af> list7, ab abVar, com.anythink.core.common.e.e eVar) {
        for (af afVar : list) {
            if (a(dVar, eVar.S(), eVar, abVar, afVar)) {
                afVar.b();
                list7.add(afVar);
            } else {
                list4.add(afVar);
            }
        }
        for (af afVar2 : list2) {
            if (a(dVar, eVar.S(), eVar, abVar, afVar2)) {
                afVar2.b();
                list7.add(afVar2);
            } else {
                list5.add(afVar2);
            }
        }
        for (af afVar3 : list3) {
            if (a(dVar, eVar.S(), eVar, abVar, afVar3)) {
                afVar3.b();
                list7.add(afVar3);
            } else {
                list6.add(afVar3);
            }
        }
        if (list4.size() > 0 || list5.size() > 0 || list6.size() > 0) {
            return;
        }
        com.anythink.core.common.j.e.b(this.a, "no vail adsource");
        eVar.z(6);
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
        throw new e(errorCode, errorCode.printStackTrace());
    }

    private void a(List<af> list, List<af> list2, com.anythink.core.common.e.e eVar, List<af> list3) {
        af afVar;
        boolean z = false;
        for (int size = list2.size() - 1; size >= 0; size--) {
            af afVar2 = list2.get(size);
            if (afVar2.aa()) {
                list3.add(afVar2);
            }
            if (afVar2.m() != 2) {
                com.anythink.core.common.e.b a = a.a().a(this.c, afVar2);
                if (a != null) {
                    afVar2.a(a.e().getUnitGroupInfo(), 0, 3, 1);
                    afVar = afVar2;
                } else {
                    afVar = null;
                }
                if (afVar == null) {
                    try {
                        com.anythink.core.common.e.m a2 = com.anythink.core.b.f.a().a(afVar2);
                        if (a2 != null && !a2.a()) {
                            afVar2.a(a2, 0, 2, 1);
                            afVar = afVar2;
                        } else if (a2 != null) {
                            a2.a(a2.price, 1, eVar, afVar2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (afVar != null) {
                    try {
                        if (afVar2.l() == 7) {
                            z = true;
                        }
                        list2.remove(size);
                        try {
                            com.anythink.core.common.j.g.a(list, afVar2, false);
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
        }
        if (z) {
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                if (list2.get(size2).l() == 7) {
                    list2.remove(size2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, com.anythink.core.common.e.e eVar, Throwable th) {
        AdError errorCode;
        if (th instanceof e) {
            errorCode = ((e) th).a;
        } else {
            errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", th.getMessage());
        }
        a(z, eVar, errorCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, com.anythink.core.common.e.e eVar, AdError adError) {
        this.f = false;
        a(adError);
        eVar.a(false);
        if (z) {
            com.anythink.core.common.i.a.a(this.b).a(10, eVar);
            com.anythink.core.common.i.c.a(eVar, adError);
        }
    }

    private boolean a(com.anythink.core.c.d dVar, String str, com.anythink.core.common.e.e eVar, ab abVar, af afVar) {
        com.anythink.core.common.e.d d;
        com.anythink.core.common.e.e a = com.anythink.core.common.j.p.a(eVar.T(), str, "", dVar, "", -1, eVar.E(), eVar.O());
        com.anythink.core.common.j.p.a(a, afVar, 0, false);
        ab.a a2 = abVar != null ? abVar.a(afVar.t()) : null;
        int i = a2 != null ? a2.e : 0;
        int i2 = a2 != null ? a2.d : 0;
        if (afVar.e() != -1 && i2 >= afVar.e()) {
            afVar.g(-5);
            afVar.h("Out of Cap");
            com.anythink.core.common.j.m.a(str, eVar, "Out of Cap", afVar, i, i2);
            com.anythink.core.common.i.c.a(a, 2, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
            return true;
        } else if (afVar.f() != -1 && i >= afVar.f()) {
            afVar.g(-5);
            afVar.h("Out of Cap");
            com.anythink.core.common.j.m.a(str, eVar, "Out of Cap", afVar, i, i2);
            com.anythink.core.common.i.c.a(a, 2, ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", "Out of Cap"));
            return true;
        } else if (com.anythink.core.a.c.a().a(str, afVar)) {
            afVar.g(-6);
            afVar.h("Out of Pacing");
            com.anythink.core.common.j.m.a(str, eVar, "Out of Pacing", afVar, i, i2);
            com.anythink.core.common.i.c.a(a, 3, ErrorCode.getErrorCode(ErrorCode.inPacingError, "", "Out of Pacing"));
            return true;
        } else if (c.a().a(afVar)) {
            afVar.g(-6);
            afVar.h("Request fail in pacing");
            com.anythink.core.common.j.m.a(str, eVar, "Request fail in pacing", afVar, i, i2);
            com.anythink.core.common.i.c.a(a, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Request fail in pacing"));
            return true;
        } else {
            List<String> j = com.anythink.core.common.b.m.a().j(this.c);
            if (j != null && j.contains(afVar.t())) {
                afVar.g(-8);
                afVar.h("Request fail in filter list");
                com.anythink.core.common.j.m.a(str, eVar, "Request fail in filter list", afVar, i, i2, j);
                com.anythink.core.common.i.c.a(a, 5, ErrorCode.getErrorCode(ErrorCode.filterSourceError, "", "Request fail in filter list"));
                return true;
            }
            List<String> k = com.anythink.core.common.b.m.a().k(this.c);
            if (k != null && k.contains(String.valueOf(afVar.c()))) {
                afVar.g(-8);
                afVar.h("Filter by network firm id.");
                com.anythink.core.common.j.m.a(str, eVar, "Filter by network firm id.", afVar, i, i2, k);
                com.anythink.core.common.i.c.a(a, 9, ErrorCode.getErrorCode(ErrorCode.networkFirmIdfilterSourceError, "", "Filter by network firm id."));
                return true;
            }
            if (afVar.j()) {
                if (c.a().b(afVar)) {
                    afVar.g(-7);
                    afVar.h("Bid fail in pacing");
                    com.anythink.core.common.j.m.a(str, eVar, "Bid fail in pacing", afVar, i, i2);
                    com.anythink.core.common.i.c.a(a, 4, ErrorCode.getErrorCode(ErrorCode.inRequestFailPacing, "", "Bid fail in pacing"));
                    return true;
                } else if (afVar.X() != 1 && afVar.l() == 2 && (d = t.a().d(this.c)) != null && d.a(afVar)) {
                    afVar.g(-7);
                    afVar.h("Can't Load On Showing");
                    com.anythink.core.common.j.m.a(str, eVar, "Can't Load On Showing", afVar, i, i2);
                    com.anythink.core.common.i.c.a(eVar, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                    return true;
                }
            }
            return false;
        }
    }

    private List<af> a(com.anythink.core.c.d dVar, String str, int i, List<af> list) {
        int i2;
        JSONArray jSONArray = new JSONArray();
        com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
        eVar.v(this.c);
        eVar.w(str);
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.S());
        eVar.x(sb.toString());
        eVar.u(dVar.P());
        eVar.t(i);
        eVar.D(dVar.J());
        eVar.v(dVar.Z());
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap(3);
        Iterator<af> it = list.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            af next = it.next();
            double a = com.anythink.core.common.j.g.a(next);
            List list2 = (List) linkedHashMap.get(String.valueOf(a));
            if (list2 == null) {
                list2 = new ArrayList();
                linkedHashMap.put(String.valueOf(a), list2);
            }
            Integer num = (Integer) hashMap.get(String.valueOf(a));
            if (num == null) {
                num = 0;
            }
            hashMap.put(String.valueOf(a), Integer.valueOf(next.T() + num.intValue()));
            list2.add(next);
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            int i3 = 1;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            List list3 = (List) entry.getValue();
            if (list3.size() > 1) {
                int intValue = ((Integer) hashMap.get(entry.getKey())).intValue();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (list3.size() <= 0) {
                        break;
                    } else if (list3.size() == i3) {
                        arrayList2.add(list3.get(i2));
                        list3.remove(i2);
                        break;
                    } else {
                        int nextInt = this.j.nextInt(intValue) + i3;
                        Iterator it3 = list3.iterator();
                        int i4 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                af afVar = (af) it3.next();
                                if (afVar.T() + i4 >= nextInt) {
                                    arrayList2.add(afVar);
                                    list3.remove(afVar);
                                    intValue -= afVar.T();
                                    i2 = 0;
                                    i3 = 1;
                                    break;
                                }
                                i4 += afVar.T();
                                i2 = 0;
                                i3 = 1;
                            }
                        }
                    }
                }
                linkedHashMap.put(entry.getKey(), arrayList2);
                i2 = 0;
            }
        }
        String str2 = this.a;
        com.anythink.core.common.j.e.d(str2, "Request UnitGroup's Number:" + dVar.g());
        int i5 = 0;
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            for (af afVar2 : (List) entry2.getValue()) {
                afVar2.m((i5 / dVar.g()) + 1);
                String str3 = this.a;
                com.anythink.core.common.j.e.d(str3, "UnitGroupInfo requestLevel:" + i5 + " || layer:" + afVar2.E());
                arrayList.add(afVar2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sortpriority", i5);
                    jSONObject.put("sorttype", afVar2.o());
                    jSONObject.put("unit_id", afVar2.t());
                    try {
                        jSONObject.put("bidresult", 1);
                        jSONObject.put("bidprice", afVar2.M() ? String.valueOf(afVar2.x()) : "0");
                        jSONArray.put(jSONObject);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                i5++;
            }
        }
        eVar.s(jSONArray.toString());
        com.anythink.core.common.i.a.a(this.b).a(15, eVar);
        return arrayList;
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, String str, double d) {
        com.anythink.core.common.b.m.a().a(new AnonymousClass4(aTBaseAdAdapter, d, str));
    }

    private void a(af afVar, com.anythink.core.common.e.e eVar) {
        g gVar = new g(afVar.p(), afVar.p(), afVar, eVar);
        this.k = gVar;
        gVar.start();
    }

    public final void a(com.anythink.core.common.e.b bVar) {
        if (bVar.c()) {
            this.e = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ATAdStatusInfo a(Context context) {
        com.anythink.core.common.b.j jVar;
        boolean d = d();
        com.anythink.core.common.e.b a = a(context, true, false);
        if (a != null) {
            BaseAd f = a.f();
            ATBaseAdAdapter e = a.e();
            if (f != null) {
                jVar = com.anythink.core.common.b.j.a(f);
            } else if (e != null) {
                jVar = com.anythink.core.common.b.j.a(a.e());
            }
            return new ATAdStatusInfo(d, a != null, jVar);
        }
        jVar = null;
        return new ATAdStatusInfo(d, a != null, jVar);
    }

    public com.anythink.core.common.e.b a(Context context, boolean z, boolean z2) {
        if (a(z2, z)) {
            return null;
        }
        return a.a().a(context, this.c, z, z2);
    }

    private boolean a(boolean z, boolean z2) {
        com.anythink.core.c.d a = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(this.c);
        String str = TextUtils.isEmpty(this.g) ? "" : this.g;
        if (a == null) {
            a = com.anythink.core.c.e.a(this.b).a(this.c);
        }
        com.anythink.core.c.d dVar = a;
        if (dVar == null) {
            com.anythink.core.common.e.e a2 = com.anythink.core.common.j.p.a("", this.c, "", null, "", -1, 0, 0);
            if (z) {
                com.anythink.core.common.i.c.a(a2, 4, "", str);
            } else if (z2) {
                com.anythink.core.common.i.c.a(a2, false, 4, -1, "", -1, "", "", str, false, "");
            }
            return true;
        }
        com.anythink.core.a.c.a();
        if (com.anythink.core.a.c.a(this.c, dVar)) {
            com.anythink.core.common.e.e a3 = com.anythink.core.common.j.p.a("", this.c, "", dVar, "", dVar.g(), 0, 0);
            if (z) {
                com.anythink.core.common.i.c.a(a3, 3, "", str);
            } else if (z2) {
                com.anythink.core.common.i.c.a(a3, false, 3, -1, "", -1, "", "", str, false, "");
            }
            return true;
        } else if (com.anythink.core.a.a.a(this.b).a(dVar, this.c)) {
            com.anythink.core.common.e.e a4 = com.anythink.core.common.j.p.a("", this.c, "", dVar, "", dVar.g(), 0, 0);
            if (z) {
                com.anythink.core.common.i.c.a(a4, 2, "", str);
            } else if (z2) {
                com.anythink.core.common.i.c.a(a4, false, 2, -1, "", -1, "", "", str, false, "");
            }
            return true;
        } else {
            return false;
        }
    }

    public final void a(AdError adError) {
        com.anythink.core.common.b.a aVar = this.i;
        if (aVar != null) {
            aVar.onAdLoadFail(adError);
        }
    }

    public final boolean a(ATAdStatusInfo aTAdStatusInfo) {
        com.anythink.core.c.d a = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(this.c);
        if (this.e != 1 || c() || aTAdStatusInfo == null || !aTAdStatusInfo.isReady()) {
            return i() || (a != null && a.Q() == 1);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static /* synthetic */ void a(f fVar, Context context, String str, String str2, com.anythink.core.c.d dVar, com.anythink.core.common.e.e eVar, j jVar) {
        boolean z;
        a.a().a(fVar.c, str2, dVar);
        boolean a = com.anythink.core.c.d.a(dVar.aa(), dVar.ab());
        List<af> a2 = com.anythink.core.c.d.a(dVar.ac(), dVar.x(), dVar.ad(), dVar.v(), dVar.n(), dVar.aj(), dVar.ak());
        List<af> c = com.anythink.core.c.d.c(dVar.i());
        List<af> d = com.anythink.core.c.d.d(dVar.b());
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                com.anythink.core.common.j.g.a((List<af>) a, c.get(i), false);
            }
        }
        try {
        } catch (e e) {
            e = e;
            a = 1;
        } catch (Throwable th) {
            th = th;
            a = 1;
        }
        try {
            if (dVar.aq()) {
                if ((a != 0 && a.size() != 0) || ((a2 != null && a2.size() != 0) || (d != null && d.size() != 0))) {
                    ab a3 = com.anythink.core.a.a.a(context).a(str);
                    long W = dVar.W();
                    long X = dVar.X();
                    int i2 = a3 != null ? a3.d : 0;
                    int i3 = a3 != null ? a3.c : 0;
                    if ((W != -1 && i3 >= W) || (X != -1 && i2 >= X)) {
                        com.anythink.core.common.j.e.b(fVar.a, "placement capping error");
                        eVar.z(1);
                        throw new e(ErrorCode.getErrorCode(ErrorCode.outOfCapError, "", ""), "Capping.");
                    }
                    com.anythink.core.a.c.a();
                    if (!com.anythink.core.a.c.a(eVar.S(), dVar)) {
                        ArrayList arrayList = new ArrayList(3);
                        ArrayList arrayList2 = new ArrayList(3);
                        ArrayList arrayList3 = new ArrayList(3);
                        ArrayList arrayList4 = new ArrayList(2);
                        fVar.a(dVar, a, a2, d, arrayList2, arrayList3, arrayList4, arrayList, a3, eVar);
                        ArrayList arrayList5 = new ArrayList(1);
                        fVar.a(arrayList2, arrayList3, eVar, arrayList5);
                        fVar.a(arrayList2, arrayList4, eVar, arrayList5);
                        List<af> a4 = fVar.a(dVar, str2, eVar.E(), arrayList2);
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.addAll(a4);
                        arrayList6.addAll(arrayList);
                        u.a().a(str, str2, dVar, arrayList6);
                        boolean z2 = arrayList5.size() > 0;
                        if (z2 || arrayList3.size() != 0) {
                            z = false;
                        } else {
                            u.a().a(str, str2);
                            z = true;
                        }
                        if (z && a4.size() == 0 && arrayList4.size() == 0) {
                            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noAvailableAdsource, "", "");
                            eVar.z(6);
                            fVar.a(true, eVar, errorCode);
                            fVar.f = false;
                            return;
                        }
                        com.anythink.core.a.b.a().b(fVar.b, str, dVar);
                        eVar.a(true);
                        com.anythink.core.common.i.a.a(fVar.b).a(10, eVar);
                        Map<String, Object> c2 = t.a().c(fVar.c);
                        h a5 = fVar.a((f) jVar);
                        a5.h = c2;
                        a5.i = eVar;
                        a5.a(jVar);
                        a5.a(jVar.e);
                        a5.R = arrayList4;
                        fVar.g = str2;
                        fVar.d.put(str2, a5);
                        com.anythink.core.common.k.g gVar = new com.anythink.core.common.k.g();
                        gVar.a = str;
                        gVar.b = str2;
                        gVar.c = dVar;
                        gVar.d = a4;
                        gVar.e = z;
                        gVar.f = eVar.O();
                        a5.a(gVar);
                        fVar.f = false;
                        if (z) {
                            return;
                        }
                        com.anythink.core.common.j.b.a.a().b(new AnonymousClass3(context, jVar, str2, str, dVar, z2, arrayList3, eVar, arrayList5, a4));
                        return;
                    }
                    com.anythink.core.common.j.e.b(fVar.a, "placement pacing error");
                    eVar.z(2);
                    throw new e(ErrorCode.getErrorCode(ErrorCode.inPacingError, "", ""), "Pacing.");
                }
                com.anythink.core.common.j.e.b(fVar.a, "unitgroup list is null");
                eVar.z(5);
                if (dVar.c() == 1) {
                    throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfigInDebugerMode, "", ""), "No Adsource.");
                }
                throw new e(ErrorCode.getErrorCode(ErrorCode.noAdsourceConfig, "", ""), "No Adsource.");
            }
            eVar.z(5);
            throw new e(ErrorCode.getErrorCode(ErrorCode.placementAdClose, "", ""), "Strategy is close.");
        } catch (e e2) {
            e = e2;
            fVar.a(a, eVar, e);
        } catch (Throwable th2) {
            th = th2;
            fVar.a(a, eVar, th);
        }
    }

    public static /* synthetic */ void a(f fVar, com.anythink.core.c.d dVar, String str, String str2) {
        List<af> a = com.anythink.core.c.d.a(dVar.aa(), dVar.ab());
        List<af> a2 = com.anythink.core.c.d.a(dVar.ac(), dVar.x(), dVar.ad(), dVar.v(), dVar.n(), dVar.aj(), dVar.ak());
        a2.addAll(com.anythink.core.c.d.d(dVar.b()));
        List<af> c = com.anythink.core.c.d.c(dVar.i());
        if (c != null) {
            int size = c.size();
            for (int i = 0; i < size; i++) {
                com.anythink.core.common.j.g.a(a, c.get(i), true);
            }
        }
        if (a2.size() > 0) {
            for (af afVar : a2) {
                com.anythink.core.common.e.b a3 = a.a().a(str2, afVar);
                if (a3 != null) {
                    try {
                        afVar.a(a3.e().getUnitGroupInfo(), 0, 3, 1);
                        com.anythink.core.common.j.g.a(a, afVar, true);
                    } catch (Exception unused) {
                    }
                }
                com.anythink.core.common.e.m a4 = com.anythink.core.b.f.a().a(afVar);
                if (a4 != null) {
                    afVar.a(a4, 0, 2, 1);
                    com.anythink.core.common.j.g.a(a, afVar, true);
                } else if (!TextUtils.isEmpty(str)) {
                    h hVar = fVar.d.get(str);
                    af afVar2 = null;
                    if (hVar != null) {
                        String t = afVar.t();
                        ConcurrentHashMap<String, af> concurrentHashMap = hVar.D;
                        if (concurrentHashMap != null) {
                            afVar2 = concurrentHashMap.get(t);
                        }
                    }
                    if (afVar2 != null) {
                        afVar.a(afVar2, 0, 3, 1);
                        com.anythink.core.common.j.g.a(a, afVar, true);
                    }
                }
            }
        }
        u.a().a(str2, str, dVar, a);
    }

    public static /* synthetic */ void a(f fVar, af afVar, com.anythink.core.common.e.e eVar) {
        g gVar = new g(afVar.p(), afVar.p(), afVar, eVar);
        fVar.k = gVar;
        gVar.start();
    }
}