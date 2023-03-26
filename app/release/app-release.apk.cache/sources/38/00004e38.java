package com.p7700g.p99005;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import com.p7700g.p99005.i2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: VersionedParcel.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class la0 {
    private static final String a = "VersionedParcel";
    private static final int b = -1;
    private static final int c = -2;
    private static final int d = -3;
    private static final int e = -4;
    private static final int f = -5;
    private static final int g = -6;
    private static final int h = -7;
    private static final int i = -9;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private static final int n = 5;
    private static final int o = 7;
    private static final int p = 8;
    public final q7<String, Method> q;
    public final q7<String, Method> r;
    public final q7<String, Class> s;

    /* compiled from: VersionedParcel.java */
    /* loaded from: classes.dex */
    public class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* compiled from: VersionedParcel.java */
    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    public la0(q7<String, Method> q7Var, q7<String, Method> q7Var2, q7<String, Class> q7Var3) {
        this.q = q7Var;
        this.r = q7Var2;
        this.s = q7Var3;
    }

    private <T> void A0(Collection<T> collection) {
        if (collection == null) {
            L0(-1);
            return;
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int g2 = g(collection.iterator().next());
            L0(g2);
            switch (g2) {
                case 1:
                    for (T t : collection) {
                        l1(t);
                    }
                    return;
                case 2:
                    for (T t2 : collection) {
                        W0(t2);
                    }
                    return;
                case 3:
                    for (T t3 : collection) {
                        Y0(t3);
                    }
                    return;
                case 4:
                    for (T t4 : collection) {
                        e1(t4);
                    }
                    return;
                case 5:
                    for (T t5 : collection) {
                        g1(t5);
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    for (T t6 : collection) {
                        L0(t6.intValue());
                    }
                    return;
                case 8:
                    for (T t7 : collection) {
                        H0(t7.floatValue());
                    }
                    return;
            }
        }
    }

    private <T> void B0(Collection<T> collection, int i2) {
        i0(i2);
        A0(collection);
    }

    private Exception C(int i2, String str) {
        return b(i2, str);
    }

    private int E() {
        return L();
    }

    private void Y0(Serializable serializable) {
        if (serializable == null) {
            e1(null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new RuntimeException(wo1.u("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e2);
        }
    }

    private Exception b(int i2, String str) {
        switch (i2) {
            case -9:
                return (Exception) V();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i2 + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class d(Class<? extends oa0> cls) throws ClassNotFoundException {
        Class cls2 = this.s.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.s.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    private Method e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.q.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, la0.class.getClassLoader()).getDeclaredMethod("read", la0.class);
            this.q.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    @x1
    public static Throwable f(@x1 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int g(T t) {
        if (t instanceof String) {
            return 4;
        }
        if (t instanceof Parcelable) {
            return 2;
        }
        if (t instanceof oa0) {
            return 1;
        }
        if (t instanceof Serializable) {
            return 3;
        }
        if (t instanceof IBinder) {
            return 5;
        }
        if (t instanceof Integer) {
            return 7;
        }
        if (t instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.r.get(cls.getName());
        if (method == null) {
            Class d2 = d(cls);
            System.currentTimeMillis();
            Method declaredMethod = d2.getDeclaredMethod("write", cls, la0.class);
            this.r.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n1(oa0 oa0Var) {
        try {
            e1(d(oa0Var.getClass()).getName());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(oa0Var.getClass().getSimpleName() + " does not have a Parcelizer", e2);
        }
    }

    private <T, S extends Collection<T>> S x(S s) {
        int L = L();
        if (L < 0) {
            return null;
        }
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    s.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    s.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    s.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    s.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    s.add(e0());
                    L--;
                }
            }
        }
        return s;
    }

    public double[] A() {
        int L = L();
        if (L < 0) {
            return null;
        }
        double[] dArr = new double[L];
        for (int i2 = 0; i2 < L; i2++) {
            dArr[i2] = y();
        }
        return dArr;
    }

    public double[] B(double[] dArr, int i2) {
        return !F(i2) ? dArr : A();
    }

    public abstract void C0(double d2);

    public Exception D(Exception exc, int i2) {
        int E;
        return (F(i2) && (E = E()) != 0) ? C(E, c0()) : exc;
    }

    public void D0(double d2, int i2) {
        i0(i2);
        C0(d2);
    }

    public void E0(double[] dArr) {
        if (dArr != null) {
            L0(dArr.length);
            for (double d2 : dArr) {
                C0(d2);
            }
            return;
        }
        L0(-1);
    }

    public abstract boolean F(int i2);

    public void F0(double[] dArr, int i2) {
        i0(i2);
        E0(dArr);
    }

    public abstract float G();

    public void G0(Exception exc, int i2) {
        i0(i2);
        if (exc == null) {
            V0();
            return;
        }
        int i3 = 0;
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i3 = -9;
        } else if (exc instanceof SecurityException) {
            i3 = -1;
        } else if (exc instanceof BadParcelableException) {
            i3 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i3 = -3;
        } else if (exc instanceof NullPointerException) {
            i3 = -4;
        } else if (exc instanceof IllegalStateException) {
            i3 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i3 = -6;
        } else if (exc instanceof UnsupportedOperationException) {
            i3 = -7;
        }
        L0(i3);
        if (i3 == 0) {
            if (exc instanceof RuntimeException) {
                throw ((RuntimeException) exc);
            }
            throw new RuntimeException(exc);
        }
        e1(exc.getMessage());
        if (i3 != -9) {
            return;
        }
        W0((Parcelable) exc);
    }

    public float H(float f2, int i2) {
        return !F(i2) ? f2 : G();
    }

    public abstract void H0(float f2);

    public float[] I() {
        int L = L();
        if (L < 0) {
            return null;
        }
        float[] fArr = new float[L];
        for (int i2 = 0; i2 < L; i2++) {
            fArr[i2] = G();
        }
        return fArr;
    }

    public void I0(float f2, int i2) {
        i0(i2);
        H0(f2);
    }

    public float[] J(float[] fArr, int i2) {
        return !F(i2) ? fArr : I();
    }

    public void J0(float[] fArr) {
        if (fArr != null) {
            L0(fArr.length);
            for (float f2 : fArr) {
                H0(f2);
            }
            return;
        }
        L0(-1);
    }

    public <T extends oa0> T K(String str, la0 la0Var) {
        try {
            return (T) e(str).invoke(null, la0Var);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public void K0(float[] fArr, int i2) {
        i0(i2);
        J0(fArr);
    }

    public abstract int L();

    public abstract void L0(int i2);

    public int M(int i2, int i3) {
        return !F(i3) ? i2 : L();
    }

    public void M0(int i2, int i3) {
        i0(i3);
        L0(i2);
    }

    public int[] N() {
        int L = L();
        if (L < 0) {
            return null;
        }
        int[] iArr = new int[L];
        for (int i2 = 0; i2 < L; i2++) {
            iArr[i2] = L();
        }
        return iArr;
    }

    public void N0(int[] iArr) {
        if (iArr != null) {
            L0(iArr.length);
            for (int i2 : iArr) {
                L0(i2);
            }
            return;
        }
        L0(-1);
    }

    public int[] O(int[] iArr, int i2) {
        return !F(i2) ? iArr : N();
    }

    public void O0(int[] iArr, int i2) {
        i0(i2);
        N0(iArr);
    }

    public <T> List<T> P(List<T> list, int i2) {
        return !F(i2) ? list : (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int i2) {
        B0(list, i2);
    }

    public abstract long Q();

    public abstract void Q0(long j2);

    public long R(long j2, int i2) {
        return !F(i2) ? j2 : Q();
    }

    public void R0(long j2, int i2) {
        i0(i2);
        Q0(j2);
    }

    public long[] S() {
        int L = L();
        if (L < 0) {
            return null;
        }
        long[] jArr = new long[L];
        for (int i2 = 0; i2 < L; i2++) {
            jArr[i2] = Q();
        }
        return jArr;
    }

    public void S0(long[] jArr) {
        if (jArr != null) {
            L0(jArr.length);
            for (long j2 : jArr) {
                Q0(j2);
            }
            return;
        }
        L0(-1);
    }

    public long[] T(long[] jArr, int i2) {
        return !F(i2) ? jArr : S();
    }

    public void T0(long[] jArr, int i2) {
        i0(i2);
        S0(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> U(Map<K, V> map, int i2) {
        if (F(i2)) {
            int L = L();
            if (L < 0) {
                return null;
            }
            q7 q7Var = new q7();
            if (L == 0) {
                return q7Var;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            x(arrayList);
            x(arrayList2);
            for (int i3 = 0; i3 < L; i3++) {
                q7Var.put(arrayList.get(i3), arrayList2.get(i3));
            }
            return q7Var;
        }
        return map;
    }

    public <K, V> void U0(Map<K, V> map, int i2) {
        i0(i2);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        A0(arrayList);
        A0(arrayList2);
    }

    public abstract <T extends Parcelable> T V();

    public void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t, int i2) {
        return !F(i2) ? t : (T) V();
    }

    public abstract void W0(Parcelable parcelable);

    public Serializable X() {
        String c0 = c0();
        if (c0 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e2) {
            throw new RuntimeException(wo1.u("VersionedParcelable encountered IOException reading a Serializable object (name = ", c0, ")"), e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(wo1.u("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", c0, ")"), e3);
        }
    }

    public void X0(Parcelable parcelable, int i2) {
        i0(i2);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int i2) {
        return !F(i2) ? set : (Set) x(new r7());
    }

    @e2(api = 21)
    public Size Z(Size size, int i2) {
        if (F(i2)) {
            if (l()) {
                return new Size(L(), L());
            }
            return null;
        }
        return size;
    }

    public void Z0(Serializable serializable, int i2) {
        i0(i2);
        Y0(serializable);
    }

    public abstract void a();

    @e2(api = 21)
    public SizeF a0(SizeF sizeF, int i2) {
        if (F(i2)) {
            if (l()) {
                return new SizeF(G(), G());
            }
            return null;
        }
        return sizeF;
    }

    public <T> void a1(Set<T> set, int i2) {
        B0(set, i2);
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i2) {
        if (F(i2)) {
            int L = L();
            if (L < 0) {
                return null;
            }
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L);
            for (int i3 = 0; i3 < L; i3++) {
                sparseBooleanArray2.put(L(), l());
            }
            return sparseBooleanArray2;
        }
        return sparseBooleanArray;
    }

    @e2(api = 21)
    public void b1(Size size, int i2) {
        i0(i2);
        m0(size != null);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    public abstract la0 c();

    public abstract String c0();

    @e2(api = 21)
    public void c1(SizeF sizeF, int i2) {
        i0(i2);
        m0(sizeF != null);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public String d0(String str, int i2) {
        return !F(i2) ? str : c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int i2) {
        i0(i2);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int i3 = 0; i3 < size; i3++) {
            L0(sparseBooleanArray.keyAt(i3));
            m0(sparseBooleanArray.valueAt(i3));
        }
    }

    public abstract IBinder e0();

    public abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int i2) {
        return !F(i2) ? iBinder : e0();
    }

    public void f1(String str, int i2) {
        i0(i2);
        e1(str);
    }

    public <T extends oa0> T g0() {
        String c0 = c0();
        if (c0 == null) {
            return null;
        }
        return (T) K(c0, c());
    }

    public abstract void g1(IBinder iBinder);

    public <T extends oa0> T h0(T t, int i2) {
        return !F(i2) ? t : (T) g0();
    }

    public void h1(IBinder iBinder, int i2) {
        i0(i2);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    public abstract void i0(int i2);

    public abstract void i1(IInterface iInterface);

    public <T> T[] j(T[] tArr) {
        int L = L();
        if (L < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L);
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    arrayList.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    arrayList.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    arrayList.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    arrayList.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    arrayList.add(e0());
                    L--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public void j0(boolean z, boolean z2) {
    }

    public void j1(IInterface iInterface, int i2) {
        i0(i2);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int i2) {
        return !F(i2) ? tArr : (T[]) j(tArr);
    }

    public <T> void k0(T[] tArr) {
        if (tArr == null) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int i2 = 0;
            int g2 = g(tArr[0]);
            L0(g2);
            if (g2 == 1) {
                while (i2 < length) {
                    l1((oa0) tArr[i2]);
                    i2++;
                }
            } else if (g2 == 2) {
                while (i2 < length) {
                    W0((Parcelable) tArr[i2]);
                    i2++;
                }
            } else if (g2 == 3) {
                while (i2 < length) {
                    Y0((Serializable) tArr[i2]);
                    i2++;
                }
            } else if (g2 == 4) {
                while (i2 < length) {
                    e1((String) tArr[i2]);
                    i2++;
                }
            } else if (g2 != 5) {
            } else {
                while (i2 < length) {
                    g1((IBinder) tArr[i2]);
                    i2++;
                }
            }
        }
    }

    public <T extends oa0> void k1(T t, la0 la0Var) {
        try {
            h(t.getClass()).invoke(null, t, la0Var);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract boolean l();

    public <T> void l0(T[] tArr, int i2) {
        i0(i2);
        k0(tArr);
    }

    public void l1(oa0 oa0Var) {
        if (oa0Var == null) {
            e1(null);
            return;
        }
        n1(oa0Var);
        la0 c2 = c();
        k1(oa0Var, c2);
        c2.a();
    }

    public boolean m(boolean z, int i2) {
        return !F(i2) ? z : l();
    }

    public abstract void m0(boolean z);

    public void m1(oa0 oa0Var, int i2) {
        i0(i2);
        l1(oa0Var);
    }

    public boolean[] n() {
        int L = L();
        if (L < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L];
        for (int i2 = 0; i2 < L; i2++) {
            zArr[i2] = L() != 0;
        }
        return zArr;
    }

    public void n0(boolean z, int i2) {
        i0(i2);
        m0(z);
    }

    public boolean[] o(boolean[] zArr, int i2) {
        return !F(i2) ? zArr : n();
    }

    public void o0(boolean[] zArr) {
        if (zArr != null) {
            L0(zArr.length);
            for (boolean z : zArr) {
                L0(z ? 1 : 0);
            }
            return;
        }
        L0(-1);
    }

    public abstract Bundle p();

    public void p0(boolean[] zArr, int i2) {
        i0(i2);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int i2) {
        return !F(i2) ? bundle : p();
    }

    public abstract void q0(Bundle bundle);

    public byte r(byte b2, int i2) {
        return !F(i2) ? b2 : (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int i2) {
        i0(i2);
        q0(bundle);
    }

    public abstract byte[] s();

    public void s0(byte b2, int i2) {
        i0(i2);
        L0(b2);
    }

    public byte[] t(byte[] bArr, int i2) {
        return !F(i2) ? bArr : s();
    }

    public abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int i2) {
        if (F(i2)) {
            int L = L();
            if (L < 0) {
                return null;
            }
            char[] cArr2 = new char[L];
            for (int i3 = 0; i3 < L; i3++) {
                cArr2[i3] = (char) L();
            }
            return cArr2;
        }
        return cArr;
    }

    public void u0(byte[] bArr, int i2) {
        i0(i2);
        t0(bArr);
    }

    public abstract CharSequence v();

    public abstract void v0(byte[] bArr, int i2, int i3);

    public CharSequence w(CharSequence charSequence, int i2) {
        return !F(i2) ? charSequence : v();
    }

    public void w0(byte[] bArr, int i2, int i3, int i4) {
        i0(i4);
        v0(bArr, i2, i3);
    }

    public void x0(char[] cArr, int i2) {
        i0(i2);
        if (cArr != null) {
            L0(cArr.length);
            for (char c2 : cArr) {
                L0(c2);
            }
            return;
        }
        L0(-1);
    }

    public abstract double y();

    public abstract void y0(CharSequence charSequence);

    public double z(double d2, int i2) {
        return !F(i2) ? d2 : y();
    }

    public void z0(CharSequence charSequence, int i2) {
        i0(i2);
        y0(charSequence);
    }
}