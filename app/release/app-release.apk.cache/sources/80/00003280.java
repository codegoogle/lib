package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.hw2;
import com.p7700g.p99005.iw2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {
    private static final jw2 a = b(hw2.t);
    private final iw2 b;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            px2.values();
            int[] iArr = new int[10];
            a = iArr;
            try {
                iArr[px2.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[px2.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[px2.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(iw2 iw2Var) {
        this.b = iw2Var;
    }

    public static jw2 a(iw2 iw2Var) {
        if (iw2Var == hw2.t) {
            return a;
        }
        return b(iw2Var);
    }

    private static jw2 b(iw2 iw2Var) {
        return new jw2() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.p7700g.p99005.jw2
            public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
                if (lx2Var.f() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public Number read(nx2 nx2Var) throws IOException {
        px2 Y = nx2Var.Y();
        int ordinal = Y.ordinal();
        if (ordinal == 5 || ordinal == 6) {
            return this.b.a(nx2Var);
        }
        if (ordinal == 8) {
            nx2Var.P();
            return null;
        }
        throw new ew2("Expecting number, got: " + Y + "; at path " + nx2Var.getPath());
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d */
    public void write(qx2 qx2Var, Number number) throws IOException {
        qx2Var.c1(number);
    }
}