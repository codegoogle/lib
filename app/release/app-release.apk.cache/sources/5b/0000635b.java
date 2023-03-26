package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.oc2;
import java.util.Arrays;

/* compiled from: DateValidatorPointForward.java */
/* loaded from: classes3.dex */
public class wc2 implements oc2.c {
    public static final Parcelable.Creator<wc2> CREATOR = new a();
    private final long s;

    /* compiled from: DateValidatorPointForward.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<wc2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public wc2 createFromParcel(@x1 Parcel parcel) {
            return new wc2(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public wc2[] newArray(int i) {
            return new wc2[i];
        }
    }

    public /* synthetic */ wc2(long j, a aVar) {
        this(j);
    }

    @x1
    public static wc2 c(long j) {
        return new wc2(j);
    }

    @x1
    public static wc2 d() {
        return c(md2.t().getTimeInMillis());
    }

    @Override // com.p7700g.p99005.oc2.c
    public boolean b(long j) {
        return j >= this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc2) && this.s == ((wc2) obj).s;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.s)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeLong(this.s);
    }

    private wc2(long j) {
        this.s = j;
    }
}