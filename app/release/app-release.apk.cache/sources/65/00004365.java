package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SegmentedByteString.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001ad\u0010\u0014\u001a\u00020\u0012*\u00020\u00072K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aq\u0010\u0018\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a$\u0010\u001b\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001e\u001a\u00020\u001d*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b \u0010!\u001a\u0014\u0010\"\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a,\u0010&\u001a\u00020\u0012*\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b&\u0010'\u001a4\u0010+\u001a\u00020**\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b+\u0010,\u001a4\u0010-\u001a\u00020**\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u001e\u00100\u001a\u00020**\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010/H\u0080\b¢\u0006\u0004\b0\u00101\u001a\u0014\u00102\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b2\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"", "", "value", "fromIndex", "toIndex", "b", "([IIII)I", "Lcom/p7700g/p99005/uw5;", "pos", "n", "(Lcom/p7700g/p99005/uw5;I)I", "Lkotlin/Function3;", "", "Lcom/p7700g/p99005/ip4;", "name", "data", "offset", "byteCount", "Lcom/p7700g/p99005/yq4;", "action", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/uw5;Lcom/p7700g/p99005/k05;)V", "beginIndex", "endIndex", "l", "(Lcom/p7700g/p99005/uw5;IILcom/p7700g/p99005/k05;)V", "Lcom/p7700g/p99005/vv5;", "i", "(Lcom/p7700g/p99005/uw5;II)Lcom/p7700g/p99005/vv5;", "", "f", "(Lcom/p7700g/p99005/uw5;I)B", "d", "(Lcom/p7700g/p99005/uw5;)I", "j", "(Lcom/p7700g/p99005/uw5;)[B", "Lcom/p7700g/p99005/sv5;", "buffer", "k", "(Lcom/p7700g/p99005/uw5;Lcom/p7700g/p99005/sv5;II)V", "other", "otherOffset", "", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/uw5;ILcom/p7700g/p99005/vv5;II)Z", "h", "(Lcom/p7700g/p99005/uw5;I[BII)Z", "", "c", "(Lcom/p7700g/p99005/uw5;Ljava/lang/Object;)Z", "e", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class fx5 {
    public static final int b(@NotNull int[] iArr, int i, int i2, int i3) {
        c25.p(iArr, "$this$binarySearch");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else if (i6 <= i) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final boolean c(@NotNull uw5 uw5Var, @Nullable Object obj) {
        c25.p(uw5Var, "$this$commonEquals");
        if (obj == uw5Var) {
            return true;
        }
        if (obj instanceof vv5) {
            vv5 vv5Var = (vv5) obj;
            if (vv5Var.C3() == uw5Var.C3() && uw5Var.d3(0, vv5Var, 0, uw5Var.C3())) {
                return true;
            }
        }
        return false;
    }

    public static final int d(@NotNull uw5 uw5Var) {
        c25.p(uw5Var, "$this$commonGetSize");
        return uw5Var.y4()[uw5Var.B4().length - 1];
    }

    public static final int e(@NotNull uw5 uw5Var) {
        c25.p(uw5Var, "$this$commonHashCode");
        int D = uw5Var.D();
        if (D != 0) {
            return D;
        }
        int length = uw5Var.B4().length;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            int i4 = uw5Var.y4()[length + i];
            int i5 = uw5Var.y4()[i];
            byte[] bArr = uw5Var.B4()[i];
            int i6 = (i5 - i2) + i4;
            while (i4 < i6) {
                i3 = (i3 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i2 = i5;
        }
        uw5Var.n3(i3);
        return i3;
    }

    public static final byte f(@NotNull uw5 uw5Var, int i) {
        c25.p(uw5Var, "$this$commonInternalGet");
        pv5.e(uw5Var.y4()[uw5Var.B4().length - 1], i, 1L);
        int n = n(uw5Var, i);
        return uw5Var.B4()[n][(i - (n == 0 ? 0 : uw5Var.y4()[n - 1])) + uw5Var.y4()[uw5Var.B4().length + n]];
    }

    public static final boolean g(@NotNull uw5 uw5Var, int i, @NotNull vv5 vv5Var, int i2, int i3) {
        c25.p(uw5Var, "$this$commonRangeEquals");
        c25.p(vv5Var, "other");
        if (i < 0 || i > uw5Var.C3() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int n = n(uw5Var, i);
        while (i < i4) {
            int i5 = n == 0 ? 0 : uw5Var.y4()[n - 1];
            int i6 = uw5Var.y4()[uw5Var.B4().length + n];
            int min = Math.min(i4, (uw5Var.y4()[n] - i5) + i5) - i;
            if (!vv5Var.i3(i2, uw5Var.B4()[n], (i - i5) + i6, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    public static final boolean h(@NotNull uw5 uw5Var, int i, @NotNull byte[] bArr, int i2, int i3) {
        c25.p(uw5Var, "$this$commonRangeEquals");
        c25.p(bArr, "other");
        if (i < 0 || i > uw5Var.C3() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int n = n(uw5Var, i);
        while (i < i4) {
            int i5 = n == 0 ? 0 : uw5Var.y4()[n - 1];
            int i6 = uw5Var.y4()[uw5Var.B4().length + n];
            int min = Math.min(i4, (uw5Var.y4()[n] - i5) + i5) - i;
            if (!pv5.d(uw5Var.B4()[n], (i - i5) + i6, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            n++;
        }
        return true;
    }

    @NotNull
    public static final vv5 i(@NotNull uw5 uw5Var, int i, int i2) {
        c25.p(uw5Var, "$this$commonSubstring");
        if (i >= 0) {
            if (!(i2 <= uw5Var.C3())) {
                StringBuilder H = wo1.H("endIndex=", i2, " > length(");
                H.append(uw5Var.C3());
                H.append(')');
                throw new IllegalArgumentException(H.toString().toString());
            }
            int i3 = i2 - i;
            if (i3 >= 0) {
                if (i == 0 && i2 == uw5Var.C3()) {
                    return uw5Var;
                }
                if (i == i2) {
                    return vv5.t;
                }
                int n = n(uw5Var, i);
                int n2 = n(uw5Var, i2 - 1);
                byte[][] bArr = (byte[][]) zr4.M1(uw5Var.B4(), n, n2 + 1);
                int[] iArr = new int[bArr.length * 2];
                if (n <= n2) {
                    int i4 = 0;
                    int i5 = n;
                    while (true) {
                        iArr[i4] = Math.min(uw5Var.y4()[i5] - i, i3);
                        int i6 = i4 + 1;
                        iArr[i4 + bArr.length] = uw5Var.y4()[uw5Var.B4().length + i5];
                        if (i5 == n2) {
                            break;
                        }
                        i5++;
                        i4 = i6;
                    }
                }
                int i7 = n != 0 ? uw5Var.y4()[n - 1] : 0;
                int length = bArr.length;
                iArr[length] = (i - i7) + iArr[length];
                return new uw5(bArr, iArr);
            }
            throw new IllegalArgumentException(wo1.o("endIndex=", i2, " < beginIndex=", i).toString());
        }
        throw new IllegalArgumentException(wo1.n("beginIndex=", i, " < 0").toString());
    }

    @NotNull
    public static final byte[] j(@NotNull uw5 uw5Var) {
        c25.p(uw5Var, "$this$commonToByteArray");
        byte[] bArr = new byte[uw5Var.C3()];
        int length = uw5Var.B4().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = uw5Var.y4()[length + i];
            int i5 = uw5Var.y4()[i];
            int i6 = i5 - i2;
            zr4.W0(uw5Var.B4()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final void k(@NotNull uw5 uw5Var, @NotNull sv5 sv5Var, int i, int i2) {
        c25.p(uw5Var, "$this$commonWrite");
        c25.p(sv5Var, "buffer");
        int i3 = i + i2;
        int n = n(uw5Var, i);
        while (i < i3) {
            int i4 = n == 0 ? 0 : uw5Var.y4()[n - 1];
            int i5 = uw5Var.y4()[uw5Var.B4().length + n];
            int min = Math.min(i3, (uw5Var.y4()[n] - i4) + i4) - i;
            int i6 = (i - i4) + i5;
            sw5 sw5Var = new sw5(uw5Var.B4()[n], i6, i6 + min, true, false);
            sw5 sw5Var2 = sv5Var.s;
            if (sw5Var2 == null) {
                sw5Var.j = sw5Var;
                sw5Var.i = sw5Var;
                sv5Var.s = sw5Var;
            } else {
                c25.m(sw5Var2);
                sw5 sw5Var3 = sw5Var2.j;
                c25.m(sw5Var3);
                sw5Var3.c(sw5Var);
            }
            i += min;
            n++;
        }
        sv5Var.v2(sv5Var.z2() + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(uw5 uw5Var, int i, int i2, k05<? super byte[], ? super Integer, ? super Integer, yq4> k05Var) {
        int n = n(uw5Var, i);
        while (i < i2) {
            int i3 = n == 0 ? 0 : uw5Var.y4()[n - 1];
            int i4 = uw5Var.y4()[uw5Var.B4().length + n];
            int min = Math.min(i2, (uw5Var.y4()[n] - i3) + i3) - i;
            k05Var.I(uw5Var.B4()[n], Integer.valueOf((i - i3) + i4), Integer.valueOf(min));
            i += min;
            n++;
        }
    }

    public static final void m(@NotNull uw5 uw5Var, @NotNull k05<? super byte[], ? super Integer, ? super Integer, yq4> k05Var) {
        c25.p(uw5Var, "$this$forEachSegment");
        c25.p(k05Var, "action");
        int length = uw5Var.B4().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = uw5Var.y4()[length + i];
            int i4 = uw5Var.y4()[i];
            k05Var.I(uw5Var.B4()[i], Integer.valueOf(i3), Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    public static final int n(@NotNull uw5 uw5Var, int i) {
        c25.p(uw5Var, "$this$segment");
        int b = b(uw5Var.y4(), i + 1, 0, uw5Var.B4().length);
        return b >= 0 ? b : ~b;
    }
}