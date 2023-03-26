package com.anythink.core.common.e;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f extends p {
    public int a;
    public ae b;
    public long c;

    @Override // com.anythink.core.common.e.p
    public final JSONObject a() {
        JSONObject A = this.b.A(this.a);
        if (A != null) {
            try {
                A.put("sdk_time", this.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return A;
    }
}