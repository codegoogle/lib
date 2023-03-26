package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* loaded from: classes.dex */
public class tk0 {
    public static final tk0 a = new tk0("COMPOSITION");
    private final List<String> b;
    @z1
    private uk0 c;

    public tk0(String... strArr) {
        this.b = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.b;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    @i2({i2.a.LIBRARY})
    @u0
    public tk0 a(String str) {
        tk0 tk0Var = new tk0(this);
        tk0Var.b.add(str);
        return tk0Var;
    }

    @i2({i2.a.LIBRARY})
    public boolean c(String str, int i) {
        if (i >= this.b.size()) {
            return false;
        }
        boolean z = i == this.b.size() - 1;
        String str2 = this.b.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.b.size() + (-2) && b())) && (str2.equals(str) || str2.equals(tm4.g));
        }
        if (!z && this.b.get(i + 1).equals(str)) {
            return i == this.b.size() + (-2) || (i == this.b.size() + (-3) && b());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.b.size() - 1) {
                return false;
            }
            return this.b.get(i2).equals(str);
        }
    }

    @i2({i2.a.LIBRARY})
    @z1
    public uk0 d() {
        return this.c;
    }

    @i2({i2.a.LIBRARY})
    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (this.b.get(i).equals("**")) {
            return (i != this.b.size() - 1 && this.b.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tk0 tk0Var = (tk0) obj;
        if (this.b.equals(tk0Var.b)) {
            uk0 uk0Var = this.c;
            uk0 uk0Var2 = tk0Var.c;
            return uk0Var != null ? uk0Var.equals(uk0Var2) : uk0Var2 == null;
        }
        return false;
    }

    public String g() {
        return this.b.toString();
    }

    @i2({i2.a.LIBRARY})
    public boolean h(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.b.size()) {
            return false;
        }
        return this.b.get(i).equals(str) || this.b.get(i).equals("**") || this.b.get(i).equals(tm4.g);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        uk0 uk0Var = this.c;
        return hashCode + (uk0Var != null ? uk0Var.hashCode() : 0);
    }

    @i2({i2.a.LIBRARY})
    public boolean i(String str, int i) {
        return "__container".equals(str) || i < this.b.size() - 1 || this.b.get(i).equals("**");
    }

    @i2({i2.a.LIBRARY})
    public tk0 j(uk0 uk0Var) {
        tk0 tk0Var = new tk0(this);
        tk0Var.c = uk0Var;
        return tk0Var;
    }

    public String toString() {
        StringBuilder G = wo1.G("KeyPath{keys=");
        G.append(this.b);
        G.append(",resolved=");
        G.append(this.c != null);
        G.append('}');
        return G.toString();
    }

    private tk0(tk0 tk0Var) {
        this.b = new ArrayList(tk0Var.b);
        this.c = tk0Var.c;
    }
}