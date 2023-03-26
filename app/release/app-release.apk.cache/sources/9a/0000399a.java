package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class au implements Parcelable {
    private final Parcelable mSuperState;
    public static final au EMPTY_STATE = new a();
    public static final Parcelable.Creator<au> CREATOR = new b();

    /* compiled from: AbsSavedState.java */
    /* loaded from: classes.dex */
    public class a extends au {
        public a() {
            super((a) null);
        }
    }

    /* compiled from: AbsSavedState.java */
    /* loaded from: classes.dex */
    public class b implements Parcelable.ClassLoaderCreator<au> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public au createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public au createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return au.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public au[] newArray(int i) {
            return new au[i];
        }
    }

    public /* synthetic */ au(a aVar) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @z1
    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }

    private au() {
        this.mSuperState = null;
    }

    public au(@x1 Parcelable parcelable) {
        if (parcelable != null) {
            this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public au(@x1 Parcel parcel) {
        this(parcel, null);
    }

    public au(@x1 Parcel parcel, @z1 ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.mSuperState = readParcelable == null ? EMPTY_STATE : readParcelable;
    }
}