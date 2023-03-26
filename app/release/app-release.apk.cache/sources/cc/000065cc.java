package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Route.java */
/* loaded from: classes2.dex */
public class xm1 implements Parcelable {
    public static final Parcelable.Creator<xm1> CREATOR = new a();
    @x1
    private final String s;
    private final int t;

    /* compiled from: Route.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<xm1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public xm1 createFromParcel(@x1 Parcel parcel) {
            return new xm1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public xm1[] newArray(int i) {
            return new xm1[i];
        }
    }

    public xm1(@x1 Parcel parcel) {
        this.s = parcel.readString();
        this.t = parcel.readInt();
    }

    public int c() {
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

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xm1 xm1Var = (xm1) obj;
        if (this.t != xm1Var.t) {
            return false;
        }
        return this.s.equals(xm1Var.s);
    }

    public int hashCode() {
        return (this.s.hashCode() * 31) + this.t;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Route{route='");
        wo1.d0(G, this.s, '\'', ", mask=");
        return wo1.y(G, this.t, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeInt(this.t);
    }

    public xm1(@x1 String str, int i) {
        this.s = str;
        this.t = i;
    }
}