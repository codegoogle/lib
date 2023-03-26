package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MethodCallsLogger.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class wz {
    private Map<String, Integer> a = new HashMap();

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public boolean a(String str, int i) {
        Integer num = this.a.get(str);
        int intValue = num != null ? num.intValue() : 0;
        boolean z = (intValue & i) != 0;
        this.a.put(str, Integer.valueOf(i | intValue));
        return !z;
    }
}