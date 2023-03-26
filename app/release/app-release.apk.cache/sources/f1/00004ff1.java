package com.p7700g.p99005;

/* compiled from: SimpleSQLiteQuery.java */
/* loaded from: classes.dex */
public final class m60 implements q60 {
    private final String s;
    @z1
    private final Object[] t;

    public m60(String str, @z1 Object[] objArr) {
        this.s = str;
        this.t = objArr;
    }

    private static void c(p60 p60Var, int i, Object obj) {
        if (obj == null) {
            p60Var.l1(i);
        } else if (obj instanceof byte[]) {
            p60Var.I0(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            p60Var.a0(i, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            p60Var.a0(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            p60Var.u0(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            p60Var.u0(i, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            p60Var.u0(i, ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            p60Var.u0(i, ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            p60Var.J(i, (String) obj);
        } else if (obj instanceof Boolean) {
            p60Var.u0(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    public static void e(p60 p60Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            c(p60Var, i, obj);
        }
    }

    @Override // com.p7700g.p99005.q60
    public int a() {
        Object[] objArr = this.t;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    @Override // com.p7700g.p99005.q60
    public String b() {
        return this.s;
    }

    @Override // com.p7700g.p99005.q60
    public void d(p60 p60Var) {
        e(p60Var, this.t);
    }

    public m60(String str) {
        this(str, null);
    }
}