package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.hw2;
import com.p7700g.p99005.iw2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.xw2;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    private static final jw2 a = b(hw2.s);
    private final Gson b;
    private final iw2 c;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            px2.values();
            int[] iArr = new int[10];
            a = iArr;
            try {
                iArr[px2.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[px2.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[px2.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[px2.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[px2.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[px2.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static jw2 a(iw2 iw2Var) {
        if (iw2Var == hw2.s) {
            return a;
        }
        return b(iw2Var);
    }

    private static jw2 b(final iw2 iw2Var) {
        return new jw2() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.p7700g.p99005.jw2
            public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
                if (lx2Var.f() == Object.class) {
                    return new ObjectTypeAdapter(gson, iw2.this);
                }
                return null;
            }
        };
    }

    private Object c(nx2 nx2Var, px2 px2Var) throws IOException {
        int ordinal = px2Var.ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 7) {
                    if (ordinal == 8) {
                        nx2Var.P();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + px2Var);
                }
                return Boolean.valueOf(nx2Var.w());
            }
            return this.c.a(nx2Var);
        }
        return nx2Var.W();
    }

    private Object d(nx2 nx2Var, px2 px2Var) throws IOException {
        int ordinal = px2Var.ordinal();
        if (ordinal == 0) {
            nx2Var.a();
            return new ArrayList();
        } else if (ordinal != 2) {
            return null;
        } else {
            nx2Var.b();
            return new xw2();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(nx2 nx2Var) throws IOException {
        px2 Y = nx2Var.Y();
        Object d = d(nx2Var, Y);
        if (d == null) {
            return c(nx2Var, Y);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (nx2Var.q()) {
                String F = d instanceof Map ? nx2Var.F() : null;
                px2 Y2 = nx2Var.Y();
                Object d2 = d(nx2Var, Y2);
                boolean z = d2 != null;
                if (d2 == null) {
                    d2 = c(nx2Var, Y2);
                }
                if (d instanceof List) {
                    ((List) d).add(d2);
                } else {
                    ((Map) d).put(F, d2);
                }
                if (z) {
                    arrayDeque.addLast(d);
                    d = d2;
                }
            } else {
                if (d instanceof List) {
                    nx2Var.h();
                } else {
                    nx2Var.j();
                }
                if (arrayDeque.isEmpty()) {
                    return d;
                }
                d = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(qx2 qx2Var, Object obj) throws IOException {
        if (obj == null) {
            qx2Var.w();
            return;
        }
        TypeAdapter q = this.b.q(obj.getClass());
        if (q instanceof ObjectTypeAdapter) {
            qx2Var.e();
            qx2Var.j();
            return;
        }
        q.write(qx2Var, obj);
    }

    private ObjectTypeAdapter(Gson gson, iw2 iw2Var) {
        this.b = gson;
        this.c = iw2Var;
    }
}