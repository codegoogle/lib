package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {
    public IronSource.AD_UNIT a;
    public String b;
    public List<NetworkSettings> c;
    public com.ironsource.mediationsdk.utils.c d;
    public int e;
    public int f;
    public int g;
    public com.ironsource.mediationsdk.adunit.c.b.a h;
    public int i;

    public a(IronSource.AD_UNIT ad_unit, String str, List<NetworkSettings> list, com.ironsource.mediationsdk.utils.c cVar, int i, int i2, int i3, int i4, com.ironsource.mediationsdk.adunit.c.b.a aVar) {
        this.a = ad_unit;
        this.b = str;
        this.c = list;
        this.d = cVar;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = aVar;
        this.i = i4;
    }

    public final NetworkSettings a(String str) {
        for (NetworkSettings networkSettings : this.c) {
            if (networkSettings.getProviderInstanceName().equals(str)) {
                return networkSettings;
            }
        }
        return null;
    }

    public final boolean a() {
        return this.d.f > 0;
    }
}