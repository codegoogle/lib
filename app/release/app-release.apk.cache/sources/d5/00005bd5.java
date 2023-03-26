package com.p7700g.p99005;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.w4;

/* compiled from: NavigationBarPresenter.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class sf2 implements w4 {
    private p4 s;
    private rf2 t;
    private boolean u = false;
    private int v;

    /* compiled from: NavigationBarPresenter.java */
    /* loaded from: classes3.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0241a();
        public int s;
        @z1
        public te2 t;

        /* compiled from: NavigationBarPresenter.java */
        /* renamed from: com.p7700g.p99005.sf2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0241a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: a */
            public a createFromParcel(@x1 Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @x1
            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@x1 Parcel parcel, int i) {
            parcel.writeInt(this.s);
            parcel.writeParcelable(this.t, 0);
        }

        public a(@x1 Parcel parcel) {
            this.s = parcel.readInt();
            this.t = (te2) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i) {
        this.v = i;
    }

    public void b(@x1 rf2 rf2Var) {
        this.t = rf2Var;
    }

    public void c(boolean z) {
        this.u = z;
    }

    @Override // com.p7700g.p99005.w4
    public boolean collapseItemActionView(@z1 p4 p4Var, @z1 s4 s4Var) {
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public boolean expandItemActionView(@z1 p4 p4Var, @z1 s4 s4Var) {
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public boolean flagActionItems() {
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public int getId() {
        return this.v;
    }

    @Override // com.p7700g.p99005.w4
    @z1
    public x4 getMenuView(@z1 ViewGroup viewGroup) {
        return this.t;
    }

    @Override // com.p7700g.p99005.w4
    public void initForMenu(@x1 Context context, @x1 p4 p4Var) {
        this.s = p4Var;
        this.t.initialize(p4Var);
    }

    @Override // com.p7700g.p99005.w4
    public void onCloseMenu(@z1 p4 p4Var, boolean z) {
    }

    @Override // com.p7700g.p99005.w4
    public void onRestoreInstanceState(@x1 Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.t.q(aVar.s);
            this.t.o(ab2.g(this.t.getContext(), aVar.t));
        }
    }

    @Override // com.p7700g.p99005.w4
    @x1
    public Parcelable onSaveInstanceState() {
        a aVar = new a();
        aVar.s = this.t.getSelectedItemId();
        aVar.t = ab2.h(this.t.getBadgeDrawables());
        return aVar;
    }

    @Override // com.p7700g.p99005.w4
    public boolean onSubMenuSelected(@z1 b5 b5Var) {
        return false;
    }

    @Override // com.p7700g.p99005.w4
    public void setCallback(@z1 w4.a aVar) {
    }

    @Override // com.p7700g.p99005.w4
    public void updateMenuView(boolean z) {
        if (this.u) {
            return;
        }
        if (z) {
            this.t.c();
        } else {
            this.t.r();
        }
    }
}