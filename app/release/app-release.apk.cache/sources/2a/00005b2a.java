package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ConfigUpdatedEvent.java */
/* loaded from: classes.dex */
public class s21 implements Parcelable {
    @x1
    public static final Parcelable.Creator<s21> CREATOR = new a();

    /* compiled from: ConfigUpdatedEvent.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<s21> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public s21 createFromParcel(@x1 Parcel parcel) {
            return new s21(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public s21[] newArray(int i) {
            return new s21[i];
        }
    }

    public s21(@x1 Parcel parcel) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
    }

    public s21() {
    }
}