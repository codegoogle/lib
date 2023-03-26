package com.anythink.core.common;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.ag;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    private static a a;
    private final String b = a.class.getSimpleName();
    private ConcurrentHashMap<String, ConcurrentHashMap<String, ag>> c = new ConcurrentHashMap<>();

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
            aVar = a;
        }
        return aVar;
    }

    public final void b(String str, af afVar) {
        if (afVar == null) {
            return;
        }
        String str2 = this.b;
        com.anythink.core.common.j.e.b(str2, "Clean own ad cache :" + afVar.t() + "|||" + afVar.l() + "|||" + afVar.c());
        int l = afVar.l();
        if (l != 3) {
            if (l == 4) {
                com.anythink.core.basead.b.a();
                Context e = com.anythink.core.common.b.m.a().e();
                com.anythink.core.basead.b.a();
                com.anythink.core.common.j.n.a(e, com.anythink.core.common.b.g.w, com.anythink.core.basead.b.a(str, afVar.t(), afVar.c()));
                return;
            } else if (l != 7) {
                return;
            }
        }
        com.anythink.core.common.e.m N = afVar.N();
        com.anythink.core.b.f.a().a(afVar.t());
        com.anythink.core.b.f.a().b(afVar.t());
        if (N == null || TextUtils.isEmpty(N.token)) {
            return;
        }
        N.b();
        com.anythink.core.common.a.a.a().b(com.anythink.core.common.b.m.a().e(), N.token);
    }

    public final ag a(String str, int i, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list, long j) {
        synchronized (t.a().a(str)) {
            ConcurrentHashMap<String, ag> concurrentHashMap = this.c.get(str);
            af unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            String t = aTBaseAdAdapter.getUnitGroupInfo().t();
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                this.c.put(str, concurrentHashMap);
            }
            ag agVar = concurrentHashMap.get(t);
            if (agVar == null) {
                agVar = new ag();
                agVar.a = i;
                agVar.b = aTBaseAdAdapter.getTrackingInfo().T();
                concurrentHashMap.put(t, agVar);
            } else {
                agVar.a = i;
                agVar.b = aTBaseAdAdapter.getTrackingInfo().T();
            }
            com.anythink.core.common.e.b a2 = agVar.a();
            if (a2 == null || !TextUtils.equals(u.a().b(str), a2.h().T())) {
                if (list != null && list.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (BaseAd baseAd : list) {
                        baseAd.setTrackingInfo(aTBaseAdAdapter.getTrackingInfo().M());
                        com.anythink.core.common.e.b bVar = new com.anythink.core.common.e.b();
                        bVar.b(i);
                        bVar.a(aTBaseAdAdapter);
                        bVar.a(baseAd);
                        bVar.c(System.currentTimeMillis());
                        bVar.b(j);
                        bVar.a(aTBaseAdAdapter.getTrackingInfo().T());
                        bVar.a(unitGroupInfo.A());
                        arrayList.add(bVar);
                    }
                    agVar.a(arrayList);
                } else {
                    com.anythink.core.common.e.b bVar2 = new com.anythink.core.common.e.b();
                    bVar2.b(i);
                    bVar2.a(aTBaseAdAdapter);
                    bVar2.c(System.currentTimeMillis());
                    bVar2.b(j);
                    bVar2.a(aTBaseAdAdapter.getTrackingInfo().T());
                    bVar2.a(unitGroupInfo.A());
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(bVar2);
                    agVar.a(arrayList2);
                }
                return agVar;
            }
            return agVar;
        }
    }

    public final com.anythink.core.common.e.b a(Context context, String str) {
        synchronized (t.a().a(str)) {
            List<com.anythink.core.common.e.b> a2 = a(context, str, false, false, false);
            if (a2 == null || a2.size() <= 0) {
                return null;
            }
            return a2.get(0);
        }
    }

    public final com.anythink.core.common.e.b a(Context context, String str, boolean z, boolean z2) {
        synchronized (t.a().a(str)) {
            List<com.anythink.core.common.e.b> a2 = a(context, str, z, z2, false);
            if (a2 == null || a2.size() <= 0) {
                return null;
            }
            return a2.get(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d2 A[Catch: all -> 0x0519, TryCatch #1 {, blocks: (B:7:0x001c, B:9:0x0044, B:11:0x0046, B:13:0x005c, B:16:0x0063, B:17:0x0066, B:20:0x0077, B:22:0x007d, B:24:0x008b, B:25:0x008e, B:27:0x0094, B:29:0x009b, B:31:0x00a5, B:119:0x0310, B:33:0x00cc, B:35:0x00e5, B:36:0x00fd, B:38:0x0104, B:46:0x011f, B:49:0x0130, B:54:0x013e, B:57:0x014a, B:59:0x0185, B:63:0x01a2, B:65:0x01b1, B:66:0x01b6, B:68:0x01b8, B:69:0x01c1, B:73:0x01e0, B:74:0x01e9, B:79:0x01fb, B:82:0x0205, B:106:0x0268, B:108:0x027f, B:110:0x029d, B:112:0x02c1, B:113:0x02c8, B:115:0x02ca, B:116:0x02d2, B:117:0x02e5, B:40:0x010b, B:42:0x0115, B:118:0x02fa, B:122:0x0323, B:124:0x0329, B:126:0x0330, B:127:0x0333, B:129:0x0335, B:131:0x033d, B:133:0x0343, B:136:0x034e, B:138:0x0357, B:142:0x0377, B:143:0x0382, B:144:0x039b, B:146:0x039d, B:153:0x03b0, B:156:0x03b8, B:158:0x03c8, B:159:0x03cc, B:161:0x03d2, B:163:0x03de, B:168:0x03ee, B:194:0x04b9, B:199:0x04c1, B:203:0x04e7, B:205:0x04fe, B:206:0x0517, B:149:0x03a5), top: B:215:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.anythink.core.common.e.b> a(Context context, String str, boolean z, boolean z2, boolean z3) {
        boolean z4;
        af afVar;
        ATBaseAdAdapter aTBaseAdAdapter;
        af afVar2;
        boolean isAdReady;
        BaseAd baseAd;
        ArrayList arrayList;
        List<com.anythink.core.common.e.b> a2;
        int i;
        String str2;
        ArrayList arrayList2;
        ConcurrentHashMap<String, ag> concurrentHashMap;
        com.anythink.core.common.e.m a3;
        ConcurrentHashMap<String, ag> concurrentHashMap2;
        af afVar3;
        ATBaseAdAdapter aTBaseAdAdapter2;
        BaseAd baseAd2;
        boolean z5;
        ArrayList arrayList3;
        boolean z6;
        Context context2 = context;
        synchronized (t.a().a(str)) {
            try {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    Looper.prepare();
                }
            } catch (Throwable unused) {
            }
            ArrayList arrayList4 = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            com.anythink.core.c.d a4 = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(str);
            if (a4 == null) {
                return null;
            }
            List<af> a5 = u.a().a(str);
            String b = u.a().b(str);
            if (TextUtils.isEmpty(b)) {
                b = com.anythink.core.common.j.g.a(context);
            }
            String str3 = b;
            if (a5 != null) {
                arrayList6.addAll(a5);
            }
            ConcurrentHashMap<String, ag> concurrentHashMap3 = this.c.get(str);
            if (arrayList6.size() > 0) {
                int i2 = 0;
                while (i2 < arrayList6.size()) {
                    af afVar4 = (af) arrayList6.get(i2);
                    if (afVar4.c() == 35) {
                        arrayList5.add(afVar4);
                    }
                    int a6 = afVar4.a() < 0 ? afVar4.a() : i2;
                    if (com.anythink.core.a.c.a().a(str, afVar4)) {
                        i = i2;
                        arrayList2 = arrayList5;
                        concurrentHashMap = concurrentHashMap3;
                        str2 = str3;
                        a(jSONArray, a6, afVar4.t(), afVar4.c(), "", false, 3);
                    } else {
                        i = i2;
                        str2 = str3;
                        arrayList2 = arrayList5;
                        concurrentHashMap = concurrentHashMap3;
                        if (com.anythink.core.a.a.a(com.anythink.core.common.b.m.a().e()).a(str, afVar4)) {
                            a(jSONArray, a6, afVar4.t(), afVar4.c(), "", false, 2);
                        } else {
                            if ((afVar4.l() != 3 && afVar4.l() != 7) || ((a3 = com.anythink.core.b.f.a().a(afVar4)) != null && !a3.a())) {
                                ag agVar = concurrentHashMap != null ? concurrentHashMap.get(afVar4.t()) : null;
                                com.anythink.core.common.e.b a7 = agVar != null ? agVar.a() : null;
                                if (agVar != null && a7 != null) {
                                    boolean g = a7.g();
                                    boolean i3 = a7.i();
                                    if (g && i3) {
                                        ATBaseAdAdapter e = a7.e();
                                        int i4 = a6;
                                        com.anythink.core.common.e.b bVar = a7;
                                        concurrentHashMap2 = concurrentHashMap;
                                        a(jSONArray, a6, afVar4.t(), afVar4.c(), e.getNetworkSDKVersion(), true, -1);
                                        com.anythink.core.common.e.e h = bVar.h();
                                        h.r(jSONArray.toString());
                                        h.p(i4);
                                        if (z) {
                                            com.anythink.core.common.i.c.a(h, true, -1, i4, afVar4.t(), afVar4.c(), e.getNetworkSDKVersion(), jSONArray.toString(), str2, h.q == 3, "");
                                        }
                                        if (!z3) {
                                            arrayList4.add(bVar);
                                            return arrayList4;
                                        }
                                        arrayList4.addAll(agVar.b());
                                    } else {
                                        int i5 = a6;
                                        com.anythink.core.common.e.b bVar2 = a7;
                                        concurrentHashMap2 = concurrentHashMap;
                                        a(str, bVar2);
                                        bVar2.k();
                                        a(jSONArray, i5, afVar4.t(), afVar4.c(), "", false, !g ? 0 : 1);
                                    }
                                    i2 = i + 1;
                                    context2 = context;
                                    arrayList5 = arrayList2;
                                    str3 = str2;
                                    concurrentHashMap3 = concurrentHashMap2;
                                }
                                int i6 = a6;
                                concurrentHashMap2 = concurrentHashMap;
                                ATBaseAdAdapter a8 = afVar4.K() == 2 ? com.anythink.core.common.j.i.a(afVar4) : null;
                                if (a8 != null) {
                                    try {
                                        boolean internalInitNetworkObjectByPlacementId = a8.internalInitNetworkObjectByPlacementId(context2, a4.a(str, str2, afVar4), t.a().c(str));
                                        if (internalInitNetworkObjectByPlacementId) {
                                            afVar3 = afVar4;
                                            str2 = str2;
                                            aTBaseAdAdapter2 = a8;
                                            try {
                                                a(a8, str2, str, a4, afVar3, i6);
                                            } catch (Throwable unused2) {
                                                baseAd2 = null;
                                                z5 = false;
                                                if (!z5) {
                                                }
                                                i2 = i + 1;
                                                context2 = context;
                                                arrayList5 = arrayList2;
                                                str3 = str2;
                                                concurrentHashMap3 = concurrentHashMap2;
                                            }
                                        } else {
                                            afVar3 = afVar4;
                                            str2 = str2;
                                            aTBaseAdAdapter2 = a8;
                                        }
                                        if (TextUtils.equals(String.valueOf(a4.S()), "0")) {
                                            if (internalInitNetworkObjectByPlacementId) {
                                                baseAd2 = aTBaseAdAdapter2.getBaseAdObject(context2);
                                                if (baseAd2 != null) {
                                                    z6 = true;
                                                    z5 = z6;
                                                }
                                            } else {
                                                baseAd2 = null;
                                            }
                                            z6 = false;
                                            z5 = z6;
                                        } else {
                                            z5 = internalInitNetworkObjectByPlacementId ? aTBaseAdAdapter2.isAdReady() : false;
                                            baseAd2 = null;
                                        }
                                    } catch (Throwable unused3) {
                                        afVar3 = afVar4;
                                        str2 = str2;
                                        aTBaseAdAdapter2 = a8;
                                    }
                                    if (!z5) {
                                        if (baseAd2 != null) {
                                            ArrayList arrayList7 = new ArrayList();
                                            baseAd2.setTrackingInfo(aTBaseAdAdapter2.getTrackingInfo().M());
                                            arrayList7.add(baseAd2);
                                            arrayList3 = arrayList7;
                                        } else {
                                            arrayList3 = null;
                                        }
                                        ag a9 = a(str, i6, aTBaseAdAdapter2, arrayList3, afVar3.p());
                                        com.anythink.core.common.e.e h2 = a9.a().h();
                                        h2.p(i6);
                                        if (z) {
                                            com.anythink.core.common.i.c.a(h2, true, -1, i6, afVar3.t(), afVar3.c(), aTBaseAdAdapter2.getNetworkSDKVersion(), jSONArray.toString(), str2, true, "");
                                        }
                                        if (!z3) {
                                            arrayList4.add(a9.a());
                                            return arrayList4;
                                        }
                                        arrayList4.addAll(a9.b());
                                    } else {
                                        a(jSONArray, i6, afVar3.t(), afVar3.c(), "", false, 4);
                                    }
                                } else {
                                    a(jSONArray, i6, afVar4.t(), afVar4.c(), "", false, 4);
                                }
                                i2 = i + 1;
                                context2 = context;
                                arrayList5 = arrayList2;
                                str3 = str2;
                                concurrentHashMap3 = concurrentHashMap2;
                            }
                            concurrentHashMap2 = concurrentHashMap;
                            a(jSONArray, a6, afVar4.t(), afVar4.c(), "", false, 5);
                            i2 = i + 1;
                            context2 = context;
                            arrayList5 = arrayList2;
                            str3 = str2;
                            concurrentHashMap3 = concurrentHashMap2;
                        }
                    }
                    concurrentHashMap2 = concurrentHashMap;
                    i2 = i + 1;
                    context2 = context;
                    arrayList5 = arrayList2;
                    str3 = str2;
                    concurrentHashMap3 = concurrentHashMap2;
                }
            }
            String str4 = str3;
            ArrayList arrayList8 = arrayList5;
            if (z3) {
                if (arrayList4.size() == 0 && (a2 = a(str, true)) != null) {
                    arrayList4.addAll(a2);
                }
                return arrayList4;
            }
            List<com.anythink.core.common.e.b> a10 = a(str, false);
            com.anythink.core.common.e.b bVar3 = (a10 == null || a10.size() <= 0) ? null : a10.get(0);
            if (bVar3 != null) {
                com.anythink.core.common.e.e h3 = bVar3.h();
                arrayList4.add(bVar3);
                if (z) {
                    com.anythink.core.common.i.c.a(h3, true, -1, arrayList6.size(), h3.w(), h3.G(), h3.u, jSONArray.toString(), str4, h3.q == 3, "");
                }
                a(jSONArray, arrayList6.size(), h3.w(), h3.G(), h3.u, true, -1);
                return arrayList4;
            }
            if (a4.L() == 1) {
                z4 = true;
            } else {
                z4 = a4.L() == 2 ? z2 : false;
            }
            if (arrayList8.size() > 0 && z4) {
                String b2 = r.a().b(context, str);
                if (!TextUtils.isEmpty(b2)) {
                    Iterator it = arrayList8.iterator();
                    while (it.hasNext()) {
                        af afVar5 = (af) it.next();
                        if (afVar5.g() != null && afVar5.g().contains(b2)) {
                            afVar = afVar5;
                            break;
                        }
                    }
                }
                afVar = null;
                if (afVar != null) {
                    Map<String, Object> a11 = a4.a(str, str4, afVar);
                    a11.put(r.b, Boolean.TRUE);
                    int indexOf = arrayList6.indexOf(afVar);
                    try {
                        ATBaseAdAdapter a12 = com.anythink.core.common.j.i.a(afVar);
                        boolean initNetworkObjectByPlacementId = a12.initNetworkObjectByPlacementId(context, a11, t.a().c(str));
                        if (initNetworkObjectByPlacementId) {
                            aTBaseAdAdapter = a12;
                            str4 = str4;
                            afVar2 = afVar;
                            try {
                                a(a12, str4, str, a4, afVar, indexOf);
                            } catch (Throwable unused4) {
                            }
                        } else {
                            aTBaseAdAdapter = a12;
                            str4 = str4;
                            afVar2 = afVar;
                        }
                        if (TextUtils.equals(String.valueOf(a4.S()), "0")) {
                            if (initNetworkObjectByPlacementId) {
                                baseAd = aTBaseAdAdapter.getBaseAdObject(context);
                                if (baseAd != null) {
                                    isAdReady = true;
                                }
                            } else {
                                baseAd = null;
                            }
                            isAdReady = false;
                        } else {
                            isAdReady = initNetworkObjectByPlacementId ? aTBaseAdAdapter.isAdReady() : false;
                            baseAd = null;
                        }
                        if (isAdReady) {
                            if (baseAd != null) {
                                ArrayList arrayList9 = new ArrayList();
                                baseAd.setTrackingInfo(aTBaseAdAdapter.getTrackingInfo().M());
                                arrayList9.add(baseAd);
                                arrayList = arrayList9;
                            } else {
                                arrayList = null;
                            }
                            ag a13 = a(str, indexOf, aTBaseAdAdapter, arrayList, afVar2.p());
                            com.anythink.core.common.e.e h4 = a13.a().h();
                            h4.z = 1;
                            h4.p(indexOf);
                            h4.r(jSONArray.toString());
                            if (z) {
                                com.anythink.core.common.i.c.a(h4, true, -1, indexOf, afVar2.t(), afVar2.c(), aTBaseAdAdapter.getNetworkSDKVersion(), jSONArray.toString(), str4, true, afVar2.g());
                            }
                            arrayList4.add(a13.a());
                            return arrayList4;
                        }
                    } catch (Throwable unused5) {
                        str4 = str4;
                    }
                }
            }
            if (z) {
                com.anythink.core.common.i.c.a(com.anythink.core.common.j.p.a(str4, str, "", a4, "", -1, 0, 0), false, t.a().b(str).d() ? 5 : 1, -1, "", -1, "", jSONArray.toString(), str4, false, "");
            }
            if (z2) {
                com.anythink.core.common.i.c.a(com.anythink.core.common.j.p.a(str4, str, "", a4, "", -1, 0, 0), 1, jSONArray.toString(), str4);
            }
            return null;
        }
    }

    private static void a(String str, com.anythink.core.common.e.b bVar) {
        try {
            com.anythink.core.common.e.m N = bVar.e().getUnitGroupInfo().N();
            if (N != null) {
                com.anythink.core.common.e.e h = bVar.h();
                af c = com.anythink.core.b.f.a().c(str);
                N.a(com.anythink.core.common.j.g.a(c), c.j(), 1, h, c, c.c());
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(ATBaseAdAdapter aTBaseAdAdapter, String str, String str2, com.anythink.core.c.d dVar, af afVar, int i) {
        Map<String, Object> c = t.a().c(str2);
        int[] iArr = {0};
        if (c.containsKey(ae.N)) {
            try {
                iArr[0] = ((Integer) c.get(ae.N)).intValue();
            } catch (Throwable unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(afVar.c());
        com.anythink.core.common.e.e a2 = com.anythink.core.common.j.p.a(str, str2, "", dVar, sb.toString(), 1, 0, iArr[0]);
        com.anythink.core.common.j.p.a(a2, afVar, i, true);
        com.anythink.core.common.j.p.a(aTBaseAdAdapter, a2, afVar);
        a2.q = 3;
        a2.g(aTBaseAdAdapter.getNetworkPlacementId());
        aTBaseAdAdapter.setRefresh(false);
    }

    private static void a(JSONArray jSONArray, int i, String str, int i2, String str2, boolean z, int i3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("priority", i);
            jSONObject.put("unit_id", str);
            jSONObject.put("nw_firm_id", i2);
            jSONObject.put("nw_ver", str2);
            jSONObject.put("result", z ? 1 : 0);
            if (i3 != -1) {
                jSONObject.put("reason", i3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jSONArray.put(jSONObject);
    }

    public final void a(String str, String str2) {
        ag remove;
        synchronized (t.a().a(str)) {
            ConcurrentHashMap<String, ag> concurrentHashMap = this.c.get(str);
            if (concurrentHashMap != null && concurrentHashMap.size() > 0 && (remove = concurrentHashMap.remove(str2)) != null) {
                remove.c();
            }
        }
    }

    public final void a(String str, String str2, com.anythink.core.common.e.b bVar) {
        ag agVar;
        synchronized (t.a().a(str)) {
            if (bVar == null) {
                return;
            }
            ConcurrentHashMap<String, ag> concurrentHashMap = this.c.get(str);
            if (concurrentHashMap != null && concurrentHashMap.size() > 0 && (agVar = concurrentHashMap.get(str2)) != null) {
                agVar.a(bVar);
                if (!agVar.d()) {
                    concurrentHashMap.remove(str2);
                }
            }
        }
    }

    public final void a(final Context context, final com.anythink.core.common.e.b bVar) {
        final ATBaseAdAdapter e = bVar.e();
        final com.anythink.core.common.e.e h = bVar.h();
        af unitGroupInfo = e != null ? e.getUnitGroupInfo() : null;
        if (h != null) {
            t.a().b(h.S()).a(h.T(), unitGroupInfo != null ? com.anythink.core.common.j.g.a(unitGroupInfo) : zg2.s, unitGroupInfo);
            b(h.S(), unitGroupInfo);
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.core.a.a.a(context).a(h.U(), h.S(), h.w());
                    com.anythink.core.a.c.a();
                    com.anythink.core.a.c.a(h.S());
                    com.anythink.core.a.c.a().a(h.S(), h.w());
                    a.this.a(h.S(), h.w(), bVar);
                    MediationBidManager b = com.anythink.core.b.f.a().b();
                    if (b != null) {
                        b.notifyWinnerDisplay(h.S(), e.getUnitGroupInfo());
                    }
                }
            });
        }
    }

    public final com.anythink.core.common.e.b a(String str, af afVar) {
        com.anythink.core.common.e.m a2;
        ConcurrentHashMap<String, ag> concurrentHashMap;
        if (((afVar.l() != 3 && afVar.l() != 7) || ((a2 = com.anythink.core.b.f.a().a(afVar)) != null && !a2.a())) && (concurrentHashMap = this.c.get(str)) != null) {
            ag agVar = concurrentHashMap.get(afVar.t());
            com.anythink.core.common.e.b a3 = agVar != null ? agVar.a() : null;
            if (a3 != null && a3.j()) {
                return a3;
            }
            if (a3 != null) {
                a(str, a3);
                a3.k();
            }
        }
        return null;
    }

    public final void a(String str, String str2, com.anythink.core.c.d dVar) {
        com.anythink.core.common.e.b a2;
        synchronized (t.a().a(str)) {
            ConcurrentHashMap<String, ag> concurrentHashMap = this.c.get(str);
            if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
                Iterator<Map.Entry<String, ag>> it = concurrentHashMap.entrySet().iterator();
                while (it != null && it.hasNext()) {
                    ag value = it.next().getValue();
                    if (value != null && (a2 = value.a()) != null) {
                        if (a2.j()) {
                            if (!a2.b().equals(str2)) {
                                com.anythink.core.common.e.e M = a2.e().getTrackingInfo().M();
                                M.v = str2;
                                M.q = 4;
                                com.anythink.core.common.j.p.a(M, dVar);
                                com.anythink.core.common.i.c.a(M, a2.b());
                                value.a(M);
                            }
                        } else {
                            a(str, a2);
                            a2.k();
                        }
                    }
                }
            }
        }
    }

    private List<com.anythink.core.common.e.b> a(String str, boolean z) {
        ConcurrentHashMap<String, ag> concurrentHashMap = this.c.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        com.anythink.core.common.e.b bVar = null;
        for (Map.Entry<String, ag> entry : concurrentHashMap.entrySet()) {
            ag value = entry.getValue();
            com.anythink.core.common.e.b a2 = value != null ? value.a() : null;
            boolean z2 = false;
            if (a2 != null && a2.j()) {
                z2 = true;
                if (z) {
                    arrayList.add(a2);
                } else if (bVar == null || com.anythink.core.common.j.g.a(bVar.e().getUnitGroupInfo()) < com.anythink.core.common.j.g.a(a2.e().getUnitGroupInfo())) {
                    bVar = a2;
                }
            }
            if (!z2 && a2 != null) {
                a(str, a2);
                a2.k();
            }
        }
        if (z) {
            Collections.sort(arrayList);
        } else if (bVar != null) {
            arrayList.add(bVar);
        }
        return arrayList;
    }
}