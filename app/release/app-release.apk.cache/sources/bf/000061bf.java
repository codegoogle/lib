package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: HydraResource.java */
/* loaded from: classes2.dex */
public class vg1 implements Parcelable {
    public static final Parcelable.Creator<vg1> CREATOR = new a();
    private final int A;
    @x1
    private final String s;
    @x1
    private final d t;
    private final int u;
    @x1
    private final String v;
    @x1
    private final List<String> w;
    @x1
    private final b x;
    @x1
    private final List<String> y;
    private final int z;

    /* compiled from: HydraResource.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<vg1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public vg1 createFromParcel(@x1 Parcel parcel) {
            return new vg1(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public vg1[] newArray(int i) {
            return new vg1[i];
        }
    }

    /* compiled from: HydraResource.java */
    /* loaded from: classes2.dex */
    public enum b {
        PROXY,
        VPN,
        BYPASS,
        BLOCK,
        VPNX
    }

    /* compiled from: HydraResource.java */
    /* loaded from: classes2.dex */
    public enum c {
        ADD,
        REMOVE
    }

    /* compiled from: HydraResource.java */
    /* loaded from: classes2.dex */
    public enum d {
        NONE,
        URL,
        IP,
        DOMAIN
    }

    public /* synthetic */ vg1(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int c() {
        return this.u;
    }

    @x1
    public String d() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.A;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vg1 vg1Var = (vg1) obj;
        if (this.u == vg1Var.u && this.z == vg1Var.z && this.A == vg1Var.A && this.s.equals(vg1Var.s) && this.t == vg1Var.t && this.v.equals(vg1Var.v) && this.w.equals(vg1Var.w) && this.x == vg1Var.x) {
            return this.y.equals(vg1Var.y);
        }
        return false;
    }

    public int g() {
        return this.z;
    }

    public int hashCode() {
        int hashCode = this.t.hashCode();
        int x = wo1.x(this.v, (((hashCode + (this.s.hashCode() * 31)) * 31) + this.u) * 31, 31);
        int hashCode2 = this.x.hashCode();
        return ((((this.y.hashCode() + ((hashCode2 + ((this.w.hashCode() + x) * 31)) * 31)) * 31) + this.z) * 31) + this.A;
    }

    @x1
    public String i() {
        return this.s;
    }

    @x1
    public b j() {
        return this.x;
    }

    @x1
    public d k() {
        return this.t;
    }

    @x1
    public List<String> l() {
        return this.w;
    }

    @x1
    public List<String> m() {
        return this.y;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("HydraResource{resource='");
        wo1.d0(G, this.s, '\'', ", resourceType=");
        G.append(this.t);
        G.append(", categoryId=");
        G.append(this.u);
        G.append(", categoryName='");
        wo1.d0(G, this.v, '\'', ", sources=");
        G.append(this.w);
        G.append(", vendorLabels=");
        G.append(this.y);
        G.append(", resourceAct=");
        G.append(this.x);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeStringList(this.w);
        parcel.writeStringList(this.y);
        parcel.writeString(this.x.name());
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
    }

    public vg1(@x1 String str, @x1 d dVar, int i, @x1 String str2, @x1 List<String> list, @x1 b bVar, @x1 List<String> list2, int i2, int i3) {
        this.s = str;
        this.t = dVar;
        this.u = i;
        this.v = str2;
        this.w = list;
        this.x = bVar;
        this.y = list2;
        this.z = i2;
        this.A = i3;
    }

    private vg1(@x1 Parcel parcel) {
        this.s = (String) r81.f(parcel.readString());
        this.t = d.valueOf(parcel.readString());
        this.u = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.createStringArrayList();
        this.y = parcel.createStringArrayList();
        this.x = b.valueOf(parcel.readString());
        this.z = parcel.readInt();
        this.A = parcel.readInt();
    }
}