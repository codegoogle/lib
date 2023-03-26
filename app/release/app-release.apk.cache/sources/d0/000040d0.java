package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: VPNState.java */
/* loaded from: classes2.dex */
public enum en1 implements Parcelable {
    UNKNOWN,
    CONNECTED,
    IDLE,
    PAUSED,
    CONNECTING_CREDENTIALS,
    CONNECTING_PERMISSIONS,
    CONNECTING_VPN,
    DISCONNECTING,
    ERROR;
    
    public static final Parcelable.Creator<en1> CREATOR = new Parcelable.Creator<en1>() { // from class: com.p7700g.p99005.en1.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public en1 createFromParcel(@x1 Parcel parcel) {
            return en1.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public en1[] newArray(int i) {
            return new en1[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @x1
    public String toString() {
        StringBuilder G = wo1.G("VPNState{state='");
        G.append(name());
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}