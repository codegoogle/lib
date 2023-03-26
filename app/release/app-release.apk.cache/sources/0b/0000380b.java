package com.p7700g.p99005;

/* compiled from: AddressStringException.java */
/* loaded from: classes3.dex */
public class a14 extends d14 {
    private static final long u = 4;
    private static final String v = d14.a("ipaddress.address.error");

    public a14(CharSequence charSequence, String str, Throwable th) {
        super(charSequence, v, str, th);
    }

    public a14(CharSequence charSequence, String str) {
        super(charSequence, v, str);
    }

    public a14(CharSequence charSequence, String str, int i) {
        super(charSequence.toString() + gl4.R + v + gl4.R + d14.a(str) + gl4.R + i);
    }

    public a14(CharSequence charSequence, int i) {
        this(charSequence, i, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a14(CharSequence charSequence, int i, boolean z) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence.toString());
        sb.append(gl4.R);
        sb.append(v);
        sb.append(gl4.R);
        sb.append(d14.a(z ? "ipaddress.error.invalid.character.combination.at.index" : "ipaddress.error.invalid.character.at.index"));
        sb.append(gl4.R);
        sb.append(i);
    }

    public a14(String str) {
        super(v, str);
    }
}