package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class rx implements Parcelable {
    public static final Parcelable.Creator<rx> CREATOR = new a();
    public ArrayList<xx> s;
    public ArrayList<String> t;
    public ex[] u;
    public int v;
    public String w;
    public ArrayList<String> x;
    public ArrayList<Bundle> y;
    public ArrayList<FragmentManager.n> z;

    /* compiled from: FragmentManagerState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<rx> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public rx createFromParcel(Parcel parcel) {
            return new rx(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public rx[] newArray(int i) {
            return new rx[i];
        }
    }

    public rx() {
        this.w = null;
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.s);
        parcel.writeStringList(this.t);
        parcel.writeTypedArray(this.u, i);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeStringList(this.x);
        parcel.writeTypedList(this.y);
        parcel.writeTypedList(this.z);
    }

    public rx(Parcel parcel) {
        this.w = null;
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        this.s = parcel.createTypedArrayList(xx.CREATOR);
        this.t = parcel.createStringArrayList();
        this.u = (ex[]) parcel.createTypedArray(ex.CREATOR);
        this.v = parcel.readInt();
        this.w = parcel.readString();
        this.x = parcel.createStringArrayList();
        this.y = parcel.createTypedArrayList(Bundle.CREATOR);
        this.z = parcel.createTypedArrayList(FragmentManager.n.CREATOR);
    }
}