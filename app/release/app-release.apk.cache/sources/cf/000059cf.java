package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReconnectSettings.java */
/* loaded from: classes2.dex */
public class re1 implements Parcelable {
    @x1
    @mw2("exception_handlers")
    private List<vn1<? extends pe1>> t;
    @mw2("use_paused_state")
    private boolean u;
    @mw2("capabilities_check")
    private boolean v;
    @mw2("connection_observer_factory")
    @z1
    private vn1<? extends oc1> w;
    @z1
    private oe1 x;
    @x1
    private static final kj1 s = kj1.b("ReconnectSettings");
    public static final Parcelable.Creator<re1> CREATOR = new a();

    /* compiled from: ReconnectSettings.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<re1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public re1 createFromParcel(@x1 Parcel parcel) {
            return new re1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public re1[] newArray(int i) {
            return new re1[i];
        }
    }

    private re1() {
        this.u = true;
        this.v = false;
        this.t = new ArrayList();
        this.w = null;
    }

    @x1
    public static re1 d() {
        return new re1();
    }

    @x1
    public re1 c(@x1 oe1 oe1Var) {
        this.x = oe1Var;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public oe1 e() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        re1 re1Var = (re1) obj;
        if (this.u == re1Var.u && this.v == re1Var.v && this.t.equals(re1Var.t) && r81.d(this.w, re1Var.w)) {
            return r81.d(this.x, re1Var.x);
        }
        return false;
    }

    @x1
    public List<vn1<? extends pe1>> g() {
        return this.t;
    }

    public int hashCode() {
        int hashCode = ((((this.t.hashCode() * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31;
        oe1 oe1Var = this.x;
        int hashCode2 = (hashCode + (oe1Var != null ? oe1Var.hashCode() : 0)) * 31;
        vn1<? extends oc1> vn1Var = this.w;
        return hashCode2 + (vn1Var != null ? vn1Var.hashCode() : 0);
    }

    @x1
    public oc1 i() {
        try {
            if (this.w != null) {
                return (oc1) un1.a().b(this.w);
            }
        } catch (tn1 e) {
            s.f(e);
        }
        return oc1.a;
    }

    @x1
    public List<? extends pe1> j() throws tn1 {
        ArrayList arrayList = new ArrayList();
        for (vn1<? extends pe1> vn1Var : this.t) {
            arrayList.add((pe1) un1.a().b(vn1Var));
        }
        return arrayList;
    }

    public boolean k() {
        return this.v;
    }

    @x1
    public re1 l(boolean z) {
        this.u = z;
        return this;
    }

    @x1
    public re1 m(@x1 vn1<? extends pe1> vn1Var) {
        this.t.add(vn1Var);
        return this;
    }

    @x1
    public re1 n(boolean z) {
        this.v = z;
        return this;
    }

    public void o(@x1 oe1 oe1Var) {
        this.x = oe1Var;
    }

    @x1
    public re1 p(@z1 vn1<? extends oc1> vn1Var) {
        this.w = vn1Var;
        return this;
    }

    public boolean q() {
        return this.u;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("ReconnectSettings{exceptionHandlers=");
        G.append(this.t);
        G.append(", usePausedState=");
        G.append(this.u);
        G.append(", capabilitiesCheck=");
        G.append(this.v);
        G.append(", connectingNotification=");
        G.append(this.x);
        G.append(", connectionObserverFactory=");
        G.append(this.w);
        G.append('}');
        return G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        parcel.writeParcelableArray((vn1[]) this.t.toArray(new vn1[0]), i);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.x, i);
        parcel.writeParcelable(this.w, i);
    }

    public re1(@x1 Parcel parcel) {
        this.u = true;
        this.v = false;
        this.t = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) r81.f(parcel.readParcelableArray(pe1.class.getClassLoader()))) {
            this.t.add((vn1) parcelable);
        }
        this.u = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.x = (oe1) parcel.readParcelable(oe1.class.getClassLoader());
        this.w = (vn1) parcel.readParcelable(oc1.class.getClassLoader());
    }
}