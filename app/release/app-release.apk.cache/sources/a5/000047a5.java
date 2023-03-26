package com.p7700g.p99005;

import java.io.IOException;

/* compiled from: ScalarResponseBodyConverters.java */
/* loaded from: classes4.dex */
public final class i06 {

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class a implements lz5<kr5, Boolean> {
        public static final a a = new a();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Boolean a(kr5 kr5Var) throws IOException {
            return Boolean.valueOf(kr5Var.E());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class b implements lz5<kr5, Byte> {
        public static final b a = new b();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Byte a(kr5 kr5Var) throws IOException {
            return Byte.valueOf(kr5Var.E());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class c implements lz5<kr5, Character> {
        public static final c a = new c();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Character a(kr5 kr5Var) throws IOException {
            String E = kr5Var.E();
            if (E.length() == 1) {
                return Character.valueOf(E.charAt(0));
            }
            StringBuilder G = wo1.G("Expected body of length 1 for Character conversion but was ");
            G.append(E.length());
            throw new IOException(G.toString());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class d implements lz5<kr5, Double> {
        public static final d a = new d();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Double a(kr5 kr5Var) throws IOException {
            return Double.valueOf(kr5Var.E());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class e implements lz5<kr5, Float> {
        public static final e a = new e();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Float a(kr5 kr5Var) throws IOException {
            return Float.valueOf(kr5Var.E());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class f implements lz5<kr5, Integer> {
        public static final f a = new f();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Integer a(kr5 kr5Var) throws IOException {
            return Integer.valueOf(kr5Var.E());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class g implements lz5<kr5, Long> {
        public static final g a = new g();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Long a(kr5 kr5Var) throws IOException {
            return Long.valueOf(kr5Var.E());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class h implements lz5<kr5, Short> {
        public static final h a = new h();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Short a(kr5 kr5Var) throws IOException {
            return Short.valueOf(kr5Var.E());
        }
    }

    /* compiled from: ScalarResponseBodyConverters.java */
    /* loaded from: classes4.dex */
    public static final class i implements lz5<kr5, String> {
        public static final i a = new i();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public String a(kr5 kr5Var) throws IOException {
            return kr5Var.E();
        }
    }

    private i06() {
    }
}