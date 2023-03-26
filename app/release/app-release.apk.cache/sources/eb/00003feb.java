package com.p7700g.p99005;

import android.content.Context;
import java.util.Objects;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes2.dex */
public final class e52 extends k52 {
    private final Context b;
    private final v92 c;
    private final v92 d;
    private final String e;

    public e52(Context context, v92 v92Var, v92 v92Var2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.b = context;
        Objects.requireNonNull(v92Var, "Null wallClock");
        this.c = v92Var;
        Objects.requireNonNull(v92Var2, "Null monotonicClock");
        this.d = v92Var2;
        Objects.requireNonNull(str, "Null backendName");
        this.e = str;
    }

    @Override // com.p7700g.p99005.k52
    public Context c() {
        return this.b;
    }

    @Override // com.p7700g.p99005.k52
    @x1
    public String d() {
        return this.e;
    }

    @Override // com.p7700g.p99005.k52
    public v92 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k52) {
            k52 k52Var = (k52) obj;
            return this.b.equals(k52Var.c()) && this.c.equals(k52Var.f()) && this.d.equals(k52Var.e()) && this.e.equals(k52Var.d());
        }
        return false;
    }

    @Override // com.p7700g.p99005.k52
    public v92 f() {
        return this.c;
    }

    public int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("CreationContext{applicationContext=");
        G.append(this.b);
        G.append(", wallClock=");
        G.append(this.c);
        G.append(", monotonicClock=");
        G.append(this.d);
        G.append(", backendName=");
        return wo1.C(G, this.e, "}");
    }
}