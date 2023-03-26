package com.p7700g.p99005;

import com.ironsource.mediationsdk.impressionData.ImpressionData;

/* compiled from: Country.java */
/* loaded from: classes.dex */
public class pr0 {
    @x1
    @mw2(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY)
    private String a;
    @mw2("servers")
    private int b;

    public pr0(@x1 String str) {
        this.a = str;
    }

    @x1
    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Country{country='");
        wo1.d0(G, this.a, '\'', ", servers=");
        return wo1.y(G, this.b, '}');
    }
}