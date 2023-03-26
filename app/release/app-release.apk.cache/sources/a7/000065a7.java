package com.p7700g.p99005;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes.dex */
public class xi0 {
    private final List<rj0> a = new ArrayList();

    public void a(rj0 rj0Var) {
        this.a.add(rj0Var);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            cp0.b(path, this.a.get(size));
        }
    }
}