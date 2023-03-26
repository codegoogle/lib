package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import com.p7700g.p99005.i2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: classes3.dex */
public class yq2 {
    private static yq2 a = null;
    private static final String b = "fire-global";
    private static final String c = "FirebaseAppHeartBeat";
    private static final String d = "fire-count";
    private static final int e = 200;
    private static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy z");
    private static final String g = "FirebaseAppHeartBeatStorage";
    private final SharedPreferences h;
    private final SharedPreferences i;

    private yq2(Context context) {
        this.h = context.getSharedPreferences(c, 0);
        this.i = context.getSharedPreferences(g, 0);
    }

    private synchronized void a() {
        long j = this.h.getLong(d, 0L);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.i.getAll().entrySet()) {
            arrayList.add(Long.valueOf(Long.parseLong(entry.getKey())));
        }
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.i.edit().remove(String.valueOf((Long) it.next())).apply();
            j--;
            this.h.edit().putLong(d, j).apply();
            if (j <= 100) {
                return;
            }
        }
    }

    public static synchronized yq2 d(Context context) {
        yq2 yq2Var;
        synchronized (yq2.class) {
            if (a == null) {
                a = new yq2(context);
            }
            yq2Var = a;
        }
        return yq2Var;
    }

    public static boolean g(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public synchronized void b() {
        this.i.edit().clear().apply();
        this.h.edit().remove(d).apply();
    }

    @i2({i2.a.TESTS})
    @r2
    public int c() {
        return (int) this.h.getLong(d, 0L);
    }

    public synchronized long e() {
        return this.h.getLong(b, -1L);
    }

    public synchronized List<ar2> f(boolean z) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.i.getAll().entrySet()) {
            arrayList.add(ar2.b((String) entry.getValue(), Long.parseLong(entry.getKey())));
        }
        Collections.sort(arrayList);
        if (z) {
            b();
        }
        return arrayList;
    }

    public synchronized boolean h(long j) {
        return i(b, j);
    }

    public synchronized boolean i(String str, long j) {
        if (this.h.contains(str)) {
            if (g(this.h.getLong(str, -1L), j)) {
                this.h.edit().putLong(str, j).apply();
                return true;
            }
            return false;
        }
        this.h.edit().putLong(str, j).apply();
        return true;
    }

    public synchronized void j(String str, long j) {
        long j2 = this.h.getLong(d, 0L);
        this.i.edit().putString(String.valueOf(j), str).apply();
        long j3 = j2 + 1;
        this.h.edit().putLong(d, j3).apply();
        if (j3 > 200) {
            a();
        }
    }

    public synchronized void k(long j) {
        this.h.edit().putLong(b, j).apply();
    }

    @i2({i2.a.TESTS})
    @r2
    public yq2(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.h = sharedPreferences;
        this.i = sharedPreferences2;
    }
}