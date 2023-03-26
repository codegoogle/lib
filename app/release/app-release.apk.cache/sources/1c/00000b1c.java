package com.anythink.expressad.videocommon.e;

import android.text.TextUtils;
import com.anythink.expressad.videocommon.b.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public static final String a = "reward";
    private static final String c = "RewardSettingManager";
    private static Map<String, d> e = new HashMap(3);
    private static c f;
    public a b;
    private Object d = new Object();

    /* renamed from: com.anythink.expressad.videocommon.e.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements g.d {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.videocommon.b.g.a
        public final void a(String str) {
        }

        @Override // com.anythink.expressad.videocommon.b.g.a
        public final void a(String str, String str2) {
        }
    }

    private c() {
        this.b = null;
        this.b = c();
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f == null) {
                f = new c();
            }
            cVar = f;
        }
        return cVar;
    }

    public static a c() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put(b.j, 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.anythink.expressad.videocommon.c.c("Virtual Item", 1));
        aVar.a(hashMap);
        aVar.b(hashMap2);
        aVar.a();
        aVar.b();
        aVar.d();
        aVar.f();
        aVar.h();
        return aVar;
    }

    public final a b() {
        a aVar = this.b;
        return aVar == null ? c() : aVar;
    }

    private static boolean b(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String optString = optJSONArray.optJSONObject(0).optString("unitId");
                if (optJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(optString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final d a(String str, String str2) {
        synchronized (this.d) {
            String str3 = "reward_" + str + "_" + str2;
            if (e.containsKey(str3)) {
                return e.get(str3);
            }
            d c2 = d.c(com.anythink.expressad.foundation.a.a.a.a().a(str3));
            e.put(str3, c2);
            return c2;
        }
    }

    public final d a(String str, String str2, boolean z) {
        d dVar;
        synchronized (this.d) {
            String str3 = "reward_" + str + "_" + str2;
            dVar = e.get(str3);
            if (dVar == null) {
                dVar = a(z);
                e.put(str3, dVar);
            }
        }
        return dVar;
    }

    public final void a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String I = a().a(com.anythink.expressad.foundation.b.a.b().e(), str, z) != null ? d.I() : "";
        if (TextUtils.isEmpty(I) || !TextUtils.isEmpty(g.a().c(I)) || TextUtils.isEmpty(I)) {
            return;
        }
        g.a().b(I, (g.a) new AnonymousClass1());
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        g.a().b(str, (g.a) new AnonymousClass1());
    }

    private static d a(boolean z) {
        d dVar = new d();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.anythink.expressad.videocommon.c.b(1, 15, null));
            dVar.a((List<com.anythink.expressad.videocommon.c.b>) arrayList);
            dVar.A();
            dVar.z();
            dVar.B();
            dVar.G();
            dVar.D();
            dVar.F();
            dVar.t();
            dVar.u();
            dVar.w();
            dVar.y();
            dVar.s();
            dVar.i();
            dVar.S();
            dVar.g();
            if (z) {
                dVar.a(5);
            } else {
                dVar.a(-1);
            }
            dVar.d();
            dVar.c();
            dVar.q();
            dVar.M();
            dVar.O();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            dVar.a(arrayList2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return dVar;
    }
}