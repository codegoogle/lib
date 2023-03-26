package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConnectionInfo.java */
/* loaded from: classes2.dex */
public class km1 implements Parcelable {
    public static final Parcelable.Creator<km1> CREATOR = new a();
    @x1
    private final String s;
    @x1
    private final List<String> t;

    /* compiled from: ConnectionInfo.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<km1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public km1 createFromParcel(@x1 Parcel parcel) {
            return new km1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public km1[] newArray(int i) {
            return new km1[i];
        }
    }

    public km1(@x1 String str, @x1 List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.t = arrayList;
        this.s = str;
        arrayList.addAll(list);
    }

    @x1
    public String c() {
        return this.s;
    }

    @x1
    public String d() {
        return this.t.isEmpty() ? "" : this.t.get(0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public List<String> e() {
        return this.t;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        km1 km1Var = (km1) obj;
        if (this.s.equals(km1Var.s)) {
            return this.t.equals(km1Var.t);
        }
        return false;
    }

    @x1
    public List<vm1> g() {
        ArrayList arrayList = new ArrayList(this.t.size());
        for (String str : this.t) {
            arrayList.add(new vm1(str, this.s));
        }
        if (arrayList.isEmpty() && this.s.length() != 0) {
            arrayList.add(new vm1("", this.s));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.t.hashCode() + (this.s.hashCode() * 31);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("ConnectionInfo{domain='");
        wo1.d0(G, this.s, '\'', ", ips=");
        G.append(this.t);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeStringList(this.t);
    }

    public km1(@x1 Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.t = arrayList;
        this.s = parcel.readString();
        arrayList.addAll(parcel.createStringArrayList());
    }
}