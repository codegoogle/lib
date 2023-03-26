package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: RemoteFileUpdatedEvent.java */
/* loaded from: classes.dex */
public class q41 implements Parcelable {
    public static final Parcelable.Creator<q41> CREATOR = new a();
    @x1
    private final String s;
    @x1
    private final String t;

    /* compiled from: RemoteFileUpdatedEvent.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<q41> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q41 createFromParcel(@x1 Parcel parcel) {
            return new q41(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q41[] newArray(int i) {
            return new q41[i];
        }
    }

    public q41(@x1 String str, @x1 String str2) {
        this.s = str;
        this.t = str2;
    }

    @x1
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

    public q41(@x1 Parcel parcel) {
        this.s = (String) r81.f(parcel.readString());
        this.t = (String) r81.f(parcel.readString());
    }
}