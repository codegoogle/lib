package com.p7700g.p99005;

import android.os.Bundle;
import com.p7700g.p99005.xu0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: EventConnectionEnd.java */
/* loaded from: classes2.dex */
public class ig1 extends hg1 {
    private long x;
    private long y;
    private long z;

    public ig1() {
        this("connection_end");
    }

    public long P() {
        return this.y;
    }

    public long Q() {
        return this.z;
    }

    public long R() {
        return this.x;
    }

    @x1
    public ig1 S(long j) {
        this.y = j;
        return this;
    }

    @x1
    public ig1 T(long j) {
        this.z = j;
        return this;
    }

    @x1
    public ig1 U(long j) {
        this.x = j;
        return this;
    }

    @Override // com.p7700g.p99005.hg1, com.p7700g.p99005.gg1
    @x1
    public Bundle b() {
        Bundle b = super.b();
        b.putLong("duration", this.x);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(xu0.f.a, this.y);
            jSONObject.put(xu0.f.b, this.z);
        } catch (JSONException unused) {
        }
        w(b, xu0.f.B, jSONObject.toString());
        return b;
    }

    public ig1(@x1 String str) {
        super(str);
    }
}