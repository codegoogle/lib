package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.impressionData.ImpressionData;

/* compiled from: CredentialsServer.java */
/* loaded from: classes.dex */
public class gt0 implements Parcelable {
    @x1
    public static final Parcelable.Creator<gt0> CREATOR = new a();
    @mw2("name")
    @z1
    private String s;
    @x1
    @mw2("address")
    private String t;
    @mw2("port")
    private int u;
    @mw2(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY)
    @z1
    private String v;

    /* compiled from: CredentialsServer.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<gt0> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public gt0 createFromParcel(@x1 Parcel parcel) {
            return new gt0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public gt0[] newArray(int i) {
            return new gt0[i];
        }
    }

    @r2
    public gt0(@x1 String str, int i) {
        this.t = str;
        this.u = i;
    }

    @x1
    public String c() {
        return this.t;
    }

    @z1
    public String d() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public String e() {
        return this.s;
    }

    public int g() {
        return this.u;
    }

    @x1
    public String toString() {
        StringBuilder K = wo1.K("CredentialsServer{", "name='");
        wo1.d0(K, this.s, '\'', ", address='");
        wo1.d0(K, this.t, '\'', ", port=");
        K.append(this.u);
        K.append(", country='");
        K.append(this.v);
        K.append('\'');
        K.append('}');
        return K.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
    }

    public gt0() {
        this.t = "";
    }

    public gt0(@x1 Parcel parcel) {
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readInt();
        this.v = parcel.readString();
    }
}