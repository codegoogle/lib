package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: VpnParams.java */
/* loaded from: classes2.dex */
public class gn1 implements Parcelable {
    public static final Parcelable.Creator<gn1> CREATOR = new a();
    @x1
    private List<xm1> s;
    @x1
    private String t;
    @x1
    private String u;

    /* compiled from: VpnParams.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<gn1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public gn1 createFromParcel(@x1 Parcel parcel) {
            return new gn1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public gn1[] newArray(int i) {
            return new gn1[i];
        }
    }

    /* compiled from: VpnParams.java */
    /* loaded from: classes2.dex */
    public static final class b {
        @x1
        private String a;
        @x1
        private String b;
        @x1
        private List<xm1> c;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private int g(String str) {
            int i = 0;
            int i2 = 0;
            for (String str2 : str.split("\\.")) {
                i2 = (i2 << 8) + Integer.parseInt(str2);
            }
            while (i2 != 0) {
                i2 <<= 1;
                i++;
            }
            return i;
        }

        @x1
        public gn1 d() {
            return new gn1(this, null);
        }

        @x1
        public b e(@x1 String str) {
            this.a = str;
            return this;
        }

        @x1
        public b f(@x1 String str) {
            this.b = str;
            return this;
        }

        @x1
        public b h(@x1 List<String> list) {
            this.c = new ArrayList();
            for (String str : list) {
                String[] split = str.split(" ");
                this.c.add(new xm1(split[0], g(split[1])));
            }
            return this;
        }

        @x1
        public b i(@x1 List<xm1> list) {
            this.c = list;
            return this;
        }

        private b() {
            this.a = "8.8.8.8";
            this.b = "8.8.4.4";
            this.c = Arrays.asList(new xm1("128.0.0.0", 1), new xm1("0.0.0.0", 1));
        }
    }

    public /* synthetic */ gn1(b bVar, a aVar) {
        this(bVar);
    }

    @x1
    public static b g() {
        return new b(null);
    }

    @x1
    public String c() {
        return this.t;
    }

    @x1
    public String d() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public List<xm1> e() {
        return this.s;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gn1 gn1Var = (gn1) obj;
        if (this.t.equals(gn1Var.t) && this.u.equals(gn1Var.u)) {
            return this.s.equals(gn1Var.s);
        }
        return false;
    }

    public int hashCode() {
        return this.s.hashCode() + wo1.x(this.u, this.t.hashCode() * 31, 31);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("VpnParams{dns1='");
        wo1.d0(G, this.t, '\'', ", dns2='");
        wo1.d0(G, this.u, '\'', ", routes=");
        G.append(this.s);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeTypedList(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }

    private gn1(@x1 b bVar) {
        this.t = bVar.a;
        this.u = bVar.b;
        this.s = bVar.c;
    }

    public gn1(@x1 Parcel parcel) {
        this.s = parcel.createTypedArrayList(xm1.CREATOR);
        this.t = parcel.readString();
        this.u = parcel.readString();
    }
}