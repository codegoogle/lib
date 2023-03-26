package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ExceptionContainer.java */
/* loaded from: classes2.dex */
public class nm1 implements Parcelable {
    public static final Parcelable.Creator<nm1> CREATOR = new a();
    @x1
    private gc1 s;

    /* compiled from: ExceptionContainer.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<nm1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public nm1 createFromParcel(@x1 Parcel parcel) {
            return new nm1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public nm1[] newArray(int i) {
            return new nm1[i];
        }
    }

    public nm1(@x1 gc1 gc1Var) {
        this.s = gc1Var;
    }

    @x1
    public gc1 c() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeSerializable(this.s);
    }

    public nm1(@x1 Parcel parcel) {
        this.s = (gc1) r81.f((gc1) parcel.readSerializable());
    }
}