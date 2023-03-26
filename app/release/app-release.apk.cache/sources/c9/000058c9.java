package com.p7700g.p99005;

/* compiled from: FirebaseInstallationsException.java */
/* loaded from: classes3.dex */
public class qr2 extends sn2 {
    @x1
    private final a s;

    /* compiled from: FirebaseInstallationsException.java */
    /* loaded from: classes3.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public qr2(@x1 a aVar) {
        this.s = aVar;
    }

    @x1
    public a f() {
        return this.s;
    }

    public qr2(@x1 String str, @x1 a aVar) {
        super(str);
        this.s = aVar;
    }

    public qr2(@x1 String str, @x1 a aVar, @x1 Throwable th) {
        super(str, th);
        this.s = aVar;
    }
}