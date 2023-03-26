package com.p7700g.p99005;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class xm2 {
    private static final Set a = new HashSet(Arrays.asList(com.anythink.expressad.foundation.g.a.f.a, "unity"));
    private static final Map b = new HashMap();
    private static final wl2 c = new wl2("PlayCoreVersion");

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map b2 = b();
        bundle.putInt("playcore_version_code", ((Integer) b2.get("java")).intValue());
        if (b2.containsKey(com.anythink.expressad.foundation.g.a.f.a)) {
            bundle.putInt("playcore_native_version", ((Integer) b2.get(com.anythink.expressad.foundation.g.a.f.a)).intValue());
        }
        if (b2.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b2.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b() {
        Map map;
        synchronized (xm2.class) {
            map = b;
            map.put("java", 11004);
        }
        return map;
    }
}