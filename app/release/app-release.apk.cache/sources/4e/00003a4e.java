package com.p7700g.p99005;

/* compiled from: VolleyError.java */
/* loaded from: classes3.dex */
public class b53 extends Exception {
    public final p43 s;
    private long t;

    public b53() {
        this.s = null;
    }

    public void a(long networkTimeMs) {
        this.t = networkTimeMs;
    }

    public b53(p43 response) {
        this.s = response;
    }

    public b53(String exceptionMessage) {
        super(exceptionMessage);
        this.s = null;
    }

    public b53(String exceptionMessage, Throwable reason) {
        super(exceptionMessage, reason);
        this.s = null;
    }

    public b53(Throwable cause) {
        super(cause);
        this.s = null;
    }
}