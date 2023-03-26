package com.p7700g.p99005;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.la0;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

/* compiled from: VersionedParcelStream.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class na0 extends la0 {
    private static final int A = 6;
    private static final int B = 7;
    private static final int C = 8;
    private static final int D = 9;
    private static final int E = 10;
    private static final int F = 11;
    private static final int G = 12;
    private static final int H = 13;
    private static final int I = 14;
    private static final Charset t = Charset.forName("UTF-16");
    private static final int u = 0;
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 3;
    private static final int y = 4;
    private static final int z = 5;
    private final DataInputStream J;
    private final DataOutputStream K;
    private DataInputStream L;
    private DataOutputStream M;
    private b N;
    private boolean O;
    public int P;
    private int Q;
    public int R;

    /* compiled from: VersionedParcelStream.java */
    /* loaded from: classes.dex */
    public static class b {
        public final ByteArrayOutputStream a;
        public final DataOutputStream b;
        private final int c;
        private final DataOutputStream d;

        public b(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.a = byteArrayOutputStream;
            this.b = new DataOutputStream(byteArrayOutputStream);
            this.c = i;
            this.d = dataOutputStream;
        }

        public void a() throws IOException {
            this.b.flush();
            int size = this.a.size();
            this.d.writeInt((this.c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.d.writeInt(size);
            }
            this.a.writeTo(this.d);
        }
    }

    public na0(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new q7(), new q7(), new q7());
    }

    private void o1(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException(wo1.l("Unknown type ", i));
        }
    }

    private void p1(Object obj) {
        if (obj == null) {
            L0(0);
        } else if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
        } else if (obj instanceof String) {
            L0(3);
            e1((String) obj);
        } else if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
        } else if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
        } else if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
        } else if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
        } else if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
        } else if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            StringBuilder G2 = wo1.G("Unsupported type ");
            G2.append(obj.getClass());
            throw new IllegalArgumentException(G2.toString());
        }
    }

    @Override // com.p7700g.p99005.la0
    public void C0(double d) {
        try {
            this.M.writeDouble(d);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public boolean F(int i) {
        while (true) {
            try {
                int i2 = this.Q;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.P;
                int i4 = this.R;
                if (i3 < i4) {
                    this.J.skip(i4 - i3);
                }
                this.R = -1;
                int readInt = this.J.readInt();
                this.P = 0;
                int i5 = readInt & 65535;
                if (i5 == 65535) {
                    i5 = this.J.readInt();
                }
                this.Q = (readInt >> 16) & 65535;
                this.R = i5;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // com.p7700g.p99005.la0
    public float G() {
        try {
            return this.L.readFloat();
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public void H0(float f) {
        try {
            this.M.writeFloat(f);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public int L() {
        try {
            return this.L.readInt();
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public void L0(int i) {
        try {
            this.M.writeInt(i);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public long Q() {
        try {
            return this.L.readLong();
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public void Q0(long j) {
        try {
            this.M.writeLong(j);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // com.p7700g.p99005.la0
    public void W0(Parcelable parcelable) {
        if (!this.O) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // com.p7700g.p99005.la0
    public void a() {
        b bVar = this.N;
        if (bVar != null) {
            try {
                if (bVar.a.size() != 0) {
                    this.N.a();
                }
                this.N = null;
            } catch (IOException e) {
                throw new la0.b(e);
            }
        }
    }

    @Override // com.p7700g.p99005.la0
    public la0 c() {
        return new na0(this.L, this.M, this.q, this.r, this.s);
    }

    @Override // com.p7700g.p99005.la0
    public String c0() {
        try {
            int readInt = this.L.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.L.readFully(bArr);
                return new String(bArr, t);
            }
            return null;
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public IBinder e0() {
        return null;
    }

    @Override // com.p7700g.p99005.la0
    public void e1(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(t);
                this.M.writeInt(bytes.length);
                this.M.write(bytes);
                return;
            }
            this.M.writeInt(-1);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public void g1(IBinder iBinder) {
        if (!this.O) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // com.p7700g.p99005.la0
    public boolean i() {
        return true;
    }

    @Override // com.p7700g.p99005.la0
    public void i0(int i) {
        a();
        b bVar = new b(i, this.K);
        this.N = bVar;
        this.M = bVar.b;
    }

    @Override // com.p7700g.p99005.la0
    public void i1(IInterface iInterface) {
        if (!this.O) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // com.p7700g.p99005.la0
    public void j0(boolean z2, boolean z3) {
        if (z2) {
            this.O = z3;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    @Override // com.p7700g.p99005.la0
    public boolean l() {
        try {
            return this.L.readBoolean();
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public void m0(boolean z2) {
        try {
            this.M.writeBoolean(z2);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public Bundle p() {
        int L = L();
        if (L < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < L; i++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    @Override // com.p7700g.p99005.la0
    public void q0(Bundle bundle) {
        try {
            if (bundle != null) {
                Set<String> keySet = bundle.keySet();
                this.M.writeInt(keySet.size());
                for (String str : keySet) {
                    e1(str);
                    p1(bundle.get(str));
                }
                return;
            }
            this.M.writeInt(-1);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public byte[] s() {
        try {
            int readInt = this.L.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.L.readFully(bArr);
                return bArr;
            }
            return null;
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public void t0(byte[] bArr) {
        try {
            if (bArr != null) {
                this.M.writeInt(bArr.length);
                this.M.write(bArr);
                return;
            }
            this.M.writeInt(-1);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public CharSequence v() {
        return null;
    }

    @Override // com.p7700g.p99005.la0
    public void v0(byte[] bArr, int i, int i2) {
        try {
            if (bArr != null) {
                this.M.writeInt(i2);
                this.M.write(bArr, i, i2);
                return;
            }
            this.M.writeInt(-1);
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public double y() {
        try {
            return this.L.readDouble();
        } catch (IOException e) {
            throw new la0.b(e);
        }
    }

    @Override // com.p7700g.p99005.la0
    public void y0(CharSequence charSequence) {
        if (!this.O) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    private na0(InputStream inputStream, OutputStream outputStream, q7<String, Method> q7Var, q7<String, Method> q7Var2, q7<String, Class> q7Var3) {
        super(q7Var, q7Var2, q7Var3);
        this.P = 0;
        this.Q = -1;
        this.R = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.J = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.K = dataOutputStream;
        this.L = dataInputStream;
        this.M = dataOutputStream;
    }

    /* compiled from: VersionedParcelStream.java */
    /* loaded from: classes.dex */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            na0 na0Var = na0.this;
            int i = na0Var.R;
            if (i != -1 && na0Var.P >= i) {
                throw new IOException();
            }
            int read = super.read();
            na0.this.P++;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            na0 na0Var = na0.this;
            int i = na0Var.R;
            if (i != -1 && na0Var.P >= i) {
                throw new IOException();
            }
            long skip = super.skip(j);
            if (skip > 0) {
                na0.this.P += (int) skip;
            }
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            na0 na0Var = na0.this;
            int i3 = na0Var.R;
            if (i3 != -1 && na0Var.P >= i3) {
                throw new IOException();
            }
            int read = super.read(bArr, i, i2);
            if (read > 0) {
                na0.this.P += read;
            }
            return read;
        }
    }
}