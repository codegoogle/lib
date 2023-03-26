package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.EOFException;
import org.jetbrains.annotations.NotNull;

/* compiled from: RealBufferedSink.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0013\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a,\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a,\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\"\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020!H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a$\u0010$\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010&\u001a\u00020\rH\u0080\b¢\u0006\u0004\b'\u0010\u001b\u001a\u001c\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\rH\u0080\b¢\u0006\u0004\b)\u0010\u001b\u001a\u001c\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\rH\u0080\b¢\u0006\u0004\b*\u0010\u001b\u001a\u001c\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010$\u001a\u00020\rH\u0080\b¢\u0006\u0004\b+\u0010\u001b\u001a\u001c\u0010,\u001a\u00020\n*\u00020\u00002\u0006\u0010$\u001a\u00020\rH\u0080\b¢\u0006\u0004\b,\u0010\u001b\u001a\u001c\u0010(\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010-\u001a\u001c\u0010.\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b.\u0010-\u001a\u001c\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b/\u0010-\u001a\u001c\u00100\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b0\u0010-\u001a\u0014\u00101\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u0010&\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b&\u00102\u001a\u0014\u00103\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00104\u001a\u0014\u00105\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00104\u001a\u0014\u00107\u001a\u000206*\u00020\u0000H\u0080\b¢\u0006\u0004\b7\u00108\u001a\u0014\u00109\u001a\u00020\u0011*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/p7700g/p99005/qw5;", "Lcom/p7700g/p99005/sv5;", rs2.f.b, "", "byteCount", "Lcom/p7700g/p99005/yq4;", "l", "(Lcom/p7700g/p99005/qw5;Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vv5;", "byteString", "Lcom/p7700g/p99005/tv5;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/qw5;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/tv5;", "", "offset", "h", "(Lcom/p7700g/p99005/qw5;Lcom/p7700g/p99005/vv5;II)Lcom/p7700g/p99005/tv5;", "", "string", "w", "(Lcom/p7700g/p99005/qw5;Ljava/lang/String;)Lcom/p7700g/p99005/tv5;", "beginIndex", "endIndex", "x", "(Lcom/p7700g/p99005/qw5;Ljava/lang/String;II)Lcom/p7700g/p99005/tv5;", "codePoint", "y", "(Lcom/p7700g/p99005/qw5;I)Lcom/p7700g/p99005/tv5;", "", "j", "(Lcom/p7700g/p99005/qw5;[B)Lcom/p7700g/p99005/tv5;", "k", "(Lcom/p7700g/p99005/qw5;[BII)Lcom/p7700g/p99005/tv5;", "Lcom/p7700g/p99005/xw5;", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/qw5;Lcom/p7700g/p99005/xw5;)J", "i", "(Lcom/p7700g/p99005/qw5;Lcom/p7700g/p99005/xw5;J)Lcom/p7700g/p99005/tv5;", "b", "n", "s", "u", com.ironsource.sdk.controller.v.a, "q", "r", "(Lcom/p7700g/p99005/qw5;J)Lcom/p7700g/p99005/tv5;", "t", ij3.b, "p", "c", "(Lcom/p7700g/p99005/qw5;)Lcom/p7700g/p99005/tv5;", "d", "(Lcom/p7700g/p99005/qw5;)V", "a", "Lcom/p7700g/p99005/zw5;", "e", "(Lcom/p7700g/p99005/qw5;)Lcom/p7700g/p99005/zw5;", "f", "(Lcom/p7700g/p99005/qw5;)Ljava/lang/String;", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class dx5 {
    public static final void a(@NotNull qw5 qw5Var) {
        c25.p(qw5Var, "$this$commonClose");
        if (qw5Var.t) {
            return;
        }
        Throwable th = null;
        try {
            if (qw5Var.s.z2() > 0) {
                vw5 vw5Var = qw5Var.u;
                sv5 sv5Var = qw5Var.s;
                vw5Var.write(sv5Var, sv5Var.z2());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            qw5Var.u.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        qw5Var.t = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public static final tv5 b(@NotNull qw5 qw5Var) {
        c25.p(qw5Var, "$this$commonEmit");
        if (!qw5Var.t) {
            long z2 = qw5Var.s.z2();
            if (z2 > 0) {
                qw5Var.u.write(qw5Var.s, z2);
            }
            return qw5Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 c(@NotNull qw5 qw5Var) {
        c25.p(qw5Var, "$this$commonEmitCompleteSegments");
        if (!qw5Var.t) {
            long f = qw5Var.s.f();
            if (f > 0) {
                qw5Var.u.write(qw5Var.s, f);
            }
            return qw5Var;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void d(@NotNull qw5 qw5Var) {
        c25.p(qw5Var, "$this$commonFlush");
        if (!qw5Var.t) {
            if (qw5Var.s.z2() > 0) {
                vw5 vw5Var = qw5Var.u;
                sv5 sv5Var = qw5Var.s;
                vw5Var.write(sv5Var, sv5Var.z2());
            }
            qw5Var.u.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final zw5 e(@NotNull qw5 qw5Var) {
        c25.p(qw5Var, "$this$commonTimeout");
        return qw5Var.u.timeout();
    }

    @NotNull
    public static final String f(@NotNull qw5 qw5Var) {
        c25.p(qw5Var, "$this$commonToString");
        return "buffer(" + qw5Var.u + ')';
    }

    @NotNull
    public static final tv5 g(@NotNull qw5 qw5Var, @NotNull vv5 vv5Var) {
        c25.p(qw5Var, "$this$commonWrite");
        c25.p(vv5Var, "byteString");
        if (!qw5Var.t) {
            qw5Var.s.y1(vv5Var);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 h(@NotNull qw5 qw5Var, @NotNull vv5 vv5Var, int i, int i2) {
        c25.p(qw5Var, "$this$commonWrite");
        c25.p(vv5Var, "byteString");
        if (!qw5Var.t) {
            qw5Var.s.Q(vv5Var, i, i2);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 i(@NotNull qw5 qw5Var, @NotNull xw5 xw5Var, long j) {
        c25.p(qw5Var, "$this$commonWrite");
        c25.p(xw5Var, rs2.f.b);
        while (j > 0) {
            long read = xw5Var.read(qw5Var.s, j);
            if (read != -1) {
                j -= read;
                qw5Var.p0();
            } else {
                throw new EOFException();
            }
        }
        return qw5Var;
    }

    @NotNull
    public static final tv5 j(@NotNull qw5 qw5Var, @NotNull byte[] bArr) {
        c25.p(qw5Var, "$this$commonWrite");
        c25.p(bArr, rs2.f.b);
        if (!qw5Var.t) {
            qw5Var.s.w1(bArr);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 k(@NotNull qw5 qw5Var, @NotNull byte[] bArr, int i, int i2) {
        c25.p(qw5Var, "$this$commonWrite");
        c25.p(bArr, rs2.f.b);
        if (!qw5Var.t) {
            qw5Var.s.V0(bArr, i, i2);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void l(@NotNull qw5 qw5Var, @NotNull sv5 sv5Var, long j) {
        c25.p(qw5Var, "$this$commonWrite");
        c25.p(sv5Var, rs2.f.b);
        if (!qw5Var.t) {
            qw5Var.s.write(sv5Var, j);
            qw5Var.p0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long m(@NotNull qw5 qw5Var, @NotNull xw5 xw5Var) {
        c25.p(qw5Var, "$this$commonWriteAll");
        c25.p(xw5Var, rs2.f.b);
        long j = 0;
        while (true) {
            long read = xw5Var.read(qw5Var.s, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            qw5Var.p0();
        }
    }

    @NotNull
    public static final tv5 n(@NotNull qw5 qw5Var, int i) {
        c25.p(qw5Var, "$this$commonWriteByte");
        if (!qw5Var.t) {
            qw5Var.s.g0(i);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 o(@NotNull qw5 qw5Var, long j) {
        c25.p(qw5Var, "$this$commonWriteDecimalLong");
        if (!qw5Var.t) {
            qw5Var.s.Q1(j);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 p(@NotNull qw5 qw5Var, long j) {
        c25.p(qw5Var, "$this$commonWriteHexadecimalUnsignedLong");
        if (!qw5Var.t) {
            qw5Var.s.e1(j);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 q(@NotNull qw5 qw5Var, int i) {
        c25.p(qw5Var, "$this$commonWriteInt");
        if (!qw5Var.t) {
            qw5Var.s.S(i);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 r(@NotNull qw5 qw5Var, int i) {
        c25.p(qw5Var, "$this$commonWriteIntLe");
        if (!qw5Var.t) {
            qw5Var.s.e0(i);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 s(@NotNull qw5 qw5Var, long j) {
        c25.p(qw5Var, "$this$commonWriteLong");
        if (!qw5Var.t) {
            qw5Var.s.O1(j);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 t(@NotNull qw5 qw5Var, long j) {
        c25.p(qw5Var, "$this$commonWriteLongLe");
        if (!qw5Var.t) {
            qw5Var.s.V(j);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 u(@NotNull qw5 qw5Var, int i) {
        c25.p(qw5Var, "$this$commonWriteShort");
        if (!qw5Var.t) {
            qw5Var.s.M(i);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 v(@NotNull qw5 qw5Var, int i) {
        c25.p(qw5Var, "$this$commonWriteShortLe");
        if (!qw5Var.t) {
            qw5Var.s.G0(i);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 w(@NotNull qw5 qw5Var, @NotNull String str) {
        c25.p(qw5Var, "$this$commonWriteUtf8");
        c25.p(str, "string");
        if (!qw5Var.t) {
            qw5Var.s.K0(str);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 x(@NotNull qw5 qw5Var, @NotNull String str, int i, int i2) {
        c25.p(qw5Var, "$this$commonWriteUtf8");
        c25.p(str, "string");
        if (!qw5Var.t) {
            qw5Var.s.a1(str, i, i2);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final tv5 y(@NotNull qw5 qw5Var, int i) {
        c25.p(qw5Var, "$this$commonWriteUtf8CodePoint");
        if (!qw5Var.t) {
            qw5Var.s.O(i);
            return qw5Var.p0();
        }
        throw new IllegalStateException("closed".toString());
    }
}