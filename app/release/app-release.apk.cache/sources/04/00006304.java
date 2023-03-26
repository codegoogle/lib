package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: VpnStateEvent.java */
/* loaded from: classes.dex */
public class w51 implements Parcelable {
    public static final Parcelable.Creator<w51> CREATOR = new a();
    @x1
    private final en1 s;

    /* compiled from: VpnStateEvent.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<w51> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public w51 createFromParcel(@x1 Parcel parcel) {
            return new w51(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public w51[] newArray(int i) {
            return new w51[i];
        }
    }

    public w51(@x1 en1 en1Var) {
        this.s = en1Var;
    }

    @x1
    public en1 c() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeParcelable(this.s, i);
    }

    public w51(@x1 Parcel parcel) {
        en1 en1Var = (en1) parcel.readParcelable(en1.class.getClassLoader());
        Objects.requireNonNull(en1Var);
        this.s = en1Var;
    }
}