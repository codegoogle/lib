package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.anythink.expressad.foundation.g.a;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.bx;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.4N  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4N {
    public static byte[] A09;
    public static String[] A0A;
    public C4M A01;
    public C4V A04;
    public final /* synthetic */ ES A08;
    public final ArrayList<C4X> A05 = new ArrayList<>();
    public ArrayList<C4X> A02 = null;
    public final ArrayList<C4X> A06 = new ArrayList<>();
    public final List<C4X> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    static {
        A06();
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, 30, 30, 43, 29, 44, -14, -53, -48, -38, -33, -47, -6, 37, 22, 30, -47, 20, 32, 38, 31, 37, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, 30, 19, 31, 30, 35, 25, 35, 36, 21, 30, 19, 41, -48, 20, 21, 36, 21, 19, 36, 21, 20, -34, -48, -7, 30, 38, 17, 28, 25, 20, -48, 25, 36, 21, 29, -48, 32, 31, 35, 25, 36, 25, 31, 30, -48, -13, 24, 13, 25, 24, 29, 19, 29, 30, 15, 24, 13, 35, -54, 14, 15, 30, 15, 13, 30, 15, 14, -40, -54, -13, 24, 32, Flags.CD, 22, 19, 14, -54, 32, 19, 15, 33, -54, 18, 25, 22, 14, 15, 28, -54, Flags.CD, 14, Flags.CD, 26, 30, 15, 28, -54, 26, 25, 29, 19, 30, 19, 25, 24, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, bx.j7, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, bx.j7, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -21, -20, bx.l7, -20, -35, -78};
    }

    public static void A06() {
        A0A = new String[]{"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    }

    public C4N(ES es) {
        this.A08 = es;
    }

    private final View A00(int i, boolean z) {
        return A0J(i, z, Long.MAX_VALUE).A0H;
    }

    private final C4X A01(int i) {
        int size;
        int A0E;
        ArrayList<C4X> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            C4X c4x = this.A02.get(i2);
            if (!c4x.A0j() && c4x.A0J() == i) {
                c4x.A0U(32);
                return c4x;
            }
        }
        if (this.A08.A04.A0C() && (A0E = this.A08.A00.A0E(i)) > 0 && A0E < this.A08.A04.A0E()) {
            long A05 = this.A08.A04.A05(A0E);
            for (int i3 = 0; i3 < size; i3++) {
                C4X c4x2 = this.A02.get(i3);
                if (!c4x2.A0j() && c4x2.A0L() == A05) {
                    c4x2.A0U(32);
                    return c4x2;
                }
            }
        }
        return null;
    }

    private final C4X A02(int cacheSize, boolean z) {
        View A092;
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C4X c4x = this.A05.get(i);
            if (!c4x.A0j() && c4x.A0J() == cacheSize && !c4x.A0c() && (this.A08.A0s.A09 || !c4x.A0d())) {
                c4x.A0U(32);
                return c4x;
            }
        }
        if (!z && (A092 = this.A08.A01.A09(cacheSize)) != null) {
            C4X A0G = ES.A0G(A092);
            this.A08.A01.A0H(A092);
            int A08 = this.A08.A01.A08(A092);
            if (A08 != -1) {
                this.A08.A01.A0D(A08);
                A0X(A092);
                A0G.A0U(8224);
                return A0G;
            }
            throw new IllegalStateException(A04(721, 52, 27) + A0G + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C4X c4x2 = this.A06.get(i2);
            if (!c4x2.A0c() && c4x2.A0J() == cacheSize) {
                if (!z) {
                    this.A06.remove(i2);
                }
                return c4x2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C4X A03(long j, int i, boolean z) {
        int size = this.A05.size() - 1;
        while (true) {
            if (size < 0) {
                for (int size2 = this.A06.size() - 1; size2 >= 0; size2--) {
                    C4X c4x = this.A06.get(size2);
                    if (c4x.A0L() == j) {
                        int A0I = c4x.A0I();
                        if (A0A[0].length() != 16) {
                            String[] strArr = A0A;
                            strArr[7] = "lrD7iCy3KBiO8gA6PsFToJiVZrW1xMAl";
                            strArr[6] = "amz9CZtibeJcU8bEqG7a4ZYgRNeZgxWk";
                            if (i == A0I) {
                                if (!z) {
                                    ArrayList<C4X> arrayList = this.A06;
                                    String[] strArr2 = A0A;
                                    if (strArr2[5].charAt(0) != strArr2[3].charAt(0)) {
                                        String[] strArr3 = A0A;
                                        strArr3[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                        strArr3[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                        arrayList.remove(size2);
                                    } else {
                                        arrayList.remove(size2);
                                    }
                                }
                                return c4x;
                            }
                            if (z) {
                                A08(size2);
                                String[] strArr4 = A0A;
                                if (strArr4[2].charAt(0) == strArr4[1].charAt(0)) {
                                    String[] strArr5 = A0A;
                                    strArr5[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                                    strArr5[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                                    return null;
                                }
                            }
                        } else {
                            String[] strArr6 = A0A;
                            strArr6[2] = "kYzWBiiTSiU3KogqfJ4EJctPAodLTQqF";
                            strArr6[1] = "kIBKgO4naDZyukeXVXxcwMENrZxoY36q";
                            if (i == A0I) {
                                if (!z) {
                                }
                                return c4x;
                            }
                            if (z) {
                            }
                        }
                    }
                }
                return null;
            }
            C4X c4x2 = this.A05.get(size);
            if (c4x2.A0L() == j && !c4x2.A0j()) {
                if (i == c4x2.A0I()) {
                    c4x2.A0U(32);
                    if (c4x2.A0d()) {
                        ES es = this.A08;
                        if (A0A[4].charAt(3) == 'b') {
                            String[] strArr7 = A0A;
                            strArr7[0] = "q3aWXTgT7NsVf007";
                            strArr7[0] = "q3aWXTgT7NsVf007";
                            if (!es.A0s.A07()) {
                                String[] strArr8 = A0A;
                                if (strArr8[2].charAt(0) != strArr8[1].charAt(0)) {
                                    String[] strArr9 = A0A;
                                    strArr9[4] = "NC6bFXUosLdTEwJsXrsHGkbXBsQUMG7q";
                                    strArr9[4] = "NC6bFXUosLdTEwJsXrsHGkbXBsQUMG7q";
                                    c4x2.A0V(2, 14);
                                } else {
                                    String[] strArr10 = A0A;
                                    strArr10[2] = "kBSMDIkt47Rx4hHhTamY1xnSrMWRxYxp";
                                    strArr10[1] = "kToZLwND7zKVFlbtf8XZb6UwHA5zPLAu";
                                    c4x2.A0V(2, 14);
                                }
                            }
                        }
                    }
                    return c4x2;
                } else if (!z) {
                    this.A05.remove(size);
                    this.A08.removeDetachedView(c4x2.A0H, false);
                    A0W(c4x2.A0H);
                }
            }
            size--;
        }
    }

    private final void A07() {
        boolean z;
        for (int i = this.A06.size() - 1; i >= 0; i--) {
            A08(i);
        }
        this.A06.clear();
        z = ES.A1E;
        if (z) {
            this.A08.A02.A03();
        }
    }

    private final void A08(int i) {
        A0e(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A09(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                if (strArr[7].charAt(8) == strArr[6].charAt(8)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                strArr2[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A09((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    private void A0A(C4X c4x) {
        if (this.A08.A1t()) {
            View view = c4x.A0H;
            if (C2u.A00(view) == 0) {
                C2u.A09(view, 1);
            }
            if (!C2u.A0E(view)) {
                c4x.A0U(16384);
                C2u.A0A(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0B(C4X c4x) {
        if (c4x.A0H instanceof ViewGroup) {
            A09((ViewGroup) c4x.A0H, false);
        }
    }

    private final void A0C(C4X c4x) {
        if (this.A08.A07 != null) {
            throw null;
        }
        AnonymousClass43 anonymousClass43 = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0C(c4x);
        }
    }

    private final boolean A0D(C4X c4x) {
        if (c4x.A0d()) {
            return this.A08.A0s.A07();
        }
        if (c4x.A03 >= 0 && c4x.A03 < this.A08.A04.A0E()) {
            if (this.A08.A0s.A07() || this.A08.A04.A04(c4x.A03) == c4x.A0I()) {
                return !this.A08.A04.A0C() || c4x.A0L() == this.A08.A04.A05(c4x.A03);
            }
            return false;
        }
        throw new IndexOutOfBoundsException(A04(205, 60, 112) + c4x + this.A08.A1J());
    }

    private boolean A0E(C4X c4x, int i, int i2, long j) {
        c4x.A08 = this.A08;
        int A0I = c4x.A0I();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE) {
            C4M c4m = this.A01;
            String[] strArr = A0A;
            if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "We3abAYlnqMpJzTP";
            strArr2[0] = "We3abAYlnqMpJzTP";
            if (!c4m.A0B(A0I, nanoTime, j)) {
                return false;
            }
        }
        this.A08.A04.A0B(c4x, i);
        this.A01.A06(c4x.A0I(), this.A08.getNanoTime() - nanoTime);
        A0A(c4x);
        if (this.A08.A0s.A07()) {
            c4x.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0F() {
        return this.A05.size();
    }

    public final View A0G(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0H(int i) {
        return A00(i, false);
    }

    public final C4M A0I() {
        if (this.A01 == null) {
            this.A01 = new C4M();
        }
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0269  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4X A0J(int i, boolean z, long j) {
        ViewGroup.LayoutParams layoutParams;
        C4G c4g;
        boolean z2;
        ES A0I;
        C4V c4v;
        View A00;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean fromScrapOrHiddenOrCache = false;
            C4X holder = null;
            boolean z3 = true;
            if (this.A08.A0s.A07()) {
                holder = A01(i);
                fromScrapOrHiddenOrCache = holder != null;
            }
            if (holder == null && (holder = A02(i, z)) != null) {
                if (!A0D(holder)) {
                    if (!z) {
                        holder.A0U(4);
                        if (holder.A0e()) {
                            this.A08.removeDetachedView(holder.A0H, false);
                            holder.A0T();
                        } else if (holder.A0j()) {
                            holder.A0P();
                        }
                        A0c(holder);
                    }
                    holder = null;
                } else {
                    fromScrapOrHiddenOrCache = true;
                }
            }
            if (holder == null) {
                int A0E = this.A08.A00.A0E(i);
                if (A0E >= 0 && A0E < this.A08.A04.A0E()) {
                    int A04 = this.A08.A04.A04(A0E);
                    if (this.A08.A04.A0C() && (holder = A03(this.A08.A04.A05(A0E), A04, z)) != null) {
                        holder.A03 = A0E;
                        fromScrapOrHiddenOrCache = true;
                    }
                    if (holder == null && (c4v = this.A04) != null && (A00 = c4v.A00(this, i, A04)) != null) {
                        holder = this.A08.A1I(A00);
                        if (holder != null) {
                            if (holder.A0i()) {
                                throw new IllegalArgumentException(A04(534, 113, 76) + this.A08.A1J());
                            }
                        } else {
                            throw new IllegalArgumentException(A04(647, 74, 17) + this.A08.A1J());
                        }
                    }
                    if (holder == null) {
                        C4M A0I2 = A0I();
                        String[] strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            String[] strArr2 = A0A;
                            strArr2[4] = "3K2bfdY4Lns5cH4Uqi6qZhk44zURNmgZ";
                            strArr2[4] = "3K2bfdY4Lns5cH4Uqi6qZhk44zURNmgZ";
                            holder = A0I2.A04(A04);
                            if (holder != null) {
                                holder.A0R();
                                if (ES.A1C) {
                                    A0B(holder);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (holder == null) {
                        long nanoTime = this.A08.getNanoTime();
                        if (j != Long.MAX_VALUE && !this.A01.A0C(A04, nanoTime, j)) {
                            return null;
                        }
                        AnonymousClass43 anonymousClass43 = this.A08.A04;
                        ES es = this.A08;
                        String[] strArr3 = A0A;
                        if (strArr3[5].charAt(0) == strArr3[3].charAt(0)) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0A;
                        strArr4[5] = "ofPrqBOY4KV1O5mmTOXtQojU6rRVoJMb";
                        strArr4[3] = "dfUBDtyf096LhSCdUEMmmzbvfUZbBbNe";
                        holder = anonymousClass43.A06(es, A04);
                        z2 = ES.A1E;
                        if (z2 && (A0I = ES.A0I(holder.A0H)) != null) {
                            holder.A09 = new WeakReference<>(A0I);
                        }
                        this.A01.A07(A04, this.A08.getNanoTime() - nanoTime);
                    }
                } else {
                    throw new IndexOutOfBoundsException(A04(159, 46, 118) + i + A04(13, 8, 126) + A0E + A04(21, 2, 104) + A04(773, 6, 62) + this.A08.A0s.A03() + this.A08.A1J());
                }
            }
            if (fromScrapOrHiddenOrCache && !this.A08.A0s.A07() && holder.A0l(8192)) {
                holder.A0V(0, 8192);
                if (this.A08.A0s.A0C) {
                    int offsetPosition = C4B.A00(holder) | 4096;
                    this.A08.A1n(holder, this.A08.A05.A08(this.A08.A0s, holder, offsetPosition, holder.A0M()));
                }
            }
            boolean z4 = false;
            boolean bound = this.A08.A0s.A07();
            if (bound) {
                boolean bound2 = holder.A0b();
                if (bound2) {
                    holder.A04 = i;
                    layoutParams = holder.A0H.getLayoutParams();
                    if (layoutParams != null) {
                        c4g = (C4G) this.A08.generateDefaultLayoutParams();
                        holder.A0H.setLayoutParams(c4g);
                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                        c4g = (C4G) this.A08.generateLayoutParams(layoutParams);
                        holder.A0H.setLayoutParams(c4g);
                    } else {
                        if (A0A[0].length() == 16) {
                            String[] strArr5 = A0A;
                            strArr5[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                            strArr5[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                            c4g = (C4G) layoutParams;
                        }
                        throw new RuntimeException();
                    }
                    c4g.A00 = holder;
                    c4g.A02 = (fromScrapOrHiddenOrCache || !z4) ? false : false;
                    return holder;
                }
            }
            if (!holder.A0b() || holder.A0h() || holder.A0c()) {
                z4 = A0E(holder, this.A08.A00.A0E(i), i, j);
            }
            layoutParams = holder.A0H.getLayoutParams();
            if (layoutParams != null) {
            }
            c4g.A00 = holder;
            c4g.A02 = (fromScrapOrHiddenOrCache || !z4) ? false : false;
            return holder;
        }
        throw new IndexOutOfBoundsException(A04(265, 22, 0) + i + A04(12, 1, 99) + i + A04(23, 14, 119) + this.A08.A0s.A03() + this.A08.A1J());
    }

    public final List<C4X> A0K() {
        return this.A07;
    }

    public final void A0L() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0N();
        }
        int i2 = this.A05.size();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A05.get(i3).A0N();
        }
        ArrayList<C4X> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int charAt = str.charAt(0);
        int scrapCount = str2.charAt(0);
        if (charAt != scrapCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int i4 = 0; i4 < changedScrapCount; i4++) {
                this.A02.get(i4).A0N();
            }
        }
    }

    public final void A0M() {
        this.A05.clear();
        ArrayList<C4X> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0N() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C4G c4g = (C4G) this.A06.get(i).A0H.getLayoutParams();
            if (c4g != null) {
                c4g.A01 = true;
            }
        }
    }

    public final void A0O() {
        if (this.A08.A04 != null && this.A08.A04.A0C()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                C4X c4x = this.A06.get(i);
                if (A0A[0].length() != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (c4x != null) {
                    c4x.A0U(6);
                    c4x.A0Z(null);
                }
            }
            return;
        }
        A07();
    }

    public final void A0P() {
        int i;
        if (this.A08.A06 != null) {
            C4F c4f = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i = c4f.A00;
            }
            throw new RuntimeException();
        }
        i = 0;
        this.A00 = this.A03 + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            int size2 = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int charAt = str.charAt(0);
            int i2 = str2.charAt(0);
            if (charAt != i2) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int i3 = this.A00;
            if (size2 > i3) {
                A08(size);
            } else {
                return;
            }
        }
    }

    public final void A0Q() {
        this.A05.clear();
        A07();
    }

    public final void A0R(int i) {
        this.A03 = i;
        A0P();
    }

    public final void A0S(int i, int i2) {
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            C4X c4x = this.A06.get(i3);
            if (c4x != null && c4x.A03 >= i) {
                c4x.A0X(i2, true);
            }
        }
    }

    public final void A0T(int end, int inBetweenOffset) {
        int cachedCount;
        int i;
        int i2;
        if (end < inBetweenOffset) {
            cachedCount = end;
            i = inBetweenOffset;
            i2 = -1;
        } else {
            cachedCount = inBetweenOffset;
            i = end;
            i2 = 1;
        }
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            C4X c4x = this.A06.get(i3);
            if (c4x != null && c4x.A03 >= cachedCount && c4x.A03 <= i) {
                int i4 = c4x.A03;
                String[] strArr = A0A;
                if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                if (i4 == end) {
                    c4x.A0X(inBetweenOffset - end, false);
                } else {
                    c4x.A0X(i2, false);
                }
            }
        }
    }

    public final void A0U(int cachedCount, int i) {
        int pos;
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C4X c4x = this.A06.get(size);
            if (c4x != null && (pos = c4x.A03) >= cachedCount && pos < i2) {
                c4x.A0U(2);
                A08(size);
            }
        }
    }

    public final void A0V(int cachedCount, int i, boolean z) {
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C4X c4x = this.A06.get(size);
            if (c4x != null) {
                if (c4x.A03 >= i2) {
                    c4x.A0X(-i, z);
                } else if (c4x.A03 >= cachedCount) {
                    c4x.A0U(8);
                    A08(size);
                }
            }
        }
    }

    public final void A0W(View view) {
        C4X A0G = ES.A0G(view);
        A0G.A0F = null;
        A0G.A0G = false;
        A0G.A0P();
        A0c(A0G);
    }

    public final void A0X(View view) {
        C4X A0G = ES.A0G(view);
        if (A0G.A0l(12) || !A0G.A0g() || this.A08.A21(A0G)) {
            boolean A0c = A0G.A0c();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!A0c || A0G.A0d() || this.A08.A04.A0C()) {
                A0G.A0Y(this, false);
                this.A05.add(A0G);
                return;
            }
            throw new IllegalArgumentException(A04(37, 122, 32) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0G.A0Y(this, true);
        this.A02.add(A0G);
    }

    public final void A0Y(View view) {
        C4X A0G = ES.A0G(view);
        if (A0G.A0f()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0G.A0e()) {
            A0G.A0T();
        } else if (A0G.A0j()) {
            A0G.A0P();
        }
        A0c(A0G);
    }

    public final void A0Z(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass432, boolean z) {
        A0Q();
        A0I().A09(anonymousClass43, anonymousClass432, z);
    }

    public final void A0a(C4M c4m) {
        C4M c4m2 = this.A01;
        if (c4m2 != null) {
            c4m2.A05();
        }
        this.A01 = c4m;
        if (c4m != null) {
            this.A01.A08(this.A08.getAdapter());
        }
    }

    public final void A0b(C4V c4v) {
        this.A04 = c4v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r5 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
        r0 = r10.A0l(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CAPPED_PER_SESSION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
        r2 = r9.A06.size();
        r0 = r9.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
        if (r2 < r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r2 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dd, code lost:
        A08(0);
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r0 = com.facebook.ads.redexgen.X.ES.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
        if (r2 <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
        r1 = r9.A08.A02;
        r0 = r10.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
        if (r1.A06(r0) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r2 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
        if (r9.A08.A02.A06(r9.A06.get(r2).A03) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0110, code lost:
        r9.A06.add(r2, r10);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0116, code lost:
        if (r7 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
        A0e(r10, true);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012d, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
        if (r5 > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0c(C4X c4x) {
        boolean A0A2;
        if (c4x.A0e() || c4x.A0H.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(A04(a.aU, 56, 52));
            sb.append(c4x.A0e());
            sb.append(A04(0, 12, 75));
            sb.append(c4x.A0H.getParent() != null);
            sb.append(this.A08.A1J());
            throw new IllegalArgumentException(sb.toString());
        }
        boolean A0f = c4x.A0f();
        String[] strArr = A0A;
        if (strArr[2].charAt(0) != strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[4] = "QZZbfikyhDCMiV1imXgamooHNWBI4VfH";
        strArr2[4] = "QZZbfikyhDCMiV1imXgamooHNWBI4VfH";
        if (!A0f) {
            if (c4x.A0i()) {
                throw new IllegalArgumentException(A04(aa.c.v, 110, 12) + this.A08.A1J());
            }
            A0A2 = c4x.A0A();
            boolean recycled = this.A08.A04 != null && A0A2 && this.A08.A04.A0D(c4x);
            boolean z = false;
            boolean z2 = false;
            if (!recycled) {
                boolean recycled2 = c4x.A0k();
            }
            int i = this.A00;
            String[] strArr3 = A0A;
            if (strArr3[2].charAt(0) != strArr3[1].charAt(0)) {
                String[] strArr4 = A0A;
                strArr4[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                strArr4[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
            } else {
                String[] strArr5 = A0A;
                strArr5[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                strArr5[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
            }
            this.A08.A0t.A0C(c4x);
            if (!z && !z2 && A0A2) {
                c4x.A08 = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(A04(343, 81, 79) + c4x + this.A08.A1J());
    }

    public final void A0d(C4X c4x) {
        boolean z;
        z = c4x.A0G;
        if (z) {
            this.A02.remove(c4x);
        } else {
            this.A05.remove(c4x);
        }
        c4x.A0F = null;
        c4x.A0G = false;
        c4x.A0P();
    }

    public final void A0e(C4X c4x, boolean z) {
        ES.A0u(c4x);
        if (c4x.A0l(16384)) {
            c4x.A0V(0, 16384);
            C2u.A0A(c4x.A0H, null);
        }
        if (z) {
            A0C(c4x);
        }
        c4x.A08 = null;
        A0I().A0A(c4x);
    }
}