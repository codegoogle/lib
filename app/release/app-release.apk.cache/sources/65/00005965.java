package com.p7700g.p99005;

import com.p7700g.p99005.h54;
import com.p7700g.p99005.l54;
import com.p7700g.p99005.o34;

/* compiled from: SQLStringMatcher.java */
/* loaded from: classes3.dex */
public class r54<T extends o34, P extends l54<T>, S extends h54<T, P>> {
    public final S a;
    private final boolean b;
    private final p54 c;

    public r54(S s, boolean z, p54 p54Var) {
        this.a = s;
        this.c = p54Var;
        this.b = z;
        p54Var.c(s.b());
    }

    public void a(StringBuilder sb, String str, char c, int i) {
        this.c.d(sb, str, c, i);
    }

    public StringBuilder b(StringBuilder sb, String str) {
        String b = this.a.b();
        if (this.b) {
            d(sb, str, b);
        } else {
            e(sb, str, this.a.c(), this.a.d() + 1, b);
        }
        return sb;
    }

    public void c(StringBuilder sb, String str, char c, int i) {
        this.c.e(sb, str, c, i);
    }

    public void d(StringBuilder sb, String str, String str2) {
        this.c.b(sb, str, str2);
    }

    public void e(StringBuilder sb, String str, char c, int i, String str2) {
        this.c.a(sb, str, c, i, str2);
    }

    public String toString() {
        return b(new StringBuilder(), "COLUMN").toString();
    }
}