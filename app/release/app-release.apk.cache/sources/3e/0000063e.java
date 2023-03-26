package com.anythink.core.common.e;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ag {
    public int a;
    public String b;
    private List<b> c;

    public final synchronized void a(List<b> list) {
        synchronized (this) {
            this.c = list;
        }
    }

    public final synchronized List<b> b() {
        List<b> list = this.c;
        ArrayList arrayList = null;
        if (list != null) {
            for (b bVar : list) {
                if (bVar.d() <= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final synchronized void c() {
        List<b> list = this.c;
        if (list != null) {
            list.clear();
            this.c = null;
        }
    }

    public final boolean d() {
        List<b> list = this.c;
        return list != null && list.size() > 0;
    }

    public final synchronized b a() {
        List<b> list = this.c;
        if (list != null) {
            for (b bVar : list) {
                if (bVar.d() <= 0) {
                    boolean z = true;
                    if (this.c.indexOf(bVar) < this.c.size() - 1) {
                        z = false;
                    }
                    bVar.a(z);
                    return bVar;
                }
            }
        }
        return null;
    }

    public final synchronized void a(b bVar) {
        List<b> list = this.c;
        if (list != null && list.size() > 0) {
            this.c.remove(bVar);
        }
    }

    public final void a(e eVar) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            this.a = -1;
            this.b = eVar.T();
            List<b> list = this.c;
            if (list != null) {
                for (b bVar : list) {
                    if (bVar.j()) {
                        ATBaseAdAdapter e = bVar.e();
                        e.setTrackingInfo(eVar);
                        eVar.g(e.getNetworkPlacementId());
                        bVar.b(-1);
                        BaseAd f = bVar.f();
                        if (f != null) {
                            f.setTrackingInfo(eVar.M());
                        }
                        arrayList.add(bVar);
                    }
                }
            }
            this.c = arrayList;
        }
    }
}