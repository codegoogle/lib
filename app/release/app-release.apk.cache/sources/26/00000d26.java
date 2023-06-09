package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0722Ic;
import com.facebook.ads.redexgen.X.EH;
import com.facebook.ads.redexgen.X.EI;
import com.facebook.ads.redexgen.X.IQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new EH();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<EI> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<EI> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(EI.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A08 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, EH eh) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(IQ iq, long j, C0722Ic c0722Ic) {
        long A0N = iq.A0N();
        boolean z = (iq.A0F() & 128) != 0;
        boolean z2 = false;
        boolean autoReturn = false;
        boolean spliceImmediateFlag = false;
        long programSplicePts = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        long j2 = -9223372036854775807L;
        if (!z) {
            int A0F = iq.A0F();
            z2 = (A0F & 128) != 0;
            autoReturn = (A0F & 64) != 0;
            boolean programSpliceFlag = (A0F & 32) != 0;
            spliceImmediateFlag = (A0F & 16) != 0;
            if (autoReturn && !spliceImmediateFlag) {
                programSplicePts = TimeSignalCommand.A00(iq, j);
            }
            if (!autoReturn) {
                int A0F2 = iq.A0F();
                emptyList = new ArrayList(A0F2);
                for (int i4 = 0; i4 < A0F2; i4++) {
                    int A0F3 = iq.A0F();
                    long j3 = -9223372036854775807L;
                    if (!spliceImmediateFlag) {
                        j3 = TimeSignalCommand.A00(iq, j);
                    }
                    long spliceEventId = j3;
                    emptyList.add(new EI(A0F3, spliceEventId, c0722Ic.A08(j3), null));
                }
            }
            if (programSpliceFlag) {
                long A0F4 = iq.A0F();
                z3 = (A0F4 & 128) != 0;
                j2 = (1000 * (((A0F4 & 1) << 32) | iq.A0N())) / 90;
            }
            i = iq.A0J();
            i2 = iq.A0F();
            i3 = iq.A0F();
        }
        return new SpliceInsertCommand(A0N, z, z2, autoReturn, spliceImmediateFlag, programSplicePts, c0722Ic.A08(programSplicePts), emptyList, z3, j2, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A07.get(i2).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}