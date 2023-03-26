package com.p7700g.p99005;

import org.json.JSONException;

/* compiled from: UserStatePush.java */
/* loaded from: classes3.dex */
public class pn3 extends mn3 {
    public pn3(String str, boolean z) {
        super(str, z);
    }

    private int E() {
        int g = j().g(un3.l, 1);
        if (g < -2) {
            return g;
        }
        if (j().e(un3.k, true)) {
            return !j().e(un3.j, true) ? -2 : 1;
        }
        return 0;
    }

    @Override // com.p7700g.p99005.mn3
    public void a() {
        try {
            v("notification_types", Integer.valueOf(E()));
        } catch (JSONException unused) {
        }
    }

    @Override // com.p7700g.p99005.mn3
    public boolean o() {
        return E() > 0;
    }

    @Override // com.p7700g.p99005.mn3
    public mn3 r(String str) {
        return new pn3(str, false);
    }
}