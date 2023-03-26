package com.anythink.core.common.e;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.p7700g.p99005.gc0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public Context a;
    public com.anythink.core.common.j b;
    public String c;
    public String d;
    public int e;
    public long f;
    public long g;
    public long h;
    public List<af> i;
    public List<af> j;
    public List<af> k;
    public String l;
    public boolean m;
    public com.anythink.core.c.d n;
    public String o;
    public String p;
    public Map<String, Object> q;
    public JSONObject r;
    public e s;
    public af t;
    public int u = 2;
    public double v;

    private a d(List<af> list) {
        a aVar = new a();
        aVar.a = this.a;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.g = this.g;
        aVar.j = this.j;
        aVar.n = this.n;
        long j = this.f;
        if (j < 0) {
            aVar.f = gc0.c;
        } else {
            aVar.f = j;
        }
        aVar.m = this.m;
        aVar.o = this.o;
        aVar.p = this.p;
        aVar.i = list;
        aVar.q = this.q;
        aVar.h = this.h;
        aVar.b = this.b;
        aVar.s = this.s;
        aVar.u = this.u;
        aVar.t = this.t;
        aVar.v = this.v;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:11:0x006d, B:30:0x00bd, B:32:0x00cd, B:33:0x00db, B:35:0x00e1, B:37:0x00ed, B:38:0x00f8, B:40:0x00fe, B:41:0x010a, B:43:0x0110, B:44:0x0115, B:46:0x011b, B:47:0x0120, B:26:0x009b, B:27:0x00a2, B:29:0x00ba, B:16:0x0082, B:19:0x008c), top: B:53:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:11:0x006d, B:30:0x00bd, B:32:0x00cd, B:33:0x00db, B:35:0x00e1, B:37:0x00ed, B:38:0x00f8, B:40:0x00fe, B:41:0x010a, B:43:0x0110, B:44:0x0115, B:46:0x011b, B:47:0x0120, B:26:0x009b, B:27:0x00a2, B:29:0x00ba, B:16:0x0082, B:19:0x008c), top: B:53:0x006d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(List<af> list, List<af> list2) {
        String valueOf;
        int hashCode;
        List<u> a;
        a d = d(list);
        d.l = this.l;
        if (list2.size() > 0) {
            ArrayList arrayList = new ArrayList();
            d.k = arrayList;
            arrayList.addAll(list2);
            char c = 0;
            af afVar = list2.get(0);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (af afVar2 : list2) {
                if (afVar2.l() == 7) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(afVar2.t())));
                    arrayList3.add(afVar2.t());
                }
            }
            JSONObject jSONObject = new JSONObject();
            ATBidRequestInfo.fillBaseCommonParams(jSONObject, String.valueOf(d.e), afVar.t(), 67);
            try {
                valueOf = String.valueOf(d.e);
                hashCode = valueOf.hashCode();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (hashCode != 50) {
                if (hashCode == 52 && valueOf.equals("4")) {
                    c = 1;
                    if (c != 0) {
                        String obj = d.n.a(d.d, d.c, afVar).get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, obj);
                        }
                    } else if (c == 1) {
                        jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
                    }
                    a = com.anythink.core.common.d.c.a(d.a).a(arrayList3);
                    if (a.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        for (u uVar : a) {
                            if (uVar.d() > 0) {
                                jSONObject2.put(uVar.a(), uVar.d());
                            }
                            if (uVar.c() > 0) {
                                jSONObject3.put(uVar.a(), uVar.c());
                            }
                        }
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.DIRECTLY_DA_OFFER_CLICK, jSONObject2);
                        }
                        if (jSONObject3.length() > 0) {
                            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.DIRECTLY_DA_OFFER_IMPRESSION, jSONObject3);
                        }
                    }
                    jSONObject.put("unit_ids", new JSONArray(arrayList2.toString()));
                    d.r = jSONObject;
                }
                c = 65535;
                if (c != 0) {
                }
                a = com.anythink.core.common.d.c.a(d.a).a(arrayList3);
                if (a.size() > 0) {
                }
                jSONObject.put("unit_ids", new JSONArray(arrayList2.toString()));
                d.r = jSONObject;
            } else {
                if (valueOf.equals("2")) {
                    if (c != 0) {
                    }
                    a = com.anythink.core.common.d.c.a(d.a).a(arrayList3);
                    if (a.size() > 0) {
                    }
                    jSONObject.put("unit_ids", new JSONArray(arrayList2.toString()));
                    d.r = jSONObject;
                }
                c = 65535;
                if (c != 0) {
                }
                a = com.anythink.core.common.d.c.a(d.a).a(arrayList3);
                if (a.size() > 0) {
                }
                jSONObject.put("unit_ids", new JSONArray(arrayList2.toString()));
                d.r = jSONObject;
            }
            th.printStackTrace();
            d.r = jSONObject;
        }
        return d;
    }

    public final a b(List<af> list) {
        a d = d(list);
        d.o = this.o;
        d.g = this.g;
        return d;
    }

    public final a c(List<af> list) {
        a d = d(list);
        d.p = this.p;
        return d;
    }

    public final a a(List<af> list) {
        return d(list);
    }
}