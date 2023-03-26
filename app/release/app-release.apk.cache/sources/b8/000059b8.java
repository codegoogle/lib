package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.oc2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositeDateValidator.java */
/* loaded from: classes3.dex */
public final class rc2 implements oc2.c {
    private static final int s = 1;
    private static final int t = 2;
    @x1
    private final d w;
    @x1
    private final List<oc2.c> x;
    private static final d u = new a();
    private static final d v = new b();
    public static final Parcelable.Creator<rc2> CREATOR = new c();

    /* compiled from: CompositeDateValidator.java */
    /* loaded from: classes3.dex */
    public class a implements d {
        @Override // com.p7700g.p99005.rc2.d
        public boolean a(@x1 List<oc2.c> list, long j) {
            for (oc2.c cVar : list) {
                if (cVar != null && cVar.b(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p7700g.p99005.rc2.d
        public int getId() {
            return 1;
        }
    }

    /* compiled from: CompositeDateValidator.java */
    /* loaded from: classes3.dex */
    public class b implements d {
        @Override // com.p7700g.p99005.rc2.d
        public boolean a(@x1 List<oc2.c> list, long j) {
            for (oc2.c cVar : list) {
                if (cVar != null && !cVar.b(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.p7700g.p99005.rc2.d
        public int getId() {
            return 2;
        }
    }

    /* compiled from: CompositeDateValidator.java */
    /* loaded from: classes3.dex */
    public class c implements Parcelable.Creator<rc2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public rc2 createFromParcel(@x1 Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(oc2.c.class.getClassLoader());
            int readInt = parcel.readInt();
            return new rc2((List) jp.l(readArrayList), readInt == 2 ? rc2.v : readInt == 1 ? rc2.u : rc2.v, null);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public rc2[] newArray(int i) {
            return new rc2[i];
        }
    }

    /* compiled from: CompositeDateValidator.java */
    /* loaded from: classes3.dex */
    public interface d {
        boolean a(@x1 List<oc2.c> list, long j);

        int getId();
    }

    public /* synthetic */ rc2(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @x1
    public static oc2.c e(@x1 List<oc2.c> list) {
        return new rc2(list, v);
    }

    @x1
    public static oc2.c g(@x1 List<oc2.c> list) {
        return new rc2(list, u);
    }

    @Override // com.p7700g.p99005.oc2.c
    public boolean b(long j) {
        return this.w.a(this.x, j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rc2) {
            rc2 rc2Var = (rc2) obj;
            return this.x.equals(rc2Var.x) && this.w.getId() == rc2Var.w.getId();
        }
        return false;
    }

    public int hashCode() {
        return this.x.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeList(this.x);
        parcel.writeInt(this.w.getId());
    }

    private rc2(@x1 List<oc2.c> list, d dVar) {
        this.x = list;
        this.w = dVar;
    }
}