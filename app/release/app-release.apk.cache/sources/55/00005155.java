package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Options.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\f\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0015B!\b\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/p7700g/p99005/mw5;", "Lcom/p7700g/p99005/nr4;", "Lcom/p7700g/p99005/vv5;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", la1.l, "c", "(I)Lcom/p7700g/p99005/vv5;", "", com.ironsource.sdk.controller.v.a, "[I", "e", "()[I", "trie", "", "u", "[Lokio/ByteString;", "d", "()[Lokio/ByteString;", "byteStrings", "a", "()I", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "<init>", "([Lokio/ByteString;[I)V", "t", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class mw5 extends nr4<vv5> implements RandomAccess {
    @NotNull
    public static final a t = new a(null);
    @NotNull
    private final vv5[] u;
    @NotNull
    private final int[] v;

    /* compiled from: Options.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J[\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0011\"\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0002*\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"com/p7700g/p99005/mw5$a", "", "", "nodeOffset", "Lcom/p7700g/p99005/sv5;", "node", "", "byteStringOffset", "", "Lcom/p7700g/p99005/vv5;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lcom/p7700g/p99005/yq4;", "a", "(JLcom/p7700g/p99005/sv5;ILjava/util/List;IILjava/util/List;)V", "", "Lcom/p7700g/p99005/mw5;", "d", "([Lokio/ByteString;)Lcom/p7700g/p99005/mw5;", "c", "(Lcom/p7700g/p99005/sv5;)J", "intCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        private final void a(long j, sv5 sv5Var, int i, List<? extends vv5> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            sv5 sv5Var2;
            int i8 = i;
            if (i2 < i3) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (!(list.get(i9).C3() >= i8)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                vv5 vv5Var = list.get(i2);
                vv5 vv5Var2 = list.get(i3 - 1);
                if (i8 == vv5Var.C3()) {
                    int i10 = i2 + 1;
                    i4 = i10;
                    i5 = list2.get(i2).intValue();
                    vv5Var = list.get(i10);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (vv5Var.A(i8) != vv5Var2.A(i8)) {
                    int i11 = 1;
                    for (int i12 = i4 + 1; i12 < i3; i12++) {
                        if (list.get(i12 - 1).A(i8) != list.get(i12).A(i8)) {
                            i11++;
                        }
                    }
                    long c = j + c(sv5Var) + 2 + (i11 * 2);
                    sv5Var.S(i11);
                    sv5Var.S(i5);
                    for (int i13 = i4; i13 < i3; i13++) {
                        byte A = list.get(i13).A(i8);
                        if (i13 == i4 || A != list.get(i13 - 1).A(i8)) {
                            sv5Var.S(A & 255);
                        }
                    }
                    sv5 sv5Var3 = new sv5();
                    while (i4 < i3) {
                        byte A2 = list.get(i4).A(i8);
                        int i14 = i4 + 1;
                        int i15 = i14;
                        while (true) {
                            if (i15 >= i3) {
                                i6 = i3;
                                break;
                            } else if (A2 != list.get(i15).A(i8)) {
                                i6 = i15;
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (i14 == i6 && i8 + 1 == list.get(i4).C3()) {
                            sv5Var.S(list2.get(i4).intValue());
                            i7 = i6;
                            sv5Var2 = sv5Var3;
                        } else {
                            sv5Var.S(((int) (c + c(sv5Var3))) * (-1));
                            i7 = i6;
                            sv5Var2 = sv5Var3;
                            a(c, sv5Var3, i8 + 1, list, i4, i6, list2);
                        }
                        sv5Var3 = sv5Var2;
                        i4 = i7;
                    }
                    sv5Var.b1(sv5Var3);
                    return;
                }
                int min = Math.min(vv5Var.C3(), vv5Var2.C3());
                int i16 = 0;
                for (int i17 = i8; i17 < min && vv5Var.A(i17) == vv5Var2.A(i17); i17++) {
                    i16++;
                }
                long c2 = j + c(sv5Var) + 2 + i16 + 1;
                sv5Var.S(-i16);
                sv5Var.S(i5);
                int i18 = i8 + i16;
                while (i8 < i18) {
                    sv5Var.S(vv5Var.A(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i18 == list.get(i4).C3()) {
                        sv5Var.S(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                sv5 sv5Var4 = new sv5();
                sv5Var.S(((int) (c(sv5Var4) + c2)) * (-1));
                a(c2, sv5Var4, i18, list, i4, i3, list2);
                sv5Var.b1(sv5Var4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public static /* synthetic */ void b(a aVar, long j, sv5 sv5Var, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.a((i4 & 1) != 0 ? 0L : j, sv5Var, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        private final long c(sv5 sv5Var) {
            return sv5Var.z2() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
            continue;
         */
        @jz4
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final mw5 d(@NotNull vv5... vv5VarArr) {
            c25.p(vv5VarArr, "byteStrings");
            int i = 0;
            if (vv5VarArr.length == 0) {
                return new mw5(new vv5[0], new int[]{0, -1}, null);
            }
            List sz = as4.sz(vv5VarArr);
            ns4.k0(sz);
            ArrayList arrayList = new ArrayList(vv5VarArr.length);
            for (vv5 vv5Var : vv5VarArr) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List Q = js4.Q((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = vv5VarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Q.set(js4.y(sz, vv5VarArr[i2], 0, 0, 6, null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((vv5) sz.get(0)).C3() > 0) {
                int i4 = 0;
                while (i4 < sz.size()) {
                    vv5 vv5Var2 = (vv5) sz.get(i4);
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < sz.size()) {
                        vv5 vv5Var3 = (vv5) sz.get(i6);
                        if (!vv5Var3.E3(vv5Var2)) {
                            break;
                        }
                        if (!(vv5Var3.C3() != vv5Var2.C3())) {
                            throw new IllegalArgumentException(("duplicate option: " + vv5Var3).toString());
                        } else if (((Number) Q.get(i6)).intValue() > ((Number) Q.get(i4)).intValue()) {
                            sz.remove(i6);
                            Q.remove(i6);
                        } else {
                            i6++;
                        }
                    }
                    i4 = i5;
                }
                sv5 sv5Var = new sv5();
                b(this, 0L, sv5Var, 0, sz, 0, 0, Q, 53, null);
                int[] iArr = new int[(int) c(sv5Var)];
                while (!sv5Var.f0()) {
                    iArr[i] = sv5Var.readInt();
                    i++;
                }
                Object[] copyOf = Arrays.copyOf(vv5VarArr, vv5VarArr.length);
                c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new mw5((vv5[]) copyOf, iArr, null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ mw5(vv5[] vv5VarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(vv5VarArr, iArr);
    }

    @jz4
    @NotNull
    public static final mw5 m(@NotNull vv5... vv5VarArr) {
        return t.d(vv5VarArr);
    }

    @Override // com.p7700g.p99005.nr4, com.p7700g.p99005.lr4
    public int a() {
        return this.u.length;
    }

    public /* bridge */ boolean b(vv5 vv5Var) {
        return super.contains(vv5Var);
    }

    @Override // com.p7700g.p99005.nr4, java.util.List
    @NotNull
    /* renamed from: c */
    public vv5 get(int i) {
        return this.u[i];
    }

    @Override // com.p7700g.p99005.lr4, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof vv5) {
            return b((vv5) obj);
        }
        return false;
    }

    @NotNull
    public final vv5[] d() {
        return this.u;
    }

    @NotNull
    public final int[] e() {
        return this.v;
    }

    public /* bridge */ int h(vv5 vv5Var) {
        return super.indexOf(vv5Var);
    }

    public /* bridge */ int i(vv5 vv5Var) {
        return super.lastIndexOf(vv5Var);
    }

    @Override // com.p7700g.p99005.nr4, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof vv5) {
            return h((vv5) obj);
        }
        return -1;
    }

    @Override // com.p7700g.p99005.nr4, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof vv5) {
            return i((vv5) obj);
        }
        return -1;
    }

    private mw5(vv5[] vv5VarArr, int[] iArr) {
        this.u = vv5VarArr;
        this.v = iArr;
    }
}