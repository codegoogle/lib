package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03803y {
    public static String[] A01;
    public final InterfaceC03793x A00;

    static {
        A01();
    }

    public static void A01() {
        A01 = new String[]{"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    }

    public C03803y(InterfaceC03793x interfaceC03793x) {
        this.A00 = interfaceC03793x;
    }

    private int A00(List<C03573a> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    private void A02(List<C03573a> list, int i, int i2) {
        C03573a c03573a = list.get(i);
        C03573a nextOp = list.get(i2);
        int i3 = nextOp.A00;
        if (i3 != 1) {
            if (i3 == 2) {
                A04(list, i, c03573a, i2, nextOp);
                return;
            } else if (i3 == 4) {
                A05(list, i, c03573a, i2, nextOp);
                return;
            } else {
                return;
            }
        }
        String[] strArr = A01;
        if (strArr[1].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aUQhN9RPINWHdtDS2haQB24BMlUHbr4B";
        strArr2[7] = "XOFwSchhjWWz78nEYYkf12AsjhBhdKRi";
        A03(list, i, c03573a, i2, nextOp);
    }

    private void A03(List<C03573a> list, int i, C03573a c03573a, int i2, C03573a c03573a2) {
        int i3 = 0;
        if (c03573a.A01 < c03573a2.A02) {
            i3 = 0 - 1;
        }
        if (c03573a.A02 < c03573a2.A02) {
            i3++;
        }
        if (c03573a2.A02 <= c03573a.A02) {
            c03573a.A02 += c03573a2.A01;
        }
        if (c03573a2.A02 <= c03573a.A01) {
            c03573a.A01 += c03573a2.A01;
        }
        c03573a2.A02 += i3;
        list.set(i, c03573a2);
        list.set(i2, c03573a);
    }

    private final void A04(List<C03573a> list, int i, C03573a c03573a, int i2, C03573a c03573a2) {
        boolean z;
        C03573a c03573a3 = null;
        boolean z2 = false;
        if (c03573a.A02 < c03573a.A01) {
            z = false;
            if (c03573a2.A02 == c03573a.A02 && c03573a2.A01 == c03573a.A01 - c03573a.A02) {
                z2 = true;
            }
        } else {
            z = true;
            if (c03573a2.A02 == c03573a.A01 + 1 && c03573a2.A01 == c03573a.A02 - c03573a.A01) {
                z2 = true;
            }
        }
        if (c03573a.A01 < c03573a2.A02) {
            c03573a2.A02--;
        } else if (c03573a.A01 < c03573a2.A02 + c03573a2.A01) {
            c03573a2.A01--;
            c03573a.A00 = 2;
            c03573a.A01 = 1;
            int i3 = c03573a2.A01;
            if (A01[6].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
            strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
            if (i3 == 0) {
                list.remove(i2);
                this.A00.AC8(c03573a2);
                return;
            }
            return;
        }
        if (c03573a.A02 <= c03573a2.A02) {
            c03573a2.A02++;
        } else if (c03573a.A02 < c03573a2.A02 + c03573a2.A01) {
            c03573a3 = this.A00.A8f(2, c03573a.A02 + 1, (c03573a2.A02 + c03573a2.A01) - c03573a.A02, null);
            c03573a2.A01 = c03573a.A02 - c03573a2.A02;
        }
        if (z2) {
            list.set(i, c03573a2);
            list.remove(i2);
            this.A00.AC8(c03573a);
            return;
        }
        if (z) {
            if (c03573a3 != null) {
                if (c03573a.A02 > c03573a3.A02) {
                    c03573a.A02 -= c03573a3.A01;
                }
                if (c03573a.A01 > c03573a3.A02) {
                    c03573a.A01 -= c03573a3.A01;
                }
            }
            if (c03573a.A02 > c03573a2.A02) {
                c03573a.A02 -= c03573a2.A01;
            }
            if (c03573a.A01 > c03573a2.A02) {
                c03573a.A01 -= c03573a2.A01;
            }
        } else {
            if (c03573a3 != null) {
                if (c03573a.A02 >= c03573a3.A02) {
                    c03573a.A02 -= c03573a3.A01;
                }
                if (c03573a.A01 >= c03573a3.A02) {
                    c03573a.A01 -= c03573a3.A01;
                }
            }
            if (c03573a.A02 >= c03573a2.A02) {
                c03573a.A02 -= c03573a2.A01;
            }
            if (c03573a.A01 >= c03573a2.A02) {
                c03573a.A01 -= c03573a2.A01;
            }
        }
        list.set(i, c03573a2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c03573a.A02 != c03573a.A01) {
            list.set(i2, c03573a);
        } else {
            list.remove(i2);
        }
        if (c03573a3 != null) {
            list.add(i, c03573a3);
        }
    }

    private final void A05(List<C03573a> list, int i, C03573a c03573a, int i2, C03573a c03573a2) {
        C03573a c03573a3 = null;
        C03573a c03573a4 = null;
        if (c03573a.A01 < c03573a2.A02) {
            c03573a2.A02--;
        } else if (c03573a.A01 < c03573a2.A02 + c03573a2.A01) {
            c03573a2.A01--;
            c03573a3 = this.A00.A8f(4, c03573a.A02, 1, c03573a2.A03);
        }
        if (c03573a.A02 <= c03573a2.A02) {
            c03573a2.A02++;
        } else if (c03573a.A02 < c03573a2.A02 + c03573a2.A01) {
            int i3 = (c03573a2.A02 + c03573a2.A01) - c03573a.A02;
            c03573a4 = this.A00.A8f(4, c03573a.A02 + 1, i3, c03573a2.A03);
            c03573a2.A01 -= i3;
        }
        list.set(i2, c03573a);
        if (c03573a2.A01 > 0) {
            list.set(i, c03573a2);
        } else {
            list.remove(i);
            this.A00.AC8(c03573a2);
        }
        if (c03573a3 != null) {
            list.add(i, c03573a3);
        }
        if (c03573a4 != null) {
            list.add(i, c03573a4);
        }
    }

    public final void A06(List<C03573a> list) {
        while (true) {
            int A00 = A00(list);
            if (A00 != -1) {
                A02(list, A00, A00 + 1);
            } else {
                return;
            }
        }
    }
}