package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import com.p7700g.p99005.i2;

/* compiled from: ParcelableSparseIntArray.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ve2 extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ve2> CREATOR = new a();

    /* compiled from: ParcelableSparseIntArray.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<ve2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public ve2 createFromParcel(@x1 Parcel parcel) {
            int readInt = parcel.readInt();
            ve2 ve2Var = new ve2(readInt);
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i = 0; i < readInt; i++) {
                ve2Var.put(iArr[i], iArr2[i]);
            }
            return ve2Var;
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public ve2[] newArray(int i) {
            return new ve2[i];
        }
    }

    public ve2() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            iArr2[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public ve2(int i) {
        super(i);
    }

    public ve2(@x1 SparseIntArray sparseIntArray) {
        for (int i = 0; i < sparseIntArray.size(); i++) {
            put(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }
}