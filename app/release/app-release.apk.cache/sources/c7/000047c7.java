package com.p7700g.p99005;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i23 {
    @NotNull
    public static final i23 a = new i23();

    private i23() {
    }

    @Nullable
    public final JSONObject a(@Nullable cb3 cb3Var) {
        if (cb3Var == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = cb3Var.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap.put(((l23) entry.getKey()).toString(), ((db3) entry.getValue()).a());
        }
        return new JSONObject(hashMap);
    }
}