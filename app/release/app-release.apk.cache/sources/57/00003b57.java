package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: TrafficStats.java */
/* loaded from: classes2.dex */
public class bn1 implements Parcelable {
    public static final Parcelable.Creator<bn1> CREATOR = new a();
    private final long s;
    private final long t;

    /* compiled from: TrafficStats.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<bn1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public bn1 createFromParcel(@x1 Parcel parcel) {
            return new bn1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public bn1[] newArray(int i) {
            return new bn1[i];
        }
    }

    public bn1(long j, long j2) {
        this.s = j2;
        this.t = j;
    }

    public long c() {
        return this.s;
    }

    public long d() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("TrafficStats{bytesRx=");
        G.append(this.s);
        G.append(", bytesTx=");
        G.append(this.t);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeLong(this.s);
        parcel.writeLong(this.t);
    }

    public bn1(@x1 Parcel parcel) {
        this.s = parcel.readLong();
        this.t = parcel.readLong();
    }
}