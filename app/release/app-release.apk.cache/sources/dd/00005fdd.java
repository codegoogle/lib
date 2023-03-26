package com.p7700g.p99005;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import com.p7700g.p99005.i2;

/* compiled from: ParcelableSparseBooleanArray.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ue2 extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ue2> CREATOR = new a();

    /* compiled from: ParcelableSparseBooleanArray.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<ue2> {
        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: a */
        public ue2 createFromParcel(@x1 Parcel parcel) {
            int readInt = parcel.readInt();
            ue2 ue2Var = new ue2(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i = 0; i < readInt; i++) {
                ue2Var.put(iArr[i], zArr[i]);
            }
            return ue2Var;
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: b */
        public ue2[] newArray(int i) {
            return new ue2[i];
        }
    }

    public ue2() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            zArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public ue2(int i) {
        super(i);
    }

    public ue2(@x1 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            put(sparseBooleanArray.keyAt(i), sparseBooleanArray.valueAt(i));
        }
    }
}