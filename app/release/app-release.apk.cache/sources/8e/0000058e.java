package com.anythink.core.b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.b.i;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class e extends d {
    public static final double e = 10000.0d;
    public final String f;
    public final List<JSONObject> g;
    public List<af> h;
    public List<af> i;
    public String j;
    public String k;
    public String l;
    public boolean m;
    public com.anythink.core.b.b.a n;
    public long o;
    public m p;
    public AtomicBoolean q;
    public AtomicBoolean r;
    public ConcurrentHashMap<String, af> s;
    public ConcurrentHashMap<String, af> t;
    public ConcurrentHashMap<String, af> u;
    public ConcurrentHashMap<String, af> v;
    public Runnable w;

    public e(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.f = getClass().getSimpleName() + ":";
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.q = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
        this.s = new ConcurrentHashMap<>();
        this.t = new ConcurrentHashMap<>();
        this.u = new ConcurrentHashMap<>();
        this.v = new ConcurrentHashMap<>();
        this.w = new Runnable() { // from class: com.anythink.core.b.e.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.e.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.f();
                    }
                });
            }
        };
        List<af> list = aVar.i;
        if (list != null && list.size() > 0) {
            for (af afVar : aVar.i) {
                if (afVar != null) {
                    this.s.put(afVar.t(), afVar);
                    this.u.put(afVar.t(), afVar);
                }
            }
        }
        List<af> list2 = aVar.k;
        if (list2 != null && list2.size() > 0) {
            for (af afVar2 : aVar.k) {
                this.t.put(afVar2.t(), afVar2);
            }
        }
        JSONObject jSONObject = aVar.r;
        if (jSONObject != null) {
            this.g.add(jSONObject);
        }
        af afVar3 = aVar.t;
        if (afVar3 != null) {
            m N = afVar3.N();
            this.p = N;
            if (N == null) {
                com.anythink.core.common.e.b a = com.anythink.core.common.a.a().a(aVar.d, aVar.t);
                if (a != null) {
                    this.p = a.e().getUnitGroupInfo().N();
                } else {
                    this.p = f.a().a(aVar.t);
                }
            }
        }
        this.m = false;
        this.j = aVar.c;
        this.k = aVar.d;
        this.l = b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(final long j) {
        com.anythink.core.common.j.e.b(com.anythink.core.common.j.m.a, this.f + "beginRequestBidInfo");
        ArrayList arrayList = new ArrayList();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a(arrayList, concurrentHashMap);
        this.r.set(true);
        a(arrayList, new com.anythink.core.common.g.h() { // from class: com.anythink.core.b.e.3
            @Override // com.anythink.core.common.g.h
            public final void onLoadCanceled(int i) {
                synchronized (e.class) {
                    e.this.r.set(false);
                    e.this.c();
                    e.this.a(null, SystemClock.elapsedRealtime() - j, -4, "onLoadCanceled.", concurrentHashMap);
                }
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadError(int i, String str, AdError adError) {
                synchronized (e.class) {
                    e.this.r.set(false);
                    e.this.c();
                    e.this.a(null, SystemClock.elapsedRealtime() - j, -4, adError != null ? adError.getPlatformMSG() : "", concurrentHashMap);
                }
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadFinish(int i, Object obj) {
                synchronized (e.class) {
                    e.this.r.set(false);
                    long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                    List a = e.a(obj);
                    e.a(e.this, obj, a);
                    e.this.a(a, elapsedRealtime, 0, null, concurrentHashMap);
                    e.this.c();
                }
            }

            @Override // com.anythink.core.common.g.h
            public final void onLoadStart(int i) {
            }
        });
    }

    private void d() {
        com.anythink.core.common.b.m.a().b(this.w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if ((r8.q.get() && !r8.r.get()) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e() {
        boolean z;
        com.anythink.core.common.j.e.b(com.anythink.core.common.j.m.a, this.f + "handleBidTokenResult");
        boolean z2 = true;
        if (this.u.size() == 0) {
            d();
            if (!this.r.get()) {
                z = true;
                if (g() > 0) {
                    if (!z) {
                    }
                    if (z2) {
                        b(this.o);
                        return;
                    } else if (this.h.size() <= 0 || !n()) {
                        return;
                    } else {
                        a(null, 0L, 0, "", null);
                        return;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        z = false;
        if (g() > 0) {
        }
        z2 = false;
        if (z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        if (this.m) {
            return;
        }
        com.anythink.core.common.j.e.d(com.anythink.core.common.j.m.a, this.f + "get token short timeout.");
        this.q.set(true);
        if (g() > 0) {
            b(SystemClock.elapsedRealtime());
        }
    }

    private synchronized int g() {
        return this.g.size();
    }

    private boolean h() {
        return !this.r.get() && this.g.size() > 0;
    }

    private boolean i() {
        return this.q.get() && !this.r.get();
    }

    private synchronized void j() {
        if (!this.m) {
            com.anythink.core.common.j.e.b(com.anythink.core.common.j.m.a, this.f + "finishCallback: ");
            this.m = true;
            d();
            this.u.clear();
            a(0L, -2, ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE, this.s);
            a(0L, -2, ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE, this.t);
            m();
            k();
            l();
        }
    }

    private void k() {
        com.anythink.core.b.b.a aVar;
        if ((this.i.size() > 0 || this.h.size() > 0) && (aVar = this.n) != null) {
            aVar.a(this.i, this.h);
        }
        this.i.clear();
        this.h.clear();
    }

    private synchronized void l() {
        com.anythink.core.b.b.a aVar;
        if (n() && (aVar = this.n) != null) {
            aVar.a();
        }
    }

    private void m() {
        if (this.d) {
            if (this.i.size() > 0 || this.h.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("S2S HeadBidding Success List", d.a(this.i));
                    jSONObject.put("S2S HeadBidding Fail List", d.a(this.h));
                } catch (Exception unused) {
                }
                com.anythink.core.common.j.m.a(com.anythink.core.common.j.m.a, jSONObject.toString(), false);
            }
        }
    }

    private boolean n() {
        return this.s.size() == 0 && this.t.size() == 0 && this.u.size() == 0;
    }

    public abstract void a(List<JSONObject> list, com.anythink.core.common.g.h hVar);

    public abstract String b();

    public final synchronized void c() {
        if (!this.r.get() && this.g.size() > 0) {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.e.4
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.b(SystemClock.elapsedRealtime());
                }
            });
        }
    }

    @Override // com.anythink.core.b.d
    public final void a(boolean z) {
        this.d = z;
    }

    @Override // com.anythink.core.b.d
    public final void a(com.anythink.core.b.b.a aVar) {
        List<af> list;
        this.o = SystemClock.elapsedRealtime();
        this.n = aVar;
        if (this.d) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("S2S Start HeadBidding List", d.a(this.c.i));
                jSONObject.put("S2S Start HeadBidding List(Directly)", d.b(this.g));
            } catch (Exception unused) {
            }
            com.anythink.core.common.j.m.a(com.anythink.core.common.j.m.a, jSONObject.toString(), false);
        }
        if (this.c.i.size() == 0 && (list = this.c.k) != null && list.size() > 0) {
            b(this.o);
            return;
        }
        long o = this.c.n.o();
        if (o <= 0) {
            o = 500;
        }
        com.anythink.core.common.b.m.a().a(this.w, o);
        for (Map.Entry<String, af> entry : this.s.entrySet()) {
            af value = entry.getValue();
            i iVar = new i(this.c);
            i.a aVar2 = new i.a() { // from class: com.anythink.core.b.e.2
                @Override // com.anythink.core.b.i.a
                public final void a(af afVar, ATBaseAdAdapter aTBaseAdAdapter) {
                    com.anythink.core.b.b.a aVar3 = e.this.n;
                    if (aVar3 != null) {
                        aVar3.a(afVar, aTBaseAdAdapter);
                    }
                }

                @Override // com.anythink.core.b.i.a
                public final void a(af afVar, JSONObject jSONObject2) {
                    e eVar = e.this;
                    if (eVar.m) {
                        return;
                    }
                    eVar.u.remove(afVar.t());
                    e.a(e.this, afVar);
                    e.this.a(jSONObject2, afVar);
                    e.b(e.this);
                }

                @Override // com.anythink.core.b.i.a
                public final void a(String str, af afVar) {
                    e eVar = e.this;
                    if (eVar.m) {
                        return;
                    }
                    eVar.u.remove(afVar.t());
                    e.this.s.remove(afVar.t());
                    e.a(e.this, str, afVar);
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1295842379:
                            if (str.equals(ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -49992206:
                            if (str.equals(ATBidRequestInfo.BIDTOKEN_OBTAIN_TIMEOUT_TYPE)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 56988620:
                            if (str.equals(ATBidRequestInfo.BIDTOKEN_EMPTY_ERROR_TYPE)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 204511524:
                            if (str.equals(ATBidRequestInfo.INIT_ERROR_TYPE)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1316982070:
                            if (str.equals(ATBidRequestInfo.RETURN_PARAMS_ERROR_TYPE)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1956498070:
                            if (str.equals(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE)) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 3:
                        case 4:
                        case 5:
                            e.this.b(afVar, str, 0L, -9);
                            break;
                        case 1:
                        case 2:
                            e.this.b(afVar, str, 0L, -2);
                            break;
                        default:
                            e.this.b(afVar, "Unknown error: ".concat(str), 0L, -9);
                            break;
                    }
                    e.b(e.this);
                }
            };
            iVar.d = aVar2;
            ATBaseAdAdapter a = com.anythink.core.common.j.i.a(value);
            if (a == null) {
                aVar2.a(ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE, value);
            } else {
                com.anythink.core.common.j.b.a.a().a(new i.AnonymousClass1(a, value));
            }
        }
    }

    private static List<m> b(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(m.a(optJSONArray.optString(i)));
            }
        }
        return arrayList;
    }

    private void b(af afVar) {
        int c = afVar.c();
        com.anythink.core.common.i.c.a(afVar, this.c, SystemClock.elapsedRealtime() - this.o, true, f.a().b(c));
        f.a().a(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(af afVar, String str, long j, int i) {
        d.a(afVar, str, j, i);
        this.h.add(afVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if ((r8.q.get() && !r8.r.get()) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(e eVar) {
        boolean z;
        com.anythink.core.common.j.e.b(com.anythink.core.common.j.m.a, eVar.f + "handleBidTokenResult");
        boolean z2 = true;
        if (eVar.u.size() == 0) {
            eVar.d();
            if (!eVar.r.get()) {
                z = true;
                if (eVar.g() > 0) {
                    if (!z) {
                    }
                    if (z2) {
                        eVar.b(eVar.o);
                        return;
                    } else if (eVar.h.size() <= 0 || !eVar.n()) {
                        return;
                    } else {
                        eVar.a(null, 0L, 0, "", null);
                        return;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        z = false;
        if (eVar.g() > 0) {
        }
        z2 = false;
        if (z2) {
        }
    }

    private void a(long j) {
        com.anythink.core.common.b.m.a().a(this.w, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(JSONObject jSONObject, af afVar) {
        this.g.add(jSONObject);
        this.v.put(afVar.t(), afVar);
    }

    private synchronized void a(List<JSONObject> list, Map<String, af> map) {
        list.addAll(this.g);
        this.g.clear();
        map.putAll(this.v);
        this.v.clear();
    }

    private void a(m mVar) {
        if (TextUtils.isEmpty(mVar.i)) {
            return;
        }
        try {
            com.anythink.core.common.e.g a = com.anythink.core.common.a.c.a(mVar.token, new JSONObject(mVar.i), mVar.d);
            if (a == null) {
                return;
            }
            if (mVar.d == 67) {
                com.anythink.core.common.d.c.a(this.c.a).a(a.k(), a.e());
                com.anythink.core.common.d.b.a(this.c.a).a(a.l(), a.e());
            }
            com.anythink.core.common.a.a.a().a(this.c.a, mVar.d, mVar.k, mVar.token, mVar.i);
        } catch (Throwable unused) {
        }
    }

    private void a(long j, int i, String str, Map<String, af> map) {
        for (af afVar : map.values()) {
            if (a(afVar, str, i)) {
                this.i.add(afVar);
            } else {
                b(afVar, str, j, i);
            }
        }
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<m> list, long j, int i, String str, Map<String, af> map) {
        com.anythink.core.common.j.e.b(com.anythink.core.common.j.m.a, this.f + "handleResult: ");
        if (list != null && list.size() > 0) {
            Collections.sort(list);
            for (int i2 = 0; i2 < list.size(); i2++) {
                m mVar = list.get(i2);
                this.s.remove(mVar.k);
                af remove = map.remove(mVar.k);
                if (remove == null && this.t.containsKey(mVar.k)) {
                    remove = this.t.remove(mVar.k);
                    this.t.clear();
                }
                if (remove != null) {
                    if (mVar.isSuccessWithUseType()) {
                        int i3 = i2 + 1;
                        int size = list.size();
                        double d = zg2.s;
                        if (i3 < size) {
                            m mVar2 = list.get(i3);
                            double d2 = mVar2.price;
                            d = d2 == zg2.s ? f.a().a(mVar2.g, remove.t()) : d2;
                        }
                        a(remove.c(), mVar, d);
                    }
                    a(remove, mVar, j);
                }
            }
        }
        if (map != null) {
            a(j, i, TextUtils.isEmpty(str) ? "No Response error." : "No Response error." + str, map);
        }
        if (this.i.size() >= 2) {
            Collections.sort(this.i);
        }
        m();
        k();
        l();
    }

    private void a(Object obj, List<m> list) {
        JSONArray optJSONArray;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("wf") && (optJSONArray = jSONObject.optJSONArray("wf")) != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(j.a(optJSONArray.optString(i2)));
                }
                Collections.sort(arrayList);
                int size = arrayList.size();
                double d = 10000.0d;
                if (size == 1) {
                    j jVar = (j) arrayList.get(0);
                    if (jVar.c == zg2.s) {
                        jVar.c = 10000.0d;
                        Iterator<m> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            m next = it.next();
                            if (TextUtils.equals(jVar.b, next.k) && next.isSuccessWithUseType()) {
                                m mVar = this.p;
                                if (mVar == null || !TextUtils.equals(mVar.g, jVar.d)) {
                                    this.p = next;
                                }
                                jVar.c = Math.max(jVar.c, next.o);
                            }
                        }
                        f.a().a(jVar.d, jVar.b, jVar);
                        return;
                    }
                    return;
                }
                int i3 = size - 1;
                while (i < size) {
                    j jVar2 = (j) arrayList.get(i);
                    if (jVar2.c == zg2.s) {
                        if (i == 0) {
                            int i4 = i + 1;
                            if (((j) arrayList.get(i4)).c == zg2.s) {
                                jVar2.c = d;
                            } else {
                                jVar2.c = ((j) arrayList.get(i4)).c + 0.1d;
                            }
                        } else if (i == i3) {
                            int i5 = i - 1;
                            if (((j) arrayList.get(i5)).c - 0.1d <= zg2.s) {
                                jVar2.c = ((j) arrayList.get(i5)).c / 2.0d;
                            } else {
                                jVar2.c = ((j) arrayList.get(i5)).c - 0.1d;
                            }
                        } else {
                            double d2 = ((j) arrayList.get(i - 1)).c;
                            double d3 = d2 - 0.1d;
                            double d4 = d2 - ((j) arrayList.get(i + 1)).c;
                            if (Math.abs(d4) <= 0.1d) {
                                d3 = d2 - (d4 / 2.0d);
                            }
                            jVar2.c = d3;
                        }
                        Iterator<m> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            m next2 = it2.next();
                            if (TextUtils.equals(jVar2.b, next2.k) && next2.isSuccessWithUseType()) {
                                m mVar2 = this.p;
                                if (mVar2 == null || !TextUtils.equals(mVar2.g, jVar2.d)) {
                                    this.p = next2;
                                }
                                jVar2.c = Math.max(jVar2.c, next2.o);
                            }
                        }
                        f.a().a(jVar2.d, jVar2.b, jVar2);
                    }
                    i++;
                    d = 10000.0d;
                }
            }
        }
    }

    private void a(String str, af afVar) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int c = afVar.c();
        com.anythink.core.common.i.c.a(afVar, this.c, SystemClock.elapsedRealtime() - this.o, false, f.a().b(c));
        f.a().a(c);
    }

    @Override // com.anythink.core.b.d
    public void a(af afVar, l lVar, long j) {
        String C;
        int i;
        boolean z = lVar instanceof m;
        if (z) {
            m mVar = (m) lVar;
            if (mVar.isSuccessWithUseType()) {
                if (z && !TextUtils.isEmpty(mVar.i)) {
                    try {
                        com.anythink.core.common.e.g a = com.anythink.core.common.a.c.a(mVar.token, new JSONObject(mVar.i), mVar.d);
                        if (a != null) {
                            if (mVar.d == 67) {
                                com.anythink.core.common.d.c.a(this.c.a).a(a.k(), a.e());
                                com.anythink.core.common.d.b.a(this.c.a).a(a.l(), a.e());
                            }
                            com.anythink.core.common.a.a.a().a(this.c.a, mVar.d, mVar.k, mVar.token, mVar.i);
                        }
                    } catch (Throwable unused) {
                    }
                }
                afVar.a(j);
                this.i.add(afVar);
                if (afVar.l() != 3 && afVar.l() != 7) {
                    mVar.f = System.currentTimeMillis() + afVar.n();
                } else {
                    mVar.f = System.currentTimeMillis() + mVar.e;
                }
                a(afVar, mVar);
                return;
            }
            int i2 = 0;
            if (mVar.useType == 2) {
                afVar.Q();
                i2 = 1;
                C = "filter by s2s bid max count";
                i = 0;
            } else {
                StringBuilder sb = new StringBuilder("errorCode:[");
                sb.append(mVar.a);
                sb.append("],errorMsg:[");
                C = wo1.C(sb, mVar.errorMsg, "]");
                i = -1;
            }
            if (a(afVar, C, i, i2)) {
                this.i.add(afVar);
            } else {
                b(afVar, C, j, i);
            }
        }
    }

    @Override // com.anythink.core.b.d
    public final void a() {
        j();
    }

    public static /* synthetic */ void a(e eVar, af afVar) {
        int c = afVar.c();
        com.anythink.core.common.i.c.a(afVar, eVar.c, SystemClock.elapsedRealtime() - eVar.o, true, f.a().b(c));
        f.a().a(c);
    }

    public static /* synthetic */ void a(e eVar, String str, af afVar) {
        if (TextUtils.equals(str, ATBidRequestInfo.NO_ADAPTER_ERROR_TYPE) || TextUtils.equals(str, ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE)) {
            return;
        }
        int c = afVar.c();
        com.anythink.core.common.i.c.a(afVar, eVar.c, SystemClock.elapsedRealtime() - eVar.o, false, f.a().b(c));
        f.a().a(c);
    }

    public static /* synthetic */ List a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof JSONObject) {
            JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(m.a(optJSONArray.optString(i)));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void a(e eVar, Object obj, List list) {
        JSONArray optJSONArray;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (!jSONObject.has("wf") || (optJSONArray = jSONObject.optJSONArray("wf")) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList.add(j.a(optJSONArray.optString(i2)));
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            double d = 10000.0d;
            if (size == 1) {
                j jVar = (j) arrayList.get(0);
                if (jVar.c == zg2.s) {
                    jVar.c = 10000.0d;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        m mVar = (m) it.next();
                        if (TextUtils.equals(jVar.b, mVar.k) && mVar.isSuccessWithUseType()) {
                            m mVar2 = eVar.p;
                            if (mVar2 == null || !TextUtils.equals(mVar2.g, jVar.d)) {
                                eVar.p = mVar;
                            }
                            jVar.c = Math.max(jVar.c, mVar.o);
                        }
                    }
                    f.a().a(jVar.d, jVar.b, jVar);
                    return;
                }
                return;
            }
            int i3 = size - 1;
            while (i < size) {
                j jVar2 = (j) arrayList.get(i);
                if (jVar2.c == zg2.s) {
                    if (i == 0) {
                        int i4 = i + 1;
                        if (((j) arrayList.get(i4)).c == zg2.s) {
                            jVar2.c = d;
                        } else {
                            jVar2.c = ((j) arrayList.get(i4)).c + 0.1d;
                        }
                    } else if (i == i3) {
                        int i5 = i - 1;
                        if (((j) arrayList.get(i5)).c - 0.1d <= zg2.s) {
                            jVar2.c = ((j) arrayList.get(i5)).c / 2.0d;
                        } else {
                            jVar2.c = ((j) arrayList.get(i5)).c - 0.1d;
                        }
                    } else {
                        double d2 = ((j) arrayList.get(i - 1)).c;
                        double d3 = d2 - 0.1d;
                        double d4 = d2 - ((j) arrayList.get(i + 1)).c;
                        if (Math.abs(d4) <= 0.1d) {
                            d3 = d2 - (d4 / 2.0d);
                        }
                        jVar2.c = d3;
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        m mVar3 = (m) it2.next();
                        if (TextUtils.equals(jVar2.b, mVar3.k) && mVar3.isSuccessWithUseType()) {
                            m mVar4 = eVar.p;
                            if (mVar4 == null || !TextUtils.equals(mVar4.g, jVar2.d)) {
                                eVar.p = mVar3;
                            }
                            jVar2.c = Math.max(jVar2.c, mVar3.o);
                        }
                    }
                    f.a().a(jVar2.d, jVar2.b, jVar2);
                }
                i++;
                d = 10000.0d;
            }
        }
    }
}