package com.anythink.core.common.k;

import com.anythink.core.common.e.af;
import com.anythink.core.common.e.m;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f {
    public static final String a = com.anythink.core.common.h.class.getSimpleName();
    public final int b;
    public int c;
    public int d;
    public long e;
    public List<af> m;
    private List<Double> n;
    public volatile int i = 0;
    public volatile int j = 0;
    public volatile int k = 0;
    public volatile int l = 0;
    public List<af> f = Collections.synchronizedList(new ArrayList(5));
    public List<af> g = Collections.synchronizedList(new ArrayList(5));
    public List<af> h = Collections.synchronizedList(new ArrayList(2));

    public f(g gVar) {
        this.c = 1;
        this.f.addAll(gVar.d);
        if (this.m == null) {
            this.m = Collections.synchronizedList(new ArrayList());
        }
        this.m.clear();
        this.m.addAll(gVar.d);
        this.b = gVar.c.ah();
        this.c = gVar.c.f();
        this.d = gVar.c.V();
        this.e = gVar.c.h();
        List<af> b = b(gVar.d);
        if (b != null) {
            this.f.removeAll(b);
            this.h.addAll(b);
        }
        this.n = Collections.synchronizedList(new ArrayList(3));
    }

    private double h() {
        return a(false);
    }

    private double i() {
        return a(true);
    }

    public final List<af> a() {
        return this.f;
    }

    public final List<af> b() {
        return this.g;
    }

    public final List<af> c() {
        return this.h;
    }

    public final int d() {
        return this.i;
    }

    public final int e() {
        return this.j;
    }

    public final int f() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.util.Collection, java.util.List<com.anythink.core.common.e.af>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.util.List<com.anythink.core.common.e.af>] */
    public final List<af> g() {
        ?? b;
        int i = this.c;
        if (i == 1) {
            b = new ArrayList();
            int min = Math.min(this.d, this.f.size());
            for (int i2 = 0; i2 < min; i2++) {
                b.add(this.f.get(i2));
            }
        } else {
            b = i == 2 ? b(1) : 0;
        }
        String str = a;
        StringBuilder sb = new StringBuilder("startToRequestMediationAd: mRequestNumType: ");
        sb.append(this.c);
        sb.append(", needRequestNum: ");
        sb.append(b != 0 ? b.size() : 0);
        sb.append(", validCacheNum: ");
        sb.append(this.b);
        sb.append(", mWaitingFillTime: ");
        sb.append(this.e);
        com.anythink.core.common.j.e.d(str, sb.toString());
        if (b.size() > 0) {
            this.f.removeAll(b);
        }
        return b;
    }

    public static String a(List<af> list) {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                str = wo1.t(str, ",");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(i).c());
            str = wo1.t(str, sb.toString());
        }
        return str;
    }

    public final List<af> b(int i) {
        List<af> list;
        if (i != 2) {
            list = this.f;
        } else {
            list = this.h;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            af afVar = list.get(0);
            if (i == 2) {
                arrayList.add(afVar);
            } else {
                boolean z = com.anythink.core.common.j.g.a(afVar) > a(true);
                int i2 = this.c;
                if (i2 == 1) {
                    boolean z2 = this.j < this.d;
                    if (z2 && z) {
                        arrayList.add(afVar);
                    } else {
                        String str = a;
                        com.anythink.core.common.j.e.d(str, "getNextRequestList, isLessThenMaxRequestNum: " + z2 + ", isExceedCachePrice" + z);
                    }
                } else if (i2 == 2) {
                    if (this.l == 0 && z) {
                        double a2 = com.anythink.core.common.j.g.a(afVar);
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            af afVar2 = list.get(i3);
                            if (com.anythink.core.common.j.g.a(afVar2) == a2) {
                                arrayList.add(afVar2);
                            }
                        }
                        this.l = arrayList.size();
                        String str2 = a;
                        com.anythink.core.common.j.e.d(str2, "getNextRequestList: same price, need request num: " + this.l);
                    } else {
                        String str3 = a;
                        com.anythink.core.common.j.e.d(str3, "getNextRequestList: The number of ad sources with the same price that did not return results: " + this.l);
                    }
                }
            }
            if (arrayList.size() > 0) {
                list.removeAll(arrayList);
            }
            return arrayList;
        }
        com.anythink.core.common.j.e.d(a, "getNextRequestList, waitingPool=null or waitingPool.size=0");
        return arrayList;
    }

    public final void a(int i, int i2) {
        this.i += i;
        if (i2 != 2) {
            this.j += i;
        } else {
            this.k += i;
        }
    }

    public final void a(int i) {
        if (this.c == 2 && i == 1) {
            this.l--;
        }
    }

    private static boolean a(af afVar, com.anythink.core.common.e.e eVar) {
        boolean z = false;
        try {
            if (afVar.j()) {
                com.anythink.core.common.j.e.b(a, "hb request send win notice url, remove cache");
                m N = afVar.N();
                com.anythink.core.b.f.a().a(afVar.t());
                if (N != null && N.a()) {
                    z = true;
                }
                if (z && N != null) {
                    N.a(N.price, 1, eVar, afVar);
                }
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    public final void a(af afVar) {
        synchronized (this.m) {
            List<af> list = this.m;
            if (list != null) {
                if (list.size() == 0) {
                    this.m.add(afVar);
                    a(afVar, 0, null);
                    return;
                }
                for (int i = 0; i < this.m.size(); i++) {
                    af afVar2 = this.m.get(i);
                    if (com.anythink.core.common.j.g.a(afVar) > com.anythink.core.common.j.g.a(afVar2)) {
                        this.m.add(i, afVar);
                        a(afVar, i, afVar2);
                        return;
                    }
                }
                this.m.add(afVar);
                a(afVar, this.m.size() - 1, null);
            }
        }
    }

    private static List<af> b(List<af> list) {
        ArrayList arrayList = null;
        for (af afVar : list) {
            if (afVar.l() == 8) {
                if (arrayList == null) {
                    arrayList = new ArrayList(4);
                }
                arrayList.add(afVar);
            }
        }
        return arrayList;
    }

    public final boolean b(af afVar) {
        double d;
        double a2 = com.anythink.core.common.j.g.a(afVar);
        double a3 = a(true);
        synchronized (this.g) {
            Iterator<af> it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    d = zg2.s;
                    break;
                }
                af next = it.next();
                d = com.anythink.core.common.j.g.a(next);
                if (next.j() && d > com.anythink.core.common.j.g.a(afVar)) {
                    break;
                }
            }
        }
        return a2 > Math.max(a3, d);
    }

    private void a(af afVar, int i, af afVar2) {
        m N;
        m N2;
        if (afVar.j() && (N2 = afVar.N()) != null) {
            if (afVar2 != null) {
                N2.q = com.anythink.core.common.j.g.a(afVar2);
            } else {
                N2.q = com.anythink.core.common.j.g.a(afVar);
            }
        }
        if (i > 0) {
            af afVar3 = this.m.get(i - 1);
            if (!afVar3.j() || (N = afVar3.N()) == null) {
                return;
            }
            N.q = com.anythink.core.common.j.g.a(afVar);
        }
    }

    public final void a(double d) {
        synchronized (this.n) {
            if (this.n.size() != 0) {
                int i = 0;
                while (true) {
                    if (i >= this.n.size() || i == this.b) {
                        break;
                    } else if (d > this.n.get(i).doubleValue()) {
                        this.n.add(i, Double.valueOf(d));
                        break;
                    } else if (i == this.n.size() - 1) {
                        this.n.add(Double.valueOf(d));
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                this.n.add(Double.valueOf(d));
            }
        }
    }

    public final double a(boolean z) {
        synchronized (this.n) {
            int size = this.n.size();
            if (size == 0) {
                return zg2.s;
            }
            int i = this.b - 1;
            int i2 = size - 1;
            if (!z || i2 >= i) {
                return this.n.get(Math.min(i, i2)).doubleValue();
            }
            return zg2.s;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r4 != 7) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(af afVar, h hVar) {
        boolean z = afVar.Z() == 1;
        if (z) {
            int l = afVar.l();
            if (l != 1 && l != 3) {
                if (l == 6) {
                    if (hVar.g) {
                        return false;
                    }
                    hVar.g = true;
                }
            }
            if (hVar.f) {
                return false;
            }
            hVar.f = true;
        }
        return z;
    }
}