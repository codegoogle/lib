package com.p7700g.p99005;

import android.os.ParcelFileDescriptor;

/* compiled from: ControlableVpnRouter.java */
/* loaded from: classes2.dex */
public class jd1 implements td1 {
    @x1
    private static final kj1 a = kj1.b("VpnRouter");
    private boolean b;
    @x1
    private final td1 c;
    @x1
    private String d;

    public jd1(boolean z, @x1 td1 td1Var, @x1 String str) {
        this.b = z;
        this.c = td1Var;
        this.d = str;
    }

    public void a(boolean z) {
        this.b = z;
    }

    @Override // com.p7700g.p99005.td1
    public boolean k(@x1 ParcelFileDescriptor parcelFileDescriptor) {
        a.c("Bypass tag: %s allow: %s", this.d, Boolean.valueOf(this.b));
        if (this.b) {
            return this.c.k(parcelFileDescriptor);
        }
        return false;
    }

    @Override // com.p7700g.p99005.td1
    public boolean l(int i) {
        a.c("Bypass tag: %s allow: %s", this.d, Boolean.valueOf(this.b));
        if (this.b) {
            return this.c.l(i);
        }
        return false;
    }
}