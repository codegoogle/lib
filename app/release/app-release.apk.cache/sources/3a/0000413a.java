package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.EOFException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealBufferedSource.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a,\u0010$\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\b$\u0010%\u001a$\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010)\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020(H\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010,\u001a\u00020+*\u00020\u0000H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020+*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0016\u00100\u001a\u0004\u0018\u00010+*\u00020\u0000H\u0080\b¢\u0006\u0004\b0\u0010-\u001a\u001c\u00102\u001a\u00020+*\u00020\u00002\u0006\u00101\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b2\u0010/\u001a\u0014\u00103\u001a\u00020\u0019*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00104\u001a\u0014\u00106\u001a\u000205*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u000205*\u00020\u0000H\u0080\b¢\u0006\u0004\b8\u00107\u001a\u0014\u00109\u001a\u00020\u0019*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u00104\u001a\u0014\u0010:\u001a\u00020\u0019*\u00020\u0000H\u0080\b¢\u0006\u0004\b:\u00104\u001a\u0014\u0010;\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b;\u0010<\u001a\u0014\u0010=\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b=\u0010<\u001a\u0014\u0010>\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b>\u0010<\u001a\u0014\u0010?\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b?\u0010<\u001a\u001c\u0010@\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b@\u0010\f\u001a,\u0010C\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bC\u0010D\u001a$\u0010F\u001a\u00020\u0003*\u00020\u00002\u0006\u0010E\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bF\u0010G\u001a$\u0010I\u001a\u00020\u0003*\u00020\u00002\u0006\u0010H\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bI\u0010G\u001a4\u0010K\u001a\u00020\u0007*\u00020\u00002\u0006\u0010#\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010N\u001a\u00020M*\u00020\u0000H\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\bP\u0010Q\u001a\u0014\u0010S\u001a\u00020R*\u00020\u0000H\u0080\b¢\u0006\u0004\bS\u0010T\u001a\u0014\u0010U\u001a\u00020+*\u00020\u0000H\u0080\b¢\u0006\u0004\bU\u0010-¨\u0006V"}, d2 = {"Lcom/p7700g/p99005/rw5;", "Lcom/p7700g/p99005/sv5;", "sink", "", "byteCount", "i", "(Lcom/p7700g/p99005/rw5;Lcom/p7700g/p99005/sv5;J)J", "", "b", "(Lcom/p7700g/p99005/rw5;)Z", "Lcom/p7700g/p99005/yq4;", "F", "(Lcom/p7700g/p99005/rw5;J)V", "E", "(Lcom/p7700g/p99005/rw5;J)Z", "", "k", "(Lcom/p7700g/p99005/rw5;)B", "Lcom/p7700g/p99005/vv5;", "n", "(Lcom/p7700g/p99005/rw5;)Lcom/p7700g/p99005/vv5;", ij3.b, "(Lcom/p7700g/p99005/rw5;J)Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/mw5;", "options", "", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Lcom/p7700g/p99005/rw5;Lcom/p7700g/p99005/mw5;)I", "", "l", "(Lcom/p7700g/p99005/rw5;)[B", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/rw5;J)[B", "r", "(Lcom/p7700g/p99005/rw5;[B)V", "offset", "h", "(Lcom/p7700g/p99005/rw5;[BII)I", "q", "(Lcom/p7700g/p99005/rw5;Lcom/p7700g/p99005/sv5;J)V", "Lcom/p7700g/p99005/vw5;", "j", "(Lcom/p7700g/p99005/rw5;Lcom/p7700g/p99005/vw5;)J", "", "z", "(Lcom/p7700g/p99005/rw5;)Ljava/lang/String;", bx.B4, "(Lcom/p7700g/p99005/rw5;J)Ljava/lang/String;", "C", "limit", "D", AFHydra.EV_BYTECOUNT, "(Lcom/p7700g/p99005/rw5;)I", "", "x", "(Lcom/p7700g/p99005/rw5;)S", "y", "t", "u", com.ironsource.sdk.controller.v.a, "(Lcom/p7700g/p99005/rw5;)J", "w", "p", "s", "H", "fromIndex", "toIndex", "c", "(Lcom/p7700g/p99005/rw5;BJJ)J", "bytes", "d", "(Lcom/p7700g/p99005/rw5;Lcom/p7700g/p99005/vv5;J)J", "targetBytes", "e", "bytesOffset", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/rw5;JLcom/p7700g/p99005/vv5;II)Z", "Lcom/p7700g/p99005/uv5;", "f", "(Lcom/p7700g/p99005/rw5;)Lcom/p7700g/p99005/uv5;", "a", "(Lcom/p7700g/p99005/rw5;)V", "Lcom/p7700g/p99005/zw5;", AFHydra.STATUS_IDLE, "(Lcom/p7700g/p99005/rw5;)Lcom/p7700g/p99005/zw5;", "J", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class ex5 {
    @NotNull
    public static final String A(@NotNull rw5 rw5Var, long j) {
        c25.p(rw5Var, "$this$commonReadUtf8");
        rw5Var.P1(j);
        return rw5Var.s.g(j);
    }

    public static final int B(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadUtf8CodePoint");
        rw5Var.P1(1L);
        byte d2 = rw5Var.s.d2(0L);
        if ((d2 & 224) == 192) {
            rw5Var.P1(2L);
        } else if ((d2 & 240) == 224) {
            rw5Var.P1(3L);
        } else if ((d2 & 248) == 240) {
            rw5Var.P1(4L);
        }
        return rw5Var.s.Y0();
    }

    @Nullable
    public static final String C(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadUtf8Line");
        long U1 = rw5Var.U1((byte) 10);
        if (U1 == -1) {
            if (rw5Var.s.z2() != 0) {
                return rw5Var.g(rw5Var.s.z2());
            }
            return null;
        }
        return bx5.i0(rw5Var.s, U1);
    }

    @NotNull
    public static final String D(@NotNull rw5 rw5Var, long j) {
        c25.p(rw5Var, "$this$commonReadUtf8LineStrict");
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long m0 = rw5Var.m0(b, 0L, j2);
            if (m0 != -1) {
                return bx5.i0(rw5Var.s, m0);
            }
            if (j2 < Long.MAX_VALUE && rw5Var.i1(j2) && rw5Var.s.d2(j2 - 1) == ((byte) 13) && rw5Var.i1(1 + j2) && rw5Var.s.d2(j2) == b) {
                return bx5.i0(rw5Var.s, j2);
            }
            sv5 sv5Var = new sv5();
            sv5 sv5Var2 = rw5Var.s;
            sv5Var2.X(sv5Var, 0L, Math.min(32, sv5Var2.z2()));
            StringBuilder G = wo1.G("\\n not found: limit=");
            G.append(Math.min(rw5Var.s.z2(), j));
            G.append(" content=");
            G.append(sv5Var.f1().H());
            G.append("…");
            throw new EOFException(G.toString());
        }
        throw new IllegalArgumentException(wo1.p("limit < 0: ", j).toString());
    }

    public static final boolean E(@NotNull rw5 rw5Var, long j) {
        c25.p(rw5Var, "$this$commonRequest");
        if (j >= 0) {
            if (!rw5Var.t) {
                while (rw5Var.s.z2() < j) {
                    if (rw5Var.u.read(rw5Var.s, 8192) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    public static final void F(@NotNull rw5 rw5Var, long j) {
        c25.p(rw5Var, "$this$commonRequire");
        if (!rw5Var.i1(j)) {
            throw new EOFException();
        }
    }

    public static final int G(@NotNull rw5 rw5Var, @NotNull mw5 mw5Var) {
        c25.p(rw5Var, "$this$commonSelect");
        c25.p(mw5Var, "options");
        if (!rw5Var.t) {
            do {
                int k0 = bx5.k0(rw5Var.s, mw5Var, true);
                if (k0 != -2) {
                    if (k0 != -1) {
                        rw5Var.s.skip(mw5Var.d()[k0].C3());
                        return k0;
                    }
                    return -1;
                }
            } while (rw5Var.u.read(rw5Var.s, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final void H(@NotNull rw5 rw5Var, long j) {
        c25.p(rw5Var, "$this$commonSkip");
        if (!(!rw5Var.t)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (rw5Var.s.z2() == 0 && rw5Var.u.read(rw5Var.s, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, rw5Var.s.z2());
            rw5Var.s.skip(min);
            j -= min;
        }
    }

    @NotNull
    public static final zw5 I(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonTimeout");
        return rw5Var.u.timeout();
    }

    @NotNull
    public static final String J(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonToString");
        return "buffer(" + rw5Var.u + ')';
    }

    public static final void a(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonClose");
        if (rw5Var.t) {
            return;
        }
        rw5Var.t = true;
        rw5Var.u.close();
        rw5Var.s.d();
    }

    public static final boolean b(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonExhausted");
        if (!rw5Var.t) {
            return rw5Var.s.f0() && rw5Var.u.read(rw5Var.s, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long c(@NotNull rw5 rw5Var, byte b, long j, long j2) {
        c25.p(rw5Var, "$this$commonIndexOf");
        boolean z = true;
        if (!rw5Var.t) {
            if (!((0 > j || j2 < j) ? false : false)) {
                throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
            }
            while (j < j2) {
                long m0 = rw5Var.s.m0(b, j, j2);
                if (m0 == -1) {
                    long z2 = rw5Var.s.z2();
                    if (z2 >= j2 || rw5Var.u.read(rw5Var.s, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, z2);
                } else {
                    return m0;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long d(@NotNull rw5 rw5Var, @NotNull vv5 vv5Var, long j) {
        c25.p(rw5Var, "$this$commonIndexOf");
        c25.p(vv5Var, "bytes");
        if (!(!rw5Var.t)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long i = rw5Var.s.i(vv5Var, j);
            if (i != -1) {
                return i;
            }
            long z2 = rw5Var.s.z2();
            if (rw5Var.u.read(rw5Var.s, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, (z2 - vv5Var.C3()) + 1);
        }
    }

    public static final long e(@NotNull rw5 rw5Var, @NotNull vv5 vv5Var, long j) {
        c25.p(rw5Var, "$this$commonIndexOfElement");
        c25.p(vv5Var, "targetBytes");
        if (!(!rw5Var.t)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long N1 = rw5Var.s.N1(vv5Var, j);
            if (N1 != -1) {
                return N1;
            }
            long z2 = rw5Var.s.z2();
            if (rw5Var.u.read(rw5Var.s, 8192) == -1) {
                return -1L;
            }
            j = Math.max(j, z2);
        }
    }

    @NotNull
    public static final uv5 f(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonPeek");
        return jw5.d(new ow5(rw5Var));
    }

    public static final boolean g(@NotNull rw5 rw5Var, long j, @NotNull vv5 vv5Var, int i, int i2) {
        c25.p(rw5Var, "$this$commonRangeEquals");
        c25.p(vv5Var, "bytes");
        if (!rw5Var.t) {
            if (j < 0 || i < 0 || i2 < 0 || vv5Var.C3() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!rw5Var.i1(1 + j2) || rw5Var.s.d2(j2) != vv5Var.A(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final int h(@NotNull rw5 rw5Var, @NotNull byte[] bArr, int i, int i2) {
        c25.p(rw5Var, "$this$commonRead");
        c25.p(bArr, "sink");
        long j = i2;
        pv5.e(bArr.length, i, j);
        if (rw5Var.s.z2() == 0 && rw5Var.u.read(rw5Var.s, 8192) == -1) {
            return -1;
        }
        return rw5Var.s.read(bArr, i, (int) Math.min(j, rw5Var.s.z2()));
    }

    public static final long i(@NotNull rw5 rw5Var, @NotNull sv5 sv5Var, long j) {
        c25.p(rw5Var, "$this$commonRead");
        c25.p(sv5Var, "sink");
        if (j >= 0) {
            if (!rw5Var.t) {
                if (rw5Var.s.z2() == 0 && rw5Var.u.read(rw5Var.s, 8192) == -1) {
                    return -1L;
                }
                return rw5Var.s.read(sv5Var, Math.min(j, rw5Var.s.z2()));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(wo1.p("byteCount < 0: ", j).toString());
    }

    public static final long j(@NotNull rw5 rw5Var, @NotNull vw5 vw5Var) {
        c25.p(rw5Var, "$this$commonReadAll");
        c25.p(vw5Var, "sink");
        long j = 0;
        while (rw5Var.u.read(rw5Var.s, 8192) != -1) {
            long f = rw5Var.s.f();
            if (f > 0) {
                j += f;
                vw5Var.write(rw5Var.s, f);
            }
        }
        if (rw5Var.s.z2() > 0) {
            long z2 = j + rw5Var.s.z2();
            sv5 sv5Var = rw5Var.s;
            vw5Var.write(sv5Var, sv5Var.z2());
            return z2;
        }
        return j;
    }

    public static final byte k(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadByte");
        rw5Var.P1(1L);
        return rw5Var.s.readByte();
    }

    @NotNull
    public static final byte[] l(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadByteArray");
        rw5Var.s.b1(rw5Var.u);
        return rw5Var.s.b0();
    }

    @NotNull
    public static final byte[] m(@NotNull rw5 rw5Var, long j) {
        c25.p(rw5Var, "$this$commonReadByteArray");
        rw5Var.P1(j);
        return rw5Var.s.r1(j);
    }

    @NotNull
    public static final vv5 n(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadByteString");
        rw5Var.s.b1(rw5Var.u);
        return rw5Var.s.f1();
    }

    @NotNull
    public static final vv5 o(@NotNull rw5 rw5Var, long j) {
        c25.p(rw5Var, "$this$commonReadByteString");
        rw5Var.P1(j);
        return rw5Var.s.D(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r9 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        r0 = com.p7700g.p99005.wo1.G("Expected leading [0-9] or '-' character but was 0x");
        r1 = java.lang.Integer.toString(r8, com.p7700g.p99005.d85.a(com.p7700g.p99005.d85.a(16)));
        com.p7700g.p99005.c25.o(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long p(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadDecimalLong");
        rw5Var.P1(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!rw5Var.i1(j2)) {
                break;
            }
            byte d2 = rw5Var.s.d2(j);
            if ((d2 < ((byte) 48) || d2 > ((byte) 57)) && !(j == 0 && d2 == ((byte) 45))) {
                break;
            }
            j = j2;
        }
        return rw5Var.s.q0();
    }

    public static final void q(@NotNull rw5 rw5Var, @NotNull sv5 sv5Var, long j) {
        c25.p(rw5Var, "$this$commonReadFully");
        c25.p(sv5Var, "sink");
        try {
            rw5Var.P1(j);
            rw5Var.s.l0(sv5Var, j);
        } catch (EOFException e) {
            sv5Var.b1(rw5Var.s);
            throw e;
        }
    }

    public static final void r(@NotNull rw5 rw5Var, @NotNull byte[] bArr) {
        c25.p(rw5Var, "$this$commonReadFully");
        c25.p(bArr, "sink");
        try {
            rw5Var.P1(bArr.length);
            rw5Var.s.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (rw5Var.s.z2() > 0) {
                sv5 sv5Var = rw5Var.s;
                int read = sv5Var.read(bArr, i, (int) sv5Var.z2());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    public static final long s(@NotNull rw5 rw5Var) {
        byte d2;
        c25.p(rw5Var, "$this$commonReadHexadecimalUnsignedLong");
        rw5Var.P1(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!rw5Var.i1(i2)) {
                break;
            }
            d2 = rw5Var.s.d2(i);
            if ((d2 < ((byte) 48) || d2 > ((byte) 57)) && ((d2 < ((byte) 97) || d2 > ((byte) 102)) && (d2 < ((byte) 65) || d2 > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            StringBuilder G = wo1.G("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(d2, d85.a(d85.a(16)));
            c25.o(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            G.append(num);
            throw new NumberFormatException(G.toString());
        }
        return rw5Var.s.V1();
    }

    public static final int t(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadInt");
        rw5Var.P1(4L);
        return rw5Var.s.readInt();
    }

    public static final int u(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadIntLe");
        rw5Var.P1(4L);
        return rw5Var.s.o1();
    }

    public static final long v(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadLong");
        rw5Var.P1(8L);
        return rw5Var.s.readLong();
    }

    public static final long w(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadLongLe");
        rw5Var.P1(8L);
        return rw5Var.s.C1();
    }

    public static final short x(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadShort");
        rw5Var.P1(2L);
        return rw5Var.s.readShort();
    }

    public static final short y(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadShortLe");
        rw5Var.P1(2L);
        return rw5Var.s.z1();
    }

    @NotNull
    public static final String z(@NotNull rw5 rw5Var) {
        c25.p(rw5Var, "$this$commonReadUtf8");
        rw5Var.s.b1(rw5Var.u);
        return rw5Var.s.u1();
    }
}