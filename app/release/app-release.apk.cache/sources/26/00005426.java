package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: CalendarConstraints.java */
/* loaded from: classes3.dex */
public final class oc2 implements Parcelable {
    public static final Parcelable.Creator<oc2> CREATOR = new a();
    @x1
    private final dd2 s;
    @x1
    private final dd2 t;
    @x1
    private final c u;
    @z1
    private dd2 v;
    private final int w;
    private final int x;

    /* compiled from: CalendarConstraints.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<oc2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public oc2 createFromParcel(@x1 Parcel parcel) {
            return new oc2((dd2) parcel.readParcelable(dd2.class.getClassLoader()), (dd2) parcel.readParcelable(dd2.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (dd2) parcel.readParcelable(dd2.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public oc2[] newArray(int i) {
            return new oc2[i];
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* loaded from: classes3.dex */
    public interface c extends Parcelable {
        boolean b(long j);
    }

    public /* synthetic */ oc2(dd2 dd2Var, dd2 dd2Var2, c cVar, dd2 dd2Var3, a aVar) {
        this(dd2Var, dd2Var2, cVar, dd2Var3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oc2) {
            oc2 oc2Var = (oc2) obj;
            return this.s.equals(oc2Var.s) && this.t.equals(oc2Var.t) && ep.a(this.v, oc2Var.v) && this.u.equals(oc2Var.u);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.s, this.t, this.v, this.u});
    }

    public dd2 i(dd2 dd2Var) {
        if (dd2Var.compareTo(this.s) < 0) {
            return this.s;
        }
        return dd2Var.compareTo(this.t) > 0 ? this.t : dd2Var;
    }

    public c j() {
        return this.u;
    }

    @x1
    public dd2 k() {
        return this.t;
    }

    public int l() {
        return this.x;
    }

    @z1
    public dd2 m() {
        return this.v;
    }

    @x1
    public dd2 n() {
        return this.s;
    }

    public int o() {
        return this.w;
    }

    public boolean p(long j) {
        if (this.s.j(1) <= j) {
            dd2 dd2Var = this.t;
            if (j <= dd2Var.j(dd2Var.w)) {
                return true;
            }
        }
        return false;
    }

    public void q(@z1 dd2 dd2Var) {
        this.v = dd2Var;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.s, 0);
        parcel.writeParcelable(this.t, 0);
        parcel.writeParcelable(this.v, 0);
        parcel.writeParcelable(this.u, 0);
    }

    private oc2(@x1 dd2 dd2Var, @x1 dd2 dd2Var2, @x1 c cVar, @z1 dd2 dd2Var3) {
        this.s = dd2Var;
        this.t = dd2Var2;
        this.v = dd2Var3;
        this.u = cVar;
        if (dd2Var3 != null && dd2Var.compareTo(dd2Var3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (dd2Var3 != null && dd2Var3.compareTo(dd2Var2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.x = dd2Var.o(dd2Var2) + 1;
        this.w = (dd2Var2.u - dd2Var.u) + 1;
    }

    /* compiled from: CalendarConstraints.java */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final long a = md2.a(dd2.d(1900, 0).x);
        public static final long b = md2.a(dd2.d(2100, 11).x);
        private static final String c = "DEEP_COPY_VALIDATOR_KEY";
        private long d;
        private long e;
        private Long f;
        private c g;

        public b() {
            this.d = a;
            this.e = b;
            this.g = wc2.c(Long.MIN_VALUE);
        }

        @x1
        public oc2 a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(c, this.g);
            dd2 e = dd2.e(this.d);
            dd2 e2 = dd2.e(this.e);
            c cVar = (c) bundle.getParcelable(c);
            Long l = this.f;
            return new oc2(e, e2, cVar, l == null ? null : dd2.e(l.longValue()), null);
        }

        @x1
        public b b(long j) {
            this.e = j;
            return this;
        }

        @x1
        public b c(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @x1
        public b d(long j) {
            this.d = j;
            return this;
        }

        @x1
        public b e(@x1 c cVar) {
            this.g = cVar;
            return this;
        }

        public b(@x1 oc2 oc2Var) {
            this.d = a;
            this.e = b;
            this.g = wc2.c(Long.MIN_VALUE);
            this.d = oc2Var.s.x;
            this.e = oc2Var.t.x;
            this.f = Long.valueOf(oc2Var.v.x);
            this.g = oc2Var.u;
        }
    }
}