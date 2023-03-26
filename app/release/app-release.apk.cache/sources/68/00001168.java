package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.p7700g.p99005.ax5;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Hs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0712Hs {
    public static byte[] A05;
    public static String[] A06;
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1235b0 A00 = C1235b0.A04;
    public final TreeSet<C1236b2> A04 = new TreeSet<>();

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{70, 0, 7, 15, 10, 3, 2, 72, 58, 110, 117, 58, 0, 55, 60, 51, ax5.a, 59, 60, 53, 114, 61, 52, 114};
    }

    public static void A03() {
        A06 = new String[]{"MBceJWRKAgeQJNY3ZRBdRhYJgpL3jkFQ", "518xlpwWcjlWASul8lHAahT8PqQVPF3u", "9RLjFZMlaqPSYVxgrCr3N29CAF4vaCFh", "Nd9PnywG3g8LluWsmNbg8PXBjZKSlX8G", "s", "C1TdeuC5gtnvKYkq95Rq", "MkXsOhuicHq9DXlwRCZefot2VxsvXJH1", "VJm3srbtmlXEw3gKHWc"};
    }

    public C0712Hs(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public static C0712Hs A00(int id, DataInputStream dataInputStream) throws IOException {
        C0712Hs c0712Hs = new C0712Hs(dataInputStream.readInt(), dataInputStream.readUTF());
        if (id < 2) {
            long readLong = dataInputStream.readLong();
            C0717Hx mutations = new C0717Hx();
            C0716Hw.A05(mutations, readLong);
            c0712Hs.A0G(mutations);
        } else {
            C1235b0 A00 = C1235b0.A00(dataInputStream);
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            strArr[1] = "w2ExrNvXNhLYBLEt12rGyqcfRXmaXRhw";
            c0712Hs.A00 = A00;
        }
        return c0712Hs;
    }

    public final int A04(int result) {
        int hashCode = (this.A02 * 31) + this.A03.hashCode();
        if (result < 2) {
            long A00 = C0716Hw.A00(this.A00);
            return (hashCode * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (hashCode * 31) + this.A00.hashCode();
    }

    public final long A05(long queryEndPosition, long currentEndPosition) {
        C1236b2 A07 = A07(queryEndPosition);
        if (A07.A01()) {
            long j = -Math.min(A07.A02() ? Long.MAX_VALUE : A07.A01, currentEndPosition);
            if (A06[3].charAt(14) != 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[7] = "ZNj15xTvoSD0UBJTiXr";
            strArr[5] = "u99g5dbJfvVcRXaISwTW";
            return j;
        }
        long j2 = queryEndPosition + currentEndPosition;
        long j3 = A07.A02 + A07.A01;
        if (j3 < j2) {
            for (C1236b2 c1236b2 : this.A04.tailSet(A07, false)) {
                if (c1236b2.A02 > j3) {
                    break;
                }
                j3 = Math.max(j3, c1236b2.A02 + c1236b2.A01);
                if (j3 >= j2) {
                    break;
                }
            }
        }
        return Math.min(j3 - queryEndPosition, currentEndPosition);
    }

    public final InterfaceC0715Hv A06() {
        return this.A00;
    }

    public final C1236b2 A07(long j) {
        C1236b2 A01 = C1236b2.A01(this.A03, j);
        C1236b2 floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j) {
            return floor;
        }
        C1236b2 ceiling = this.A04.ceiling(A01);
        if (ceiling == null) {
            return C1236b2.A02(this.A03, j);
        }
        return C1236b2.A03(this.A03, j, ceiling.A02 - j);
    }

    public final C1236b2 A08(C1236b2 c1236b2) throws C0703Hj {
        I1.A04(this.A04.remove(c1236b2));
        C1236b2 A08 = c1236b2.A08(this.A02);
        if (c1236b2.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new C0703Hj(A01(12, 12, 78) + c1236b2.A03 + A01(8, 4, 6) + A08.A03 + A01(0, 8, 122));
    }

    public final TreeSet<C1236b2> A09() {
        return this.A04;
    }

    public final void A0A(C1236b2 c1236b2) {
        this.A04.add(c1236b2);
    }

    public final void A0B(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A0A(dataOutputStream);
    }

    public final void A0C(boolean z) {
        this.A01 = z;
    }

    public final boolean A0D() {
        return this.A04.isEmpty();
    }

    public final boolean A0E() {
        return this.A01;
    }

    public final boolean A0F(C0709Hp c0709Hp) {
        if (this.A04.remove(c0709Hp)) {
            c0709Hp.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0G(C0717Hx c0717Hx) {
        C1235b0 c1235b0 = this.A00;
        this.A00 = this.A00.A09(c0717Hx);
        return !this.A00.equals(c1235b0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0712Hs c0712Hs = (C0712Hs) obj;
        if (this.A02 == c0712Hs.A02 && this.A03.equals(c0712Hs.A03)) {
            TreeSet<C1236b2> treeSet = this.A04;
            if (A06[4].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "qw9AeUbTiw";
            strArr[4] = "qw9AeUbTiw";
            if (treeSet.equals(c0712Hs.A04) && this.A00.equals(c0712Hs.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (A04(Integer.MAX_VALUE) * 31) + this.A04.hashCode();
    }
}