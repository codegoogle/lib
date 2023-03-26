package com.p7700g.p99005;

import java.util.Locale;

/* compiled from: ConnectionTimeoutException.java */
/* loaded from: classes2.dex */
public class sb1 extends gc1 {
    public sb1(long j) {
        super(String.format(Locale.US, "Vpn transport didn't establish connection in %d seconds.", Long.valueOf(j)));
    }
}