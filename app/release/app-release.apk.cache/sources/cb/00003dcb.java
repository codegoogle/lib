package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ActivityResult.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    @x1
    public static final Parcelable.Creator<d0> CREATOR = new a();
    private final int s;
    @z1
    private final Intent t;

    /* compiled from: ActivityResult.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d0 createFromParcel(@x1 Parcel parcel) {
            return new d0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d0[] newArray(int i) {
            return new d0[i];
        }
    }

    public d0(int i, @z1 Intent intent) {
        this.s = i;
        this.t = intent;
    }

    @x1
    public static String e(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @z1
    public Intent c() {
        return this.t;
    }

    public int d() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder G = wo1.G("ActivityResult{resultCode=");
        G.append(e(this.s));
        G.append(", data=");
        G.append(this.t);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeInt(this.s);
        parcel.writeInt(this.t == null ? 0 : 1);
        Intent intent = this.t;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public d0(Parcel parcel) {
        this.s = parcel.readInt();
        this.t = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}