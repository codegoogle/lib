package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: NotificationUpdateEvent.java */
/* loaded from: classes.dex */
public class b41 implements Parcelable {
    public static final Parcelable.Creator<b41> CREATOR = new a();

    /* compiled from: NotificationUpdateEvent.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b41> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b41 createFromParcel(@x1 Parcel parcel) {
            return new b41(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b41[] newArray(int i) {
            return new b41[i];
        }
    }

    public b41() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
    }

    public b41(@x1 Parcel parcel) {
    }
}