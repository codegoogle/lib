package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;

/* compiled from: CredentialsResponse.java */
/* loaded from: classes2.dex */
public class go1 implements Parcelable {
    @x1
    public final gn1 t;
    @x1
    public final String u;
    public final int v;
    @x1
    public final Bundle w;
    @x1
    public final Bundle x;
    @x1
    public final Bundle y;
    @z1
    public final String z;
    private static final int s = (int) TimeUnit.SECONDS.toMillis(30);
    public static final Parcelable.Creator<go1> CREATOR = new a();

    /* compiled from: CredentialsResponse.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<go1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public go1 createFromParcel(@x1 Parcel parcel) {
            return new go1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public go1[] newArray(int i) {
            return new go1[i];
        }
    }

    /* compiled from: CredentialsResponse.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @z1
        private gn1 a;
        @z1
        private String b;
        private int c;
        @x1
        private Bundle d;
        @x1
        private Bundle e;
        @x1
        private Bundle f;
        @z1
        private String g;

        public /* synthetic */ b(a aVar) {
            this();
        }

        @x1
        public go1 h() {
            return new go1(this, (a) null);
        }

        @x1
        public b i(@x1 Bundle bundle) {
            this.d = bundle;
            return this;
        }

        @x1
        public b j(@x1 String str) {
            this.b = str;
            return this;
        }

        @x1
        public b k(int i) {
            this.c = i;
            return this;
        }

        @x1
        public b l(@x1 Bundle bundle) {
            this.e = bundle;
            return this;
        }

        @x1
        public b m(@x1 String str) {
            this.g = str;
            return this;
        }

        @x1
        public b n(@x1 Bundle bundle) {
            this.f = bundle;
            return this;
        }

        @x1
        public b o(@x1 gn1 gn1Var) {
            this.a = gn1Var;
            return this;
        }

        private b() {
            this.c = go1.s;
            this.d = new Bundle();
            this.e = new Bundle();
            this.f = new Bundle();
        }
    }

    public /* synthetic */ go1(b bVar, a aVar) {
        this(bVar);
    }

    @x1
    public static b d() {
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
        go1 go1Var = (go1) obj;
        if (this.v == go1Var.v && this.t.equals(go1Var.t) && this.u.equals(go1Var.u) && this.w.equals(go1Var.w) && this.x.equals(go1Var.x) && this.y.equals(go1Var.y)) {
            String str = this.z;
            String str2 = go1Var.z;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.u;
        int hashCode = this.w.hashCode();
        int hashCode2 = (this.y.hashCode() + ((this.x.hashCode() + ((hashCode + ((wo1.x(str, this.t.hashCode() * 31, 31) + this.v) * 31)) * 31)) * 31)) * 31;
        String str2 = this.z;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("CredentialsResponse{vpnParams=");
        G.append(this.t);
        G.append(", config='");
        wo1.d0(G, this.u, '\'', ", connectionTimeout=");
        G.append(this.v);
        G.append(", clientData=");
        G.append(this.w);
        G.append(", customParams=");
        G.append(this.x);
        G.append(", trackingData=");
        G.append(this.y);
        G.append(", pkiCert='");
        G.append(this.z);
        G.append('\'');
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeParcelable(this.t, i);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeBundle(this.w);
        parcel.writeBundle(this.x);
        parcel.writeBundle(this.y);
        parcel.writeString(this.z);
    }

    public go1(@x1 gn1 gn1Var, @x1 String str) {
        this.t = (gn1) r81.f(gn1Var);
        this.u = (String) r81.f(str);
        this.v = s;
        this.w = new Bundle();
        this.x = new Bundle();
        this.y = new Bundle();
        this.z = null;
    }

    public go1(@x1 Parcel parcel) {
        this.t = (gn1) r81.f((gn1) parcel.readParcelable(gn1.class.getClassLoader()));
        this.u = (String) r81.f(parcel.readString());
        this.v = parcel.readInt();
        this.w = (Bundle) r81.f(parcel.readBundle(getClass().getClassLoader()));
        this.x = (Bundle) r81.f(parcel.readBundle(getClass().getClassLoader()));
        this.y = (Bundle) r81.f(parcel.readBundle(getClass().getClassLoader()));
        this.z = parcel.readString();
    }

    @Deprecated
    public go1(@x1 gn1 gn1Var, @x1 String str, @x1 Bundle bundle, @x1 Bundle bundle2, @x1 Bundle bundle3, @z1 String str2) {
        this.t = gn1Var;
        this.u = str;
        this.v = s;
        this.w = bundle;
        this.x = bundle2;
        this.y = bundle3;
        this.z = str2;
    }

    private go1(@x1 b bVar) {
        this.t = (gn1) r81.f(bVar.a);
        this.u = (String) r81.f(bVar.b);
        this.v = bVar.c;
        this.w = bVar.d;
        this.x = bVar.e;
        this.y = bVar.f;
        this.z = bVar.g;
    }
}