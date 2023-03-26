package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c {
    private static final String a = "DownLoadManager";
    private static c b;
    private ThreadPoolExecutor c;
    private boolean d = false;
    private ConcurrentHashMap<String, l> e = new ConcurrentHashMap<>();
    private Map<String, List<Map<String, a>>> f;
    private Map<String, List<com.anythink.expressad.foundation.d.c>> g;
    private Map<String, List<a>> h;

    private c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.c = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static c a() {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    private CopyOnWriteArrayList<Map<String, a>> f(String str) {
        l c = c(str);
        if (c != null) {
            return c.d();
        }
        return null;
    }

    private List<Map<String, a>> g(String str) {
        Map<String, List<Map<String, a>>> map = this.f;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f.get(str);
    }

    private void h(String str) {
        l c = c(str);
        if (c != null) {
            c.e();
        }
    }

    public final List<a> b(String str) {
        Map<String, List<a>> map = this.h;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.h.get(str);
    }

    public final l c(String str) {
        ConcurrentHashMap<String, l> concurrentHashMap = this.e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.e.get(str);
    }

    public final void d(String str) {
        l c = c(str);
        if (c != null) {
            c.a();
        }
    }

    public final int e(String str) {
        CopyOnWriteArrayList<Map<String, a>> d;
        a value;
        com.anythink.expressad.foundation.d.c k;
        ConcurrentHashMap<String, l> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                l value2 = entry.getValue();
                if (value2 != null && (d = value2.d()) != null) {
                    int size = d.size();
                    for (int i = 0; i < size; i++) {
                        Map<String, a> map = d.get(i);
                        if (map != null) {
                            Iterator<Map.Entry<String, a>> it = map.entrySet().iterator();
                            if (it.hasNext() && (value = it.next().getValue()) != null && (k = value.k()) != null) {
                                String R = k.R();
                                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(R) && str.equals(R)) {
                                    return value.h();
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return 0;
    }

    private a b(int i, String str, boolean z) {
        l c = c(str);
        if (c != null) {
            return c.b(i, z);
        }
        return null;
    }

    private void d() {
        ConcurrentHashMap<String, l> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                l value = entry.getValue();
                if (value != null) {
                    value.b();
                }
            }
        }
    }

    public final void c() {
        ConcurrentHashMap<String, l> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                l value = entry.getValue();
                String key = entry.getKey();
                try {
                    com.anythink.expressad.videocommon.e.d a2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), key);
                    if (a2 != null) {
                        if (a2.E() == 2) {
                            value.c();
                        } else {
                            value.a();
                        }
                    }
                } catch (Exception e) {
                    n.d(a, e.getMessage());
                    try {
                        if (!TextUtils.isEmpty(key)) {
                            com.anythink.expressad.d.b.a();
                            com.anythink.expressad.d.c c = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), key);
                            if (c == null) {
                                c = com.anythink.expressad.d.c.d(key);
                            }
                            if (c.m() == 2) {
                                value.c();
                            } else {
                                value.a();
                            }
                        }
                    } catch (Exception e2) {
                        n.d(a, e2.getMessage());
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a7, code lost:
        if (r11.containsKey(r9) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a9, code lost:
        r8.h.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ae, code lost:
        r11 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b0, code lost:
        if (r11 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b2, code lost:
        r8.g = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01be, code lost:
        if (r11.containsKey(r9) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c0, code lost:
        r8.g.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c5, code lost:
        if (r10 == null) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cb, code lost:
        if (r10.size() <= 0) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cd, code lost:
        r11 = new java.util.ArrayList();
        r12 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e4, code lost:
        if (r10.hasNext() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
        r14 = r10.next();
        r1 = new java.util.concurrent.ConcurrentHashMap();
        r2 = r14.k();
        r1.put(r2.aZ() + r2.R() + r2.z(), r14);
        r11.add(r1);
        r12.add(r2);
        r13.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0220, code lost:
        r8.f.put(r9, r11);
        r8.g.put(r9, r12);
        r8.h.put(r9, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0119, code lost:
        if (r13.size() >= r11) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017b, code lost:
        if (r11.size() > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0180, code lost:
        r11 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0182, code lost:
        if (r11 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0184, code lost:
        r8.f = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0190, code lost:
        if (r11.containsKey(r9) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0192, code lost:
        r8.f.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0197, code lost:
        r11 = r8.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0199, code lost:
        if (r11 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019b, code lost:
        r8.h = new java.util.HashMap();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(String str, boolean z, int i, boolean z2, int i2, List<com.anythink.expressad.foundation.d.c> list) {
        l c;
        boolean z3;
        com.anythink.expressad.foundation.d.c cVar;
        boolean z4 = false;
        if (list != null) {
            try {
                if (list.size() != 0 && (c = c(str)) != null) {
                    List<a> a2 = c.a(94, z, list);
                    if (a2 != null && a2.size() != 0) {
                        if (z2) {
                            if (list.size() <= 0 || (cVar = list.get(0)) == null || cVar.aD() == null || cVar.aD().size() <= 0 || !cVar.aD().contains(0)) {
                                z3 = false;
                            } else {
                                n.b(a, "Is not check video download status with TPL");
                                z3 = true;
                            }
                            try {
                                if (i2 == 0) {
                                    ArrayList arrayList = new ArrayList();
                                    for (a aVar : a2) {
                                        for (com.anythink.expressad.foundation.d.c cVar2 : list) {
                                            if (aVar != null && aVar.k() != null && cVar2 != null && cVar2.aZ().equals(aVar.k().aZ()) && cVar2.aa().equals(aVar.k().aa())) {
                                                arrayList.add(aVar);
                                            }
                                        }
                                    }
                                    z4 = arrayList.size() > 0 ? true : z3;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (a aVar2 : a2) {
                                        for (com.anythink.expressad.foundation.d.c cVar3 : list) {
                                            if (aVar2 != null && aVar2.k() != null && cVar3 != null && cVar3.aZ().equals(aVar2.k().aZ()) && cVar3.aa().equals(aVar2.k().aa())) {
                                                arrayList2.add(aVar2);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                z4 = z3;
                                if (com.anythink.expressad.a.a) {
                                    e.printStackTrace();
                                }
                                return z4;
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (a aVar3 : a2) {
                                for (com.anythink.expressad.foundation.d.c cVar4 : list) {
                                    if (aVar3 != null && aVar3.k() != null && cVar4 != null && cVar4.aZ().equals(aVar3.k().aZ()) && cVar4.aa().equals(aVar3.k().aa())) {
                                        arrayList3.add(aVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return z4;
    }

    public final a a(String str, String str2) {
        l c = c(str);
        if (c != null) {
            return c.a(str2);
        }
        return null;
    }

    public final List<com.anythink.expressad.foundation.d.c> a(String str) {
        Map<String, List<com.anythink.expressad.foundation.d.c>> map = this.g;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.g.get(str);
    }

    public final boolean a(int i, String str, boolean z) {
        try {
            l c = c(str);
            if (c != null) {
                return c.a(i, z) != null;
            }
            return false;
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
                return false;
            }
            return false;
        }
    }

    public final boolean a(String str, boolean z, int i, boolean z2, int i2, List<com.anythink.expressad.foundation.d.c> list) {
        return b(str, z, i, z2, i2, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r6.size() > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        r8 = r5.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r8 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
        r5.f = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r8.containsKey(r7) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        r5.f.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
        r8 = r5.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
        r5.h = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        if (r8.containsKey(r7) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
        r5.h.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
        r8 = r5.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        if (r8 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
        r5.g = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r8.containsKey(r7) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
        r5.g.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:
        if (r6 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
        if (r6.size() <= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
        r8 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r10 = new java.util.ArrayList();
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
        if (r6.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
        r11 = r6.next();
        r1 = new java.util.concurrent.ConcurrentHashMap();
        r2 = r11.k();
        r1.put(r2.aZ() + r2.R() + r2.z(), r11);
        r8.add(r1);
        r9.add(r2);
        r10.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
        r5.f.put(r7, r8);
        r5.g.put(r7, r9);
        r5.h.put(r7, r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(int i, String str, boolean z, com.anythink.expressad.foundation.d.c cVar, int i2, List<com.anythink.expressad.foundation.d.c> list) {
        l c;
        boolean z2 = false;
        try {
            c = c(str);
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
            }
        }
        if (c != null) {
            List<a> a2 = c.a(i, z, list);
            if (a2 != null && a2.size() != 0) {
                if (!TextUtils.isEmpty(cVar.au())) {
                    if (cVar.at() == 0) {
                        if (a2.size() > 0) {
                            z2 = true;
                        }
                    } else if (a2.size() == i2) {
                        z2 = true;
                    }
                }
                if (com.anythink.expressad.a.a) {
                    e.printStackTrace();
                }
            }
        }
        return z2;
    }

    private static void a(int i, l lVar, boolean z) {
        Iterator<Map.Entry<String, a>> it;
        try {
            CopyOnWriteArrayList<Map<String, a>> d = lVar.d();
            if (d == null || d.size() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < d.size(); i2++) {
                Map<String, a> map = d.get(i2);
                if (map != null) {
                    Set<Map.Entry<String, a>> entrySet = map.entrySet();
                    if (entrySet == null || entrySet.size() <= 0 || (it = entrySet.iterator()) == null) {
                        break;
                    } else if (it.hasNext()) {
                        arrayList.add(it.next().getValue().k().ab());
                    }
                }
            }
            com.anythink.expressad.videocommon.a.a(i, z);
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }

    private void b(String str, String str2) {
        l c = c(str);
        if (c != null) {
            try {
                c.b(str2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(int i, String str, boolean z, com.anythink.expressad.foundation.d.c cVar, int i2, List<com.anythink.expressad.foundation.d.c> list) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (a(i, str, z, cVar, i2, list)) {
            n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功");
            if (TextUtils.isEmpty(cVar.au())) {
                n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功，非大模板");
                if (cVar.L() != null && !TextUtils.isEmpty(cVar.L().e())) {
                    n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功，非大模板，存在播放模板，开始检查播放模板预加载");
                    if (g.a().c(cVar.L().e()) != null) {
                        j a2 = j.a();
                        StringBuilder L = wo1.L(str, "_");
                        L.append(cVar.aa());
                        L.append("_");
                        L.append(cVar.L().e());
                        if (a2.d(L.toString())) {
                            n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功，非大模板，存在播放模板，播放模板预加载成功 ,isCampaignTemplatePreLoadReady true");
                        }
                    }
                    z2 = true;
                    z3 = false;
                    z4 = true;
                    n.a(a, "CampaignDownLoadTask: isCampaignDownloadReady " + z2 + "  isCampaignTemplatePreLoadReady: " + z3 + "  isCampaignTPLPreLoadReady: " + z4);
                    return !z2 && z3 && z4;
                }
                n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功，非大模板，不存在播放模板");
            } else {
                n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功，大模板，开始检查大模板下载情况");
                if (g.a().c(cVar.au()) != null) {
                    n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功，大模板，大模板下载成功，开始检查大模板预加载情况");
                    j a3 = j.a();
                    StringBuilder L2 = wo1.L(str, "_");
                    L2.append(cVar.aa());
                    L2.append("_");
                    L2.append(cVar.au());
                    if (a3.d(L2.toString())) {
                        n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载成功，大模板，大模板下载成功，大模板预加载成功");
                    }
                }
                z2 = true;
                z3 = true;
            }
            z2 = true;
            z3 = true;
            z4 = true;
            n.a(a, "CampaignDownLoadTask: isCampaignDownloadReady " + z2 + "  isCampaignTemplatePreLoadReady: " + z3 + "  isCampaignTPLPreLoadReady: " + z4);
            if (z2) {
            }
        }
        n.a(a, "CampaignDownLoadTask nscpt： " + cVar.at() + " Campaigns 下载失败");
        z2 = false;
        z3 = false;
        z4 = false;
        n.a(a, "CampaignDownLoadTask: isCampaignDownloadReady " + z2 + "  isCampaignTemplatePreLoadReady: " + z3 + "  isCampaignTPLPreLoadReady: " + z4);
        if (z2) {
        }
    }

    public final l a(String str, List<com.anythink.expressad.foundation.d.c> list, int i, com.anythink.expressad.videocommon.d.b bVar) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return null;
        }
        if (this.e.containsKey(str)) {
            l lVar = this.e.get(str);
            if (i != 94 && i != 287) {
                lVar.a(bVar);
            } else {
                lVar.a(list.get(0).aa(), bVar);
            }
            lVar.a(list);
            return lVar;
        }
        l lVar2 = new l(list, this.c, str, i);
        if (bVar != null) {
            lVar2.a(bVar);
        }
        this.e.put(str, lVar2);
        return lVar2;
    }

    private l a(String str, com.anythink.expressad.foundation.d.c cVar, int i, com.anythink.expressad.videocommon.d.b bVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return null;
        }
        if (this.e.containsKey(str)) {
            l lVar = this.e.get(str);
            if (i != 94 && i != 287) {
                lVar.a(bVar);
            } else {
                lVar.a(cVar.aa(), bVar);
            }
            lVar.a(cVar);
            return lVar;
        }
        l lVar2 = new l(cVar, this.c, str, i);
        if (bVar != null) {
            lVar2.a(bVar);
        }
        this.e.put(str, lVar2);
        return lVar2;
    }

    public final void b() {
        this.d = false;
        ConcurrentHashMap<String, l> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                l value = entry.getValue();
                if (value != null) {
                    value.c();
                }
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            if (this.d) {
                return;
            }
        } else {
            this.d = false;
        }
        ConcurrentHashMap<String, l> concurrentHashMap = this.e;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, l> entry : concurrentHashMap.entrySet()) {
                entry.getValue().a();
            }
        }
    }

    private static void a(l lVar, String str) {
        try {
            com.anythink.expressad.videocommon.e.d a2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), str);
            if (a2 == null) {
                return;
            }
            if (a2.E() == 2) {
                lVar.c();
            } else {
                lVar.a();
            }
        } catch (Exception e) {
            n.d(a, e.getMessage());
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                com.anythink.expressad.d.b.a();
                com.anythink.expressad.d.c c = com.anythink.expressad.d.b.c(com.anythink.expressad.foundation.b.a.b().e(), str);
                if (c == null) {
                    c = com.anythink.expressad.d.c.d(str);
                }
                if (c.m() == 2) {
                    lVar.c();
                } else {
                    lVar.a();
                }
            } catch (Exception e2) {
                n.d(a, e2.getMessage());
            }
        }
    }
}