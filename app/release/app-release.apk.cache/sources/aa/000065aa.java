package com.p7700g.p99005;

import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: GoogleApiClientCompatProxy.java */
/* loaded from: classes3.dex */
public class xi3 {
    private final GoogleApiClient a;
    private final Class b;

    public xi3(GoogleApiClient googleApiClient) {
        this.a = googleApiClient;
        this.b = googleApiClient.getClass();
    }

    public void a() {
        try {
            this.b.getMethod("connect", new Class[0]).invoke(this.a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b() {
        try {
            this.b.getMethod("disconnect", new Class[0]).invoke(this.a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public GoogleApiClient c() {
        return this.a;
    }
}