package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g50 implements q60, p60 {
    @r2
    public static final int s = 15;
    @r2
    public static final int t = 10;
    @r2
    public static final TreeMap<Integer, g50> u = new TreeMap<>();
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 3;
    private static final int y = 4;
    private static final int z = 5;
    private volatile String A;
    @r2
    public final long[] B;
    @r2
    public final double[] C;
    @r2
    public final String[] D;
    @r2
    public final byte[][] E;
    private final int[] F;
    @r2
    public final int G;
    @r2
    public int H;

    /* compiled from: RoomSQLiteQuery.java */
    /* loaded from: classes.dex */
    public static class a implements p60 {
        public a() {
        }

        @Override // com.p7700g.p99005.p60
        public void I0(int i, byte[] bArr) {
            g50.this.I0(i, bArr);
        }

        @Override // com.p7700g.p99005.p60
        public void I1() {
            g50.this.I1();
        }

        @Override // com.p7700g.p99005.p60
        public void J(int i, String str) {
            g50.this.J(i, str);
        }

        @Override // com.p7700g.p99005.p60
        public void a0(int i, double d) {
            g50.this.a0(i, d);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // com.p7700g.p99005.p60
        public void l1(int i) {
            g50.this.l1(i);
        }

        @Override // com.p7700g.p99005.p60
        public void u0(int i, long j) {
            g50.this.u0(i, j);
        }
    }

    private g50(int i) {
        this.G = i;
        int i2 = i + 1;
        this.F = new int[i2];
        this.B = new long[i2];
        this.C = new double[i2];
        this.D = new String[i2];
        this.E = new byte[i2];
    }

    public static g50 e(String str, int i) {
        TreeMap<Integer, g50> treeMap = u;
        synchronized (treeMap) {
            Map.Entry<Integer, g50> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                g50 value = ceilingEntry.getValue();
                value.j(str, i);
                return value;
            }
            g50 g50Var = new g50(i);
            g50Var.j(str, i);
            return g50Var;
        }
    }

    public static g50 h(q60 q60Var) {
        g50 e = e(q60Var.b(), q60Var.a());
        q60Var.d(new a());
        return e;
    }

    private static void k() {
        TreeMap<Integer, g50> treeMap = u;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    @Override // com.p7700g.p99005.p60
    public void I0(int i, byte[] bArr) {
        this.F[i] = 5;
        this.E[i] = bArr;
    }

    @Override // com.p7700g.p99005.p60
    public void I1() {
        Arrays.fill(this.F, 1);
        Arrays.fill(this.D, (Object) null);
        Arrays.fill(this.E, (Object) null);
        this.A = null;
    }

    @Override // com.p7700g.p99005.p60
    public void J(int i, String str) {
        this.F[i] = 4;
        this.D[i] = str;
    }

    @Override // com.p7700g.p99005.q60
    public int a() {
        return this.H;
    }

    @Override // com.p7700g.p99005.p60
    public void a0(int i, double d) {
        this.F[i] = 3;
        this.C[i] = d;
    }

    @Override // com.p7700g.p99005.q60
    public String b() {
        return this.A;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.p7700g.p99005.q60
    public void d(p60 p60Var) {
        for (int i = 1; i <= this.H; i++) {
            int i2 = this.F[i];
            if (i2 == 1) {
                p60Var.l1(i);
            } else if (i2 == 2) {
                p60Var.u0(i, this.B[i]);
            } else if (i2 == 3) {
                p60Var.a0(i, this.C[i]);
            } else if (i2 == 4) {
                p60Var.J(i, this.D[i]);
            } else if (i2 == 5) {
                p60Var.I0(i, this.E[i]);
            }
        }
    }

    public void f(g50 g50Var) {
        int a2 = g50Var.a() + 1;
        System.arraycopy(g50Var.F, 0, this.F, 0, a2);
        System.arraycopy(g50Var.B, 0, this.B, 0, a2);
        System.arraycopy(g50Var.D, 0, this.D, 0, a2);
        System.arraycopy(g50Var.E, 0, this.E, 0, a2);
        System.arraycopy(g50Var.C, 0, this.C, 0, a2);
    }

    public void j(String str, int i) {
        this.A = str;
        this.H = i;
    }

    @Override // com.p7700g.p99005.p60
    public void l1(int i) {
        this.F[i] = 1;
    }

    public void release() {
        TreeMap<Integer, g50> treeMap = u;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.G), this);
            k();
        }
    }

    @Override // com.p7700g.p99005.p60
    public void u0(int i, long j) {
        this.F[i] = 2;
        this.B[i] = j;
    }
}