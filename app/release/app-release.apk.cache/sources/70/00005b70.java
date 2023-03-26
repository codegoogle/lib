package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ScanResultsUpdated.java */
/* loaded from: classes.dex */
public class s71 implements Parcelable {
    @x1
    public static final Parcelable.Creator<s71> CREATOR = new a();

    /* compiled from: ScanResultsUpdated.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<s71> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public s71 createFromParcel(@x1 Parcel parcel) {
            return new s71(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public s71[] newArray(int i) {
            return new s71[i];
        }
    }

    public s71(@x1 Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
    }

    public s71() {
    }
}