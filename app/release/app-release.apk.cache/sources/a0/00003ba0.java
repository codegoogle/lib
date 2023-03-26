package com.p7700g.p99005;

import com.p7700g.p99005.kt3;
import java.text.ParseException;
import java.util.Collections;
import java.util.Set;

/* compiled from: MatchingEntityTag.java */
/* loaded from: classes3.dex */
public class bt3 extends qm4 {
    public static final Set<bt3> d = Collections.emptySet();

    public bt3(String str) {
        super(str, false);
    }

    public static bt3 d(kt3 kt3Var) throws ParseException {
        String d2 = kt3Var.d();
        kt3.j j = kt3Var.j(false);
        if (j == kt3.j.QuotedString) {
            return new bt3(kt3Var.b());
        }
        if (j == kt3.j.Token && kt3Var.b().equals(bx.y4)) {
            kt3Var.o(j14.P);
            return new bt3(kt3Var.l(), true);
        }
        throw new ParseException(rx3.B(d2), kt3Var.c());
    }

    public bt3(String str, boolean z) {
        super(str, z);
    }
}