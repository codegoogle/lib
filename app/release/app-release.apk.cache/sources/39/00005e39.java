package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import java.util.UUID;

/* compiled from: ConnectionAttemptId.java */
/* loaded from: classes2.dex */
public class ti1 implements Parcelable {
    @x1
    private final String t;
    private final long u;
    @x1
    public static final ti1 s = new ti1("", 0);
    @x1
    public static final Parcelable.Creator<ti1> CREATOR = new a();

    /* compiled from: ConnectionAttemptId.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<ti1> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public ti1 createFromParcel(@x1 Parcel parcel) {
            ti1 ti1Var = new ti1(parcel);
            ti1 ti1Var2 = ti1.s;
            return ti1Var.equals(ti1Var2) ? ti1Var2 : ti1Var;
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public ti1[] newArray(int i) {
            return new ti1[i];
        }
    }

    private ti1(@x1 String str, long j) {
        this.t = str;
        this.u = j;
    }

    @x1
    public static ti1 c() {
        return new ti1(UUID.randomUUID().toString().replaceAll("-", "").toUpperCase(Locale.ENGLISH), System.currentTimeMillis());
    }

    @x1
    public String d() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.u;
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ti1 ti1Var = (ti1) obj;
        if (this.u != ti1Var.u) {
            return false;
        }
        return this.t.equals(ti1Var.t);
    }

    @x1
    public String g() {
        if (!i()) {
            long j = this.u;
            if (j != 0) {
                return Long.toString(j);
            }
        }
        return "";
    }

    public int hashCode() {
        long j = this.u;
        return (this.t.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public boolean i() {
        return this == s;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("ConnectionAttemptId{id='");
        wo1.d0(G, this.t, '\'', ", time=");
        G.append(this.u);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.t);
        parcel.writeLong(this.u);
    }

    public ti1(@x1 Parcel parcel) {
        this.t = parcel.readString();
        this.u = parcel.readLong();
    }
}