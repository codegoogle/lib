package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.videocommon.b.g;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class b implements g.c {
    private static String a = "DownLoadH5SourceListener";
    private ConcurrentMap<String, b> b;
    private k c;
    private CopyOnWriteArrayList<g.d> d;
    private String e;

    public b(ConcurrentMap<String, b> concurrentMap, k kVar, g.d dVar, String str) {
        CopyOnWriteArrayList<g.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.d = copyOnWriteArrayList;
        this.b = concurrentMap;
        this.c = kVar;
        copyOnWriteArrayList.add(dVar);
        this.e = str;
    }

    @Override // com.anythink.expressad.videocommon.b.g.c
    public final void a() {
    }

    public final void a(g.d dVar) {
        this.d.add(dVar);
    }

    @Override // com.anythink.expressad.videocommon.b.g.c
    public final void a(byte[] bArr, String str) {
        String str2;
        ConcurrentMap<String, b> concurrentMap;
        try {
            concurrentMap = this.b;
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
            try {
                str2 = e.getMessage();
            } catch (Throwable th) {
                n.b(a, th.getMessage(), th);
                str2 = "";
            }
        }
        if (concurrentMap == null) {
            Iterator<g.d> it = this.d.iterator();
            while (it.hasNext()) {
                g.d next = it.next();
                if (next != null) {
                    next.a(str, "mResDownloadingMap  is null");
                    this.d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(str)) {
            this.b.remove(str);
        }
        if (bArr == null || bArr.length <= 0) {
            str2 = "response data is error";
        } else {
            String a2 = this.c.a(str, bArr);
            if (TextUtils.isEmpty(a2)) {
                Iterator<g.d> it2 = this.d.iterator();
                while (it2.hasNext()) {
                    g.d next2 = it2.next();
                    if (next2 != null) {
                        next2.a(str);
                        this.d.remove(next2);
                    }
                }
                return;
            }
            str2 = "data save failed:".concat(String.valueOf(a2));
        }
        Iterator<g.d> it3 = this.d.iterator();
        while (it3.hasNext()) {
            g.d next3 = it3.next();
            if (next3 != null) {
                next3.a(str, str2);
            }
        }
    }

    @Override // com.anythink.expressad.videocommon.b.g.c
    public final void a(String str) {
        ConcurrentMap<String, b> concurrentMap;
        try {
            concurrentMap = this.b;
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
            try {
                str = e.getMessage();
            } catch (Throwable th) {
                n.b(a, th.getMessage(), th);
            }
        }
        if (concurrentMap == null) {
            Iterator<g.d> it = this.d.iterator();
            while (it.hasNext()) {
                g.d next = it.next();
                if (next != null) {
                    next.a(this.e, "mResDownloadingMap  is null");
                    this.d.remove(next);
                }
            }
            return;
        }
        if (concurrentMap.containsKey(this.e)) {
            this.b.remove(this.e);
        }
        Iterator<g.d> it2 = this.d.iterator();
        while (it2.hasNext()) {
            g.d next2 = it2.next();
            if (next2 != null) {
                next2.a(this.e, str);
                this.d.remove(next2);
            }
        }
    }
}