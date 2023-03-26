package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: VpnStartArguments.java */
/* loaded from: classes2.dex */
public class ve1 implements Parcelable {
    public static final Parcelable.Creator<ve1> CREATOR = new a();
    public static final String s = "isKillSwitchEnabled";
    public static final String t = "isCaptivePortalBlockBypass";
    @x1
    private final String u;
    @x1
    private final String v;
    @x1
    private final co1 w;
    @x1
    private final Bundle x;
    private final boolean y;
    private final boolean z;

    /* compiled from: VpnStartArguments.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<ve1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public ve1 createFromParcel(@x1 Parcel parcel) {
            return new ve1(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public ve1[] newArray(int i) {
            return new ve1[i];
        }
    }

    /* compiled from: VpnStartArguments.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @z1
        private String a;
        @z1
        private String b;
        @x1
        private co1 c;
        @x1
        private Bundle d;
        private boolean e;
        private boolean f;

        public /* synthetic */ b(a aVar) {
            this();
        }

        @x1
        public ve1 g() {
            String str = this.a == null ? " virtualLocation" : "";
            if (this.b == null) {
                str = wo1.t(str, " reason");
            }
            if (str.isEmpty()) {
                this.e = this.d.getBoolean(ve1.s, false);
                this.f = this.d.getBoolean(ve1.t, false);
                return new ve1(this, (a) null);
            }
            throw new IllegalStateException(wo1.t("Missing required properties:", str));
        }

        @x1
        public b h(@x1 co1 co1Var) {
            this.c = co1Var;
            return this;
        }

        @x1
        public b i(@x1 Bundle bundle) {
            this.d = bundle;
            return this;
        }

        @x1
        public b j(boolean z) {
            this.f = z;
            return this;
        }

        @x1
        public b k(boolean z) {
            this.e = z;
            return this;
        }

        @x1
        public b l(@z1 String str) {
            this.b = str;
            return this;
        }

        @x1
        public b m(@z1 String str) {
            this.a = str;
            return this;
        }

        private b() {
            this.c = co1.c();
            this.d = new Bundle();
        }
    }

    public /* synthetic */ ve1(Parcel parcel, a aVar) {
        this(parcel);
    }

    @x1
    public static b k() {
        return new b(null);
    }

    @x1
    public co1 c() {
        return this.w;
    }

    @x1
    public Bundle d() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String e() {
        return this.v;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ve1 ve1Var = (ve1) obj;
        if (this.z == ve1Var.z && this.y == ve1Var.y && this.u.equals(ve1Var.u) && this.v.equals(ve1Var.v) && this.w.equals(ve1Var.w)) {
            return this.x.equals(ve1Var.x);
        }
        return false;
    }

    @x1
    public String g() {
        return this.u;
    }

    public int hashCode() {
        int x = wo1.x(this.v, this.u.hashCode() * 31, 31);
        return ((((this.x.hashCode() + ((this.w.hashCode() + x) * 31)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0);
    }

    public boolean i() {
        return this.z;
    }

    public boolean j() {
        return this.y;
    }

    @x1
    public ve1 l(@x1 Bundle bundle) {
        return k().h(this.w).l(this.v).m(this.u).i(bundle).g();
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("VpnStartArguments{virtualLocation='");
        wo1.d0(G, this.u, '\'', ", reason='");
        wo1.d0(G, this.v, '\'', ", appPolicy=");
        G.append(this.w);
        G.append(", extra=");
        G.append(this.x);
        G.append(", isKillSwitchEnabled=");
        G.append(this.y);
        G.append(", isCaptivePortalBlockBypass=");
        G.append(this.z);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeParcelable(this.w, i);
        parcel.writeBundle(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
    }

    public /* synthetic */ ve1(b bVar, a aVar) {
        this(bVar);
    }

    private ve1(@x1 b bVar) {
        this.u = (String) r81.f(bVar.a);
        this.v = (String) r81.f(bVar.b);
        this.w = bVar.c;
        this.x = bVar.d;
        this.y = bVar.e;
        this.z = bVar.f;
    }

    private ve1(@x1 Parcel parcel) {
        this.u = (String) r81.f(parcel.readString());
        this.v = (String) r81.f(parcel.readString());
        this.w = (co1) parcel.readParcelable(co1.class.getClassLoader());
        this.x = parcel.readBundle(getClass().getClassLoader());
        this.y = parcel.readInt() != 0;
        this.z = parcel.readInt() != 0;
    }
}