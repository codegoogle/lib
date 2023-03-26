package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: HydraPTM.java */
/* loaded from: classes2.dex */
public class ug1 implements Parcelable {
    public static final Parcelable.Creator<ug1> CREATOR = new a();
    @x1
    private final String s;
    @z1
    private final String t;

    /* compiled from: HydraPTM.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<ug1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public ug1 createFromParcel(@x1 Parcel parcel) {
            return new ug1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public ug1[] newArray(int i) {
            return new ug1[i];
        }
    }

    public ug1(@x1 String str, @z1 String str2) {
        this.s = str;
        this.t = str2;
    }

    @z1
    public String c() {
        return this.t;
    }

    @x1
    public String d() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }

    public ug1(@x1 Parcel parcel) {
        this.s = parcel.readString();
        this.t = parcel.readString();
    }
}