package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ParcelableCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class cn {

    /* compiled from: ParcelableCompat.java */
    /* loaded from: classes.dex */
    public static class a<T> implements Parcelable.ClassLoaderCreator<T> {
        private final dn<T> a;

        public a(dn<T> dnVar) {
            this.a = dnVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.a.newArray(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.a.createFromParcel(parcel, classLoader);
        }
    }

    private cn() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(dn<T> dnVar) {
        return new a(dnVar);
    }
}