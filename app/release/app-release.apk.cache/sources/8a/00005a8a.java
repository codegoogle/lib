package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PositionSavedState.java */
/* loaded from: classes3.dex */
public class rq3 extends View.BaseSavedState {
    public static final Parcelable.Creator<rq3> CREATOR = new a();
    private int s;
    private int t;
    private int u;

    /* compiled from: PositionSavedState.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<rq3> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public rq3 createFromParcel(Parcel parcel) {
            return new rq3(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public rq3[] newArray(int i) {
            return new rq3[i];
        }
    }

    public /* synthetic */ rq3(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int c() {
        return this.u;
    }

    public int d() {
        return this.s;
    }

    public int e() {
        return this.t;
    }

    public void g(int i) {
        this.u = i;
    }

    public void i(int i) {
        this.s = i;
    }

    public void j(int i) {
        this.t = i;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
    }

    public rq3(Parcelable parcelable) {
        super(parcelable);
    }

    private rq3(Parcel parcel) {
        super(parcel);
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
    }
}