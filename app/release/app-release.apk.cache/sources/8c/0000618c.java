package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.oc2;
import java.util.Arrays;

/* compiled from: DateValidatorPointBackward.java */
/* loaded from: classes3.dex */
public class vc2 implements oc2.c {
    public static final Parcelable.Creator<vc2> CREATOR = new a();
    private final long s;

    /* compiled from: DateValidatorPointBackward.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<vc2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public vc2 createFromParcel(@x1 Parcel parcel) {
            return new vc2(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public vc2[] newArray(int i) {
            return new vc2[i];
        }
    }

    public /* synthetic */ vc2(long j, a aVar) {
        this(j);
    }

    @x1
    public static vc2 c(long j) {
        return new vc2(j);
    }

    @x1
    public static vc2 d() {
        return c(md2.t().getTimeInMillis());
    }

    @Override // com.p7700g.p99005.oc2.c
    public boolean b(long j) {
        return j <= this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc2) && this.s == ((vc2) obj).s;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeLong(this.s);
    }

    private vc2(long j) {
        this.s = j;
    }
}