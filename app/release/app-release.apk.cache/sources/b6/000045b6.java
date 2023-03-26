package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: CarrierLoginEvent.java */
/* loaded from: classes.dex */
public class h21 implements Parcelable {
    @x1
    public static final Parcelable.Creator<h21> CREATOR = new a();
    @x1
    private final String s;

    /* compiled from: CarrierLoginEvent.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<h21> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h21 createFromParcel(@x1 Parcel parcel) {
            return new h21(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public h21[] newArray(int i) {
            return new h21[i];
        }
    }

    public h21(@x1 String str) {
        this.s = str;
    }

    @x1
    public String c() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
    }

    public h21(@x1 Parcel parcel) {
        this.s = parcel.readString();
    }
}