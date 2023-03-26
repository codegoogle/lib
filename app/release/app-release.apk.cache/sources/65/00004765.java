package com.p7700g.p99005;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToNumberPolicy.java */
/* loaded from: classes3.dex */
public abstract class hw2 implements iw2 {
    public static final hw2 s;
    public static final hw2 t;
    public static final hw2 u;
    public static final hw2 v;
    private static final /* synthetic */ hw2[] w;

    /* compiled from: ToNumberPolicy.java */
    /* loaded from: classes3.dex */
    public enum a extends hw2 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.p7700g.p99005.iw2
        /* renamed from: b */
        public Double a(nx2 nx2Var) throws IOException {
            return Double.valueOf(nx2Var.z());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        s = aVar;
        hw2 hw2Var = new hw2("LAZILY_PARSED_NUMBER", 1) { // from class: com.p7700g.p99005.hw2.b
            @Override // com.p7700g.p99005.iw2
            public Number a(nx2 nx2Var) throws IOException {
                return new ww2(nx2Var.W());
            }
        };
        t = hw2Var;
        hw2 hw2Var2 = new hw2("LONG_OR_DOUBLE", 2) { // from class: com.p7700g.p99005.hw2.c
            @Override // com.p7700g.p99005.iw2
            public Number a(nx2 nx2Var) throws IOException, yv2 {
                String W = nx2Var.W();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(W));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(W);
                        if ((valueOf.isInfinite() || valueOf.isNaN()) && !nx2Var.r()) {
                            throw new rx2("JSON forbids NaN and infinities: " + valueOf + "; at path " + nx2Var.m());
                        }
                        return valueOf;
                    }
                } catch (NumberFormatException e) {
                    StringBuilder M = wo1.M("Cannot parse ", W, "; at path ");
                    M.append(nx2Var.m());
                    throw new yv2(M.toString(), e);
                }
            }
        };
        u = hw2Var2;
        hw2 hw2Var3 = new hw2("BIG_DECIMAL", 3) { // from class: com.p7700g.p99005.hw2.d
            @Override // com.p7700g.p99005.iw2
            /* renamed from: b */
            public BigDecimal a(nx2 nx2Var) throws IOException {
                String W = nx2Var.W();
                try {
                    return new BigDecimal(W);
                } catch (NumberFormatException e) {
                    StringBuilder M = wo1.M("Cannot parse ", W, "; at path ");
                    M.append(nx2Var.m());
                    throw new yv2(M.toString(), e);
                }
            }
        };
        v = hw2Var3;
        w = new hw2[]{aVar, hw2Var, hw2Var2, hw2Var3};
    }

    private hw2(String str, int i) {
    }

    public static hw2 valueOf(String str) {
        return (hw2) Enum.valueOf(hw2.class, str);
    }

    public static hw2[] values() {
        return (hw2[]) w.clone();
    }

    public /* synthetic */ hw2(String str, int i, a aVar) {
        this(str, i);
    }
}