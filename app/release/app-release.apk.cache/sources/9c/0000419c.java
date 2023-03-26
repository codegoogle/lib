package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.anchorfree.partner.api.ClientInfo;
import java.io.Serializable;

/* compiled from: StateSwitchEvent.java */
/* loaded from: classes.dex */
public class f51 implements Parcelable {
    public static final Parcelable.Creator<f51> CREATOR = new a();
    @x1
    private final Pair<en1, ClientInfo> s;

    /* compiled from: StateSwitchEvent.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f51> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f51 createFromParcel(@x1 Parcel parcel) {
            return new f51(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f51[] newArray(int i) {
            return new f51[i];
        }
    }

    public f51(@x1 Pair<en1, ClientInfo> pair) {
        this.s = pair;
    }

    @x1
    public Pair<en1, ClientInfo> c() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && ((en1) this.s.first).equals(((f51) obj).s.first) && ((ClientInfo) this.s.second).getCarrierId().equals(((ClientInfo) this.s.second).getCarrierId());
    }

    public int hashCode() {
        return this.s.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeSerializable((Serializable) this.s.first);
        parcel.writeString(((ClientInfo) this.s.second).getCarrierId());
        parcel.writeString(((ClientInfo) this.s.second).getBaseUrl());
    }

    public f51(@x1 Parcel parcel) {
        this.s = Pair.create((en1) parcel.readSerializable(), ClientInfo.newBuilder().g((String) r81.f(parcel.readString())).e((String) r81.f(parcel.readString())).f());
    }
}