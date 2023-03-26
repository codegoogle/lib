package com.p7700g.p99005;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.p7700g.p99005.i2;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class ma0 extends la0 {
    private static final boolean t = false;
    private static final String u = "VersionedParcelParcel";
    private int A;
    private int B;
    private int C;
    private final SparseIntArray v;
    private final Parcel w;
    private final int x;
    private final int y;
    private final String z;

    public ma0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new q7(), new q7(), new q7());
    }

    @Override // com.p7700g.p99005.la0
    public void C0(double d) {
        this.w.writeDouble(d);
    }

    @Override // com.p7700g.p99005.la0
    public boolean F(int i) {
        while (this.B < this.y) {
            int i2 = this.C;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.w.setDataPosition(this.B);
            int readInt = this.w.readInt();
            this.C = this.w.readInt();
            this.B += readInt;
        }
        return this.C == i;
    }

    @Override // com.p7700g.p99005.la0
    public float G() {
        return this.w.readFloat();
    }

    @Override // com.p7700g.p99005.la0
    public void H0(float f) {
        this.w.writeFloat(f);
    }

    @Override // com.p7700g.p99005.la0
    public int L() {
        return this.w.readInt();
    }

    @Override // com.p7700g.p99005.la0
    public void L0(int i) {
        this.w.writeInt(i);
    }

    @Override // com.p7700g.p99005.la0
    public long Q() {
        return this.w.readLong();
    }

    @Override // com.p7700g.p99005.la0
    public void Q0(long j) {
        this.w.writeLong(j);
    }

    @Override // com.p7700g.p99005.la0
    public <T extends Parcelable> T V() {
        return (T) this.w.readParcelable(getClass().getClassLoader());
    }

    @Override // com.p7700g.p99005.la0
    public void W0(Parcelable parcelable) {
        this.w.writeParcelable(parcelable, 0);
    }

    @Override // com.p7700g.p99005.la0
    public void a() {
        int i = this.A;
        if (i >= 0) {
            int i2 = this.v.get(i);
            int dataPosition = this.w.dataPosition();
            this.w.setDataPosition(i2);
            this.w.writeInt(dataPosition - i2);
            this.w.setDataPosition(dataPosition);
        }
    }

    @Override // com.p7700g.p99005.la0
    public la0 c() {
        Parcel parcel = this.w;
        int dataPosition = parcel.dataPosition();
        int i = this.B;
        if (i == this.x) {
            i = this.y;
        }
        return new ma0(parcel, dataPosition, i, wo1.C(new StringBuilder(), this.z, g54.A), this.q, this.r, this.s);
    }

    @Override // com.p7700g.p99005.la0
    public String c0() {
        return this.w.readString();
    }

    @Override // com.p7700g.p99005.la0
    public IBinder e0() {
        return this.w.readStrongBinder();
    }

    @Override // com.p7700g.p99005.la0
    public void e1(String str) {
        this.w.writeString(str);
    }

    @Override // com.p7700g.p99005.la0
    public void g1(IBinder iBinder) {
        this.w.writeStrongBinder(iBinder);
    }

    @Override // com.p7700g.p99005.la0
    public void i0(int i) {
        a();
        this.A = i;
        this.v.put(i, this.w.dataPosition());
        L0(0);
        L0(i);
    }

    @Override // com.p7700g.p99005.la0
    public void i1(IInterface iInterface) {
        this.w.writeStrongInterface(iInterface);
    }

    @Override // com.p7700g.p99005.la0
    public boolean l() {
        return this.w.readInt() != 0;
    }

    @Override // com.p7700g.p99005.la0
    public void m0(boolean z) {
        this.w.writeInt(z ? 1 : 0);
    }

    @Override // com.p7700g.p99005.la0
    public Bundle p() {
        return this.w.readBundle(getClass().getClassLoader());
    }

    @Override // com.p7700g.p99005.la0
    public void q0(Bundle bundle) {
        this.w.writeBundle(bundle);
    }

    @Override // com.p7700g.p99005.la0
    public byte[] s() {
        int readInt = this.w.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.w.readByteArray(bArr);
        return bArr;
    }

    @Override // com.p7700g.p99005.la0
    public void t0(byte[] bArr) {
        if (bArr != null) {
            this.w.writeInt(bArr.length);
            this.w.writeByteArray(bArr);
            return;
        }
        this.w.writeInt(-1);
    }

    @Override // com.p7700g.p99005.la0
    public CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.w);
    }

    @Override // com.p7700g.p99005.la0
    public void v0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.w.writeInt(bArr.length);
            this.w.writeByteArray(bArr, i, i2);
            return;
        }
        this.w.writeInt(-1);
    }

    @Override // com.p7700g.p99005.la0
    public double y() {
        return this.w.readDouble();
    }

    @Override // com.p7700g.p99005.la0
    public void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.w, 0);
    }

    private ma0(Parcel parcel, int i, int i2, String str, q7<String, Method> q7Var, q7<String, Method> q7Var2, q7<String, Class> q7Var3) {
        super(q7Var, q7Var2, q7Var3);
        this.v = new SparseIntArray();
        this.A = -1;
        this.B = 0;
        this.C = -1;
        this.w = parcel;
        this.x = i;
        this.y = i2;
        this.B = i;
        this.z = str;
    }
}