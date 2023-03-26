package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: VpnServiceConfig.java */
/* loaded from: classes2.dex */
public class zn1 implements Parcelable {
    public static final Parcelable.Creator<zn1> CREATOR = new a();
    @x1
    @mw2("reconnect_settings")
    private final re1 s;
    @x1
    @mw2("transport_factory")
    private final vn1<? extends qa1> t;
    @mw2("network_probe_factory")
    @z1
    private final vn1<? extends md1> u;
    @mw2("captive_portal_checker")
    @z1
    private final vn1<? extends do1> v;

    /* compiled from: VpnServiceConfig.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<zn1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public zn1 createFromParcel(@x1 Parcel parcel) {
            return new zn1(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public zn1[] newArray(int i) {
            return new zn1[i];
        }
    }

    /* compiled from: VpnServiceConfig.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @z1
        private re1 a;
        @z1
        private vn1<? extends qa1> b;
        @z1
        private vn1<? extends md1> c;
        @z1
        private vn1<? extends do1> d;

        public /* synthetic */ b(a aVar) {
            this();
        }

        @x1
        public zn1 a() {
            return new zn1((re1) r81.f(this.a), (vn1) r81.f(this.b), this.c, this.d, null);
        }

        @x1
        public b b(@z1 vn1<? extends do1> vn1Var) {
            this.d = vn1Var;
            return this;
        }

        @x1
        public b c(@z1 vn1<? extends md1> vn1Var) {
            this.c = vn1Var;
            return this;
        }

        @x1
        public b d(@z1 re1 re1Var) {
            this.a = re1Var;
            return this;
        }

        @x1
        public b e(@z1 vn1<? extends qa1> vn1Var) {
            this.b = vn1Var;
            return this;
        }

        private b() {
        }
    }

    public /* synthetic */ zn1(Parcel parcel, a aVar) {
        this(parcel);
    }

    @x1
    public static b c() {
        return new b(null);
    }

    @z1
    public vn1<? extends do1> d() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public vn1<? extends md1> e() {
        return this.u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        if (this.s.equals(zn1Var.s) && this.t.equals(zn1Var.t) && r81.d(this.u, zn1Var.u)) {
            return r81.d(this.v, zn1Var.v);
        }
        return false;
    }

    @x1
    public re1 g() {
        return this.s;
    }

    public int hashCode() {
        int hashCode = (this.t.hashCode() + (this.s.hashCode() * 31)) * 31;
        vn1<? extends md1> vn1Var = this.u;
        int hashCode2 = (hashCode + (vn1Var != null ? vn1Var.hashCode() : 0)) * 31;
        vn1<? extends do1> vn1Var2 = this.v;
        return hashCode2 + (vn1Var2 != null ? vn1Var2.hashCode() : 0);
    }

    @x1
    public vn1<? extends qa1> i() {
        return this.t;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("VpnServiceConfig{reconnectSettings=");
        G.append(this.s);
        G.append(", transportStringClz=");
        G.append(this.t);
        G.append(", networkProbeFactory=");
        G.append(this.u);
        G.append(", captivePortalStringClz=");
        G.append(this.v);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        r81.g(this.s, "reconnectSettings shouldn't be null");
        r81.g(this.t, "transportStringClz shouldn't be null");
        parcel.writeParcelable(this.s, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeParcelable(this.u, i);
        parcel.writeParcelable(this.v, i);
    }

    public /* synthetic */ zn1(re1 re1Var, vn1 vn1Var, vn1 vn1Var2, vn1 vn1Var3, a aVar) {
        this(re1Var, vn1Var, vn1Var2, vn1Var3);
    }

    private zn1(@x1 re1 re1Var, @x1 vn1<? extends qa1> vn1Var, @z1 vn1<? extends md1> vn1Var2, @z1 vn1<? extends do1> vn1Var3) {
        this.s = re1Var;
        this.t = vn1Var;
        this.u = vn1Var2;
        this.v = vn1Var3;
    }

    private zn1(@x1 Parcel parcel) {
        this.s = (re1) r81.f((re1) parcel.readParcelable(re1.class.getClassLoader()));
        this.t = (vn1) r81.f((vn1) parcel.readParcelable(qa1.class.getClassLoader()));
        this.u = (vn1) parcel.readParcelable(md1.class.getClassLoader());
        this.v = (vn1) parcel.readParcelable(do1.class.getClassLoader());
    }
}