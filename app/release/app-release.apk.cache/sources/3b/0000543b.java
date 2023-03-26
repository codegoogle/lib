package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.rp0;

/* compiled from: NotificationData.java */
/* loaded from: classes2.dex */
public class oe1 implements Parcelable {
    public static final Parcelable.Creator<oe1> CREATOR = new a();
    public static final int s = 3333;
    @x1
    private static final String t = "vpnKeepAlive";
    @x1
    public final String u;
    @x1
    public final String v;
    @x1
    public final String w;
    public final int x;

    /* compiled from: NotificationData.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<oe1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public oe1 createFromParcel(@x1 Parcel parcel) {
            return new oe1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public oe1[] newArray(int i) {
            return new oe1[i];
        }
    }

    public oe1(@x1 String str, @x1 String str2, @x1 String str3, int i) {
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = i;
    }

    @x1
    public static oe1 c(@x1 Context context) {
        return new oe1(t, d(context), context.getResources().getString(rp0.k.E), rp0.f.u0);
    }

    @x1
    private static String d(@x1 Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return "";
        }
        int i = applicationInfo.labelRes;
        return i == 0 ? String.valueOf(applicationInfo.nonLocalizedLabel) : context.getString(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oe1 oe1Var = (oe1) obj;
        if (this.x == oe1Var.x && this.u.equals(oe1Var.u) && this.v.equals(oe1Var.v)) {
            return this.w.equals(oe1Var.w);
        }
        return false;
    }

    public int hashCode() {
        return wo1.x(this.w, wo1.x(this.v, this.u.hashCode() * 31, 31), 31) + this.x;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
    }

    public oe1(@x1 Parcel parcel) {
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readInt();
    }
}