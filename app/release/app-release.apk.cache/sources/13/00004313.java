package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.anchorfree.sdk.fireshield.FireshieldConfig;
import com.anythink.core.common.c.f;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.p7700g.p99005.xu0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Credentials.java */
/* loaded from: classes.dex */
public class ft0 implements Parcelable {
    public static final Parcelable.Creator<ft0> CREATOR = new a();
    @mw2("ipaddr")
    @z1
    private String A;
    @mw2("openvpn_cert")
    @z1
    private String B;
    @mw2("client_ip")
    @z1
    private String C;
    @mw2(f.a.f)
    private long D;
    @mw2("expire_time")
    private long E;
    @mw2("hydra_cert")
    @z1
    private String F;
    @mw2("user_country")
    @z1
    private String G;
    @mw2("user_country_region")
    @z1
    private String H;
    @x1
    @mw2("servers")
    private List<gt0> I;
    @mw2("name")
    @z1
    private String s;
    @mw2(FireshieldConfig.Services.IP)
    @z1
    private String t;
    @mw2("port")
    @z1
    private String u;
    @mw2(xu0.f.m)
    @z1
    private String v;
    @mw2("username")
    @z1
    private String w;
    @mw2("password")
    @z1
    private String x;
    @mw2(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY)
    @z1
    private String y;
    @mw2("cert")
    @z1
    private String z;

    /* compiled from: Credentials.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ft0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ft0 createFromParcel(Parcel parcel) {
            return new ft0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ft0[] newArray(int i) {
            return new ft0[i];
        }
    }

    public ft0(@x1 Parcel parcel) {
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readString();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.B = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.I = arrayList;
        arrayList.addAll(Arrays.asList((gt0[]) parcel.readParcelableArray(gt0.class.getClassLoader())));
        this.G = parcel.readString();
        this.H = parcel.readString();
    }

    @z1
    public String c() {
        return this.z;
    }

    @z1
    public String d() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public String e() {
        return this.y;
    }

    public long g() {
        return this.D;
    }

    public long i() {
        return this.E;
    }

    @z1
    public String j() {
        return this.F;
    }

    @z1
    public String k() {
        return this.t;
    }

    @z1
    public String l() {
        return this.A;
    }

    @z1
    public String m() {
        return this.s;
    }

    @z1
    public String n() {
        return this.B;
    }

    @z1
    public String o() {
        return this.x;
    }

    @z1
    public String p() {
        return this.u;
    }

    @z1
    public String q() {
        return this.v;
    }

    @x1
    public List<gt0> r() {
        return Collections.unmodifiableList(this.I);
    }

    @z1
    public String s() {
        return this.G;
    }

    @z1
    public String t() {
        return this.H;
    }

    public String toString() {
        StringBuilder K = wo1.K("Credentials{", "name='");
        wo1.d0(K, this.s, '\'', ", ip='");
        wo1.d0(K, this.t, '\'', ", port='");
        wo1.d0(K, this.u, '\'', ", protocol='");
        wo1.d0(K, this.v, '\'', ", username='");
        wo1.d0(K, this.w, '\'', ", password='");
        wo1.d0(K, this.x, '\'', ", country='");
        wo1.d0(K, this.y, '\'', ", cert='");
        wo1.d0(K, this.z, '\'', ", ipaddr='");
        wo1.d0(K, this.A, '\'', ", openVpnCert='");
        wo1.d0(K, this.B, '\'', ", clientIp='");
        wo1.d0(K, this.C, '\'', ", createTime=");
        K.append(this.D);
        K.append(", expireTime=");
        K.append(this.E);
        K.append(", servers=");
        K.append(this.I);
        K.append(", userCountry=");
        K.append(this.G);
        K.append(", hydraCert=");
        K.append(this.F);
        K.append(", userCountryRegion=");
        return wo1.B(K, this.H, '}');
    }

    @z1
    public String u() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeString(this.B);
        parcel.writeString(this.F);
        parcel.writeParcelableArray(new gt0[this.I.size()], i);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
    }

    public ft0() {
        this.I = new ArrayList();
    }
}