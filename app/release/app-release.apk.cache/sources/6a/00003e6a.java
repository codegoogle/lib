package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Month.java */
/* loaded from: classes3.dex */
public final class dd2 implements Comparable<dd2>, Parcelable {
    public static final Parcelable.Creator<dd2> CREATOR = new a();
    @x1
    private final Calendar s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final long x;
    @z1
    private String y;

    /* compiled from: Month.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<dd2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public dd2 createFromParcel(@x1 Parcel parcel) {
            return dd2.d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public dd2[] newArray(int i) {
            return new dd2[i];
        }
    }

    private dd2(@x1 Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = md2.f(calendar);
        this.s = f;
        this.t = f.get(2);
        this.u = f.get(1);
        this.v = f.getMaximum(7);
        this.w = f.getActualMaximum(5);
        this.x = f.getTimeInMillis();
    }

    @x1
    public static dd2 d(int i, int i2) {
        Calendar v = md2.v();
        v.set(1, i);
        v.set(2, i2);
        return new dd2(v);
    }

    @x1
    public static dd2 e(long j) {
        Calendar v = md2.v();
        v.setTimeInMillis(j);
        return new dd2(v);
    }

    @x1
    public static dd2 g() {
        return new dd2(md2.t());
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(@x1 dd2 dd2Var) {
        return this.s.compareTo(dd2Var.s);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dd2) {
            dd2 dd2Var = (dd2) obj;
            return this.t == dd2Var.t && this.u == dd2Var.u;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.t), Integer.valueOf(this.u)});
    }

    public int i() {
        int firstDayOfWeek = this.s.get(7) - this.s.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.v : firstDayOfWeek;
    }

    public long j(int i) {
        Calendar f = md2.f(this.s);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    public int k(long j) {
        Calendar f = md2.f(this.s);
        f.setTimeInMillis(j);
        return f.get(5);
    }

    @x1
    public String l() {
        if (this.y == null) {
            this.y = uc2.i(this.s.getTimeInMillis());
        }
        return this.y;
    }

    public long m() {
        return this.s.getTimeInMillis();
    }

    @x1
    public dd2 n(int i) {
        Calendar f = md2.f(this.s);
        f.add(2, i);
        return new dd2(f);
    }

    public int o(@x1 dd2 dd2Var) {
        if (this.s instanceof GregorianCalendar) {
            return (dd2Var.t - this.t) + ((dd2Var.u - this.u) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeInt(this.u);
        parcel.writeInt(this.t);
    }
}