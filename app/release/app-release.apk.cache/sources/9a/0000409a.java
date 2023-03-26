package com.p7700g.p99005;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: TimeModel.java */
/* loaded from: classes3.dex */
public class ej2 implements Parcelable {
    public static final Parcelable.Creator<ej2> CREATOR = new a();
    public static final String s = "%02d";
    public static final String t = "%d";
    public int A;
    private final bj2 u;
    private final bj2 v;
    public final int w;
    public int x;
    public int y;
    public int z;

    /* compiled from: TimeModel.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<ej2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ej2 createFromParcel(Parcel parcel) {
            return new ej2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ej2[] newArray(int i) {
            return new ej2[i];
        }
    }

    public ej2() {
        this(0);
    }

    public static String c(Resources resources, CharSequence charSequence) {
        return d(resources, charSequence, s);
    }

    public static String d(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int j(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        if (this.w == 1) {
            return this.x % 24;
        }
        int i = this.x;
        if (i % 12 == 0) {
            return 12;
        }
        return this.A == 1 ? i - 12 : i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ej2) {
            ej2 ej2Var = (ej2) obj;
            return this.x == ej2Var.x && this.y == ej2Var.y && this.w == ej2Var.w && this.z == ej2Var.z;
        }
        return false;
    }

    public bj2 g() {
        return this.v;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z)});
    }

    public bj2 i() {
        return this.u;
    }

    public void k(int i) {
        if (this.w == 1) {
            this.x = i;
        } else {
            this.x = (i % 12) + (this.A != 1 ? 0 : 12);
        }
    }

    public void l(int i) {
        this.A = j(i);
        this.x = i;
    }

    public void m(@p1(from = 0, to = 59) int i) {
        this.y = i % 60;
    }

    public void n(int i) {
        if (i != this.A) {
            this.A = i;
            int i2 = this.x;
            if (i2 < 12 && i == 1) {
                this.x = i2 + 12;
            } else if (i2 < 12 || i != 0) {
            } else {
                this.x = i2 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.w);
    }

    public ej2(int i) {
        this(0, 0, 10, i);
    }

    public ej2(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.w = i4;
        this.A = j(i);
        this.u = new bj2(59);
        this.v = new bj2(i4 == 1 ? 24 : 12);
    }

    public ej2(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}