package com.anythink.expressad.videocommon.b;

import android.content.Context;
import android.media.MediaPlayer;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.videocommon.b.h;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class l {
    private static final String c = "UnitCacheCtroller";
    private com.anythink.expressad.videocommon.d.b f;
    private ConcurrentHashMap<String, com.anythink.expressad.videocommon.d.b> g;
    private ExecutorService k;
    private String m;
    private com.anythink.expressad.videocommon.e.d n;
    private int p;
    private com.anythink.expressad.d.c q;
    private List<com.anythink.expressad.foundation.d.c> d = new ArrayList();
    private boolean e = true;
    private d h = new d() { // from class: com.anythink.expressad.videocommon.b.l.1
        @Override // com.anythink.expressad.videocommon.b.d
        public final void a(long j, int i) {
            if (i == 5 || i == 4) {
                l.this.e = true;
                l.this.a();
            }
            if (i == 2) {
                l.this.e = true;
            }
        }
    };
    private CopyOnWriteArrayList<Map<String, a>> i = new CopyOnWriteArrayList<>();
    private long l = com.anythink.expressad.d.a.b.P;
    private int o = 2;
    public com.anythink.expressad.d.c a = null;
    public com.anythink.expressad.d.c b = null;
    private Context j = com.anythink.core.common.b.m.a().e();

    public l(List<com.anythink.expressad.foundation.d.c> list, ExecutorService executorService, String str, int i) {
        this.p = 1;
        List<com.anythink.expressad.foundation.d.c> list2 = this.d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.k = executorService;
        this.m = str;
        this.p = i;
        b(this.d);
    }

    private void f() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    while (i < this.i.size()) {
                        Map<String, a> map = this.i.get(i);
                        for (Map.Entry<String, a> entry : map.entrySet()) {
                            a value = entry.getValue();
                            if (value != null) {
                                if (currentTimeMillis - value.c() > this.l * 1000 && value.h() == 1) {
                                    value.g();
                                    value.a(this.o);
                                    value.n();
                                    this.i.remove(map);
                                    i--;
                                }
                                if (value.h() != 1 && value.h() != 5 && value.h() != 0) {
                                    value.n();
                                    this.i.remove(map);
                                    i--;
                                }
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void g() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.i.size()) {
                        Map<String, a> map = this.i.get(i);
                        for (Map.Entry<String, a> entry : map.entrySet()) {
                            a value = entry.getValue();
                            if (value != null && value.k() != null && value.b()) {
                                value.l();
                                this.i.remove(map);
                                i--;
                            }
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
                n.d(c, "cleanDisplayTask ERROR");
            }
        }
    }

    private static boolean h() {
        return true;
    }

    private int i() {
        int i = 0;
        try {
            CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
            if (copyOnWriteArrayList != null) {
                synchronized (copyOnWriteArrayList) {
                    i = this.i.size();
                }
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    private int j() {
        try {
            com.anythink.expressad.d.c cVar = this.a;
            if (cVar != null) {
                return cVar.f();
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }

    public final CopyOnWriteArrayList<Map<String, a>> d() {
        return this.i;
    }

    public final void e() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, a>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next == null) {
                            return;
                        }
                        for (Map.Entry<String, a> entry : next.entrySet()) {
                            a value = entry.getValue();
                            if (value != null) {
                                value.l();
                            }
                        }
                    }
                    this.i.clear();
                }
            } catch (Throwable unused) {
                n.d(c, "campaignDownLoadTaskList clean failed");
            }
        }
        List<com.anythink.expressad.foundation.d.c> list = this.d;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.d.clear();
    }

    private void b(List<com.anythink.expressad.foundation.d.c> list) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        boolean z;
        if (list == null || list.size() == 0) {
            return;
        }
        g();
        f();
        int i = this.p;
        if (i != 1) {
            if (i != 287) {
                if (i == 298) {
                    com.anythink.expressad.d.b.a();
                    com.anythink.expressad.d.c d = com.anythink.expressad.d.b.d(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                    this.b = d;
                    if (d == null) {
                        com.anythink.expressad.d.b.a();
                        this.b = com.anythink.expressad.d.b.b(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                    }
                    com.anythink.expressad.d.c cVar = this.b;
                    if (cVar != null) {
                        this.l = cVar.i();
                        this.o = this.b.m();
                    }
                } else if (i != 94) {
                    if (i == 95) {
                        try {
                            if (!TextUtils.isEmpty(this.m)) {
                                com.anythink.expressad.d.b.a();
                                com.anythink.expressad.d.c c2 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                                if (c2 == null) {
                                    c2 = com.anythink.expressad.d.c.d(this.m);
                                }
                                if (c2 != null) {
                                    this.l = c2.i();
                                    this.o = c2.m();
                                }
                            }
                        } catch (Exception unused) {
                            n.d(c, "make sure your had put feeds jar into your project");
                            return;
                        }
                    }
                }
            }
            try {
                com.anythink.expressad.videocommon.e.a b = com.anythink.expressad.videocommon.e.c.a().b();
                if (b == null) {
                    com.anythink.expressad.videocommon.e.c.a();
                    com.anythink.expressad.videocommon.e.c.c();
                }
                if (b != null) {
                    this.l = b.e();
                }
                if (!TextUtils.isEmpty(this.m)) {
                    this.n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                }
                com.anythink.expressad.videocommon.e.d dVar = this.n;
                if (dVar != null) {
                    this.o = dVar.E();
                }
            } catch (Exception unused2) {
                n.d(c, "make sure your had put reward jar into your project");
                return;
            }
        } else {
            try {
                if (!TextUtils.isEmpty(this.m)) {
                    com.anythink.expressad.d.b.a();
                    com.anythink.expressad.d.c c3 = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                    this.a = c3;
                    if (c3 == null) {
                        this.a = com.anythink.expressad.d.c.c(this.m);
                    }
                    com.anythink.expressad.d.c cVar2 = this.a;
                    if (cVar2 != null) {
                        this.l = cVar2.i();
                        this.o = this.a.m();
                    }
                }
            } catch (Exception unused3) {
                n.d(c, "make sure your had put feeds jar into your project");
                return;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.anythink.expressad.foundation.d.c cVar3 = list.get(i2);
            if (cVar3 != null) {
                int i3 = this.p;
                String str = (i3 != 94 && i3 != 287) ? cVar3.aZ() + cVar3.R() + cVar3.z() : cVar3.aa() + cVar3.aZ() + cVar3.R();
                if ((c(cVar3) || !TextUtils.isEmpty(cVar3.R())) && (copyOnWriteArrayList = this.i) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i4 = 0;
                        while (true) {
                            try {
                                if (i4 >= this.i.size()) {
                                    z = false;
                                    break;
                                }
                                Map<String, a> map = this.i.get(i4);
                                if (map != null && map.containsKey(str)) {
                                    a aVar = map.get(str);
                                    aVar.a(cVar3);
                                    aVar.a(this.o);
                                    aVar.a(false);
                                    map.remove(str);
                                    map.put(str, aVar);
                                    this.i.set(i4, map);
                                    z = true;
                                    break;
                                }
                                i4++;
                            } catch (Throwable unused4) {
                            }
                        }
                        if (!z) {
                            a aVar2 = new a(this.j, cVar3, this.k, this.m);
                            aVar2.a(this.o);
                            aVar2.d(this.p);
                            HashMap hashMap = new HashMap();
                            hashMap.put(str, aVar2);
                            this.i.add(hashMap);
                        }
                    }
                }
            }
        }
        List<com.anythink.expressad.foundation.d.c> list2 = this.d;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.d.clear();
    }

    private static synchronized String c(a aVar) {
        String R;
        synchronized (l.class) {
            R = aVar.k().R();
            if (aVar.h() == 5 || aVar.h() == 6) {
                String d = aVar.d();
                if (!v.a(d)) {
                    if (new File(d).exists()) {
                        R = d;
                    }
                }
            }
        }
        return R;
    }

    private int d(com.anythink.expressad.foundation.d.c cVar) {
        try {
            if (cVar.u() == 298) {
                if (this.b == null) {
                    com.anythink.expressad.d.b.a();
                    this.b = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                }
                return this.b.f();
            } else if (cVar.u() == 42) {
                return j();
            } else {
                if (this.n == null) {
                    this.n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.m, false);
                }
                return this.n.v();
            }
        } catch (Throwable th) {
            n.b(c, th.getMessage(), th);
            return 100;
        }
    }

    public final void a(com.anythink.expressad.videocommon.d.b bVar) {
        this.f = bVar;
    }

    public final void a(String str, com.anythink.expressad.videocommon.d.b bVar) {
        if (this.g == null) {
            this.g = new ConcurrentHashMap<>();
        }
        this.g.put(str, bVar);
    }

    public final void a(List<com.anythink.expressad.foundation.d.c> list) {
        List<com.anythink.expressad.foundation.d.c> list2 = this.d;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        b(this.d);
    }

    public final void c() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, a>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null) {
                            for (Map.Entry<String, a> entry : next.entrySet()) {
                                a value = entry.getValue();
                                if (value != null && value.h() == 1) {
                                    n.b(c, "暂停所有下载");
                                    value.g();
                                    value.n();
                                    this.i.remove(next);
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        List<com.anythink.expressad.foundation.d.c> list = this.d;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        b(this.d);
    }

    public final List<a> a(int i, boolean z, List<com.anythink.expressad.foundation.d.c> list) {
        long j;
        Iterator<Map.Entry<String, a>> it;
        Iterator<Map.Entry<String, a>> it2;
        boolean z2 = z;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i2 = 0;
                    while (i2 < this.i.size()) {
                        Map<String, a> map = this.i.get(i2);
                        Iterator<Map.Entry<String, a>> it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            a value = it3.next().getValue();
                            if (value != null && value.k() != null) {
                                com.anythink.expressad.foundation.d.c k = value.k();
                                boolean z3 = false;
                                for (com.anythink.expressad.foundation.d.c cVar : list) {
                                    if (k == null || cVar == null || TextUtils.isEmpty(k.aa()) || TextUtils.isEmpty(cVar.aa())) {
                                        it2 = it3;
                                    } else {
                                        it2 = it3;
                                        if (k.aZ().equals(cVar.aZ()) && k.aa().equals(cVar.aa())) {
                                            z3 = true;
                                        }
                                    }
                                    it3 = it2;
                                }
                                it = it3;
                                if (!z3) {
                                    n.b(c, "UnitCache isReady ==== Campaign isAvailable = ".concat(String.valueOf(z3)));
                                } else if ((z2 && !k.y()) || (!z2 && k.y())) {
                                    n.b(c, "UnitCache isReady ==== isBidCampaign = " + z2 + " campaign.isBidCampaign() = " + k.y());
                                } else {
                                    String G = k.G();
                                    String R = k.R();
                                    String e = k.L() != null ? k.L().e() : "";
                                    if (i == 94 || i == 287) {
                                        if (!TextUtils.isEmpty(e) && !e.contains(com.anythink.expressad.foundation.d.c.d) && !b(k, e)) {
                                            n.b(c, "UnitCache isReady ====  templateZipDownload check false continue");
                                        } else if (b(G, k)) {
                                            if (value.b()) {
                                                value.l();
                                                n.b(c, "isready endcard下载完 但是offer展示过 continue");
                                            } else if (v.a(R)) {
                                                n.b(c, "endcard为基准 endcard和图片下载完成 videourl为空不用下载 return task");
                                                arrayList.add(value);
                                            } else if (a(value, b(k))) {
                                                n.b(c, "endcard为基准 endcard 图片 和 videourl 下载完成 return task");
                                                arrayList.add(value);
                                            }
                                        }
                                    }
                                    boolean isEmpty = TextUtils.isEmpty(value.j());
                                    int h = value.h();
                                    n.a(c, "isready unit state:".concat(String.valueOf(h)));
                                    if (h == 5) {
                                        if (value.b()) {
                                            value.l();
                                            this.i.remove(map);
                                            i2--;
                                            n.b(c, "isready state == DownLoadConstant.DOWNLOAD_DONE 但是offer展示过 continue");
                                            z2 = z;
                                            it3 = it;
                                        } else if (!isEmpty) {
                                            value.i();
                                            if (i == 95) {
                                                n.b(c, "isready ==========done but isEffectivePath:" + isEmpty + " is feed" + i);
                                                arrayList.add(value);
                                            } else {
                                                n.b(c, "isready !isEffectivePath continue");
                                            }
                                        } else if (a(G, k)) {
                                            n.b(c, "isready videourl为基准 state＝done endcard 图片 和 videourl 下载完成 return task");
                                            arrayList.add(value);
                                        } else {
                                            n.b(c, "isready done but continue");
                                            return null;
                                        }
                                    } else {
                                        long c2 = value.c();
                                        if (value.h() == 1) {
                                            j = currentTimeMillis;
                                            if (currentTimeMillis - c2 > this.l * 1000) {
                                                value.g();
                                                value.n();
                                                this.i.remove(map);
                                                i2--;
                                                if (i == 1 || i == 94) {
                                                    n.b(c, "isready download !timeout continue");
                                                    z2 = z;
                                                    it3 = it;
                                                    currentTimeMillis = j;
                                                }
                                            }
                                        } else {
                                            j = currentTimeMillis;
                                        }
                                        if (h != 4 && h != 2) {
                                            if (h == 1) {
                                                if (value.b()) {
                                                    n.b(c, "isready run 已经被展示过 continue");
                                                } else if (!com.anythink.expressad.a.p && a(value, b(k)) && a(G, k)) {
                                                    n.b(c, "isready  IS_DOWANLOAD_FINSH_PLAY is :" + com.anythink.expressad.a.p);
                                                    arrayList.add(value);
                                                }
                                                z2 = z;
                                                it3 = it;
                                                currentTimeMillis = j;
                                            }
                                            if ((i == 94 || i == 287) && a(value, b(k)) && a(G, k)) {
                                                arrayList.add(value);
                                            }
                                            z2 = z;
                                            it3 = it;
                                            currentTimeMillis = j;
                                        }
                                        this.i.remove(map);
                                        value.n();
                                        i2--;
                                        n.b(c, "isready stop continue");
                                        z2 = z;
                                        it3 = it;
                                        currentTimeMillis = j;
                                    }
                                }
                                j = currentTimeMillis;
                                z2 = z;
                                it3 = it;
                                currentTimeMillis = j;
                            }
                            j = currentTimeMillis;
                            it = it3;
                            n.b(c, "UnitCache isReady ==== task 或者 campaign为空 continue");
                            z2 = z;
                            it3 = it;
                            currentTimeMillis = j;
                        }
                        i2++;
                        z2 = z;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public l(com.anythink.expressad.foundation.d.c cVar, ExecutorService executorService, String str, int i) {
        this.p = 1;
        List<com.anythink.expressad.foundation.d.c> list = this.d;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
        this.k = executorService;
        this.m = str;
        this.p = i;
        b(this.d);
    }

    private static boolean c(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            try {
                return cVar.H() == 2;
            } catch (Throwable th) {
                if (com.anythink.expressad.a.a) {
                    th.printStackTrace();
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    private int b(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar != null) {
            if (cVar.as() != -1) {
                int as = cVar.as();
                wo1.Z(as, "ready_rate(campaign): ", c);
                return as;
            }
            int d = d(cVar);
            wo1.Z(d, "ready_rate(reward_unit_setting): ", c);
            return d;
        }
        return -1;
    }

    private static boolean b(a aVar, int i) {
        return a(aVar, i);
    }

    private static boolean b(String str, com.anythink.expressad.foundation.d.c cVar) {
        if (!cVar.F() && !TextUtils.isEmpty(str)) {
            if (cVar.ax() != 1 || c(cVar)) {
                if (cVar.aD() != null && cVar.aD().size() > 0 && cVar.aD().contains(2)) {
                    n.b(c, "Is not check endCard download status : ".concat(String.valueOf(str)));
                    return true;
                } else if (v.b(g.a().c(str))) {
                    n.b(c, "endcard zip 下载完成 return true endcardUrl:".concat(String.valueOf(str)));
                    return true;
                } else if (v.b(h.a.a.b(str))) {
                    n.b(c, "endcard url 源码 下载完成 return true endcardUrl:".concat(String.valueOf(str)));
                    return true;
                } else {
                    n.b(c, "checkEndcardZipOrSourceDownLoad endcardUrl return false endcardUrl:".concat(String.valueOf(str)));
                    return false;
                }
            }
            return true;
        }
        n.b(c, "Campaign is Mraid, do not need download endcardurl or Campaign load timeout");
        return true;
    }

    private static boolean b(com.anythink.expressad.foundation.d.c cVar, String str) {
        n.a(c, "check template ".concat(String.valueOf(str)));
        if (cVar.j()) {
            return true;
        }
        if (cVar.aD() != null && cVar.aD().size() > 0 && cVar.aD().contains(1)) {
            n.b(c, "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && cVar.ax() == 0) {
            n.a(c, "check template 下载情况：" + g.a().c(str));
            if (g.a().c(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148 A[Catch: all -> 0x02a0, Exception -> 0x02a2, TRY_ENTER, TryCatch #1 {Exception -> 0x02a2, blocks: (B:5:0x0028, B:6:0x002d, B:8:0x0035, B:9:0x0045, B:11:0x004b, B:13:0x0059, B:16:0x0061, B:18:0x0067, B:23:0x0075, B:21:0x006f, B:25:0x009a, B:27:0x00aa, B:28:0x00b2, B:34:0x00c1, B:36:0x00c7, B:38:0x00cf, B:40:0x00d5, B:41:0x00dd, B:43:0x00e3, B:45:0x00e9, B:46:0x00f4, B:48:0x00fa, B:51:0x0103, B:53:0x010d, B:56:0x0116, B:58:0x0137, B:64:0x0148, B:66:0x014e, B:68:0x0165, B:70:0x016c, B:73:0x018b, B:74:0x0194, B:76:0x019a, B:79:0x01a3, B:83:0x01ad, B:85:0x01b8, B:87:0x01c6, B:91:0x01db, B:93:0x01e6, B:95:0x01ec, B:97:0x01f2, B:98:0x01fe, B:107:0x021e, B:109:0x0224, B:110:0x022c, B:112:0x0230, B:114:0x023a, B:116:0x0240, B:119:0x0257, B:123:0x0261, B:125:0x026b, B:129:0x0273, B:130:0x0285), top: B:143:0x0028, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a a(int i, boolean z) {
        long j;
        int h;
        boolean z2 = z;
        n.a(c, "isReady unitID " + this.m + " ad_type " + this.p);
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i2 = 0;
                    while (i2 < this.i.size()) {
                        Map<String, a> map = this.i.get(i2);
                        for (Map.Entry<String, a> entry : map.entrySet()) {
                            a value = entry.getValue();
                            if (value != null && value.k() != null) {
                                com.anythink.expressad.foundation.d.c k = value.k();
                                if ((z2 && !k.y()) || (!z2 && k.y())) {
                                    n.b(c, "UnitCache isReady ==== isBidCampaign = " + z2 + " campaign.isBidCampaign() = " + k.y());
                                } else {
                                    String G = k.G();
                                    String R = k.R();
                                    String e = k.L() != null ? k.L().e() : "";
                                    if (this.p != 94) {
                                        if (i == 287) {
                                        }
                                        boolean isEmpty = TextUtils.isEmpty(value.j());
                                        h = value.h();
                                        n.a(c, "isready unit state:".concat(String.valueOf(h)));
                                        if (this.p != 298 && a(value, b(k))) {
                                            return value;
                                        }
                                        if (h != 5) {
                                            if (value.b()) {
                                                value.l();
                                                this.i.remove(map);
                                                i2--;
                                                n.b(c, "isready state == DownLoadConstant.DOWNLOAD_DONE 但是offer展示过 continue");
                                                z2 = z;
                                            } else if (!isEmpty) {
                                                value.i();
                                                if (this.p == 95) {
                                                    n.b(c, "isready ==========done but isEffectivePath:" + isEmpty + " is feed" + this.p);
                                                    return value;
                                                }
                                                n.b(c, "isready !isEffectivePath continue");
                                            } else if (a(G, k)) {
                                                n.b(c, "isready videourl为基准 state＝done endcard 图片 和 videourl 下载完成 return task");
                                                return value;
                                            } else {
                                                n.b(c, "isready done but continue");
                                                return null;
                                            }
                                        } else {
                                            long c2 = value.c();
                                            if (value.h() == 1) {
                                                j = currentTimeMillis;
                                                if (currentTimeMillis - c2 > this.l * 1000) {
                                                    value.g();
                                                    value.n();
                                                    this.i.remove(map);
                                                    i2--;
                                                    int i3 = this.p;
                                                    if (i3 == 1 || i3 == 94) {
                                                        n.b(c, "isready download !timeout continue");
                                                        z2 = z;
                                                        currentTimeMillis = j;
                                                    }
                                                }
                                            } else {
                                                j = currentTimeMillis;
                                            }
                                            if (this.p == 95) {
                                                if (!value.b()) {
                                                    n.b(c, "==========isready ad_type is :" + this.p);
                                                    return value;
                                                }
                                                value.l();
                                                this.i.remove(map);
                                                i2--;
                                            } else if (h != 4 && h != 2) {
                                                if (h == 1) {
                                                    if (value.b()) {
                                                        n.b(c, "isready run 已经被展示过 continue");
                                                    } else if (!com.anythink.expressad.a.p && a(value, b(k)) && a(G, k)) {
                                                        n.b(c, "isready  IS_DOWANLOAD_FINSH_PLAY is :" + com.anythink.expressad.a.p);
                                                        return value;
                                                    }
                                                }
                                                int i4 = this.p;
                                                if ((i4 == 94 || i4 == 287) && a(value, b(k)) && a(G, k)) {
                                                    return value;
                                                }
                                            } else {
                                                this.i.remove(map);
                                                value.n();
                                                i2--;
                                                n.b(c, "isready stop continue");
                                            }
                                            z2 = z;
                                            currentTimeMillis = j;
                                        }
                                    }
                                    if (!TextUtils.isEmpty(e) && !e.contains(com.anythink.expressad.foundation.d.c.d) && !b(k, e)) {
                                        n.b(c, "UnitCache isReady ====  templateZipDownload check false continue");
                                    } else {
                                        if (b(G, k)) {
                                            if (value.b()) {
                                                value.l();
                                                n.b(c, "isready endcard下载完 但是offer展示过 continue");
                                            } else if (v.a(R)) {
                                                n.b(c, "endcard为基准 endcard和图片下载完成 videourl为空不用下载 return task");
                                                return value;
                                            } else if (a(value, b(k))) {
                                                n.b(c, "endcard为基准 endcard 图片 和 videourl 下载完成 return task");
                                                return value;
                                            }
                                        }
                                        boolean isEmpty2 = TextUtils.isEmpty(value.j());
                                        h = value.h();
                                        n.a(c, "isready unit state:".concat(String.valueOf(h)));
                                        if (this.p != 298) {
                                        }
                                        if (h != 5) {
                                        }
                                    }
                                }
                                j = currentTimeMillis;
                                z2 = z;
                                currentTimeMillis = j;
                            }
                            j = currentTimeMillis;
                            n.b(c, "UnitCache isReady ==== task 或者 campaign为空 continue");
                            z2 = z;
                            currentTimeMillis = j;
                        }
                        i2++;
                        z2 = z;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return null;
            }
        }
        return null;
    }

    public final a b(int i, boolean z) {
        try {
            return a(i, z);
        } catch (Throwable th) {
            n.b(c, th.getMessage(), th);
            return null;
        }
    }

    private static synchronized String b(a aVar) {
        String c2;
        synchronized (l.class) {
            c2 = c(aVar);
        }
        return c2;
    }

    public final void b() {
        int h;
        try {
            CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
            if (copyOnWriteArrayList != null) {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, a>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null) {
                            for (Map.Entry<String, a> entry : next.entrySet()) {
                                a value = entry.getValue();
                                if (value != null && (h = value.h()) != 1 && h != 5) {
                                    if (com.anythink.expressad.foundation.h.j.a() != 9 && this.o == 2) {
                                        return;
                                    }
                                    if (h == 2 || h == 0) {
                                        value.f();
                                        return;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(String str) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        try {
            synchronized (this.i) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.i) != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<Map<String, a>> it = this.i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null) {
                            for (Map.Entry<String, a> entry : next.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.i.remove(next);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static boolean a(a aVar, int i) {
        long m = aVar.m();
        long e = aVar.e();
        if (TextUtils.isEmpty(aVar.a())) {
            n.a(c, "checkVideoDownload video done return true");
            return true;
        }
        if (i == 0) {
            if (aVar.k() != null && !TextUtils.isEmpty(aVar.k().R())) {
                a(aVar);
                return true;
            }
        } else if (e > 0 && m * 100 >= e * i) {
            if (i == 100) {
                if (aVar.h() == 5) {
                    a(aVar);
                    return true;
                }
                aVar.n();
                return false;
            }
            a(aVar);
            return true;
        }
        return false;
    }

    private static synchronized void a(a aVar) {
        synchronized (l.class) {
            com.anythink.expressad.foundation.d.c k = aVar != null ? aVar.k() : null;
            if (k == null) {
                return;
            }
            if (k.u() == 94 || k.u() == 287) {
                com.anythink.expressad.foundation.g.i.b bVar = new com.anythink.expressad.foundation.g.i.b();
                String b = b(aVar);
                String str = k.aa() + b;
                if (!com.anythink.expressad.foundation.g.i.a.c(str)) {
                    aVar.b(b);
                    aVar.c(str);
                    try {
                        MediaPlayer mediaPlayer = new MediaPlayer();
                        mediaPlayer.setDataSource(b);
                        bVar.a(mediaPlayer, b);
                        com.anythink.expressad.foundation.g.i.a.a(str, bVar);
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    private static boolean a(String str, com.anythink.expressad.foundation.d.c cVar) {
        try {
        } catch (Throwable th) {
            n.b(c, th.getMessage(), th);
        }
        if (cVar.aD() != null && cVar.aD().size() > 0 && cVar.aD().contains(2)) {
            n.b(c, "Is not check endCard download status : ".concat(String.valueOf(str)));
            return true;
        } else if (!cVar.j() || s.f(str)) {
            if (v.a(str)) {
                n.b(c, "checkEndcardDownload endcardUrl is null return true");
                return true;
            }
            if (b(str, cVar)) {
                n.b(c, "checkEndcardDownload endcardUrl done return true");
                return true;
            }
            n.b(c, "checkEndcardDownload endcardUrl return false");
            return false;
        } else {
            return true;
        }
    }

    private boolean a(com.anythink.expressad.foundation.d.c cVar, String str) {
        if (TextUtils.isEmpty(cVar.au())) {
            n.a(c, "check template pre load ".concat(String.valueOf(str)));
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            j a = j.a();
            boolean d = a.d(this.m + "_" + cVar.aa() + "_" + str);
            n.a(c, "check template 预加载情况：".concat(String.valueOf(d)));
            return d;
        }
        return true;
    }

    public final a a(String str) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                Iterator<Map<String, a>> it = this.i.iterator();
                while (it.hasNext()) {
                    Map<String, a> next = it.next();
                    if (next != null && next.containsKey(str)) {
                        return next.get(str);
                    }
                }
                return null;
            }
        }
        return null;
    }

    private static boolean a(CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, a> next = it.next();
                if (next != null) {
                    for (Map.Entry<String, a> entry : next.entrySet()) {
                        if (entry.getValue().h() == 1) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0031 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[Catch: all -> 0x01b2, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0015, B:9:0x001b, B:11:0x0021, B:13:0x0029, B:14:0x0031, B:16:0x0037, B:18:0x0045, B:20:0x004b, B:22:0x0051, B:23:0x0053, B:26:0x005f, B:27:0x006b, B:29:0x007b, B:31:0x007f, B:32:0x0087, B:33:0x008b, B:39:0x009f, B:41:0x00a3, B:42:0x00b6, B:44:0x00ba, B:46:0x00c0, B:48:0x00c4, B:50:0x00c8, B:51:0x00db, B:53:0x00df, B:65:0x010d, B:67:0x0112, B:69:0x0118, B:71:0x0145, B:73:0x0149, B:76:0x0151, B:77:0x0158, B:79:0x015c, B:81:0x0162, B:83:0x0170, B:91:0x0182, B:93:0x0186, B:95:0x0191, B:99:0x0199, B:100:0x019e, B:106:0x01ab, B:105:0x01a8, B:54:0x00e4, B:56:0x00e8, B:60:0x00fd, B:61:0x0103, B:63:0x0107, B:107:0x01b0), top: B:113:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112 A[Catch: all -> 0x01b2, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0015, B:9:0x001b, B:11:0x0021, B:13:0x0029, B:14:0x0031, B:16:0x0037, B:18:0x0045, B:20:0x004b, B:22:0x0051, B:23:0x0053, B:26:0x005f, B:27:0x006b, B:29:0x007b, B:31:0x007f, B:32:0x0087, B:33:0x008b, B:39:0x009f, B:41:0x00a3, B:42:0x00b6, B:44:0x00ba, B:46:0x00c0, B:48:0x00c4, B:50:0x00c8, B:51:0x00db, B:53:0x00df, B:65:0x010d, B:67:0x0112, B:69:0x0118, B:71:0x0145, B:73:0x0149, B:76:0x0151, B:77:0x0158, B:79:0x015c, B:81:0x0162, B:83:0x0170, B:91:0x0182, B:93:0x0186, B:95:0x0191, B:99:0x0199, B:100:0x019e, B:106:0x01ab, B:105:0x01a8, B:54:0x00e4, B:56:0x00e8, B:60:0x00fd, B:61:0x0103, B:63:0x0107, B:107:0x01b0), top: B:113:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145 A[Catch: all -> 0x01b2, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0013, B:8:0x0015, B:9:0x001b, B:11:0x0021, B:13:0x0029, B:14:0x0031, B:16:0x0037, B:18:0x0045, B:20:0x004b, B:22:0x0051, B:23:0x0053, B:26:0x005f, B:27:0x006b, B:29:0x007b, B:31:0x007f, B:32:0x0087, B:33:0x008b, B:39:0x009f, B:41:0x00a3, B:42:0x00b6, B:44:0x00ba, B:46:0x00c0, B:48:0x00c4, B:50:0x00c8, B:51:0x00db, B:53:0x00df, B:65:0x010d, B:67:0x0112, B:69:0x0118, B:71:0x0145, B:73:0x0149, B:76:0x0151, B:77:0x0158, B:79:0x015c, B:81:0x0162, B:83:0x0170, B:91:0x0182, B:93:0x0186, B:95:0x0191, B:99:0x0199, B:100:0x019e, B:106:0x01ab, B:105:0x01a8, B:54:0x00e4, B:56:0x00e8, B:60:0x00fd, B:61:0x0103, B:63:0x0107, B:107:0x01b0), top: B:113:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int x;
        com.anythink.expressad.videocommon.d.b bVar;
        int i;
        f();
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                if (!a(this.i)) {
                    this.e = true;
                }
                Iterator<Map<String, a>> it = this.i.iterator();
                while (it.hasNext()) {
                    Map<String, a> next = it.next();
                    if (next != null) {
                        for (Map.Entry<String, a> entry : next.entrySet()) {
                            a value = entry.getValue();
                            if (value != null && !value.b()) {
                                if (this.p == 95) {
                                    this.e = true;
                                }
                                int h = value.h();
                                final com.anythink.expressad.foundation.d.c k = value.k();
                                if (k != null && h == 0) {
                                    h = c.a().e(k.R());
                                }
                                value.a(new com.anythink.expressad.videocommon.d.b() { // from class: com.anythink.expressad.videocommon.b.l.2
                                    @Override // com.anythink.expressad.videocommon.d.b
                                    public final void a(String str) {
                                        com.anythink.expressad.videocommon.d.b bVar2;
                                        if (l.this.f != null) {
                                            l.this.f.a(str);
                                        }
                                        if (l.this.g == null || l.this.g.size() <= 0 || k == null || (bVar2 = (com.anythink.expressad.videocommon.d.b) l.this.g.get(k.aa())) == null) {
                                            return;
                                        }
                                        bVar2.a(str);
                                    }

                                    @Override // com.anythink.expressad.videocommon.d.b
                                    public final void a(String str, String str2) {
                                        com.anythink.expressad.videocommon.d.b bVar2;
                                        com.anythink.expressad.foundation.d.c cVar = k;
                                        if (cVar == null || cVar.aD() == null || k.aD().size() <= 0 || !k.aD().contains(0)) {
                                            if (l.this.f != null) {
                                                l.this.f.a(str, str2);
                                            }
                                            if (l.this.g == null || l.this.g.size() <= 0 || k == null || (bVar2 = (com.anythink.expressad.videocommon.d.b) l.this.g.get(k.aa())) == null) {
                                                return;
                                            }
                                            bVar2.a(str, str2);
                                            return;
                                        }
                                        n.b(l.c, "Is not check video download status");
                                    }
                                });
                                int b = b(k);
                                if (this.p == 1) {
                                    if (this.a == null) {
                                        this.a = com.anythink.expressad.d.c.c(this.m);
                                    }
                                    b = j();
                                }
                                value.c(b);
                                int i2 = this.p;
                                if (i2 != 94 && i2 != 287 && i2 != 95) {
                                    if (i2 == 298) {
                                        if (this.b == null) {
                                            com.anythink.expressad.d.b.a();
                                            this.b = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                                        }
                                        com.anythink.expressad.d.c cVar = this.b;
                                        if (cVar != null) {
                                            x = cVar.g();
                                            if (this.p == 1) {
                                                if (this.a == null) {
                                                    com.anythink.expressad.d.b.a();
                                                    this.a = com.anythink.expressad.d.b.a(com.anythink.expressad.foundation.b.a.b().e(), this.m);
                                                }
                                                com.anythink.expressad.d.c cVar2 = this.a;
                                                if (cVar2 != null) {
                                                    x = cVar2.g();
                                                }
                                            }
                                            value.b(x);
                                            int aE = k != null ? k.aE() : 1;
                                            n.d(c, "ready_rate : " + b + " cd_rate : " + x + " videoCtnType : " + aE);
                                            if (a(value, b(k))) {
                                                com.anythink.expressad.videocommon.d.b bVar2 = this.f;
                                                if (bVar2 != null && ((i = this.p) == 297 || i == 298)) {
                                                    bVar2.a(k.R());
                                                }
                                                ConcurrentHashMap<String, com.anythink.expressad.videocommon.d.b> concurrentHashMap = this.g;
                                                if (concurrentHashMap != null && concurrentHashMap.size() > 0 && (bVar = this.g.get(k.aa())) != null) {
                                                    bVar.a(k.R());
                                                }
                                            }
                                            if (h == 1 && h != 5 && h != 4 && (h == 2 || this.e)) {
                                                value.a(this.h);
                                                if (!a(value, b)) {
                                                    int i3 = this.p;
                                                    if (i3 == 94 || i3 == 287) {
                                                        value.f();
                                                    }
                                                } else {
                                                    int i4 = this.p;
                                                    if (i4 == 1 || i4 == 95 || i4 == 298) {
                                                        this.e = false;
                                                    }
                                                    value.f();
                                                }
                                            }
                                        }
                                    }
                                    x = 0;
                                    if (this.p == 1) {
                                    }
                                    value.b(x);
                                    if (k != null) {
                                    }
                                    n.d(c, "ready_rate : " + b + " cd_rate : " + x + " videoCtnType : " + aE);
                                    if (a(value, b(k))) {
                                    }
                                    if (h == 1) {
                                        value.a(this.h);
                                        if (!a(value, b)) {
                                        }
                                    }
                                }
                                if (this.n == null) {
                                    this.n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.m, this.p == 287);
                                }
                                com.anythink.expressad.videocommon.e.d dVar = this.n;
                                x = dVar != null ? dVar.x() : 0;
                                value.b(x);
                                if (k != null) {
                                }
                                n.d(c, "ready_rate : " + b + " cd_rate : " + x + " videoCtnType : " + aE);
                                if (a(value, b(k))) {
                                }
                                if (h == 1) {
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}