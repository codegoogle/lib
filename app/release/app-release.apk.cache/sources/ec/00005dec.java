package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.p7700g.p99005.i2;

/* compiled from: ParcelableSparseArray.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class te2 extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<te2> CREATOR = new a();

    /* compiled from: ParcelableSparseArray.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.ClassLoaderCreator<te2> {
        @Override // android.os.Parcelable.Creator
        @z1
        /* renamed from: a */
        public te2 createFromParcel(@x1 Parcel parcel) {
            return new te2(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @x1
        /* renamed from: b */
        public te2 createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
            return new te2(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: c */
        public te2[] newArray(int i) {
            return new te2[i];
        }
    }

    public te2() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public te2(@x1 Parcel parcel, @z1 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }
}