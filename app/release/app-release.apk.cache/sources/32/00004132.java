package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p7700g.p99005.dy;
import com.p7700g.p99005.mz;
import java.util.ArrayList;

/* compiled from: BackStackState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ex implements Parcelable {
    public static final Parcelable.Creator<ex> CREATOR = new a();
    private static final String s = "FragmentManager";
    public final int A;
    public final CharSequence B;
    public final int C;
    public final CharSequence D;
    public final ArrayList<String> E;
    public final ArrayList<String> F;
    public final boolean G;
    public final int[] t;
    public final ArrayList<String> u;
    public final int[] v;
    public final int[] w;
    public final int x;
    public final String y;
    public final int z;

    /* compiled from: BackStackState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<ex> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ex createFromParcel(Parcel parcel) {
            return new ex(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ex[] newArray(int i) {
            return new ex[i];
        }
    }

    public ex(dx dxVar) {
        int size = dxVar.u.size();
        this.t = new int[size * 5];
        if (dxVar.A) {
            this.u = new ArrayList<>(size);
            this.v = new int[size];
            this.w = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                dy.a aVar = dxVar.u.get(i);
                int i3 = i2 + 1;
                this.t[i2] = aVar.a;
                ArrayList<String> arrayList = this.u;
                Fragment fragment = aVar.b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.t;
                int i4 = i3 + 1;
                iArr[i3] = aVar.c;
                int i5 = i4 + 1;
                iArr[i4] = aVar.d;
                int i6 = i5 + 1;
                iArr[i5] = aVar.e;
                iArr[i6] = aVar.f;
                this.v[i] = aVar.g.ordinal();
                this.w[i] = aVar.h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.x = dxVar.z;
            this.y = dxVar.C;
            this.z = dxVar.O;
            this.A = dxVar.D;
            this.B = dxVar.E;
            this.C = dxVar.F;
            this.D = dxVar.G;
            this.E = dxVar.H;
            this.F = dxVar.I;
            this.G = dxVar.J;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public dx c(FragmentManager fragmentManager) {
        dx dxVar = new dx(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.t.length) {
            dy.a aVar = new dy.a();
            int i3 = i + 1;
            aVar.a = this.t[i];
            if (FragmentManager.T0(2)) {
                String str = "Instantiate " + dxVar + " op #" + i2 + " base fragment #" + this.t[i3];
            }
            String str2 = this.u.get(i2);
            if (str2 != null) {
                aVar.b = fragmentManager.n0(str2);
            } else {
                aVar.b = null;
            }
            aVar.g = mz.c.values()[this.v[i2]];
            aVar.h = mz.c.values()[this.w[i2]];
            int[] iArr = this.t;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar.c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar.d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar.e = i9;
            int i10 = iArr[i8];
            aVar.f = i10;
            dxVar.v = i5;
            dxVar.w = i7;
            dxVar.x = i9;
            dxVar.y = i10;
            dxVar.m(aVar);
            i2++;
            i = i8 + 1;
        }
        dxVar.z = this.x;
        dxVar.C = this.y;
        dxVar.O = this.z;
        dxVar.A = true;
        dxVar.D = this.A;
        dxVar.E = this.B;
        dxVar.F = this.C;
        dxVar.G = this.D;
        dxVar.H = this.E;
        dxVar.I = this.F;
        dxVar.J = this.G;
        dxVar.U(1);
        return dxVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.t);
        parcel.writeStringList(this.u);
        parcel.writeIntArray(this.v);
        parcel.writeIntArray(this.w);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        TextUtils.writeToParcel(this.B, parcel, 0);
        parcel.writeInt(this.C);
        TextUtils.writeToParcel(this.D, parcel, 0);
        parcel.writeStringList(this.E);
        parcel.writeStringList(this.F);
        parcel.writeInt(this.G ? 1 : 0);
    }

    public ex(Parcel parcel) {
        this.t = parcel.createIntArray();
        this.u = parcel.createStringArrayList();
        this.v = parcel.createIntArray();
        this.w = parcel.createIntArray();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.C = parcel.readInt();
        this.D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.E = parcel.createStringArrayList();
        this.F = parcel.createStringArrayList();
        this.G = parcel.readInt() != 0;
    }
}