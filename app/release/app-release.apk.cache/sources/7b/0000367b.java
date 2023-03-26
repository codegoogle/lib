package com.ironsource.sdk.service;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

@vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ironsource/sdk/service/AdInstanceTimingService;", "", "()V", "instanceToTimingValuesMapping", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getInstanceToTimingValuesMapping", "()Ljava/util/HashMap;", "addTimingValueForInstance", "", "instance", "timingValue", "clearTimingValueForInstance", "getTimeElapsedForInstanceTimer", "getTimingValueForInstance", "sdk5_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final a a = new a();
    @NotNull
    private static final HashMap<String, Long> b = new HashMap<>();

    private a() {
    }

    public static long a(@NotNull String str) {
        c25.p(str, "instance");
        Long l = b.get(str);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public static boolean a(@NotNull String str, long j) {
        c25.p(str, "instance");
        if (!(str.length() == 0)) {
            HashMap<String, Long> hashMap = b;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, Long.valueOf(j));
                return true;
            }
        }
        return false;
    }

    public static boolean b(@NotNull String str) {
        c25.p(str, "instance");
        HashMap<String, Long> hashMap = b;
        if (hashMap.get(str) != null) {
            hashMap.remove(str);
            return true;
        }
        return false;
    }

    public static long c(@NotNull String str) {
        c25.p(str, "instance");
        Long l = b.get(str);
        if (l == null) {
            return -1L;
        }
        return System.currentTimeMillis() - l.longValue();
    }
}