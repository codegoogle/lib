package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class xx implements Parcelable {
    public static final Parcelable.Creator<xx> CREATOR = new a();
    public final boolean A;
    public final Bundle B;
    public final boolean C;
    public final int D;
    public Bundle E;
    public final String s;
    public final String t;
    public final boolean u;
    public final int v;
    public final int w;
    public final String x;
    public final boolean y;
    public final boolean z;

    /* compiled from: FragmentState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<xx> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public xx createFromParcel(Parcel parcel) {
            return new xx(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public xx[] newArray(int i) {
            return new xx[i];
        }
    }

    public xx(Fragment fragment) {
        this.s = fragment.getClass().getName();
        this.t = fragment.mWho;
        this.u = fragment.mFromLayout;
        this.v = fragment.mFragmentId;
        this.w = fragment.mContainerId;
        this.x = fragment.mTag;
        this.y = fragment.mRetainInstance;
        this.z = fragment.mRemoving;
        this.A = fragment.mDetached;
        this.B = fragment.mArguments;
        this.C = fragment.mHidden;
        this.D = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.s);
        sb.append(" (");
        sb.append(this.t);
        sb.append(")}:");
        if (this.u) {
            sb.append(" fromLayout");
        }
        if (this.w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.w));
        }
        String str = this.x;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.x);
        }
        if (this.y) {
            sb.append(" retainInstance");
        }
        if (this.z) {
            sb.append(" removing");
        }
        if (this.A) {
            sb.append(" detached");
        }
        if (this.C) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeBundle(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeBundle(this.E);
        parcel.writeInt(this.D);
    }

    public xx(Parcel parcel) {
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readInt() != 0;
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readString();
        this.y = parcel.readInt() != 0;
        this.z = parcel.readInt() != 0;
        this.A = parcel.readInt() != 0;
        this.B = parcel.readBundle();
        this.C = parcel.readInt() != 0;
        this.E = parcel.readBundle();
        this.D = parcel.readInt();
    }
}