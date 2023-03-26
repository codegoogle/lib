package com.p7700g.p99005;

import com.google.android.gms.internal.firebase_messaging.zze;
import com.google.android.gms.internal.firebase_messaging.zzz;
import com.p7700g.p99005.yp2;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class bv2 {
    private static final bv2 a = new a().a();
    private final av2 b;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static final class a {
        private av2 a = null;

        @x1
        public bv2 a() {
            return new bv2(this.a);
        }

        @x1
        public a b(@x1 av2 av2Var) {
            this.a = av2Var;
            return this;
        }
    }

    public bv2(av2 av2Var) {
        this.b = av2Var;
    }

    @x1
    public static bv2 a() {
        return a;
    }

    @x1
    public static a d() {
        return new a();
    }

    @x1
    @yp2.b
    public av2 b() {
        av2 av2Var = this.b;
        return av2Var == null ? av2.f() : av2Var;
    }

    @x1
    @zzz(zza = 1)
    @yp2.a(name = "messagingClientEvent")
    public av2 c() {
        return this.b;
    }

    @x1
    public byte[] e() {
        return zze.zza(this);
    }

    public void f(@x1 OutputStream outputStream) throws IOException {
        zze.zzb(this, outputStream);
    }
}