package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: GifViewSavedState.java */
/* loaded from: classes4.dex */
public class zx5 extends View.BaseSavedState {
    public static final Parcelable.Creator<zx5> CREATOR = new a();
    public final long[][] s;

    /* compiled from: GifViewSavedState.java */
    /* loaded from: classes4.dex */
    public static class a implements Parcelable.Creator<zx5> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public zx5 createFromParcel(Parcel parcel) {
            return new zx5(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public zx5[] newArray(int i) {
            return new zx5[i];
        }
    }

    public /* synthetic */ zx5(Parcel parcel, a aVar) {
        this(parcel);
    }

    public void c(Drawable drawable, int i) {
        long[][] jArr = this.s;
        if (jArr[i] == null || !(drawable instanceof ox5)) {
            return;
        }
        ox5 ox5Var = (ox5) drawable;
        ox5Var.M(ox5Var.y.E(jArr[i], ox5Var.x));
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.s.length);
        for (long[] jArr : this.s) {
            parcel.writeLongArray(jArr);
        }
    }

    public zx5(Parcelable parcelable, Drawable... drawableArr) {
        super(parcelable);
        this.s = new long[drawableArr.length];
        for (int i = 0; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable instanceof ox5) {
                this.s[i] = ((ox5) drawable).y.o();
            } else {
                this.s[i] = null;
            }
        }
    }

    private zx5(Parcel parcel) {
        super(parcel);
        this.s = new long[parcel.readInt()];
        int i = 0;
        while (true) {
            long[][] jArr = this.s;
            if (i >= jArr.length) {
                return;
            }
            jArr[i] = parcel.createLongArray();
            i++;
        }
    }

    public zx5(Parcelable parcelable, long[] jArr) {
        super(parcelable);
        this.s = r2;
        long[][] jArr2 = {jArr};
    }
}