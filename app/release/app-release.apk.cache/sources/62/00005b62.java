package com.p7700g.p99005;

import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.List;

/* compiled from: Token.java */
/* loaded from: classes.dex */
public final class s6 {
    private static final String a = "Token";
    @x1
    private final t6 b;

    private s6(@x1 t6 t6Var) {
        this.b = t6Var;
    }

    @z1
    public static s6 a(@x1 String str, @x1 PackageManager packageManager) {
        List<byte[]> b = q6.b(str, packageManager);
        if (b == null) {
            return null;
        }
        try {
            return new s6(t6.b(str, b));
        } catch (IOException unused) {
            return null;
        }
    }

    @x1
    public static s6 b(@x1 byte[] bArr) {
        return new s6(t6.d(bArr));
    }

    public boolean c(@x1 String str, @x1 PackageManager packageManager) {
        return q6.d(str, packageManager, this.b);
    }

    @x1
    public byte[] d() {
        return this.b.j();
    }
}