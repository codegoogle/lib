package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: BaseResponse.java */
/* loaded from: classes.dex */
public class et0 implements Parcelable {
    @x1
    public static final Parcelable.Creator<et0> CREATOR = new a();
    @mw2("result")
    private final String s;
    @mw2("error")
    private final String t;
    @mw2("httpCode")
    private int u;

    /* compiled from: BaseResponse.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<et0> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public et0 createFromParcel(@x1 Parcel parcel) {
            return new et0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public et0[] newArray(int i) {
            return new et0[i];
        }
    }

    public et0(@x1 Parcel parcel) {
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readInt();
    }

    @x1
    public String c() {
        return this.t;
    }

    public int d() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String e() {
        return this.s;
    }

    public void g(int i) {
        this.u = i;
    }

    public String toString() {
        StringBuilder G = wo1.G("BaseResponse{result='");
        wo1.d0(G, this.s, '\'', ", error='");
        wo1.d0(G, this.t, '\'', ", httpCode='");
        G.append(this.u);
        G.append('\'');
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
    }
}