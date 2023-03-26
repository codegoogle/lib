package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: InputMerger.java */
/* loaded from: classes.dex */
public abstract class rb0 {
    private static final String a = tb0.f("InputMerger");

    @i2({i2.a.LIBRARY_GROUP})
    public static rb0 a(String className) {
        try {
            return (rb0) Class.forName(className).newInstance();
        } catch (Exception e) {
            tb0.c().b(a, wo1.t("Trouble instantiating + ", className), e);
            return null;
        }
    }

    @x1
    public abstract kb0 b(@x1 List<kb0> inputs);
}