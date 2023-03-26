package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: HashingSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019B\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cB\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u001dB!\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0015\u001a\u00020\t8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000b¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/gw5;", "Lcom/p7700g/p99005/bw5;", "Lcom/p7700g/p99005/xw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "read", "(Lcom/p7700g/p99005/sv5;J)J", "Lcom/p7700g/p99005/vv5;", "d", "()Lcom/p7700g/p99005/vv5;", "Ljavax/crypto/Mac;", com.ironsource.sdk.controller.v.a, "Ljavax/crypto/Mac;", "mac", "Ljava/security/MessageDigest;", "u", "Ljava/security/MessageDigest;", "messageDigest", "e", "hash", rs2.f.b, "digest", "<init>", "(Lcom/p7700g/p99005/xw5;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lcom/p7700g/p99005/xw5;Ljava/lang/String;)V", "(Lcom/p7700g/p99005/xw5;Ljavax/crypto/Mac;)V", "key", "(Lcom/p7700g/p99005/xw5;Lcom/p7700g/p99005/vv5;Ljava/lang/String;)V", "t", "a", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class gw5 extends bw5 implements xw5 {
    @NotNull
    public static final a t = new a(null);
    private final MessageDigest u;
    private final Mac v;

    /* compiled from: HashingSource.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/gw5$a", "", "Lcom/p7700g/p99005/xw5;", rs2.f.b, "Lcom/p7700g/p99005/gw5;", "d", "(Lcom/p7700g/p99005/xw5;)Lcom/p7700g/p99005/gw5;", "e", "f", com.anythink.basead.d.g.i, "Lcom/p7700g/p99005/vv5;", "key", "a", "(Lcom/p7700g/p99005/xw5;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/gw5;", "b", "c", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @jz4
        @NotNull
        public final gw5 a(@NotNull xw5 xw5Var, @NotNull vv5 vv5Var) {
            c25.p(xw5Var, rs2.f.b);
            c25.p(vv5Var, "key");
            return new gw5(xw5Var, vv5Var, "HmacSHA1");
        }

        @jz4
        @NotNull
        public final gw5 b(@NotNull xw5 xw5Var, @NotNull vv5 vv5Var) {
            c25.p(xw5Var, rs2.f.b);
            c25.p(vv5Var, "key");
            return new gw5(xw5Var, vv5Var, "HmacSHA256");
        }

        @jz4
        @NotNull
        public final gw5 c(@NotNull xw5 xw5Var, @NotNull vv5 vv5Var) {
            c25.p(xw5Var, rs2.f.b);
            c25.p(vv5Var, "key");
            return new gw5(xw5Var, vv5Var, "HmacSHA512");
        }

        @jz4
        @NotNull
        public final gw5 d(@NotNull xw5 xw5Var) {
            c25.p(xw5Var, rs2.f.b);
            return new gw5(xw5Var, "MD5");
        }

        @jz4
        @NotNull
        public final gw5 e(@NotNull xw5 xw5Var) {
            c25.p(xw5Var, rs2.f.b);
            return new gw5(xw5Var, "SHA-1");
        }

        @jz4
        @NotNull
        public final gw5 f(@NotNull xw5 xw5Var) {
            c25.p(xw5Var, rs2.f.b);
            return new gw5(xw5Var, "SHA-256");
        }

        @jz4
        @NotNull
        public final gw5 g(@NotNull xw5 xw5Var) {
            c25.p(xw5Var, rs2.f.b);
            return new gw5(xw5Var, "SHA-512");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw5(@NotNull xw5 xw5Var, @NotNull MessageDigest messageDigest) {
        super(xw5Var);
        c25.p(xw5Var, rs2.f.b);
        c25.p(messageDigest, "digest");
        this.u = messageDigest;
        this.v = null;
    }

    @jz4
    @NotNull
    public static final gw5 f(@NotNull xw5 xw5Var, @NotNull vv5 vv5Var) {
        return t.a(xw5Var, vv5Var);
    }

    @jz4
    @NotNull
    public static final gw5 h(@NotNull xw5 xw5Var, @NotNull vv5 vv5Var) {
        return t.b(xw5Var, vv5Var);
    }

    @jz4
    @NotNull
    public static final gw5 j(@NotNull xw5 xw5Var, @NotNull vv5 vv5Var) {
        return t.c(xw5Var, vv5Var);
    }

    @jz4
    @NotNull
    public static final gw5 k(@NotNull xw5 xw5Var) {
        return t.d(xw5Var);
    }

    @jz4
    @NotNull
    public static final gw5 l(@NotNull xw5 xw5Var) {
        return t.e(xw5Var);
    }

    @jz4
    @NotNull
    public static final gw5 m(@NotNull xw5 xw5Var) {
        return t.f(xw5Var);
    }

    @jz4
    @NotNull
    public static final gw5 q(@NotNull xw5 xw5Var) {
        return t.g(xw5Var);
    }

    @fz4(name = "-deprecated_hash")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "hash", imports = {}))
    @NotNull
    public final vv5 d() {
        return e();
    }

    @fz4(name = "hash")
    @NotNull
    public final vv5 e() {
        byte[] doFinal;
        MessageDigest messageDigest = this.u;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.v;
            c25.m(mac);
            doFinal = mac.doFinal();
        }
        c25.o(doFinal, "result");
        return new vv5(doFinal);
    }

    @Override // com.p7700g.p99005.bw5, com.p7700g.p99005.xw5
    public long read(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, "sink");
        long read = super.read(sv5Var, j);
        if (read != -1) {
            long z2 = sv5Var.z2() - read;
            long z22 = sv5Var.z2();
            sw5 sw5Var = sv5Var.s;
            c25.m(sw5Var);
            while (z22 > z2) {
                sw5Var = sw5Var.j;
                c25.m(sw5Var);
                z22 -= sw5Var.f - sw5Var.e;
            }
            while (z22 < sv5Var.z2()) {
                int i = (int) ((sw5Var.e + z2) - z22);
                MessageDigest messageDigest = this.u;
                if (messageDigest != null) {
                    messageDigest.update(sw5Var.d, i, sw5Var.f - i);
                } else {
                    Mac mac = this.v;
                    c25.m(mac);
                    mac.update(sw5Var.d, i, sw5Var.f - i);
                }
                z22 += sw5Var.f - sw5Var.e;
                sw5Var = sw5Var.i;
                c25.m(sw5Var);
                z2 = z22;
            }
        }
        return read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gw5(@NotNull xw5 xw5Var, @NotNull String str) {
        this(xw5Var, r3);
        c25.p(xw5Var, rs2.f.b);
        c25.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        c25.o(messageDigest, "MessageDigest.getInstance(algorithm)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw5(@NotNull xw5 xw5Var, @NotNull Mac mac) {
        super(xw5Var);
        c25.p(xw5Var, rs2.f.b);
        c25.p(mac, "mac");
        this.v = mac;
        this.u = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gw5(@NotNull xw5 xw5Var, @NotNull vv5 vv5Var, @NotNull String str) {
        this(xw5Var, r0);
        c25.p(xw5Var, rs2.f.b);
        c25.p(vv5Var, "key");
        c25.p(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(vv5Var.n4(), str));
            yq4 yq4Var = yq4.a;
            c25.o(mac, "try {\n      Mac.getInsta…rgumentException(e)\n    }");
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}