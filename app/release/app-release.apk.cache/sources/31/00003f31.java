package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ApiRequest.java */
/* loaded from: classes.dex */
public class dr0 implements Parcelable {
    public static final Parcelable.Creator<dr0> CREATOR = new a();
    private final String s;
    private final String t;
    private final String u;

    /* compiled from: ApiRequest.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<dr0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public dr0 createFromParcel(Parcel parcel) {
            return new dr0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public dr0[] newArray(int i) {
            return new dr0[i];
        }
    }

    public dr0(Parcel parcel) {
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
    }

    public static dr0 c(hr5 hr5Var, String str) {
        return new dr0(hr5Var.q().a0().toString(), hr5Var.m(), str);
    }

    public static dr0 d(String str) {
        return new dr0(str, com.anythink.expressad.foundation.g.a.a.a, "");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder G = wo1.G("ApiRequest{url='");
        wo1.d0(G, this.s, '\'', ", method='");
        wo1.d0(G, this.t, '\'', ", body='");
        G.append(this.u);
        G.append('\'');
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }

    private dr0(String str, String str2, String str3) {
        this.s = str;
        this.t = str2;
        this.u = str3;
    }
}