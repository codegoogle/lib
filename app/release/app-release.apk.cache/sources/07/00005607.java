package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ReconnectExceptionHandler.java */
/* loaded from: classes2.dex */
public abstract class pe1 implements Parcelable {
    public static final int s = 3;
    private final int t;
    @z1
    private qe1 u;

    public pe1(int i) {
        this.t = i;
    }

    public void c(@x1 qe1 qe1Var) {
        this.u = qe1Var;
    }

    public boolean d(@x1 ve1 ve1Var, @x1 gc1 gc1Var, @x1 en1 en1Var, int i) {
        return this.t > i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @x1
    public qe1 e() {
        qe1 qe1Var = this.u;
        if (qe1Var != null) {
            return qe1Var;
        }
        throw new IllegalStateException("reconnectManager is null");
    }

    public boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.t == ((pe1) obj).t;
    }

    public abstract void g(@x1 ve1 ve1Var, @x1 gc1 gc1Var, int i);

    public int hashCode() {
        return this.t;
    }

    public void i() {
    }

    public void j() {
    }

    @x1
    public String toString() {
        return wo1.y(wo1.G("ReconnectExceptionHandler{reconnectionAttemptLimit="), this.t, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeInt(this.t);
    }

    public pe1(@x1 Parcel parcel) {
        this.t = parcel.readInt();
    }
}