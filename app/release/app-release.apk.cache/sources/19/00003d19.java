package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AppPolicy.java */
/* loaded from: classes2.dex */
public class co1 implements Parcelable {
    public static final Parcelable.Creator<co1> CREATOR = new a();
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    @mw2("policy")
    private final int v;
    @x1
    @mw2("reason")
    private final List<String> w;

    /* compiled from: AppPolicy.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<co1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public co1 createFromParcel(@x1 Parcel parcel) {
            return new co1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public co1[] newArray(int i) {
            return new co1[i];
        }
    }

    /* compiled from: AppPolicy.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private int a;
        @x1
        private List<String> b;

        public /* synthetic */ b(a aVar) {
            this();
        }

        @x1
        public b c(@x1 List<String> list) {
            this.b.clear();
            this.b.addAll(list);
            return this;
        }

        @x1
        public co1 d() {
            return new co1(this, null);
        }

        @x1
        public b e(int i) {
            this.a = i;
            return this;
        }

        private b() {
            this.a = 0;
            this.b = new ArrayList();
        }
    }

    public /* synthetic */ co1(b bVar, a aVar) {
        this(bVar);
    }

    @x1
    public static co1 c() {
        return g().d();
    }

    @x1
    public static b g() {
        return new b(null);
    }

    @x1
    public List<String> d() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.v;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        co1 co1Var = (co1) obj;
        if (this.v != co1Var.v) {
            return false;
        }
        return this.w.equals(co1Var.w);
    }

    public int hashCode() {
        return this.w.hashCode() + (this.v * 31);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("AppPolicy{policy=");
        G.append(this.v);
        G.append(", appList=");
        G.append(this.w);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeInt(this.v);
        parcel.writeStringList(this.w);
    }

    private co1(@x1 b bVar) {
        this.v = bVar.a;
        this.w = bVar.b;
    }

    public co1(@x1 Parcel parcel) {
        this.v = parcel.readInt();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.w = createStringArrayList == null ? new ArrayList<>() : createStringArrayList;
    }
}