package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class EM {
    public static String[] A0B;
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<EL> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    static {
        A04();
    }

    public static void A04() {
        A0B = new String[]{"s27kRN", "abG5pKADna", "w2jztrB", "I7geUVX8H5XW4NGFgS7QGYJa3", "W37aGUNVZO5G", "W3qhVhIXcY", "2nbP2bKsNJFzfOABHc993I7Qj", "6HcftuEFFeXx4hy"};
    }

    public EM(long j, boolean z, boolean z2, boolean z3, List<EL> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public EM(Parcel parcel) {
        EL A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = EL.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public static EM A00(Parcel parcel) {
        return new EM(parcel);
    }

    public static /* synthetic */ EM A01(Parcel parcel) {
        return A00(parcel);
    }

    public static EM A02(IQ iq) {
        long A0N = iq.A0N();
        boolean autoReturn = (iq.A0F() & 128) != 0;
        boolean z = false;
        boolean z2 = false;
        long j = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int headerByte = 0;
        int i2 = 0;
        boolean z3 = false;
        long j2 = -9223372036854775807L;
        if (!autoReturn) {
            int A0F = iq.A0F();
            if (A0B[2].length() != 7) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[6] = "oYMFgXMCdR9ldlOsYeO";
            strArr[6] = "oYMFgXMCdR9ldlOsYeO";
            z = (A0F & 128) != 0;
            z2 = (A0F & 64) != 0;
            boolean z4 = (A0F & 32) != 0;
            if (z2) {
                j = iq.A0N();
            }
            if (!z2) {
                int A0F2 = iq.A0F();
                arrayList = new ArrayList(A0F2);
                for (int i3 = 0; i3 < A0F2; i3++) {
                    arrayList.add(new EL(iq.A0F(), iq.A0N(), null));
                }
            }
            if (z4) {
                int componentCount = iq.A0F();
                long j3 = componentCount;
                int i4 = ((128 & j3) > 0L ? 1 : ((128 & j3) == 0L ? 0 : -1));
                z3 = i4 != 0;
                long breakDuration90khz = ((1 & j3) << 32) | iq.A0N();
                j2 = (1000 * breakDuration90khz) / 90;
            }
            i = iq.A0J();
            headerByte = iq.A0F();
            i2 = iq.A0F();
        }
        return new EM(A0N, autoReturn, z, z2, arrayList, j, z3, j2, i, headerByte, i2);
    }

    public static /* synthetic */ EM A03(IQ iq) {
        return A02(iq);
    }

    public void A05(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A06(EM em, Parcel parcel) {
        em.A05(parcel);
    }
}