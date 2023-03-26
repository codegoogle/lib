package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ExtendableSavedState.java */
/* loaded from: classes3.dex */
public class fi2 extends au {
    public static final Parcelable.Creator<fi2> CREATOR = new a();
    @x1
    public final y7<String, Bundle> s;

    /* compiled from: ExtendableSavedState.java */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.ClassLoaderCreator<fi2> {
        @Override // android.os.Parcelable.Creator
        @z1
        /* renamed from: a */
        public fi2 createFromParcel(@x1 Parcel parcel) {
            return new fi2(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @x1
        /* renamed from: b */
        public fi2 createFromParcel(@x1 Parcel parcel, ClassLoader classLoader) {
            return new fi2(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @x1
        /* renamed from: c */
        public fi2[] newArray(int i) {
            return new fi2[i];
        }
    }

    public /* synthetic */ fi2(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("ExtendableSavedState{");
        G.append(Integer.toHexString(System.identityHashCode(this)));
        G.append(" states=");
        G.append(this.s);
        G.append("}");
        return G.toString();
    }

    @Override // com.p7700g.p99005.au, android.os.Parcelable
    public void writeToParcel(@x1 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.s.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.s.n(i2);
            bundleArr[i2] = this.s.r(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public fi2(Parcelable parcelable) {
        super(parcelable);
        this.s = new y7<>();
    }

    private fi2(@x1 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.s = new y7<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.s.put(strArr[i], bundleArr[i]);
        }
    }
}