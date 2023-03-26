package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Credentials.java */
/* loaded from: classes2.dex */
public class fo1 implements Parcelable {
    public static final Parcelable.Creator<fo1> CREATOR = new a();
    @x1
    public final co1 s;
    @x1
    public final gn1 t;
    public final int u;
    @x1
    public final String v;
    @x1
    public final Bundle w;
    @x1
    public final ti1 x;
    @x1
    public final Bundle y;
    @z1
    public final String z;

    /* compiled from: Credentials.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<fo1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public fo1 createFromParcel(@x1 Parcel parcel) {
            return new fo1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public fo1[] newArray(int i) {
            return new fo1[i];
        }
    }

    /* compiled from: Credentials.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @z1
        private co1 a;
        @z1
        private gn1 b;
        @z1
        private String c;
        private int d;
        @z1
        private Bundle e;
        @z1
        private String f;
        @z1
        private ti1 g;
        @z1
        private Bundle h;

        public /* synthetic */ b(a aVar) {
            this();
        }

        @x1
        public b i(@x1 co1 co1Var) {
            this.a = co1Var;
            return this;
        }

        @x1
        public fo1 j() {
            return new fo1(this, null);
        }

        @x1
        public b k(@x1 String str) {
            this.c = str;
            return this;
        }

        @x1
        public b l(@x1 ti1 ti1Var) {
            this.g = ti1Var;
            return this;
        }

        @x1
        public b m(@x1 Bundle bundle) {
            this.e = bundle;
            return this;
        }

        @x1
        public b n(@x1 String str) {
            this.f = str;
            return this;
        }

        @x1
        public b o(int i) {
            this.d = i;
            return this;
        }

        @x1
        public b p(@x1 Bundle bundle) {
            this.h = bundle;
            return this;
        }

        @x1
        public b q(@x1 gn1 gn1Var) {
            this.b = gn1Var;
            return this;
        }

        private b() {
        }
    }

    public /* synthetic */ fo1(b bVar, a aVar) {
        this(bVar);
    }

    @x1
    public static b c() {
        return new b(null);
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
        fo1 fo1Var = (fo1) obj;
        if (this.u == fo1Var.u && this.s.equals(fo1Var.s) && this.t.equals(fo1Var.t) && this.v.equals(fo1Var.v) && this.w.equals(fo1Var.w) && r81.d(this.z, fo1Var.z) && this.x.equals(fo1Var.x)) {
            return this.y.equals(fo1Var.y);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.t.hashCode();
        int hashCode2 = (this.w.hashCode() + ((wo1.x(this.v, (hashCode + (this.s.hashCode() * 31)) * 31, 31) + this.u) * 31)) * 31;
        String str = this.z;
        int hashCode3 = str != null ? str.hashCode() : 0;
        return this.y.hashCode() + ((this.x.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Credentials{appPolicy=");
        G.append(this.s);
        G.append(", vpnParams=");
        G.append(this.t);
        G.append(", config='");
        wo1.d0(G, this.v, '\'', ", connectionTimeout=");
        G.append(this.u);
        G.append(", customParams=");
        G.append(this.w);
        G.append(", pkiCert='");
        wo1.d0(G, this.z, '\'', ", connectionAttemptId=");
        G.append(this.x);
        G.append(", trackingData=");
        G.append(this.y);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeParcelable(this.s, i);
        parcel.writeParcelable(this.t, i);
        parcel.writeString(this.v);
        parcel.writeInt(this.u);
        parcel.writeBundle(this.w);
        parcel.writeString(this.z);
        parcel.writeParcelable(this.x, i);
        parcel.writeBundle(this.y);
    }

    public fo1(@x1 co1 co1Var, @x1 gn1 gn1Var, @x1 String str, int i, @x1 Bundle bundle, @x1 ti1 ti1Var, @x1 Bundle bundle2, @z1 String str2) {
        this.s = co1Var;
        this.t = gn1Var;
        this.v = str;
        this.u = i;
        this.w = bundle;
        this.x = ti1Var;
        this.y = bundle2;
        this.z = str2;
    }

    private fo1(@x1 b bVar) {
        this.s = (co1) r81.f((co1) r81.f(bVar.a));
        this.t = (gn1) r81.f(bVar.b);
        this.v = (String) r81.f(bVar.c);
        this.u = bVar.d;
        this.w = (Bundle) r81.f(bVar.e);
        this.z = bVar.f;
        this.x = (ti1) r81.f(bVar.g);
        this.y = (Bundle) r81.f(bVar.h);
    }

    public fo1(@x1 Parcel parcel) {
        this.s = (co1) r81.f((co1) parcel.readParcelable(co1.class.getClassLoader()));
        this.t = (gn1) r81.f((gn1) parcel.readParcelable(gn1.class.getClassLoader()));
        this.v = (String) r81.f(parcel.readString());
        this.u = parcel.readInt();
        this.w = (Bundle) r81.f(parcel.readBundle(getClass().getClassLoader()));
        this.z = parcel.readString();
        this.x = (ti1) r81.f((ti1) parcel.readParcelable(ti1.class.getClassLoader()));
        this.y = (Bundle) r81.f(parcel.readBundle(getClass().getClassLoader()));
    }
}