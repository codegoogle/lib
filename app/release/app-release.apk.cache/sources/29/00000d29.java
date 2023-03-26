package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0722Ic;
import com.facebook.ads.redexgen.X.EN;
import com.facebook.ads.redexgen.X.IQ;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new EN();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, EN en) {
        this(j, j2);
    }

    public static long A00(IQ iq, long j) {
        long A0F = iq.A0F();
        if ((128 & A0F) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0F;
        return (((ptsTime << 32) | iq.A0N()) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(IQ iq, long j, C0722Ic c0722Ic) {
        long A00 = A00(iq, j);
        return new TimeSignalCommand(A00, c0722Ic.A08(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}