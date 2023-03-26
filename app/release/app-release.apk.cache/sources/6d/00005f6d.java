package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: VpnErrorEvent.java */
/* loaded from: classes.dex */
public class u51 implements Parcelable {
    public static final Parcelable.Creator<u51> CREATOR = new a();
    @x1
    private final nm1 s;

    /* compiled from: VpnErrorEvent.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<u51> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public u51 createFromParcel(@x1 Parcel parcel) {
            return new u51(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public u51[] newArray(int i) {
            return new u51[i];
        }
    }

    public u51(@x1 gc1 gc1Var) {
        this.s = new nm1(gc1Var);
    }

    @x1
    public gc1 c() {
        return this.s.c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeParcelable(this.s, i);
    }

    public u51(@x1 Parcel parcel) {
        this.s = (nm1) parcel.readParcelable(nm1.class.getClassLoader());
    }
}