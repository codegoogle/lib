package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: RemoteConfigUpdated.java */
/* loaded from: classes.dex */
public class m41 implements Parcelable {
    public static final Parcelable.Creator<m41> CREATOR = new a();

    /* compiled from: RemoteConfigUpdated.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<m41> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m41 createFromParcel(@x1 Parcel parcel) {
            return new m41(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m41[] newArray(int i) {
            return new m41[i];
        }
    }

    public m41() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
    }

    public m41(@x1 Parcel parcel) {
    }
}