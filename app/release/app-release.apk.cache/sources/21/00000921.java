package com.anythink.expressad.reward.a;

import com.anythink.expressad.foundation.h.n;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class e implements com.anythink.expressad.e.b {
    private static final String a = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, com.anythink.expressad.videocommon.e.d> b;

    /* loaded from: classes2.dex */
    public static final class a {
        private static final e a = new e((byte) 0);

        private a() {
        }
    }

    public /* synthetic */ e(byte b) {
        this();
    }

    public static e a() {
        return a.a;
    }

    private e() {
        this.b = new ConcurrentHashMap<>();
    }

    public final void a(String str, String str2, com.anythink.expressad.videocommon.e.d dVar) {
        try {
            String str3 = str + "_" + str2;
            if (dVar != null && this.b.containsKey(str3)) {
                this.b.remove(str3);
            }
            this.b.put(str3, dVar);
        } catch (Exception e) {
            n.d(a, e.getMessage());
        }
    }

    public final com.anythink.expressad.videocommon.e.d a(String str, String str2) {
        try {
            try {
                return this.b.remove(str + "_" + str2);
            } catch (Exception e) {
                n.d(a, e.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}