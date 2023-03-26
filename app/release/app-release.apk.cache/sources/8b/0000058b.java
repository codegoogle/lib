package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.c.i;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.anythink.core.common.j.p;
import com.anythink.core.common.u;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class d {
    private final String a = getClass().getSimpleName() + ":";
    public com.anythink.core.common.e.a c;
    public boolean d;

    public d(com.anythink.core.common.e.a aVar) {
        this.c = aVar;
    }

    public static JSONArray b(List<JSONObject> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (JSONObject jSONObject : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(i.a.d, 67);
                if (jSONObject.has("unit_ids")) {
                    jSONObject2.put("unit_ids", jSONObject.get("unit_ids"));
                }
                jSONArray.put(jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public abstract void a();

    public abstract void a(com.anythink.core.b.b.a aVar);

    public abstract void a(af afVar, l lVar, long j);

    public void a(boolean z) {
        this.d = z;
    }

    public static JSONArray a(List<af> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (af afVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(i.a.d, afVar.c());
                jSONObject.put("ad_source_id", afVar.t());
                jSONObject.put("content", afVar.g());
                if (!TextUtils.isEmpty(afVar.z())) {
                    jSONObject.put("error", afVar.z());
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static void a(af afVar, String str, long j, int i) {
        afVar.a(j);
        afVar.a(zg2.s);
        afVar.g(i);
        afVar.b();
        if (TextUtils.isEmpty(str)) {
            afVar.h("bid error");
        } else {
            afVar.h(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(af afVar, m mVar) {
        double d;
        double d2;
        boolean z;
        double d3;
        m a = f.a().a(afVar);
        if (a != null) {
            if (mVar.price == zg2.s) {
                String str = a.g;
                if (TextUtils.isEmpty(str)) {
                    d2 = 0.0d;
                    z = true;
                } else {
                    j b = f.a().b(a.g, a.k);
                    j b2 = f.a().b(mVar.g, mVar.k);
                    if (b != null && b2 != null) {
                        d = b.c;
                        f.a().c(str, a.k);
                    } else {
                        d2 = b != null ? b.c : 0.0d;
                        z = false;
                    }
                }
            } else {
                boolean a2 = a.a();
                if (!a2) {
                    double d4 = mVar.price;
                    d3 = a.price;
                    if (d4 <= d3) {
                        z = false;
                        d2 = d3;
                    }
                }
                double d5 = mVar.price;
                if (a2) {
                    com.anythink.core.common.e.a aVar = this.c;
                    a.a(d5, 1, p.a(aVar.c, aVar.d, "", aVar.n, "", 1, 0, 0), afVar);
                    d2 = d5;
                    z = true;
                } else {
                    d3 = d5;
                    z = true;
                    d2 = d3;
                }
            }
            if (!z) {
                if (a != null) {
                    try {
                        com.anythink.core.common.e.a aVar2 = this.c;
                        a.a(d2, 2, p.a(aVar2.c, aVar2.d, "", aVar2.n, "", 1, 0, 0), afVar);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                afVar.a(mVar, 2, 0, 1);
                if (afVar.L() != 2) {
                    f.a().a.put(afVar.t(), mVar);
                    if (afVar.l() == 3 || afVar.l() == 7) {
                        f.a(afVar.t(), mVar);
                        return;
                    }
                    return;
                }
                return;
            }
            if (mVar != null) {
                try {
                    com.anythink.core.common.e.a aVar3 = this.c;
                    com.anythink.core.common.e.e a3 = p.a(aVar3.c, aVar3.d, "", aVar3.n, "", 1, 0, 0);
                    if (mVar.price == zg2.s) {
                        mVar.a(d2, 3, a3, afVar);
                    } else {
                        mVar.a(d2, 2, a3, afVar);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            afVar.a(a, 1, 0, 1);
            return;
        }
        d = mVar.price;
        if (d == zg2.s) {
            j b3 = f.a().b(mVar.g, mVar.k);
            d = b3 != null ? b3.c : 0.0d;
        }
        d2 = d;
        z = true;
        if (!z) {
        }
    }

    public final boolean a(af afVar, String str, int i) {
        return a(afVar, str, i, 0);
    }

    public final boolean a(af afVar, String str, int i, int i2) {
        m a = f.a().a(afVar);
        if (a != null && !a.a()) {
            afVar.a(a, 0, i, i2);
            afVar.h(str);
            return true;
        }
        if (a != null) {
            try {
                com.anythink.core.common.e.a aVar = this.c;
                a.a(a.price, 1, p.a(aVar.c, aVar.d, "", aVar.n, "", 1, 0, 0), afVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public final void a(int i, l lVar, double d) {
        if (i != 28) {
            return;
        }
        double d2 = 0.95d;
        JSONObject a = this.c.n.a();
        if (a != null) {
            double optDouble = a.optDouble(String.valueOf(i));
            if (optDouble > zg2.s && optDouble <= 1.0d) {
                d2 = optDouble;
            }
        }
        double d3 = lVar.originPrice * d2;
        ArrayList arrayList = new ArrayList(5);
        u a2 = u.a();
        com.anythink.core.common.e.a aVar = this.c;
        List<af> b = a2.b(aVar.d, aVar.c);
        if (b != null) {
            arrayList.addAll(b);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            double a3 = com.anythink.core.common.j.g.a((af) it.next());
            if (a3 < lVar.originPrice) {
                d3 = Math.max(d3, a3);
                break;
            }
        }
        double max = Math.max(d3, d);
        lVar.price = (Math.random() * (lVar.originPrice - max)) + max;
    }

    public final double a(af afVar) {
        if (afVar.ad() == null) {
            return 1.0d;
        }
        if (afVar.ad() == ATAdConst.CURRENCY.RMB_CENT) {
            return (1.0d / this.c.n.k()) * 100.0d;
        }
        if (afVar.ad() == ATAdConst.CURRENCY.RMB) {
            return 1.0d / this.c.n.k();
        }
        return 1.0d;
    }

    public final double a(double d, af afVar) {
        double k;
        if (afVar.ad() == null) {
            return d;
        }
        if (afVar.ad() == ATAdConst.CURRENCY.RMB) {
            k = this.c.n.k();
        } else if (afVar.ad() != ATAdConst.CURRENCY.RMB_CENT) {
            return d;
        } else {
            d /= 100.0d;
            k = this.c.n.k();
        }
        return d * k;
    }
}