package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1147Yw implements InterfaceC0599Dd {
    public static byte[] A02;
    public static String[] A03;
    public final int A00;
    public final List<Format> A01;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -118, -116, -120, 84, 93, 87, 95, -114, -99, -99, -103, -106, -112, -114, -95, -106, -100, -101, 92, -112, -110, -114, 90, 100, 93, 101};
    }

    public static void A03() {
        A03 = new String[]{"ggGLmhyInJSffjkfPU8VRn", "WisLA7DCjwWBxH7MqLlw8w9Z4gicIVYK", "baeaQjGS5RYnakDSUMD4HiL2ABi7hiKM", "QvfNkpkg0VH", "dkSLNeeU5ck3Twa6KyaCdOuwvlu7l8iW", "e6Ade", "C9ShSy7zMtGRXyHgR8PAzFWulvZi4KLP", "w2lskP6GH6NJyN70rzATNYjf2L9mjjHA"};
    }

    public C1147Yw() {
        this(0);
    }

    public C1147Yw(int i) {
        this(i, Collections.emptyList());
    }

    public C1147Yw(int i, List<Format> list) {
        this.A00 = i;
        if (!A04(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 33), 0, null));
        }
        this.A01 = list;
    }

    private DZ A00(C0598Dc c0598Dc) {
        String A01;
        int i;
        if (A04(32)) {
            return new DZ(this.A01);
        }
        IQ iq = new IQ(c0598Dc.A03);
        List<Format> list = this.A01;
        while (true) {
            int A05 = iq.A05();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "9wGqNU4xey1NmHgGithGb88lbeAMl0Qa";
            strArr2[5] = "Me3yU";
            if (A05 > 0) {
                int descriptorLength = iq.A0F();
                int descriptorTag = iq.A0F();
                int A07 = iq.A07() + descriptorTag;
                if (descriptorLength == 134) {
                    list = new ArrayList<>();
                    int nextDescriptorPosition = iq.A0F();
                    int i2 = nextDescriptorPosition & 31;
                    for (int accessibilityChannel = 0; accessibilityChannel < i2; accessibilityChannel++) {
                        String A0T = iq.A0T(3);
                        int A0F = iq.A0F();
                        int captionTypeByte = A0F & 128;
                        int captionTypeByte2 = captionTypeByte != 0 ? 1 : 0;
                        if (captionTypeByte2 != 0) {
                            A01 = A01(19, 19, 39);
                            i = A0F & 63;
                        } else {
                            A01 = A01(0, 19, 33);
                            i = 1;
                        }
                        list.add(Format.A08(null, A01, null, -1, 0, A0T, i, null));
                        iq.A0a(2);
                    }
                }
                iq.A0Z(A07);
            } else {
                return new DZ(list);
            }
        }
    }

    private boolean A04(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0599Dd
    public final SparseArray<InterfaceC0601Df> A4J() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0599Dd
    public final InterfaceC0601Df A4O(int i, C0598Dc c0598Dc) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new Z5(new Z4(c0598Dc.A01));
            }
            if (i == 15) {
                if (A04(2)) {
                    return null;
                }
                return new Z5(new C1146Yv(false, c0598Dc.A01));
            } else if (i == 17) {
                if (A04(2)) {
                    return null;
                }
                return new Z5(new Z3(c0598Dc.A01));
            } else if (i != 21) {
                if (i == 27) {
                    if (A04(4)) {
                        return null;
                    }
                    return new Z5(new Z0(A00(c0598Dc), A04(1), A04(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 129) {
                                if (i != 130) {
                                    if (A03[7].charAt(7) != 'G') {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr = A03;
                                    strArr[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                                    strArr[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                                    if (i == 134) {
                                        if (A04(16)) {
                                            return null;
                                        }
                                        return new Z8(new Z9());
                                    } else if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new Z5(new C1143Ys(c0598Dc.A01));
                        }
                        return new Z5(new C1148Yx(c0598Dc.A01));
                    }
                    return new Z5(new C1149Yy(c0598Dc.A02));
                } else {
                    return new Z5(new Z1(A00(c0598Dc)));
                }
            } else {
                return new Z5(new Z2());
            }
        }
        return new Z5(new C1150Yz());
    }
}