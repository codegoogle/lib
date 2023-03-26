package com.p7700g.p99005;

import android.content.Intent;

/* compiled from: AuthFailureError.java */
/* loaded from: classes3.dex */
public class e43 extends b53 {
    private Intent u;

    public e43() {
    }

    public Intent f() {
        return this.u;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.u != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public e43(Intent intent) {
        this.u = intent;
    }

    public e43(p43 response) {
        super(response);
    }

    public e43(String message) {
        super(message);
    }

    public e43(String message, Exception reason) {
        super(message, reason);
    }
}