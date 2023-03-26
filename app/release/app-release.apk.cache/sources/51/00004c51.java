package com.p7700g.p99005;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetworkFullProbe.java */
/* loaded from: classes2.dex */
public class kd1 {
    public static final String a = "network_availability_test";
    @x1
    private final kj1 b = kj1.b("NetworkFullProbe");
    @x1
    private final Set<ld1> c;

    public kd1(@x1 List<ld1> list) {
        this.c = new HashSet(list);
    }

    public static float b(@x1 List<nd1> list) {
        float f = 0.0f;
        int i = 0;
        for (nd1 nd1Var : list) {
            if (!nd1Var.f()) {
                i++;
            } else if (nd1Var.e()) {
                f += 1.0f;
            }
        }
        if (list.size() - i > 0) {
            f /= list.size() - i;
        }
        return j(f);
    }

    @x1
    public static kd1 c() {
        return new kd1(Collections.emptyList());
    }

    @z1
    private static nd1 d(@x1 List<nd1> list) {
        for (nd1 nd1Var : list) {
            if (nd1.d.equals(nd1Var.c())) {
                return nd1Var;
            }
        }
        return null;
    }

    @x1
    public static String e(@x1 List<nd1> list) {
        if (list.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (nd1 nd1Var : list) {
            if (nd1Var.f()) {
                jSONArray.put(nd1Var.a());
            }
        }
        try {
            jSONObject.put(a, jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    @x1
    public static String f(@x1 List<nd1> list) {
        nd1 d = d(list);
        return (d == null || !d.e()) ? "" : d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ List h(List list) throws Exception {
        try {
            this.b.c("Start networkFull probe", new Object[0]);
            dq0 b0 = dq0.b0(list);
            b0.Z(10L, TimeUnit.SECONDS);
            List list2 = (List) b0.F();
            if (list2 != null) {
                this.b.c("Return networkFull probe", new Object[0]);
                return list2;
            }
        } catch (Throwable th) {
            this.b.f(th);
        }
        this.b.c("Return empty networkFull probe", new Object[0]);
        return new ArrayList();
    }

    private static float j(float f) {
        return new BigDecimal(Float.toString(f)).setScale(2, 4).floatValue();
    }

    public void a(@x1 Collection<ld1> collection) {
        this.c.addAll(collection);
    }

    @x1
    public dq0<List<nd1>> i() {
        final ArrayList arrayList = new ArrayList();
        for (ld1 ld1Var : this.c) {
            arrayList.add(ld1Var.a());
        }
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.vc1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kd1.this.h(arrayList);
            }
        });
    }
}