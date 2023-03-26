package com.p7700g.p99005;

/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public class vl0 implements pl0 {
    private final String a;
    private final a b;
    private final boolean c;

    /* compiled from: MergePaths.java */
    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a b(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public vl0(String str, a aVar, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = z;
    }

    @Override // com.p7700g.p99005.pl0
    @z1
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        if (!hi0Var.v()) {
            yo0.e("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new hj0(this);
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        StringBuilder G = wo1.G("MergePaths{mode=");
        G.append(this.b);
        G.append('}');
        return G.toString();
    }
}