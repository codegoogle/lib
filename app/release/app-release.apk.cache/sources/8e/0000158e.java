package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public class ZC implements DY {
    public static String[] A05;
    public final int A00;
    public final /* synthetic */ ZD A04;
    public final IP A03 = new IP(new byte[5]);
    public final SparseArray<InterfaceC0601Df> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    static {
        A01();
    }

    public static void A01() {
        A05 = new String[]{"RGyTh4SpGx69CnC3uYB0gmKqWWTNP", "iDg", "j2BD3qxwlCatqD2Ch8dsr4SydA7XKwXL", "m1LAn1cIXYa33UPzElI", "cPJKdoCFMTZnGOgvNAg6pI", "iUx5cAJ8Ufw2U1Fp6uB6P", "qd", "YeOgnvzSUR8"};
    }

    public ZC(ZD zd, int i) {
        this.A04 = zd;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r3 == 122) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        r7 = org.xbill.DNS.WKSRecord.Service.LOC_SRV;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        if (r3 == 122) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r3 != 123) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r7 = org.xbill.DNS.WKSRecord.Service.NETBIOS_DGM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r3 != 10) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
        r6 = r13.A0T(3).trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r3 != 89) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r7 = 89;
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
        if (r13.A07() >= r10) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
        r4 = r13.A0T(3).trim();
        r3 = r13.A0F();
        r1 = new byte[4];
        r13.A0d(r1, 0, 4);
        r5.add(new com.facebook.ads.redexgen.X.C0597Db(r4, r3, r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0598Dc A00(IQ iq, int i) {
        long j;
        long j2;
        long j3;
        int A07 = iq.A07();
        int i2 = A07 + i;
        int descriptorTag = -1;
        String str = null;
        ArrayList arrayList = null;
        while (iq.A07() < i2) {
            int A0F = iq.A0F();
            int A072 = iq.A07() + iq.A0F();
            if (A0F == 5) {
                long A0N = iq.A0N();
                j = ZD.A0F;
                if (A0N == j) {
                    descriptorTag = 129;
                } else {
                    j2 = ZD.A0G;
                    if (A0N == j2) {
                        descriptorTag = WKSRecord.Service.LOC_SRV;
                    } else {
                        j3 = ZD.A0H;
                        if (A0N == j3) {
                            descriptorTag = 36;
                        }
                    }
                }
            } else {
                String[] strArr = A05;
                if (strArr[5].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[5] = "0iRHlmeNaIWOYOZ0wuzrf";
                strArr2[7] = "tRWtYFFxRJJ";
                if (A0F == 106) {
                    descriptorTag = 129;
                } else if (A05[2].charAt(6) != 'x') {
                    String[] strArr3 = A05;
                    strArr3[2] = "1wLlXhx7j4gWLvUCKIdOcZbAVKCqpjoE";
                    strArr3[2] = "1wLlXhx7j4gWLvUCKIdOcZbAVKCqpjoE";
                } else {
                    String[] strArr4 = A05;
                    strArr4[5] = "yxMQjgWbjbckRLnQ6dtKu";
                    strArr4[7] = "lY9rZIuJvHs";
                }
            }
            iq.A0a(A072 - iq.A07());
        }
        iq.A0Z(i2);
        return new C0598Dc(descriptorTag, str, arrayList, Arrays.copyOfRange(iq.A00, A07, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    @Override // com.facebook.ads.redexgen.X.DY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A48(IQ iq) {
        int i;
        List list;
        C0722Ic c0722Ic;
        int programNumber;
        int A052;
        int size;
        int i2;
        int i3;
        SparseArray sparseArray;
        int i4;
        int i5;
        int i6;
        CM cm;
        boolean z;
        CM cm2;
        SparseBooleanArray sparseBooleanArray;
        InterfaceC0601Df interfaceC0601Df;
        SparseArray sparseArray2;
        CM cm3;
        int esInfoLength;
        SparseBooleanArray sparseBooleanArray2;
        int trackId;
        InterfaceC0599Dd interfaceC0599Dd;
        InterfaceC0601Df A4O;
        int i7;
        InterfaceC0601Df interfaceC0601Df2;
        InterfaceC0599Dd interfaceC0599Dd2;
        InterfaceC0601Df interfaceC0601Df3;
        CM cm4;
        int i8;
        int i9;
        List list2;
        List list3;
        if (iq.A0F() != 2) {
            return;
        }
        i = this.A04.A05;
        if (i != 1) {
            i8 = this.A04.A05;
            if (i8 != 2) {
                i9 = this.A04.A01;
                if (i9 != 1) {
                    list2 = this.A04.A0B;
                    c0722Ic = new C0722Ic(((C0722Ic) list2.get(0)).A04());
                    list3 = this.A04.A0B;
                    list3.add(c0722Ic);
                    iq.A0a(2);
                    int A0J = iq.A0J();
                    int i10 = 5;
                    iq.A0a(5);
                    iq.A0b(this.A03, 2);
                    int i11 = 4;
                    this.A03.A09(4);
                    int i12 = 12;
                    int programNumber2 = this.A03.A05(12);
                    iq.A0a(programNumber2);
                    programNumber = this.A04.A05;
                    int programInfoLength = 21;
                    if (programNumber == 2) {
                        interfaceC0601Df2 = this.A04.A03;
                        if (interfaceC0601Df2 == null) {
                            C0598Dc c0598Dc = new C0598Dc(21, null, null, new byte[0]);
                            ZD zd = this.A04;
                            interfaceC0599Dd2 = zd.A09;
                            zd.A03 = interfaceC0599Dd2.A4O(21, c0598Dc);
                            interfaceC0601Df3 = this.A04.A03;
                            cm4 = this.A04.A02;
                            interfaceC0601Df3.A7S(c0722Ic, cm4, new C0600De(A0J, 21, 8192));
                        }
                    }
                    this.A01.clear();
                    this.A02.clear();
                    A052 = iq.A05();
                    while (A052 > 0) {
                        iq.A0b(this.A03, i10);
                        int A053 = this.A03.A05(8);
                        this.A03.A09(3);
                        int A054 = this.A03.A05(13);
                        this.A03.A09(i11);
                        int A055 = this.A03.A05(i12);
                        C0598Dc A00 = A00(iq, A055);
                        if (A053 == 6) {
                            A053 = A00.A00;
                        }
                        int esInfoLength2 = A055 + 5;
                        A052 -= esInfoLength2;
                        esInfoLength = this.A04.A05;
                        int i13 = esInfoLength == 2 ? A053 : A054;
                        sparseBooleanArray2 = this.A04.A07;
                        if (!sparseBooleanArray2.get(i13)) {
                            trackId = this.A04.A05;
                            if (trackId != 2 || A053 != programInfoLength) {
                                ZD zd2 = this.A04;
                                String[] strArr = A05;
                                String str = strArr[0];
                                String str2 = strArr[1];
                                int programInfoLength2 = str.length();
                                if (programInfoLength2 == str2.length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A05;
                                strArr2[5] = "uMTX0BK3hwRt9LI9TXEhN";
                                strArr2[7] = "Q6yhhKO6s7v";
                                interfaceC0599Dd = zd2.A09;
                                A4O = interfaceC0599Dd.A4O(A053, A00);
                            } else {
                                A4O = this.A04.A03;
                            }
                            i7 = this.A04.A05;
                            if (i7 != 2 || A054 < this.A02.get(i13, 8192)) {
                                SparseIntArray sparseIntArray = this.A02;
                                int programInfoLength3 = A05[4].length();
                                if (programInfoLength3 == 17) {
                                    throw new RuntimeException();
                                }
                                String[] strArr3 = A05;
                                strArr3[3] = "hYuW2ZxScZvjOUyRYzD";
                                strArr3[3] = "hYuW2ZxScZvjOUyRYzD";
                                sparseIntArray.put(i13, A054);
                                this.A01.put(i13, A4O);
                            }
                        }
                        i10 = 5;
                        i11 = 4;
                        i12 = 12;
                        programInfoLength = 21;
                    }
                    size = this.A02.size();
                    for (i2 = 0; i2 < size; i2++) {
                        int keyAt = this.A02.keyAt(i2);
                        sparseBooleanArray = this.A04.A07;
                        sparseBooleanArray.put(keyAt, true);
                        InterfaceC0601Df valueAt = this.A01.valueAt(i2);
                        if (valueAt != null) {
                            interfaceC0601Df = this.A04.A03;
                            if (valueAt != interfaceC0601Df) {
                                cm3 = this.A04.A02;
                                valueAt.A7S(c0722Ic, cm3, new C0600De(A0J, keyAt, 8192));
                            }
                            sparseArray2 = this.A04.A06;
                            int trackIdCount = this.A02.valueAt(i2);
                            sparseArray2.put(trackIdCount, valueAt);
                        }
                    }
                    i3 = this.A04.A05;
                    if (i3 == 2) {
                        int i14 = 0;
                        sparseArray = this.A04.A06;
                        int programInfoLength4 = this.A00;
                        sparseArray.remove(programInfoLength4);
                        ZD zd3 = this.A04;
                        i4 = zd3.A05;
                        if (i4 != 1) {
                            i5 = this.A04.A01;
                            i14 = i5 - 1;
                        }
                        zd3.A01 = i14;
                        i6 = this.A04.A01;
                        if (i6 != 0) {
                            return;
                        }
                        cm = this.A04.A02;
                        cm.A4w();
                        this.A04.A04 = true;
                        return;
                    }
                    z = this.A04.A04;
                    if (z) {
                        return;
                    }
                    cm2 = this.A04.A02;
                    cm2.A4w();
                    this.A04.A01 = 0;
                    this.A04.A04 = true;
                    return;
                }
            }
        }
        list = this.A04.A0B;
        c0722Ic = (C0722Ic) list.get(0);
        iq.A0a(2);
        int A0J2 = iq.A0J();
        int i102 = 5;
        iq.A0a(5);
        iq.A0b(this.A03, 2);
        int i112 = 4;
        this.A03.A09(4);
        int i122 = 12;
        int programNumber22 = this.A03.A05(12);
        iq.A0a(programNumber22);
        programNumber = this.A04.A05;
        int programInfoLength5 = 21;
        if (programNumber == 2) {
        }
        this.A01.clear();
        this.A02.clear();
        A052 = iq.A05();
        while (A052 > 0) {
        }
        size = this.A02.size();
        while (i2 < size) {
        }
        i3 = this.A04.A05;
        if (i3 == 2) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A7S(C0722Ic c0722Ic, CM cm, C0600De c0600De) {
    }
}