package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.bx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SS implements InterfaceC03793x {
    public static byte[] A08;
    public static String[] A09;
    public int A00;
    public C2Q<C03573a> A01;
    public final C3Z A02;
    public final C03803y A03;
    public final Runnable A04;
    public final ArrayList<C03573a> A05;
    public final ArrayList<C03573a> A06;
    public final boolean A07;

    static {
        A04();
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, bx.l7, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, bx.l7, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, bx.l7, -123, -43, -58, -40, -40, -24, -23, -103, -20, bx.j7, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, 19, 26, 32, 23, 15, -53, 25, 26, 31, -53, 15, 20, 30, 27, 12, 31, 14, 19, -53, 12, 15, 15, -53, 26, 29, -53, 24, 26, 33, 16, -53, 17, 26, 29, -53, 27, 29, 16, -53, 23, 12, 36, 26, 32, 31};
    }

    public static void A04() {
        A09 = new String[]{"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    }

    public SS(C3Z c3z) {
        this(c3z, false);
    }

    public SS(C3Z c3z, boolean z) {
        this.A01 = new SA(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = c3z;
        this.A07 = z;
        this.A03 = new C03803y(this);
    }

    private int A00(int i, int start) {
        int i2;
        int i3;
        for (int end = this.A06.size() - 1; end >= 0; end--) {
            C03573a c03573a = this.A06.get(end);
            if (c03573a.A00 == 8) {
                if (c03573a.A02 < c03573a.A01) {
                    i2 = c03573a.A02;
                    i3 = c03573a.A01;
                } else {
                    i2 = c03573a.A01;
                    i3 = c03573a.A02;
                }
                if (i >= i2 && i <= i3) {
                    if (i2 == c03573a.A02) {
                        if (start == 1) {
                            c03573a.A01++;
                        } else if (start == 2) {
                            c03573a.A01--;
                        }
                        i++;
                    } else {
                        if (start == 1) {
                            c03573a.A02++;
                        } else if (start == 2) {
                            c03573a.A02--;
                        }
                        i--;
                    }
                } else if (i < c03573a.A02) {
                    if (start == 1) {
                        c03573a.A02++;
                        c03573a.A01++;
                    } else if (start == 2) {
                        c03573a.A02--;
                        c03573a.A01--;
                    }
                }
            } else if (c03573a.A02 <= i) {
                if (c03573a.A00 == 1) {
                    int i4 = c03573a.A01;
                    if (A09[7].length() != 4) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A09;
                    strArr[7] = "N0sU";
                    strArr[7] = "N0sU";
                    i -= i4;
                } else if (c03573a.A00 == 2) {
                    i += c03573a.A01;
                }
            } else if (start == 1) {
                c03573a.A02++;
            } else if (start == 2) {
                c03573a.A02--;
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C03573a c03573a2 = this.A06.get(size);
            if (c03573a2.A00 == 8) {
                if (c03573a2.A01 == c03573a2.A02 || c03573a2.A01 < 0) {
                    this.A06.remove(size);
                    AC8(c03573a2);
                }
            } else if (c03573a2.A01 <= 0) {
                this.A06.remove(size);
                AC8(c03573a2);
            }
        }
        return i;
    }

    private final int A01(int i, int i2) {
        int size = this.A06.size();
        while (i2 < size) {
            C03573a c03573a = this.A06.get(i2);
            if (c03573a.A00 == 8) {
                if (c03573a.A02 == i) {
                    i = c03573a.A01;
                } else {
                    if (c03573a.A02 < i) {
                        i--;
                    }
                    if (c03573a.A01 <= i) {
                        i++;
                    }
                }
            } else if (c03573a.A02 > i) {
                continue;
            } else if (c03573a.A00 == 2) {
                if (i < c03573a.A02 + c03573a.A01) {
                    return -1;
                }
                i -= c03573a.A01;
            } else {
                int i3 = c03573a.A00;
                String[] strArr = A09;
                if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                strArr2[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                if (i3 == 1) {
                    i += c03573a.A01;
                }
            }
            i2++;
        }
        return i;
    }

    private void A05(C03573a c03573a) {
        A0A(c03573a);
    }

    private void A06(C03573a c03573a) {
        A0A(c03573a);
    }

    private void A07(C03573a c03573a) {
        int tmpEnd = c03573a.A02;
        int type = 0;
        int position = c03573a.A02 + c03573a.A01;
        char c = 65535;
        int i = c03573a.A02;
        while (i < position) {
            boolean z = false;
            if (this.A02.A57(i) != null || A0D(i)) {
                if (c == 0) {
                    A09(A8f(2, tmpEnd, type, null));
                    z = true;
                }
                c = 1;
            } else {
                if (c == 1) {
                    C03573a newOp = A8f(2, tmpEnd, type, null);
                    A0A(newOp);
                    z = true;
                }
                c = 0;
            }
            if (z) {
                i -= type;
                position -= type;
                type = 1;
            } else {
                type++;
            }
            i++;
        }
        if (type != c03573a.A01) {
            AC8(c03573a);
            c03573a = A8f(2, tmpEnd, type, null);
        }
        if (c == 0) {
            A09(c03573a);
        } else {
            A0A(c03573a);
        }
    }

    private void A08(C03573a c03573a) {
        int tmpEnd = c03573a.A02;
        int type = 0;
        int position = c03573a.A02 + c03573a.A01;
        char c = 65535;
        int i = c03573a.A02;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            strArr2[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (i < position) {
                if (this.A02.A57(i) != null || A0D(i)) {
                    if (c == 0) {
                        A09(A8f(4, tmpEnd, type, c03573a.A03));
                        type = 0;
                        tmpEnd = i;
                    }
                    c = 1;
                } else {
                    if (c == 1) {
                        C03573a newOp = A8f(4, tmpEnd, type, c03573a.A03);
                        A0A(newOp);
                        type = 0;
                        tmpEnd = i;
                    }
                    c = 0;
                }
                type++;
                i++;
            } else {
                if (type != c03573a.A01) {
                    Object obj = c03573a.A03;
                    AC8(c03573a);
                    c03573a = A8f(4, tmpEnd, type, obj);
                }
                if (c == 0) {
                    A09(c03573a);
                    return;
                } else {
                    A0A(c03573a);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(C03573a c03573a) {
        int i;
        int i2;
        int updatedPos;
        int pos;
        if (c03573a.A00 != 1) {
            int i3 = c03573a.A00;
            if (A09[4].length() == 28) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "fuh7";
            strArr[7] = "fuh7";
            if (i3 != 8) {
                int A00 = A00(c03573a.A02, c03573a.A00);
                int i4 = 1;
                int i5 = c03573a.A02;
                int offsetPositionForPartial = c03573a.A00;
                if (offsetPositionForPartial == 2) {
                    i = 0;
                } else if (offsetPositionForPartial == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException(A02(85, 30, 55) + c03573a);
                }
                int positionMultiplier = 1;
                while (true) {
                    int i6 = c03573a.A01;
                    int tmpCnt = A09[1].length();
                    if (tmpCnt != 31) {
                        if (positionMultiplier >= i6) {
                            break;
                        }
                        int tmpCnt2 = c03573a.A02;
                        int p = i * positionMultiplier;
                        int pos2 = tmpCnt2 + p;
                        int p2 = c03573a.A00;
                        int A002 = A00(pos2, p2);
                        i2 = 0;
                        updatedPos = c03573a.A00;
                        if (updatedPos != 2) {
                            pos = A002 == A00 ? 1 : 0;
                            i2 = pos;
                        } else if (updatedPos == 4) {
                            pos = A002 == A00 + 1 ? 1 : 0;
                            i2 = pos;
                        }
                        if (i2 == 0) {
                            i4++;
                        } else {
                            C03573a A8f = A8f(c03573a.A00, A00, i4, c03573a.A03);
                            A0B(A8f, i5);
                            AC8(A8f);
                            if (c03573a.A00 == 4) {
                                i5 += i4;
                            }
                            A00 = A002;
                            if (A09[0].charAt(28) != 'A') {
                                i4 = 1;
                            } else {
                                String[] strArr2 = A09;
                                strArr2[3] = "EcOQEIn9Q5XvTjS6SUXoeHtz7oIrLcgt";
                                strArr2[2] = "qdxRTeDYAvuRxJ3EQmMRRmoNV8wrEDZm";
                                i4 = 1;
                            }
                        }
                        positionMultiplier++;
                    } else {
                        String[] strArr3 = A09;
                        strArr3[4] = "Sd1L0VSyo86shE8ew7ry1Omr";
                        strArr3[4] = "Sd1L0VSyo86shE8ew7ry1Omr";
                        if (positionMultiplier >= i6) {
                            break;
                        }
                        int tmpCnt22 = c03573a.A02;
                        int p3 = i * positionMultiplier;
                        int pos22 = tmpCnt22 + p3;
                        int p22 = c03573a.A00;
                        int A0022 = A00(pos22, p22);
                        i2 = 0;
                        updatedPos = c03573a.A00;
                        if (updatedPos != 2) {
                        }
                        if (i2 == 0) {
                        }
                        positionMultiplier++;
                    }
                }
                Object obj = c03573a.A03;
                AC8(c03573a);
                if (i4 > 0) {
                    C03573a A8f2 = A8f(c03573a.A00, A00, i4, obj);
                    A0B(A8f2, i5);
                    AC8(A8f2);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(A02(115, 46, 105));
    }

    private void A0A(C03573a c03573a) {
        this.A06.add(c03573a);
        int i = c03573a.A00;
        if (i == 1) {
            this.A02.A8g(c03573a.A02, c03573a.A01);
        } else if (i == 2) {
            this.A02.A8j(c03573a.A02, c03573a.A01);
        } else if (i == 4) {
            this.A02.A8S(c03573a.A02, c03573a.A01, c03573a.A03);
        } else if (i == 8) {
            this.A02.A8h(c03573a.A02, c03573a.A01);
        } else {
            throw new IllegalArgumentException(A02(0, 27, 5) + c03573a);
        }
    }

    private final void A0B(C03573a c03573a, int i) {
        this.A02.A9K(c03573a);
        int i2 = c03573a.A00;
        if (i2 == 2) {
            this.A02.A8i(i, c03573a.A01);
        } else if (i2 == 4) {
            this.A02.A8S(i, c03573a.A01, c03573a.A03);
        } else {
            throw new IllegalArgumentException(A02(27, 58, 35));
        }
    }

    private final void A0C(List<C03573a> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AC8(list.get(i));
        }
        list.clear();
    }

    private boolean A0D(int i) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C03573a c03573a = this.A06.get(pos);
            if (c03573a.A00 == 8) {
                if (A01(c03573a.A01, pos + 1) == i) {
                    return true;
                }
            } else {
                int i2 = c03573a.A00;
                if (A09[4].length() != 28) {
                    String[] strArr = A09;
                    strArr[7] = "h3FT";
                    strArr[7] = "h3FT";
                    if (i2 == 1) {
                        int i3 = c03573a.A02 + c03573a.A01;
                        for (int i4 = c03573a.A02; i4 < i3; i4++) {
                            if (A01(i4, pos + 1) == i) {
                                return true;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return false;
    }

    public final int A0E(int i) {
        return A01(i, 0);
    }

    public final int A0F(int i) {
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C03573a c03573a = this.A05.get(i2);
            int i3 = c03573a.A00;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (c03573a.A02 == i) {
                            i = c03573a.A01;
                        } else {
                            if (c03573a.A02 < i) {
                                i--;
                            }
                            if (c03573a.A01 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c03573a.A02 > i) {
                    continue;
                } else if (c03573a.A02 + c03573a.A01 > i) {
                    return -1;
                } else {
                    i -= c03573a.A01;
                }
            } else if (c03573a.A02 <= i) {
                i += c03573a.A01;
            }
        }
        return i;
    }

    public final void A0G() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A02.A9M(this.A06.get(i));
        }
        A0C(this.A06);
        this.A00 = 0;
    }

    public final void A0H() {
        A0G();
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C03573a c03573a = this.A05.get(i);
            int i2 = c03573a.A00;
            if (i2 == 1) {
                this.A02.A9M(c03573a);
                C3Z c3z = this.A02;
                int i3 = c03573a.A02;
                int i4 = c03573a.A01;
                c3z.A8g(i3, i4);
            } else if (i2 == 2) {
                this.A02.A9M(c03573a);
                C3Z c3z2 = this.A02;
                int i5 = c03573a.A02;
                int i6 = c03573a.A01;
                if (A09[0].charAt(28) != 'A') {
                    String[] strArr = A09;
                    strArr[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    strArr[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    c3z2.A8i(i5, i6);
                } else {
                    String[] strArr2 = A09;
                    strArr2[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    strArr2[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    c3z2.A8i(i5, i6);
                }
            } else if (i2 == 4) {
                this.A02.A9M(c03573a);
                C3Z c3z3 = this.A02;
                int i7 = c03573a.A02;
                int i8 = c03573a.A01;
                if (A09[0].charAt(28) != 'A') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A09;
                strArr3[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                strArr3[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                c3z3.A8S(i7, i8, c03573a.A03);
            } else if (i2 == 8) {
                this.A02.A9M(c03573a);
                C3Z c3z4 = this.A02;
                int i9 = c03573a.A02;
                int i10 = c03573a.A01;
                c3z4.A8h(i9, i10);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        A0C(this.A05);
        this.A00 = 0;
    }

    public final void A0I() {
        this.A03.A06(this.A05);
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C03573a c03573a = this.A05.get(i);
            int i2 = c03573a.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i3 = str.charAt(31);
            if (i3 != str2.charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            strArr2[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            if (i2 == 1) {
                A05(c03573a);
            } else if (i2 == 2) {
                A07(c03573a);
            } else if (i2 == 4) {
                A08(c03573a);
            } else if (i2 == 8) {
                A06(c03573a);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0J() {
        A0C(this.A05);
        A0C(this.A06);
        this.A00 = 0;
    }

    public final boolean A0K() {
        return this.A05.size() > 0;
    }

    public final boolean A0L() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0M(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03793x
    public final C03573a A8f(int i, int i2, int i3, Object obj) {
        C03573a A2P = this.A01.A2P();
        if (A2P == null) {
            return new C03573a(i, i2, i3, obj);
        }
        A2P.A00 = i;
        A2P.A02 = i2;
        A2P.A01 = i3;
        A2P.A03 = obj;
        return A2P;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03793x
    public final void AC8(C03573a c03573a) {
        if (!this.A07) {
            c03573a.A03 = null;
            this.A01.ACG(c03573a);
        }
    }
}