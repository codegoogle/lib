package com.p7700g.p99005;

import android.content.Context;
import android.os.PowerManager;
import com.p7700g.p99005.i2;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: WakeLocks.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class sf0 {
    private static final String a = tb0.f("WakeLocks");
    private static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    private sf0() {
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                tb0.c().h(a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(@x1 Context context, @x1 String tag) {
        String t = wo1.t("WorkManager: ", tag);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, t);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, t);
        }
        return newWakeLock;
    }
}