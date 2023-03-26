package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: HashingSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0019\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dB\u0019\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001eB!\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010 J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0012\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/p7700g/p99005/fw5;", "Lcom/p7700g/p99005/aw5;", "Lcom/p7700g/p99005/vw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "write", "(Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vv5;", "a", "()Lcom/p7700g/p99005/vv5;", "Ljava/security/MessageDigest;", "t", "Ljava/security/MessageDigest;", "messageDigest", "b", "hash", "Ljavax/crypto/Mac;", "u", "Ljavax/crypto/Mac;", "mac", "sink", "digest", "<init>", "(Lcom/p7700g/p99005/vw5;Ljava/security/MessageDigest;)V", "", "algorithm", "(Lcom/p7700g/p99005/vw5;Ljava/lang/String;)V", "(Lcom/p7700g/p99005/vw5;Ljavax/crypto/Mac;)V", "key", "(Lcom/p7700g/p99005/vw5;Lcom/p7700g/p99005/vv5;Ljava/lang/String;)V", "s", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class fw5 extends aw5 implements vw5 {
    @NotNull
    public static final a s = new a(null);
    private final MessageDigest t;
    private final Mac u;

    /* compiled from: HashingSink.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/fw5$a", "", "Lcom/p7700g/p99005/vw5;", "sink", "Lcom/p7700g/p99005/fw5;", "d", "(Lcom/p7700g/p99005/vw5;)Lcom/p7700g/p99005/fw5;", "e", "f", com.anythink.basead.d.g.i, "Lcom/p7700g/p99005/vv5;", "key", "a", "(Lcom/p7700g/p99005/vw5;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/fw5;", "b", "c", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @jz4
        @NotNull
        public final fw5 a(@NotNull vw5 vw5Var, @NotNull vv5 vv5Var) {
            c25.p(vw5Var, "sink");
            c25.p(vv5Var, "key");
            return new fw5(vw5Var, vv5Var, "HmacSHA1");
        }

        @jz4
        @NotNull
        public final fw5 b(@NotNull vw5 vw5Var, @NotNull vv5 vv5Var) {
            c25.p(vw5Var, "sink");
            c25.p(vv5Var, "key");
            return new fw5(vw5Var, vv5Var, "HmacSHA256");
        }

        @jz4
        @NotNull
        public final fw5 c(@NotNull vw5 vw5Var, @NotNull vv5 vv5Var) {
            c25.p(vw5Var, "sink");
            c25.p(vv5Var, "key");
            return new fw5(vw5Var, vv5Var, "HmacSHA512");
        }

        @jz4
        @NotNull
        public final fw5 d(@NotNull vw5 vw5Var) {
            c25.p(vw5Var, "sink");
            return new fw5(vw5Var, "MD5");
        }

        @jz4
        @NotNull
        public final fw5 e(@NotNull vw5 vw5Var) {
            c25.p(vw5Var, "sink");
            return new fw5(vw5Var, "SHA-1");
        }

        @jz4
        @NotNull
        public final fw5 f(@NotNull vw5 vw5Var) {
            c25.p(vw5Var, "sink");
            return new fw5(vw5Var, "SHA-256");
        }

        @jz4
        @NotNull
        public final fw5 g(@NotNull vw5 vw5Var) {
            c25.p(vw5Var, "sink");
            return new fw5(vw5Var, "SHA-512");
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw5(@NotNull vw5 vw5Var, @NotNull MessageDigest messageDigest) {
        super(vw5Var);
        c25.p(vw5Var, "sink");
        c25.p(messageDigest, "digest");
        this.t = messageDigest;
        this.u = null;
    }

    @jz4
    @NotNull
    public static final fw5 d(@NotNull vw5 vw5Var, @NotNull vv5 vv5Var) {
        return s.a(vw5Var, vv5Var);
    }

    @jz4
    @NotNull
    public static final fw5 e(@NotNull vw5 vw5Var, @NotNull vv5 vv5Var) {
        return s.b(vw5Var, vv5Var);
    }

    @jz4
    @NotNull
    public static final fw5 f(@NotNull vw5 vw5Var, @NotNull vv5 vv5Var) {
        return s.c(vw5Var, vv5Var);
    }

    @jz4
    @NotNull
    public static final fw5 h(@NotNull vw5 vw5Var) {
        return s.d(vw5Var);
    }

    @jz4
    @NotNull
    public static final fw5 j(@NotNull vw5 vw5Var) {
        return s.e(vw5Var);
    }

    @jz4
    @NotNull
    public static final fw5 k(@NotNull vw5 vw5Var) {
        return s.f(vw5Var);
    }

    @jz4
    @NotNull
    public static final fw5 l(@NotNull vw5 vw5Var) {
        return s.g(vw5Var);
    }

    @fz4(name = "-deprecated_hash")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "hash", imports = {}))
    @NotNull
    public final vv5 a() {
        return b();
    }

    @fz4(name = "hash")
    @NotNull
    public final vv5 b() {
        byte[] doFinal;
        MessageDigest messageDigest = this.t;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.u;
            c25.m(mac);
            doFinal = mac.doFinal();
        }
        c25.o(doFinal, "result");
        return new vv5(doFinal);
    }

    @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5
    public void write(@NotNull sv5 sv5Var, long j) throws IOException {
        c25.p(sv5Var, rs2.f.b);
        pv5.e(sv5Var.z2(), 0L, j);
        sw5 sw5Var = sv5Var.s;
        c25.m(sw5Var);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, sw5Var.f - sw5Var.e);
            MessageDigest messageDigest = this.t;
            if (messageDigest != null) {
                messageDigest.update(sw5Var.d, sw5Var.e, min);
            } else {
                Mac mac = this.u;
                c25.m(mac);
                mac.update(sw5Var.d, sw5Var.e, min);
            }
            j2 += min;
            sw5Var = sw5Var.i;
            c25.m(sw5Var);
        }
        super.write(sv5Var, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fw5(@NotNull vw5 vw5Var, @NotNull String str) {
        this(vw5Var, r3);
        c25.p(vw5Var, "sink");
        c25.p(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        c25.o(messageDigest, "MessageDigest.getInstance(algorithm)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw5(@NotNull vw5 vw5Var, @NotNull Mac mac) {
        super(vw5Var);
        c25.p(vw5Var, "sink");
        c25.p(mac, "mac");
        this.u = mac;
        this.t = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fw5(@NotNull vw5 vw5Var, @NotNull vv5 vv5Var, @NotNull String str) {
        this(vw5Var, r0);
        c25.p(vw5Var, "sink");
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