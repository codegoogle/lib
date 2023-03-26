package com.p7700g.p99005;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes3.dex */
public abstract class fw2 {
    public static final fw2 s;
    public static final fw2 t;
    private static final /* synthetic */ fw2[] u;

    /* compiled from: LongSerializationPolicy.java */
    /* loaded from: classes3.dex */
    public enum a extends fw2 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.p7700g.p99005.fw2
        public uv2 a(Long l) {
            if (l == null) {
                return wv2.a;
            }
            return new aw2(l);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        s = aVar;
        fw2 fw2Var = new fw2("STRING", 1) { // from class: com.p7700g.p99005.fw2.b
            @Override // com.p7700g.p99005.fw2
            public uv2 a(Long l) {
                if (l == null) {
                    return wv2.a;
                }
                return new aw2(l.toString());
            }
        };
        t = fw2Var;
        u = new fw2[]{aVar, fw2Var};
    }

    private fw2(String str, int i) {
    }

    public static fw2 valueOf(String str) {
        return (fw2) Enum.valueOf(fw2.class, str);
    }

    public static fw2[] values() {
        return (fw2[]) u.clone();
    }

    public abstract uv2 a(Long l);

    public /* synthetic */ fw2(String str, int i, a aVar) {
        this(str, i);
    }
}