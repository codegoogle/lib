package com.p7700g.p99005;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public class fm0 implements pl0 {
    private final String a;
    private final a b;
    private final zk0 c;
    private final zk0 d;
    private final zk0 e;
    private final boolean f;

    /* compiled from: ShapeTrimPath.java */
    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException(wo1.l("Unknown trim path type ", i));
            }
            return SIMULTANEOUSLY;
        }
    }

    public fm0(String str, a aVar, zk0 zk0Var, zk0 zk0Var2, zk0 zk0Var3, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = zk0Var;
        this.d = zk0Var2;
        this.e = zk0Var3;
        this.f = z;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new rj0(im0Var, this);
    }

    public zk0 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public zk0 d() {
        return this.e;
    }

    public zk0 e() {
        return this.c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        StringBuilder G = wo1.G("Trim Path: {start: ");
        G.append(this.c);
        G.append(", end: ");
        G.append(this.d);
        G.append(", offset: ");
        G.append(this.e);
        G.append("}");
        return G.toString();
    }
}